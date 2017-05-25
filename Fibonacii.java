import java.util.*;
public class Fibonacii{

	void fibonacii_iterative(int number)
		{
			if(number==0) 
			{
				System.out.println(0);
			}
			else if(number==1) {
				System.out.println(1);
			}
			else
			{
				int n1=0,n2=1,n3=0;
				int i=0;
				System.out.println(0);
				System.out.println(1);
				for(i=2;i<=number;i++)
				{
					System.out.println((n1)+(n2));
					n3=n1+n2;
					n1=n2;
					n2=n3;
				}
			}
		}
		int fibonacii_recursive(int number)
		{
			if(number==0){ return 0;} 
			else if(number==1) {return 1;}
			
			else{
				return fibonacii_recursive(number-1)+fibonacii_recursive(number-2);
			}
		}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		Fibonacii obj=new Fibonacii();
		int number=sc.nextInt();
		int i=0,val;
		for(i=0;i<=number;i++)
		{
			val=obj.fibonacii_recursive(i);
			System.out.println(" "+val);
		}
		obj.fibonacii_iterative(number);
	}
}