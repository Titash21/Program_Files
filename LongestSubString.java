import java.util.*;

public class LongestSubString{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		char c;
		int max_Length=0;
		Set<Character> lookup=new HashSet<Character>();
		int lengths=str.length();
		int start=0,j=0,t=0;
		for(int i=0;i<lengths;i++)
		{
			c=str.charAt(i);
			if(lookup.contains(str.charAt(i)))
			{
				System.out.println("Common CHARACTER FOUND"+str.charAt(i));
				j=start;
				System.out.println("Start"+ j);
				while((str.charAt(j)!=c) && (j<lengths))
				{
					lookup.remove(str.charAt(j));
					
					System.out.println("Removed Character"+" "+c);
					j++;
					Iterator it=lookup.iterator();
					while(it.hasNext())
					{
						System.out.print(it.next());
					}
					System.out.println();

				}
				start=j+1;
			}
			else
			{
				lookup.add(str.charAt(i));
			}
			System.out.println("Max Length at iteration"+" "+ t+ " " +max_Length);
			t++;
			max_Length=Math.max(max_Length,i-start+1);
		}

		System.out.println(max_Length);
	}
}