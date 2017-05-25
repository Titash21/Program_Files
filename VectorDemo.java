import java.util.*;
import java.io.*;
public class VectorDemo{

	public static void main(String args[]) {
	Vector v= new Vector(0,2);
	System.out.println("Initial size of vector "  + v.size());
	System.out.println("Initial capacity of vector "  + v.capacity());
	v.addElement(new Integer(1));
	v.addElement(new Integer(8));
	v.addElement(new Integer(3));
	v.addElement(new Integer(4));
	System.out.println("after adding the size of vector "  + v.size());
	System.out.println("after adding 4 elements the capacity of vector "  + v.capacity());
	v.addElement(new Double(5.45));
      System.out.println("Current capacity: " + v.capacity());
      
      v.addElement(new Double(6.08));
      v.addElement(new Integer(7));
      System.out.println("Current capacity: " + v.capacity());
	if(v.contains(new Integer(4)))
	{
		System.out.println("YES IT CONTAINS 4");
	}
	else
	{
		System.out.println("NO IT not CONTAINS 4");
	}

	System.out.println("FIRST ELEMENT\t" + v.firstElement());
	System.out.println("LAST  ELEMENT\t" + v.lastElement());
	Enumeration venum=v.elements();
	while(venum.hasMoreElements())
	{
		System.out.println(venum.nextElement());
	}
}


}