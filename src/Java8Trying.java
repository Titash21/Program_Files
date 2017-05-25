import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by TITASH MANDAL on 5/7/2017.
 */
public class Java8Trying {
    public static void main(String[] args){
        Optional<String> gender=Optional.of("MALE");
        String name="Titash";
        String nullValue=null;
        System.out.println("Optinal value "+ gender);
        System.out.println("Gender Value= "+ gender.get());
        System.out.println("STRING OPTIONAL "+ Optional.ofNullable(name));
        System.out.println("STRING OPTIONAL " + Optional.ofNullable(nullValue));
        //System.out.println("ofNullable on Nonempty Optional "+ Optional.of(nullValue));
        // Without using optional
        List<String> list=new ArrayList<>();
        String value=null;
        if(value!=null){
            list.add(value);
        }
        System.out.println("Without using optional Size of List is " + list.size());
        //Using Optional
        Optional<String> optional=Optional.of("Number");
        Optional<String> optional1=Optional.ofNullable(null);
        optional.ifPresent(list::add);
        optional1.ifPresent(list::add);
        System.out.println("The size after adding values is" +list.size());
        System.out.print("%nThe values are " + list);

        List<String> collected = Stream.of("a", "b", "hello") // Stream of String
                .map(String::toUpperCase) // Returns a stream consisting of the results of applying the given function to the elements of this stream.
                .collect(Collectors.toList());
        System.out.println(collected);

//      List<Integer> together = Stream.of(asList(1, 2), asList(3, 4)) // Stream of List<Integer>
//        .flatMap(List::stream)
//                .map(integer -> integer + 1)
//                .collect(Collectors.toList());

        //Optional MAP and FlatMap
        List<String> listString= Arrays.asList("Titash","Mandal","","","Counters");
      List<String> number=listString.stream().filter(t->!t.isEmpty()).collect(Collectors.toList());
        System.out.println("printing list after filtering "+number);
        //System.out.println(filterlList);
    }
}
