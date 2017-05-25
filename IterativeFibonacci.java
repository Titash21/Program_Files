import java.util.*;
public class Fibonacii{

	void fibonacii_iterative(int number)
		{
			if(number==0) return 0;
			else if(number==1) return 1;
			else
			{
				int n1=0,n2=1;
				int i=0;
				for(i=2;i<=number;i++)
				{
					System.out.println((i-1)+(i-2));
				}
			}
		}
		int fibonacii_recursive(int number)
		{
			if(number==0) return 0;
			else if(number==1) return 1;
			else{
				return fibonacii_iterative(number-1)+fibonacii_iterative(number-2);
			}
		}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		Fibonacii obj=new Fibonacii();
		int number=sc.nextInt();
		int i=0;
		for(i=0;i<number;i++)
		{
			System.out.println(" "+obj.fibonacii_recursive(i));
		}
		obj.fibonacii_iterative(number);
	}
}