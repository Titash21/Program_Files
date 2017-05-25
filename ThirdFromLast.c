//How to find 3rd element from end in a linked list in one pass?

#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <stdbool.h>

struct node {
   int data;
   struct node *next;
};

struct node *head = NULL;

//display the list
void printList() {
   struct node *ptr = head;
   printf("\n[ ");
	
   //start from the beginning
   while(ptr != NULL) {
      printf("%d ",ptr->data);
      ptr = ptr->next;
   }
	
   printf(" ]");
}

void insertLast(int data)
{
	struct node *ptr=head;
	struct node *nw=(struct node*)malloc(sizeof(struct node));
	nw->data=data;
	if(head==NULL)
	{
		head=nw;
		nw->next=NULL;
	}
	else
	{
		while(ptr->next!=NULL)
		{
			ptr=ptr->next;
		}
		ptr->next=nw;
		nw->next=NULL;
	}
}
//insert link at the first location
void insertFirst(int data) {
   //create a link
   struct node *link = (struct node*) malloc(sizeof(struct node));
	
   
   link->data = data;
	
   //point it to old first node
   link->next = head;
	
   //point first to new first node
   head = link;
}
void deletedLast(int ch)
{
	struct node *temp;
	struct node *first=head;
	struct node *last=head;
	int data,i;
	i=ch;
	if(head==NULL)
	{
		printf("EMPTY LINK LIST\n");
	}
	else
	{
		while(ch>0)
		{
			first=first->next;
			ch--;
		}
		while(first!=NULL)
		{
			first=first->next;
			last=last->next;
		}
		data=last->data;
		printf("The %d th element from last is %d \n",i,data );
	}

}
void FindMiddle()
{
	struct node *fast=head;
	struct node *slow=head;
	if(head==NULL)
	{
		printf("Empty Link list\n");
	}
	else
	{
		while(fast->next!=NULL && fast->next->next!=NULL)
		{
			slow=slow->next;
			fast=fast->next->next;
		}
		printf("MIDDLE ELEMENT IS : %d\t\n",slow->next->data);
	}
}
void main()
{
	int ch,no=0,data=0;
	printf("Enter the number of elements you want to enter\n");
	scanf("%d",&no);
	while(no>0)
	{
		printf("Enter the number");
		scanf("%d",&data);
		insertLast(data);
		no--;
	}
	printList();
	FindMiddle();
	printf("Enter element from last you want to delete\n");
	scanf("%d",&ch);
	deletedLast(ch);
}