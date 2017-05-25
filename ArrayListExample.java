import java.util.*;

public class ArrayListExamples{

public static void main(String args[]){
		
		ArrayList<String> obj= new ArrayList<String>(
			Arrays.asList("Titash","Rohan","Tom","Hari","Omkar","Manish"));

		System.out.println("The list before sorting is \n"+obj);
		/* Sort statement*/
	   Collections.sort(obj);
	   System.out.println("The list after sorting is \n"+obj);

}
	
}