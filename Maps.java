import java.util.*;

public class Maps{

	/*A Map is an object that maps keys to values. 
	A map cannot contain duplicate keys:
	Each key can map to at most one value. It models the mathematical function abstraction. The Map interface includes methods for basic operations (such as put, get, remove, containsKey, containsValue, size, and empty),
	bulk operations (such as putAll and clear), and collection views (such as keySet, entrySet, and values).*/
	
	public static void main(String args[]){
		int i=0;
		Map<String, Integer> m = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		String[] array = new String[5];
		for(i=0;i<array.length;i++)
		{
			array[i]=sc.nextLine();
		}
		
	

        // Initialize frequency table from command line
        for (String a : array) {
            Integer freq = m.get(a);
            //That argument is a conditional expression that has the effect of setting the frequency to one if the word 
            //has never been seen before or one more than its current value if the word has already been seen
            m.put(a, (freq == null) ? 1 : freq + 1);
        }

        System.out.println(m.size() + " distinct words:");
        System.out.println(m);

	}

}