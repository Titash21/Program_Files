import java.io.*;
 
/*public class GarbageCollection{

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

}	*/

public class TestGarbage1{  
 public void finalize(){System.out.println("object is garbage collected");}  
 public static void main(String args[]){  
  TestGarbage1 s1=new TestGarbage1();  
  TestGarbage1 s2=new TestGarbage1();  
  s1=null;  
  s2=null;  
  System.gc();  
 }  
} 
