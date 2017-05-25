import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    /*Suppose you have a String, , of length  that is indexed from  to . 
    You also have some String, , that is the reverse of String .  
    is funny if the condition  is true for every character  from  to .

Note: For some String ,  denotes the ASCII value of the  -indexed character in . 
The absolute value of an integer, , is written as .*/

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc= new Scanner(System.in);
         int t=sc.nextInt();

for(int i=0;i<t;i++)
    {
    int flag=0;
    String s=sc.next();
    int start=0,end=s.length()-1;

    while(start<(s.length()-2))
        {

        int first=(int)s.charAt(start);
        int last=(int)s.charAt(end);
        int sec=(int)s.charAt(start+1);
        int sec_last=(int)s.charAt(end-1);

        if(Math.abs(first-sec)!=Math.abs(last-sec_last))
        {
            flag=1;
            break;
         }   

        start++;
        end--;
    }

    if(flag==0)
        System.out.println("Funny");
    else
        System.out.println("Not Funny");
}
        
    }
}