import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangram {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int[] array= new int[26];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        input=input.toLowerCase();
        System.out.println(input);
        int i,value=0;
        for(i=0;i<input.length();i++)
            {
            //97==a , 122=z
            value=input.charAt(i)-'a';
            if(value>0)
            {
              
                array[value]=1;
            }
            
            }


        for(i=0;i<26;i++)
            {
                System.out.println(array[i]);
                sum+=array[i];

            }
            System.out.println("SUM" +sum);
        if(sum==25)
            {
            System.out.println("pangram");
        }
        else
            {
            System.out.println("not pangram");
        }
    }
}