import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NewYear2{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
     System.out.println("Enter number of test cases");
    int T = in.nextInt();
    for(int a0 = 0; a0 < T; a0++)
    {
        System.out.println("Enter number of people"); 
        int n = in.nextInt();
        int q[] = new int[n];
    System.out.println("Entered the first array"); 

        for(int q_i=0; q_i < n; q_i++)
            q[q_i] = in.nextInt();

        int bribe = 0;
        boolean chaotic = false;
        for(int i = 0; i < n; i++)
        {
            if(q[i]-(i+1) > 2)
            {               
                chaotic = true;
                break;     
            }
            for (int j = Math.max(0, q[i]-1-1); j < i; j++)
                if (q[j] > q[i]) 
                    bribe++;
        }
        if(chaotic)
            System.out.println("Too chaotic");
        else
            System.out.println(bribe);
    }
}
}
