

/**
 * Created by TITASH MANDAL on 5/5/2017.
 */
public class MainMethod {
    public static void main(String args[]){

        //Testing inheritance
        Animal[] animal=new Animal[]{new Dog(), new Cat()};
        Dog[] dog=new Dog[]{new Dog(), new Dog()};
        animal=dog;
        //exception first occurs here
        //animal[0]=new Cat();

        GenericsTest<Number> genericsTest=new GenericsTest<Number>();
        Integer i= (Integer) genericsTest.getValue(10);
        Double d= (Double) genericsTest.getValue(10.22d);

        //genericsTest.getValue(new GenericsTest<Integer>());
        //genericsTest.getValue(new GenericsTest<Double>());
        InnerOuterClassExample innerOuterClassExample=new InnerOuterClassExample();
        InnerOuterClassExample.InnerClass innerClass= innerOuterClassExample. new InnerClass();
        int value= innerClass.print();
        System.out.println("Value returned from inner class is "+ value);
        int valueOuter=innerOuterClassExample.outerPrint();
        System.out.println("Value returned from outer class is "+ valueOuter);
        innerOuterClassExample.interiorMethods();
        //Java 8


    }
}
