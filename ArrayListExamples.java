import java.util.*;

public class ArrayListExamples{

public static void main(String args[]){
		
		ArrayList<String> obj= new ArrayList<String>(
			Arrays.asList("Titash","Rohan","Tom","Hari","Omkar","Manish"));
		ArrayList<String> obj2= new ArrayList<String>(
			Arrays.asList("Titan","Rohini","Tomini","Hariini","Omkarii","Manishini"));
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(7);
		hs.add(1);
		hs.add(9);
		hs.add(5);
		hs.add(3);
		
// Converting HASH SET TO TREE SET
		Set<Integer> s = new TreeSet<Integer>(hs);
		System.out.println(s);
		LinkedList<String> lk=new LinkedList<String>();
		int sizes=lk.size();
		System.out.println("The list size initally is \n"+ sizes);
		obj.add(0,"Minakshi");
		System.out.println("The list is \n"+obj);
		System.out.println();
		obj.add(0,"Buffalo");
		System.out.println("The list before updating is \n"+obj);
		System.out.println();
		obj.set(0,"Buffalo2");
		System.out.println("The list update is \n"+obj);
		System.out.println();
		Iterator iter = obj.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}

		System.out.println("The list before sorting is \n"+obj);
		System.out.println();
		/* Sort statement*/
	   Collections.sort(obj);

	   System.out.println("The list after sorting is \n"+obj);
	   System.out.println();
	   lk.add("FirstItem");
	   lk.add("SecondItem");
	   lk.add("ThirdItem");
	   System.out.println("The Link list update is \n"+lk);
	   System.out.println();

	   System.out.println("Adding ArrayList into Linked List");
	   //you should be having a liked lst prepared to insert values at particular indices of it
	   lk.addAll(1,obj);
	   lk.addAll(2,obj2);
	   sizes=lk.size();
	   System.out.println("The list size now is \n"+ sizes);
	   System.out.println();
	    System.out.println("REVERSE ORDER LIST");

	   for(int i=sizes-1;i>0;i--)
	   {
	   	System.out.println(lk.get(i));
	   }
	   
	   System.out.println("The list is \n"+lk);
	   System.out.println();
	   System.out.println("The HashSet list update is \n"+lk);

	   	Iterator it= hs.iterator();
	   while(it.hasNext())
		{
			System.out.println(it.next());
		}


}
	
}