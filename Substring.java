import java.util.*;
public class Substring{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter string");
		String str=sc.nextLine();
		System.out.println("Enter SubString");
		String find=sc.nextLine();
		int count=0;
		int index=0;
		int lengths=str.length();
		while(index!=-1)
		{
			index=str.indexOf(find,index);
			if(index!=-1)
			{
				count++;
				index=index+(find.length());
				
			}
					
		}
		System.out.println(count);
		count=0;
		int count1=0,j=0,i;
		int lengths1=find.length();
		for(i=0;i<lengths;i++)
		{
			
				j=0;
			
			while(str.charAt(i)==find.charAt(j))

			{
					System.out.println(str.charAt(i)+"  " +find.charAt(j));
					System.out.println("");
					count++;
					j++;
					i++;
					
			}	
				if(count==lengths1)
				{
					System.out.println("count"+ count);
					count1++;
					System.out.println("count1"+ count1);
					count=0;
				}
				
				//System.out.println(j);
		
				
	}
			System.out.println(count1);
		}
		
}
