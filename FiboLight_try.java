import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FiboLight_try{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<Integer> array=new ArrayList<Integer>();
        int val,count=2,sum=0,sizes=0;
        Scanner sc = new Scanner(System.in);
        array.add(0,0);
        array.add(1,1);
        
        
        while(sc.hasNext())
      {
            val=sc.nextInt();
            sizes=array.size();
            

            
           if(sizes<val){
                         for(count=sizes;count<=val;count++)
                        {
                            sum=array.get(count-1)+array.get(count-2);
                            array.add(count,sum);
                            sum=0;
                         }
                        
                         

                    System.out.println(array.get(val));
               }
               else if(sizes>val)
                {
                        System.out.println();
                        System.out.println("THE LIST IS\n");
                           
                        System.out.println();
                        System.out.println("The value is at \t" + val+ "is\t"+ array.get(val));
                }
                
                        
            
        }      
        



        
    }
}