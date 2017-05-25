import java.util.*;
public class duplicate{
	public static void main(String args[])
 	 {
 	 	//print the first occurence of repeating character in string
 	 	//abba---->a
 	 	//baby---->b
 	 	Scanner sc=new Scanner(System.in);
 	 	String input=sc.nextLine();
 	 	char a=' ';
 	 	int flag=0;
 	 	char[] charArray=input.toCharArray();
 	 	Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        for (int i = 0; i < charArray.length; i++) 
        {
            char c = charArray[i];
            if(charCountMap.containsKey(c))
            {
            	charCountMap.put(c,charCountMap.get(c)+1);
            }
            else
            {
            	charCountMap.put(c,1);	
            }
         }

          for (int i = 0; i < charArray.length; i++) 
          {
            if (charCountMap.get(charArray[i]) > 1) 
            {
                System.out.println(charArray[i]);
                break;
            }
        } 

            

      
 	 /*	for(int i=0;i<input.length();i++)
 	 	{
 	 		a=input.charAt(i);
 	 		
 	 		for(int j=i+1;j<input.length();j++)
 	 		{

 	 			if(a==input.charAt(j))
 	 			{
 	 				
 	 				flag=1;
 	 				break;
 	 			}
 	 		}
 	 		if(flag==1)
 	 		{
 	 			break;
 	 		}

 	 	}

 	 	System.out.println(a);*/
}
}
