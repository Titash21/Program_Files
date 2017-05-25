import java.util.*;
public class PrintString{
public static void main(String args[])
	{
		//qqtrbejj ---->2
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter String");
			String str=sc.nextLine();
			int length=str.length();
			int count=0,j;
			HashMap<Character,Integer> maps=new HashMap<Character,Integer>();
			
			for(int i=0;i<length;i++)
			{
				if(maps.containsKey(str.charAt(i)))
				{
					int t = maps.get(str.charAt(i));
					t++;
					maps.put(str.charAt(i),t);
				}
				else
				{
					maps.put(str.charAt(i),1);
				}
			}
			 Set set =maps.entrySet();
			Iterator it=set.iterator();
			while(it.hasNext())
			{
				Map.Entry mentry = (Map.Entry)it.next();
				int key=(int)mentry.getValue();
				if(key>1)
				{
					count++;
				}
			}
			System.out.println(count);
	}
}