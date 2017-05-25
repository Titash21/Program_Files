import java.util.*;
public class RemoveDuplicate2{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String1");
		String str1=sc.nextLine();	
		String str2=" ";
		//System.out.println("Enter String2");
		StringBuilder sb1=new StringBuilder(str1);
		str2=sb1.reverse().toString();
		if(str1.equals(str2))
		{
		System.out.println("YES Palindrome");	
		}
		else
		{
			System.out.println("NOt Palindrome");	
		}
		int length=str1.length();
		Set<Character> set=new HashSet<Character>();
		for(int i=0;i<length;i++)
		{
			if(set.contains(str1.charAt(i)))
			{
				continue;
			}
			else
			{
				set.add(str1.charAt(i));
				System.out.print(str1.charAt(i));
			}
		}

		/*int length=str.length();
		char[] strnew=new char[length];

		String newOne=" ";
		int i,j=0;
		for(i=length-1;i>=0;i--)
		{
			strnew[j]=str.charAt(i);
			j++;
		}
		for(i=0;i<length;i++)
		{
		System.out.print(strnew[i]);	
		}*/
		

	}
}		