/**
 * Created by TITASH MANDAL on 5/8/2017.
 */
public class InnerOuterClassExample {

    private final int value=223;
    // Inner class is public
    public class InnerClass{
        private final int v=2;
        public int print(){
            System.out.println("Inner Class");
            //inner class can access the private member of outer class
            return value;
        }
    }
    //Method local classes
    void interiorMethods(){
        int relax=232;
        //the local classes can only be final and abstract
         //public
        class LocalClass {
            public void printRelax(){
                System.out.println("Relax inside local method is " + relax);
            }
        }
        LocalClass localClass=new LocalClass();
        localClass.printRelax();
    }

    // Private Inner Class
    private class InnerPrivateClass{
        public void printPrivate(){
            System.out.println("Private Inner Class");
        }
    }
    // outer class can access the private members of inner class
    public int outerPrint(){
        // the private class objects can only be created inside the outer class
        InnerPrivateClass innerPrivateClass=new InnerPrivateClass();
        innerPrivateClass.printPrivate();
        return new InnerClass().v;
    }
}
