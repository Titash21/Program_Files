import java.io.*;
 public class AccessModi{

 	private String val="Tea";
 	// private instance variables can be accessed inside the public methods outdie the class

 	public void getString()
 	{
 		System.out.println("Value of val is "+ val);
 		System.out.println("Value of val is "+ this.val);
 	 }

 	 public String SetString()
 	 {
 	 	val="Check";
 	 	return this.val;
 	 }

 	 public static void main(String args[])
 	 {
 	 	String n;
 	 	AccessModi obj=new AccessModi();
 	 	
 	 	obj.getString();
 	 	n=obj.SetString();
 	 	System.out.println("Value of val is "+ n);
 	 }

 }