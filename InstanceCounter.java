import java.io.*;
 

class Finals{

	int add=0;
	final void adding(){
		System.out.println("Adding" + ++add);
	}

}

class Final1 extends Finals{
	void check()
	{
		System.out.println("In child class \t" + add);
	}

	public static void main(String args[])
	{
      Final1 obj = new Final1();
      obj.Final1();

   }

}
