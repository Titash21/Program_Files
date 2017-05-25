import java.util.*;
public class reverseString{
	public static void main(String args[])
	{
		String str,reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		str=sc.nextLine();
		StringBuilder sb=new StringBuilder(str);
		str=sb.reverse().toString();
		System.out.println(str);
		int lengths=str.length();
		for(int i=lengths-1;i>=0;i--)
		{
			reverse+=str.charAt(i);

		}
		System.out.println(reverse);

	}
}