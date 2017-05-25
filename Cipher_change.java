import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Cipher_change {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        int value=0,i,diff=0; char c=' ';
        for(i=0;i<n;i++)
            {
                
                value=s.charAt(i);
                    if (value >= 'a' && c <= 'z') 
                    { // Lowercase characters
                            value += k;
                            if (value > 'z')
                             { // C exceeds the ascii range of lowercase characters.
                            value = 96 + (value % 122); // wrapping from z to a
                            }
                    } 

                    else if(c >= 'A' && c <= 'Z') 
                    { // Uppercase characters
                            value += k;
                         if(value > 'Z') 
                         { // C exceeds the ascii range of uppercase characters.
                                value = 64 + (value % 90); //wrapping from Z to A
                        }
                }
                        c=(char)value;
                        s= new StringBuilder(s).deleteCharAt(i).insert(i,c).toString();
            }
               /* if((value>=65 && value<=90) || (value>=97 && value<=122))
                    {
                        value=value+k;
                        

                        if(value>122)
                        {
                            diff=value-123;
                            value=diff+97;
                        }
                        if(value>90 && value <97)
                        {
                            diff=value-91;
                            value=diff+65;

                    }
                        
                         

                        c=(char)value;
                        s= new StringBuilder(s).deleteCharAt(i).insert(i,c).toString();
                    }
            
               
            }*/

        
        
        System.out.println(s);
    }
}
