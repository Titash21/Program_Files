import java.io.*;
 
 class addition{

 	int product=0,sum=0;

 	 void multiply(int x,int y)

 	 {
 	 	product= x*y;
 	 	System.out.println("Product is " + product);
 	 	
 	 	
	}

	void add(int x, int y)
	{
		sum=x+y;
		System.out.println("Sum is " + sum);
	}
	void display(){
			System.out.println("inside the display of superclass");
			System.out.println("Inside the display the Product is " + product);
			System.out.println("Inside the display the Sum is " + sum);
		}
 }

 public class division extends addition{

 	double div;

 	void divide(int x, int y){
 			div=x/y;
 		
 	}
 	void display(){
		
		System.out.println("Division value is " + div);
	}
	void func()
	{
		division obj=new division();
 		obj.multiply(5,4);
 		obj.add(5,4);
 		obj.divide(10,5);
 		
 		obj.display();
		super.display();
	}
	

 	public static void main(String args[])
 	{
 		
 		division obj1=new division();
 		obj1.func();
 	}



 }
