import java.util.*;
public class FirstNonRepeatedCharacter{
public static void main(String args[])
	{
		//Morning--->m
		//abcda---->b
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter String");
			String str=sc.nextLine();
			int length=str.length();
			int i,index=0;
			HashMap<Character,Integer> map=new HashMap<Character,Integer>();
			int val=0;
			for(i=0;i<length;i++)
			{
				
					if(map.containsKey(str.charAt(i)))
					{
						int t=map.get(str.charAt(i));
						t++;
						map.put(str.charAt(i),t);
					}
					else
					{
						map.put(str.charAt(i),1);
					}
			}
			for(i=0;i<length;i++)
			{
				val=map.get(str.charAt(i));
				{
					if(val==1)
					{
						System.out.println(str.charAt(i));
						break;
					}
				}
			}
	}
}		