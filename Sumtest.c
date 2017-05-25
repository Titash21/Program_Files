#include<stdio.h>


void merging(int low, int mid, int high) {
   int l1, l2, i;

   for(l1 = low, l2 = mid + 1, i = low; l1 <= mid && l2 <= high; i++) {
      if(a[l1] <= a[l2])
         b[i] = a[l1++];
      else
         b[i] = a[l2++];
   }
   
   while(l1 <= mid)    
      b[i++] = a[l1++];

   while(l2 <= high)   
      b[i++] = a[l2++];

   for(i = low; i <= high; i++)
      a[i] = b[i];
}

void sort(int A,int low, int high) {
   int mid;
   
   if(low < high) {
      mid = (low + high) / 2;
      sort(A,low, mid);
      sort(A,mid+1, high);
      merging(low, mid, high);
   } else { 
      return;
   }   
}

void main()
{
	int x, i;
	int A[5];
	for(i=0;i<5;i++)
	{
		scanf("%d",&A[i]);
	}

	sort(A,0,5);

	check(A,x);
}

void check(int A,int x)
{
	int low =0, high=4;
	while(low<high)
	{
		if(A[low]+A[high]==x)
		{
		printf("YES");
		}
		else if(A[low]+A[high]>x)
		{
			high-- ;
		}
		else
		{
			low++ ;
		}
	}
}