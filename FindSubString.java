import java.util.*;
public class FindSubString{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		System.out.println("Enter the substring");
		String find=sc.nextLine();


		int index=0,count=0;
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
	}
}