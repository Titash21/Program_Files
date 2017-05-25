import java.util.*;
public class insertionSort{
void sort(int[] arr,int size)
	{
		int i,j,key=0,t;
		for(i=1;i<size;i++)
		{
			key=arr[i];
			j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
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