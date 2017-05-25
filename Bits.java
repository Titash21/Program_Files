
import java.util.*;

public class StringFUNCTIONS{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int value=-2;
      String Today="Titash", New="Mandal";
      String result = String.format("One: %1$d Two: %2$d Three: %3$d",10, 20, 30);
      System.out.println(result);
      System.out.println("The Binary value of -2"+ " " +Integer.toBinaryString(value));
      System.out.println("The original is" + value);
    
      String result1=String.format("%s %s", Today,New);
      System.out.println(result1);
      
       System.out.println("The compement is" + (~value) );
    }
    
}