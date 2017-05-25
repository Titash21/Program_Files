#include<stdio.h>
void main()
{
    int A[7],i,j,k=7;
    int result = 0,max;
    printf("ENTER YOUR ARRAY\n");
    for(i=0;i<7;i++)
    {
        scanf("%d",&A[i]);
    }
    
    for(i=0;i<7;i++)
    {
        
        A[A[i]%k] = A[A[i]%k]+k;
        printf("When k=%d  i= %d and A[A[i]modK]  %d\t\t",k,i,A[i]%k);
        printf("%d\n",A[A[i]%k]);

    }
    max = A[0];

    for (i = 1; i <7 ; i++)
    {
        if (A[i] > max)
        {
            max = A[i];
            result = i;
        }
    }

    printf("%d", result);
}