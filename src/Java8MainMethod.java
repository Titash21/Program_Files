/**
 * Created by TITASH MANDAL on 5/10/2017.
 */
//public class Java8MainMethod extends AbstractClass implements Suv {
//    public static void main(String[] args) {
//        Java8MainMethod java8MainMethod=new Java8MainMethod();
//        java8MainMethod.display();
//    }
//}

public class Java8MainMethod implements InterfaceDefault,ExtraSuv {
    public static void main(String[] args) {
        Java8MainMethod java8MainMethod=new Java8MainMethod();
        java8MainMethod.display();
    }
    @Override
    public void display(){
        ExtraSuv.super.display();
    }
}
