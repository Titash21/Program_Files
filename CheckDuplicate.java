import java.util.*;
public class CheckDuplicate{
	boolean duplicates (int [] x) {
		//Check is array has duplicate elements by converting to set as it allows only unique values
    Set<Integer> set = new HashSet<Integer>();
    int numElementsInX=x.length;
    int flag=0;
    for ( int i = 0; i < numElementsInX; i++ ) {
        if ( set.contains( x[i])) {
        	System.out.println("Duplicate element is  "+" "+x[i]);
            flag=1;
        }
        else {
            set.add(x[i]);
        }
    }
    if(flag==0)
    {
    	return false;
    }
	else{
			return true;
		}
    
	}

	public static void main(String args[])
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your size of array");
			CheckDuplicate obj=new CheckDuplicate();
			int size=sc.nextInt();
			int[] x=new int[size];
			System.out.println("Now enter your elements");
			for(int i=0;i<size;i++)
			{
				x[i]=sc.nextInt();
			}
			
			if(obj.duplicates(x))
			{
				System.out.println("Has duplicates");
			}
			else
			{
				System.out.println("Does not have duplicates");
			}
	}
}