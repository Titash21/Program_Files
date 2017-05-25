import java.io.*;
import java.util.*;

public class TestInput {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String s = n.nextLine();
        for(int i = 1; i < s.length() ; i++){

            //StringBuilder objects are like String objects, except that they can be modified. 
            //Internally, these objects are treated like variable-length arrays that contain a sequence of characters.
            // At any point, the length and content of the sequence can be changed through method invocations
           if (new Character(s.charAt(i)).equals(new Character(s.charAt(i -1))))
                {
                    s = new StringBuilder(s).deleteCharAt(i).deleteCharAt(i -1).toString();
                    i = 0;
                }               
        }    
        String response = (s.isEmpty()) ? "Empty String" : s;
        System.out.println(response);
        
    }
}