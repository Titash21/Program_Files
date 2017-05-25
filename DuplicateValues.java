import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DuplicateValues{

    public static void main(String[] args) {
        HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
        int val,length,i=0;
       
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER LENGTH OF THE ARRAY");
        length=sc.nextInt();
        
        while(i<length)
        {
                val=sc.nextInt();
                Integer intObj = new Integer(val);
                if(hmap.containsKey(intObj))
                    {
                        int count=hmap.get(intObj);
                        hmap.put(val,++count);
                    }
                else
                    {
                    hmap.put(val,1);
                    }
                    i++;
            
        }
        Set set=hmap.entrySet();
        Iterator it=set.iterator();
        while(it.hasNext())
            {
            Map.Entry mentry=(Map.Entry)it.next();
            
            if((int)mentry.getValue()<2)
                {
                    System.out.println( mentry.getKey() + " does not have a pair" );
                }
        }
        
        
            
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}