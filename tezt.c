#include<stdio.h>
void twoSum(int* nums, int numsSize, int target) {
    int sums=0,i,index_1,index_2,j;
    for(i=0;i<6;i++)
    {
        printf("%d\t",nums[i]);
    }
    printf("\n");
    for(i=0;i<numsSize;i++)
    {
        sums=nums[i];
        index_1=i;
        for(j=i+1;j<numsSize;j++)
        {
            sums=sums+nums[j];
            if(sums==target)
            {
                index_2=j;
                
                printf(" The indices are-%d %d\t\t",index_1,index_2 );
                printf("values at index %d and %d are %d %d\t",index_1,index_2,nums[index_1],nums[index_2]);
                break;
                
            }
            else
            {
                sums=sums-nums[j];
            }

        }
       
    
    }
    
}
 void main()
 {
    int arr[6],i,j,target=0;
    printf("Enter array\n");
    for(i=0;i<6;i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Enter valur whose sum is needed\n");
    scanf("%d",&target);
    twoSum(arr,6,target);
 }

