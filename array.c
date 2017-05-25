#include<stdio.h>
void main()
{
	int arr[9]={1,2,3,6,10,23,5,8,9},sum=0,j,i;
	printf("enter sum you need\n");
	scanf("%d",&sum);
	
	for(i=0;i<9;i++)
	{
		for(j=i+1;j<9;j++)
		{
			if(arr[i]+arr[j]==sum)
			
			printf("%d  %d",i,j);
			break; 
			else{j++;j}
			
		}
	}
if(arr[i]+arr[j]!=sum)
{
	printf("SUM NOT FOUND\n");
}

}