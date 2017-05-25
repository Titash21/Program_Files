import java.io.*;
 
public class GarbageCollection{

	public void finalize(){
	System.out.println("Garbage collected\n");}

	public static void main(String args[])
	{
		 GarbageCollection obj1 =new GarbageCollection();
		 GarbageCollection obj2 =new GarbageCollection();
		 obj1=null;
		 obj2=null;
		 System.gc();

	}

}	

