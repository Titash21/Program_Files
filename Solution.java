import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<Integer> array=new ArrayList<Integer>();
        int val,count=0,sum=0;
        Scanner sc = new Scanner(System.in);
        array.add(0,0);
        array.add(1,1);
        val=sc.nextInt();

        for(count=2;count<=val;count++)
            {
                sum=array.get(count-1)+array.get(count-2);
                array.add(count,sum);
                sum=0;
            }

        Iterator it=array.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println(array.get(val));



        
    }
}