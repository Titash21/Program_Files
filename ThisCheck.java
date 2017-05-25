import java.io.*;
class Cons{
	Cons()
	{
		//this has to be the first line in the constructor
		this("STRING PASSED");
		System.out.println("Inside the constructor with no argument\n");
		
	}
	Cons(String var)
	{
		System.out.println("Inside the constructor with argument and value of var is\n"+ var);
	}
}
public class ThisCheck{

	int variable=6;
	 public static void main(String args[])
	 {
	 	ThisCheck obj=new ThisCheck();
	 	Cons obj1= new Cons();

	 	obj.printval(20);
	 	obj.printval();
	 }

  void printval(int variable)

  {
  		System.out.println("The local variable value is "+ variable);
  		System.out.println("The instance  variable value is "+ this.variable);
  }
  void printval()

  {
  		int variable=50;
  		System.out.println("The local value is"+ variable);
  		System.out.println("The instance  variable value is"+ this.variable);
  }
}

