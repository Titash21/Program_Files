import java.util.*;
public class CheckTriangle{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int side1=sc.nextInt();
		int side2=sc.nextInt();
		int side3=sc.nextInt();
		int val1=side1+side2;
		int val2=side2+side3;
		int val3=side3+side1;
		if((val1>side3) && (val2>side1) && (val3>side2))
		{
			if((side1==side2)&&(side2==side3))
				{
					System.out.println("Equilateral");
				}
				else if(side1==side2 || side2==side3 || side3==side1)
				{

						System.out.println("Isosceles");
				}
				else{
					System.out.println("NONE OF THESE");
				}
		}

		else
		{
			System.out.println("INVALID TRIANGLE");
		}


	}	
}
