
#include<stdio.h>
void main()
{
    int A[7],i,j,k=7;
    int result = 0,sum=0;
    printf("ENTER YOUR ARRAY\n");
    for(i=0;i<7;i++)
    {
        scanf("%d",&A[i]);
    }
    
    for(i=0;i<7;i++)
    {
        for(j=i+1;j<7;j++)
        {
            sum=A[i]+A[j];
            if(sum==6)
            {
                printf("%d %d\t\n",A[i],A[j]);
            }
        }
     } 

     printf("HEY !");  
        
}