import java.util.*;
public class MergeSort{
void Mergesort(int low,int high,int[] arr,int size){
	int middle;
	while(low<high)
	{
		middle=(low+(high-low))/2;
		Mergesort(low,middle,arr,size);
		Mergesort(middle+1,high,arr,size);
		merge(low,middle,high,arr,size);
	}

}
void merge(int low,int middle,int high, int[] arr,int size){
	int i,t;
	int[] temparr=new int[size]; 
	for(i=low;i<=high;i++)
	{
		temparr[i]=arr[i];
	}
	int j,k;
	i=low;
	j=middle+1;
	k=low;
	while(i<=middle && j<=high)
	{
		if(temparr[i]<temparr[j])
		{
			arr[k]=temparr[i];
			i++; k++;
		}
		else
		{
			arr[k]=temparr[j];
			j++;; k++;
		}
	}

	while(i<=middle)
	{
		arr[k]=temparr[i];
		k++;i++;
	}
	while(j<=high){
		arr[k]=temparr[j];
		j++;k++;
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
		MergeSort obj=new MergeSort();
		obj.Mergesort(0,size-1,arr,size);
	}
}