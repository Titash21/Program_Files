import java.util.*;
class EncapTest {
   private String name;
   private String idNum;
   private int age;
   public int check;

   public int getAge() {
      return age;
   }

   public String getName() {
      return name;
   }

   public String getIdNum() {
      return idNum;
   }

   public void setAge( int newAge) {
      age = newAge;
   }

   public void setName(String newName) {
      name = newName;
   }

   public void setIdNum( String newId) {
      idNum = newId;
   }

}

public class RunEncap extends EncapTest{

public static void main(String args[]) {
      RunEncap encap = new RunEncap();
      encap.setName("James");
      encap.setAge(20);
      encap.setIdNum("12343ms");
      encap.check=9;
      encap.age=7;
      System.out.println("Check is "+ encap.check);
      System.out.println(" Age is "+ encap.age);

      System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
   }

}
