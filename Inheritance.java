import java.util.*;
 class calculation{
	public int adding(int x,int y)
	{
		int sum=x+y;
		return sum;
	}
	public int subs(int x,int y)
	{
		int diff=Math.abs(x-y);
		return diff;
	}
}

public class Inheritance extends calculation{

	public int mul(int x,int y)
	{
		int mul=x*y;
		return mul;
	}
	public static void main(String args[])
	{
		Inheritance obj=new Inheritance();
		int sum=obj.adding(6,7);
		System.out.println("Sum is  "+ sum);
		int diff=obj.subs(3,4);
		System.out.println("Diff is  "+ diff);
		diff=obj.subs(7,4);
		System.out.println("Diff is  "+ diff);
		int prod=obj.mul(7,9);
		System.out.println("prod is  "+ prod);


	}
}