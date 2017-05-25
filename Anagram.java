import java.util.*;
public class Anagram{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String1");
		String str1=sc.nextLine();
		int length1=str1.length();
		int t=length1;
		
		System.out.println("Enter String2");
		String str2=sc.nextLine();
		int length2=str2.length();
		char[] charstr1=str1.toCharArray();
		char[] charstr2=str2.toCharArray();
		Arrays.sort(charstr1);
		Arrays.sort(charstr2);
		if(Arrays.equals(charstr1,charstr2))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}

		

		int count=0,flag=0,index=0;
		
		if(length1!=length2)
		{
			
			flag=1;
		}

		else
		{

			for(int i=0;i<length1;i++)
			{
				index=str2.indexOf(str1.charAt(i),0);
				if(index==-1)
				{
					flag=1;
					break;
				}
				else
				{
					//System.out.println(str1.charAt(i));
					StringBuilder sb1=new StringBuilder(str1);
					StringBuilder sb2=new StringBuilder(str2);
					str1=sb1.deleteCharAt(i).toString();
					str2=sb2.deleteCharAt(index).toString();
					
					length1--;
					length2--;
					i--;

					count++;
					
				}
			}
		}
		if(flag==1 || count!=t)
		{
		System.out.println("NO");	
		}
		else if(count==t)
		{
			System.out.println("YES");
		}

	}
}