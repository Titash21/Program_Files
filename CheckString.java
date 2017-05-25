import java.util.*;
public class CheckString{
	
	void check(String str)
	{

	int count=0,i,j=0,h=0,flag=0,index=0,size=0;
	int lengths=str.length();
	size=lengths;

	
	System.out.println("length of string is "+ " "+ lengths);
	if((str.charAt(0))>=64 && (str.charAt(0)<=90) )
	{
		for(i=1;i<lengths;i++)
		{
			j=str.charAt(i-1);
			h=str.charAt(i);
			
			if(h==(j+32))
			{
				//count++;
				if(lengths<size)
				{
					index=i+(size-lengths);
				}
				
				StringBuilder sb=new StringBuilder(str);
				str=sb.deleteCharAt(i).deleteCharAt(i-1).toString();
				lengths=lengths-2;
				i=i-2;
				continue;
			}
			else if((str.charAt(i))>=64 && (str.charAt(i)<=90))
			{
				//count++;
				continue;
			}
			
			else
			{
			flag=1;
			break;
			}
			
		}
		if(flag==1)
		{
			System.out.println("Invalid String");
		}
		else
		{
		System.out.println(" "+ index);	
		}
		
	}
	else
	{
		System.out.println("Invalid String");
	} 
	

}	
	public static void main(String args[])
	{
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		
		CheckString obj=new CheckString();
	
		obj.check(str);
	}
}