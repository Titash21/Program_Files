import java.util.*;
import java.io.*;
public class StringRepeat{
	//remove consecutive duplicate instances of a string eg ttsshh="EMPTY"
	//ttshhh=sh
	//double letters removed just 
	public static void main(String args[])
	{
			Scanner sc= new Scanner(System.in);
			String input= sc.nextLine();
			int i;
			String a="zbak";
			int value=0;
			
			for(i=0;i<a.length();i++)
			{
				value=a.charAt(i)-'a';
				System.out.println(value);
			}
			

			
			
			for(i=1;i<input.length();i++)
			{
					if(new Character(input.charAt(i)).equals(new Character(input.charAt(i-1))))
					{
						input= new StringBuilder(input).deleteCharAt(i).deleteCharAt(i-1).toString();
						i=0;	
					}
			}

			if(input.isEmpty())
			{
				System.out.println("empty String");

			}
			else
			{
				System.out.println(input);
			}
	}
}