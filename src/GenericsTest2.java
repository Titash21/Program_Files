/**
 * Created by TITASH MANDAL on 5/7/2017.
 */
public class GenericsTest2 {
    public static void main(String[] args) {

        Gift<Computer> gift=new Gift<Computer>(new Computer(),137d);
        GenericsTest2 object=new GenericsTest2();
        object.print1(gift);
        object.print2(gift);
    }
    public<T extends Object> T print1(Gift<T> genericsTest2){
        System.out.println("Value inside T");
        return null;
    }
    public void print2(Gift<?> gift){
        System.out.println("Value inside Wildcard");
    }
}
