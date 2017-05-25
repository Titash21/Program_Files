/**
 * Created by TITASH MANDAL on 5/8/2017.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * References:
 *
 *  - http://java.sun.com/j2se/1.5/pdf/generics-tutorial.pdf
 *  - Effective Java (2nd edition), item 28
 *
 * Mnemonic from Effective Java: PECS = producer-extends, consumer-super
 */
public class PECS {

    public static <T> T copy01(Collection<T> from, Collection<T> to) {
        for (T t : from) {
            to.add(t);
        }

        // ignore NPEs :P
        return from.iterator().next();
    }

    /**
     * Use extends when getting from a producer
     */
    public static <T> T copy02(Collection<? extends T> from, Collection<T> to) {
        for (T t : from) {
            to.add(t);
        }

        return from.iterator().next();
    }

    /**
     * Use super when putting into a consumer
     */
    public static <T> T copy03(Collection<T> from, Collection<? super T> to) {
        for (T t : from) {
            to.add(t);
        }

        return from.iterator().next();
    }

    public static void main(String[] args) {
        List<String> from = Arrays.asList("foo", "bar", "baz");
        List<CharSequence> to = new ArrayList<CharSequence>();

        // copy String elements to CharSequence elements
       // copy01(from, to); // doesn't type check

        CharSequence a = copy02(from, to); // returns CharSequence because of extends
        String b = copy03(from, to);       // returns String       because of super


        // Or, Collections.sort(List<T>, Comparator<? super T>);

        // sort by length, ascending
        Comparator<CharSequence> charSequenceComparator = new Comparator<CharSequence>() {
            @Override
            public int compare(CharSequence a, CharSequence b) {
                return a.length() - b.length();
            }
        };

        // The above can sort Strings
        List<String> stringsToSort = Arrays.asList("ccc", "bb", "a");
        Collections.sort(stringsToSort, charSequenceComparator);
        System.out.println(stringsToSort);

        // Or StringBuilders
        List<StringBuilder> buildersToSort = Arrays.asList(
                new StringBuilder("ccc"),
                new StringBuilder("bb"),
                new StringBuilder("a")
        );
        Collections.sort(buildersToSort, charSequenceComparator);

        System.out.println(buildersToSort);
    }
}
