import java.util.*;

/**
 * Created by TITASH MANDAL on 5/10/2017.
 */
public class RemovalWithoutIterator {
    public static void main(String[] args) {
        List<String> collection= Arrays.asList("Titash", "Mandal");
        Set<String> set= new HashSet<>();
        set.add("eytywe");
        set.add("egf");
        set.add("efghcnb");

        System.out.println("Size "+collection.size());
        System.out.println("Size SET "+set.size());
//        for(String value:collection){
//            System.out.println(collection.remove(value));
//        }
        System.out.println("Size "+collection.size());
        for(String value:set){
            System.out.println(set.remove(value));
        }
        System.out.println("Size SET "+set.size());
    }
}
