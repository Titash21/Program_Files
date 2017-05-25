import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NewYear{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //number if test cases
        System.out.println("Enter number of test cases");
        int T = in.nextInt();
        int i,j,count,key,flag=0,k;
        for(int a0 = 0; a0 < T; a0++)
        
        {
                count=0;
                //number of people
                System.out.println("Enter number of people"); 
                int n = in.nextInt();
                int q[] = new int[n];
                int t[]=new int[n];
                for(int q_i=0; q_i < n; q_i++)
                {
                q[q_i] = in.nextInt();
                t[q_i]=0;
                }
                
            //checking number of swaps
                for (j = 1; j < n; j++)
                {
                     key = q[j];
                     i = j-1;
                    while ( (i > -1) && ( q[i] > key ) ) 
                    {
                        System.out.println("q[i]:"+"  "+q[i]);
                        System.out.println("q[i+1]:"+"  "+q[i+1]);
                        t[q[i]-1]=t[q[i]-1]+1;
                        t[q[i+1]-1]=t[q[i+1]-1]+1;
                        
                        q[i+1] = q[i];

                        i--;
                        count++;
                       
                    }
                     q[i+1] = key;
                 }
                 System.out.println("Printing the array after swapping");
                 for(int q_i=0; q_i < n; q_i++)
                {
                    System.out.print(" "+ q[q_i]);
                }
            for(k=0;k<n;k++)
                {
                    if(t[k]>2)
                        {
                        System.out.println("Too chaotic");
                        flag=1;
                        }
                }
            if(flag!=1)
                {
                System.out.println(count);
                 }
            
    }
}
}
