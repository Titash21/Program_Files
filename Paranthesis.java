import java.util.*;
public class Paranthesis{
	public static void main(String args[])
	{
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		Stack<Character> stk=new Stack<Character>();
		int lengths=str.length();
		int flag=0;
	
		for(int i=0;i<lengths;i++)
		{
			if(str.charAt(i)=='(' || str.charAt(i)=='{'|| str.charAt(i)=='[')
			{
				
				stk.push(str.charAt(i));
			}
			else if(str.charAt(i)=='}' && !stk.empty() && (stk.peek()).equals('{')) 
			{
				stk.pop();
			}
			else if(str.charAt(i)==')' && !stk.empty() && (stk.peek()).equals('('))
			{
				stk.pop();
			}
			else if(str.charAt(i)==']' && !stk.empty() && (stk.peek()).equals('['))
			{
				stk.pop();
			}
			else
			{
				flag=-1;
				break;
			}
		}
		if(flag==-1)
		{
			System.out.println("Invalid String");
		}
		else
		{
			System.out.println("Valid String");
		}
	}
}