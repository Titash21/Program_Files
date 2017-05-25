#include<stdio.h>
void main()
{
	int a,c;
	int retu;
	while(true)
{
	printf("ENTER ONE NUMBER\n");
	retu=scanf("%d",&a);
	if(retu==0)
	{
		printf("Invalid entry try again\n");
	}
	else
	{
		printf("a is %d ",a);
		break;
	}
}		
	

}