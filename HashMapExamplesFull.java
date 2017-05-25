import java.util.*;
  
public class HashMapExamplesFull{

public void finalize(){System.out.println("object is garbage collected");}
 public static void main(String[] args) {

HashMap<Integer,String> obj= new HashMap<Integer,String>();

 	obj.put(1,"Tona");
 	obj.put(8,"Minu");
 	obj.put(7,"Titash");
 	obj.put(4,"Hitesh");
 	int size=obj.size();
 	System.out.println("The size is "+size);
 	Set set=obj.entrySet();
 	Iterator it=set.iterator();

 	while(it.hasNext())
 	{
 		Map.Entry mentry=(Map.Entry)it.next();
 		System.out.println("The value is   "+ mentry.getValue()+"   The key is  "+ mentry.getKey());
		
	}
		Map<Integer, String> map = new TreeMap<Integer, String>(obj); 
         System.out.println("After Sorting:");
         Set set2 = obj.entrySet();
         Iterator iterator2 = set2.iterator();
         while(iterator2.hasNext()) {
              Map.Entry me2 = (Map.Entry)iterator2.next();
              System.out.print(me2.getKey() + ": ");
              System.out.println(me2.getValue());
          }

          obj=null;
	map=null;
 System.gc();

 }

 


}