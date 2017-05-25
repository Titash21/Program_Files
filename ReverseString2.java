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
		System.out.println("YES");	
		}
		else
		{
			System.out.println("NO");	
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