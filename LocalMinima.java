import java.util.*;
public class LocalMinima{

	int FindLocalMinima(int array[], int size,int low, int high)
	{
		int i,mid;
		if(size==1){ return array[0];}
		else if (low<=high)
			{

				mid=(low+(high-low)/2);
				System.out.println("Mid is :"+ mid);
				if (mid-1< 0 && mid+1>=high )
				{
   					return -1;
				}
				if(array[mid-1]>array[mid] && array[mid+1]>array[mid])
				{
					return array[mid];
				}
				else if(array[mid-1]<array[mid])
				{
					return FindLocalMinima(array,size,low,(mid-1));
				}
				else return FindLocalMinima(array,size,(mid+1),high);
			}
			return -1;
	}
	int FindLocalMaxima(int array[], int size,int low, int high)
	{
		int i,mid;
		if(size==1){ return array[0];}
		else if (low<=high)
			{

				mid=(low+(high-low)/2);
				System.out.println("Mid is :"+ mid);
				if (mid-1< 0 && mid+1>=high)
				{
   					return -1;
				}
				if(array[mid-1]<array[mid] && array[mid+1]<array[mid])
				{
					return array[mid];
				}
				else if(array[mid-1]>array[mid])
				{
					return FindLocalMaxima(array,size,low,(mid-1));
				}
				else return FindLocalMaxima(array,size,(mid+1),high);
			}
			return -1;
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		System.out.println("Enter the array");
		int[] array=new int[size];
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		LocalMinima obj=new LocalMinima();
		int minima=obj.FindLocalMinima(array,size,0,size);
		if(minima==-1)
		{
			System.out.println("No local minima exists");
		}
		else
		{	System.out.println("LocalMinima:" + minima);
		
		}
		int maxima=obj.FindLocalMaxima(array,size,0,size);
		if(maxima==-1)
		{
			System.out.println("No local maxima exists");
		}
		else
		{	System.out.println("LocalMaxima:" + maxima);}
		
		}
}