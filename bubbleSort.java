import java.util.*;
public class bubbleSort{
	void sort(int[] arr,int size)
	{
		int i,j,temp=0,t;
		
		for(i=0;i<size;i++)
		{
			for(j=0;j<(size-i-1);j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
		
				}
			}
		}
		System.out.println("ARRAY AFTER SORTING");
		for(t=0;t<size;t++)
		{
			System.out.print(arr[t]+ "  ");
		}


	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		System.out.println("Enter the array");
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		bubbleSort obj=new bubbleSort();
		obj.sort(arr,size);
	}

}