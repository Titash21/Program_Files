#include<stdio.h>
void median(int *, int *);
void main()
{
	int arr1[5],arr2[5],i,j;
	printf("Enter first ARRAY\n");
	for(i=0;i<5;i++)
	{
		scanf("%d",&arr1[i]);
	}
	
	printf("Enter second ARRAY\n");
	for(i=0;i<5;i++)
	{
		scanf("%d",&arr1[i]);
	}

	median(arr1,arr2);
}
void median(int *arr1, int *arr2)
{
	int i,j=0,k=0,len=0;
	
	int arr3[10];

	for(i=0;j<5 && k<5; i++)
	{
		if(arr1[j]<arr2[k])
		{
				arr3[i]=arr1[j];
				j++;
		}
		else
		{
			arr3[i]=arr2[k];
			k++;
		}
	}
	len=i;

	if(k<5)
	{
		for(i=k;i<5;i++)
		{
			arr3[len]=arr2[i];
		}
	}
	else if(j<5)
	{
		for(i=k;i<5;i++)
		{
			arr3[len]=arr1[j];
		}
	}

	printf("FINAL MERGED ARRAY IS \n");
	for(i=0;i<10;i++)
	{
		printf("%d\t",arr3[i]);
	}




}