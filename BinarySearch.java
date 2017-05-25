import java.io.*;
import java.util.*;
public class BinarySearch{
	int BinarySearches(int[] arr,int low, int high, int val)
{
		int mid;

	if(low<=high)
	{
		mid=(low+(high-low))/2;	
		if(val==arr[mid])
		{
			return mid;
		}else if(arr[mid]>val)
		{
			return BinarySearches(arr,low,mid-1,val);
		}
		else
		{
			return BinarySearches(arr,mid+1,high,val);
		}

	}	
		return -1;
}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		System.out.println("Enter the SORTED array");
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter value to be searched");
		int val=sc.nextInt();
		BinarySearch obj=new BinarySearch();
		int f=obj.BinarySearches(arr,0,size,val);
		if(f!=-1)
		{
			System.out.println("Value found at index"+ f);
		}
		else
		{
			System.out.println("Value not found");
		}
	}
}