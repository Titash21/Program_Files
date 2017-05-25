import java.io.*;
 

class Finals{

	int add=0;
	final void adding(){
		System.out.println("Adding" + ++add);
	}

}

public class Final1 extends Finals{
	void check()
	{
		System.out.println("In child class \t" + add);
	}

	public static void main(String args[])
	{
     	new Final1().check();
     

   }

}
