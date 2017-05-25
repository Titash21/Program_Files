import java.io.*;

public class TestingStatic{ 
static int count=0;
int b=0;//will get memory when instance is created  
  
TestingStatic(){  
count++; 
b++; 
System.out.println("Count is " + count + "b is "+ b);  
}  
  
  static void area(int x)
  {
  	//will create an error because locah variables cannot be static /* static int areas=x*x; 
  	int areas;
  	areas = x*x;
  	System.out.println("Area is " + areas);
  }

public static void main(String args[]){  
  
TestingStatic ob1= new TestingStatic();
TestingStatic ob2= new TestingStatic();
TestingStatic ob3= new TestingStatic();
area(5);
  
 }  

}