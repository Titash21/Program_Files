import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigDecimal;
/* Name of the class has to be "Main" only if the class is public. */
public class MidTerm{
	public static void main (String[] args) throws java.lang.Exception
	{


		printAge(22);
		double peroid=7.232;
		BigDecimal bigPeroid=new BigDecimal(Double.toString(peroid));
		BigDecimal diff=bigPeroid.subtract(BigDecimal.ONE);

		System.out.println(diff);

		/*Inner obj=new Inner();
		obj.display();*/
		System.out.println(12345 + 5432l);

		char x='c';
		String s="Titash";
		short val=-32767;
		final int i=0;
		long longT=10L;
		byte value=(byte)10;
		System.out.println("TERNARY CHECK");
		System.out.println((5>9)? i:x);
		System.out.println((5<9)? x:value);
		System.out.println(false?i:x);
		System.out.println(false?i:s);
		System.out.println(false?i:val);
		System.out.println("EXPRESSION CHECK");
		int a=0,b=0;
		boolean expres=(++a==++b);
		System.out.println(expres);
		System.out.println("MAX_VALUE AND MIN_VALUES");

		
		
		// your code goes here
	/*double a=1.11d,b=2.22d,c=3.33d;
	private static double getX(double a, double b,double c){
		return a*b/c;
	}
	private static strictfp double getY(double a, double b,double c){
		return a*b/c;
	}
		
	double x=getX(a,b,c);
	double y=getY(a,b,c);
	System.out.println( "x " + x +"y  "+y);
	}*/


	/*int a=-1,b=-1,c=3;
		c+=b*=a;
		System.out.println(c);*/
		/*int first;
		Integer second;
		Integer third;
		first=12;
		second=12;
		third=12;

		System.out.println((first==second));
		System.out.println((third==second));
		first=121;
		second=121;
		third=121;
		System.out.println((first==second));
		System.out.println((third==second));*/
		/*Integer i=new Integer(10);
		Integer i1=new Integer(10);

		System.out.println((i==i1));
		i=10;
		i1=10;
		System.out.println((i==i1));
		i=1000;
		i1=1000;
		System.out.println((i==i1));*/

	}

	public void printName(String name){
		System.out.println(name);
	}
	public static void printAge(int age){
		System.out.println(age);
	}
}