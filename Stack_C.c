#include<stdio.h>
int top=-1;
int arr[10];
void push(int data)
{
	int i;
	if(top==-1 || top<10)
	{
		top++;
		arr[top]=data;
		printf("The stack\n");
		for(i=0;i<=top;i++)
		{
			printf("%d",arr[i]);
		}
	}

	else {
		printf("STACK FULL OVERFLOW\n");
	}
}
void pop()
{
	int temp;
	if(top==-1){
		printf("STACK EMPTY\n");
	}
	else{
		temp=arr[top];
		printf("DELETING %d\n", temp);
		top--;
	}
}

void main()
{
	int ch=0,i=0,data;
	printf("Enter what you want to do\n");
	while(ch<=1 && i<10)
	{

	
	printf("Enter 1 for push , enter 0 for pop \n");
	scanf("%d",&ch);
		switch(ch)
		{
			case 1: i++; 
			printf("Enter data to be pushed\n");
			scanf("%d",&data);
			push(data); 
			break;
			case 0: pop();
			break;
			default:
			printf("Wrong input\n");
			break;
		}
	}		
	 
	
}