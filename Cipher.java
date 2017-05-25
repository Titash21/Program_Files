import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Cipher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        int value=0,i; char c=' ';
        for(i=0;i<n;i++)
            {
                
                value=s.charAt(i);
                System.out.println("Value of i "+ i + "  "  + value);
                if((value>=65 && value<=90) || (value>=97 && value<=122))
                    {
                        value=value+k;
                        System.out.println("Value is "+ "  "  + value);

                        if(value>122)
                            {
                                value=value-122;
                            }
                        else if(value>90)
                        {
                        value=value-90;
                         }
                         System.out.println("Value after change "+ "  "  + value);

                        c=(char)value;
                        s= new StringBuilder(s).deleteCharAt(i).insert(i,c).toString();
                    }
            
               
            }
        
        System.out.println(s);
    }
}
