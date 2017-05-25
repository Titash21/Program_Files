import java.util.*;
import java.io.*;
public class CovertString{
	/*String  always consists of two distinct alternating characters.
	 For example, if string 's two distinct characters are x and y, then t could be xyxyx or yxyxy but not xxyy or xyyx.

You can convert some string  to string  by deleting characters from .
 When you delete a character from , you must delete all occurrences of it in . 
 For example, if  abaacdabd and you delete the character a, then the string becomes bcdbd.

Given , convert it to the longest possible string . 
Then print the length of string  on a new line; if no string  can be formed from , print  instead.*/
	
	public static void main(String args[])
	{
			Scanner sc= new Scanner(System.in);
			String input= sc.nextLine();
			int length=input.length();
			char c=' ';
			int i,j;
			for(i=0;i<length;i++)
			{
					c= input.CharAt(i);
					for(j=0;j<length;j++)
					if(c.equals(input.CharAt(j)))
					{

						input= new StringBuilder(input).deleteCharAt(j).toString();
					}
			}

	}
}
