import java.io.*;
import java.util.*;

class StaticCheck{  
     int rollno;  
     String name;  
     static String college = "ITS";  
       
     static void change(){  
     college = "BBDIT";  
     }  
  
     StaticCheck(int r, String n){  
     rollno = r;  
     name = n;  
     }  
  
     void display (){System.out.println(rollno+" "+name+" "+college);}  
        int factorial(int n)
        {
            if(n==1)
            {
                return 1;
            }
               
                
            return (n*factorial(n-1));
                
                
        }
    public static void main(String args[]){  
  change();  
  
    StaticCheck s1 = new StaticCheck (111,"Karan");  
   StaticCheck s2 = new StaticCheck(222,"Aryan");  
    StaticCheck s3 = new StaticCheck(333,"Sonoo");  
  
    s1.display();  
    s2.display();  
    s3.display();
    System.out.println("Enter the number whose factorial is needed");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int fact=s1.factorial(n); 
    System.out.println(fact);
    }  
}