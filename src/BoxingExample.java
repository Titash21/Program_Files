/**
 * Created by TITASH MANDAL on 5/9/2017.
 */
public class BoxingExample {
    public static void main(String[] args) {
        int i=121;
        int first=65;
        Integer second=65;
        Integer third=65;
        System.out.println("Comparing first and second "+ (first==second));
        System.out.println("Comparing third and second "+ (third==second));
        System.out.println("After rewriting");
        first=128;
        second=128;
        third=128;
        System.out.println("Comparing first and second "+ (first==second));
        System.out.println("Comparing third and second "+ (third==second));
        System.out.println("After rewriting2.......");
        first=12;
        second=12;
        third=12;
        System.out.println("Comparing first and second "+ (first==second));
        System.out.println("Comparing third and second "+ (third==second));


        display(i);
        CompareValues();
    }
    //widening has a precedence over Boxing
    //Boxing has a precedene over Varargs
    // Widening and Boxing both cannot be applied together if its the only method
    public static void display(Integer i){
        System.out.println("The Integer wrapped value is " + i);
    }
    public static void display(long i){
        System.out.println("Widening over Boxing "+ i);
    }
    //NOT ALLOWED HERE
    public static void display(Long i){
        System.out.println("Is this was the only display method, it would give an error");
    }
    public static void display(Integer... i){
        if(i==null || i.length<=0){
            return;
        }
        for(Integer integer:i){
            System.out.println(" "+i);
        }
    }
    public static void CompareValues(){
        Integer i1=100;
        Integer ii1=100;
        Integer obint=new Integer(10);
        Integer obint1=new Integer(10);
        int i2=100;
        System.out.println("Compare Integer with int "+ (i1==i2));
        System.out.println("Compare Integer with Integer " + (i1==ii1));
        System.out.println("Compare new Integer with new Integer "+ (obint==obint1));

        obint=4;
        obint1=4;
        // if we add values between [-128 , 127] we get the values as cached
        System.out.println("Compare Caching "+ (obint==obint1));
        obint=1000;
        obint1=10000;
        System.out.println("Cached out of range " + (obint==obint1));

    }
}
