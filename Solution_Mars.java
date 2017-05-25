import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution_Mars {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int length=S.length();
        
        int count=0,j=0,i;
        for(i=0;i<length;i++)
            {
                if(j==0 && new Character(S.charAt(i)).equals('S'))
                   {    
                        System.out.println(S.charAt(i));
                        count++;
                        j++;
                   }
            else if(j==1 && S.charAt(i)!='S')
                {
                    System.out.println("j value is"+" "+j +" "+ S.charAt(i));
                    count++;
                    j++;
                }
                
                else if(j==2 && S.charAt(i)!='O' )
                   {    
                        System.out.println("j value is"+" "+j +" "+  S.charAt(i));
                        count++;
                        j++;
                   }
                        j=0;
                if(j>2)
                    {
                        if(S.charAt(j)!='S')
                        { 
                        System.out.println("j value is"+" "+j +" "+ S.charAt(i));   
                          count++;
                          j++;
                        }
                   
                    }
        }
        System.out.println(count);
    }
}
