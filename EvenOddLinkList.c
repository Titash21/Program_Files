#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <stdbool.h>

struct node {
   int data;
  struct node *next;
};
struct node *head = NULL;
void insert(int data)
{
	struct node *new=(struct node*)malloc(sizeof(struct node));
	new->data=data;
	if(head==NULL)
	{
		head=new;
		new->next=NULL;

	}
	else
	{
		new->next=head;
		head=new;
	}
	
}
//remove desired element from the LinkedList
void removeElements(int val) {
 		struct node *temp;
 		struct node *ptr;
 		struct node *prev=NULL;
 		printf("HEAD IS BEFORE DELETION  %d  \n",head->data);
 		if(head->data==val)
 			{
     			temp=head;
     			head=head->next;
     			free(temp);
     			temp=NULL;
 			}
		 temp=head;
 
 			while(temp!=NULL)
 			{
  
     			if(temp->data==val)
     			{
         			prev->next=temp->next;
        			temp=temp->next;
     			}
     			else
     			{
        			 prev=temp;
         			temp=temp->next;
     			}


			}
		printf("HEAD IS after DELETION  %d  \n",head->data);
	ptr=head;
	printf("After removing elements\n");
    printf("\n[ ");
	
   //start from the beginning
   while(ptr != NULL) {
      printf("%d ",ptr->data);
      ptr = ptr->next;
   }
	
   printf(" ]");

}

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

void isPalindrome() {
    struct node *ptr=head;
    struct node *currNode = head;
		struct node *nextNode = NULL;
		struct node *prevNode = NULL;


   int number1=0,number2=0;
   while(ptr!=NULL)
   {
       number1=(number1*10)+(ptr->data);
       ptr=ptr->next;
       
   }
   printf("Number1 is %d\n",number1);
   while(currNode!=NULL){
			nextNode = currNode->next;
			currNode->next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		head = prevNode; 
		ptr=head;
		printf("REVERSE LIST\n");
while(ptr!=NULL)
{
	printf("%d",ptr->data);
 	ptr=ptr->next;
}
 	printf("\n");
	ptr=head;
 while(ptr!=NULL)
 {
    number2=(number2*10)+(ptr->data); 
    ptr=ptr->next;
 }
 printf("Number2 is %d\n",number2);
 if(number1==number2)
 {
      printf("true");
 }
 else
 {
      printf("false");
 }
    
}
void oddEvenList() 
    {
        if(!head) 
        {
        	printf("EMPTY LIST\n");
        }
        int i=0;
        struct node *ptr;
        struct node *odd=head, *evenhead=head->next, *even = evenhead;
        while(even && even->next)
        {
        	
            odd->next = odd->next->next;
            //printf("ODD  next now IS %d\t\n",odd->next->data);
            even->next = even->next->next;
            //printf("EVEN next now IS %d\t\n",even->next->data);
            odd = odd->next;
            even = even->next;
            //printf("ODD VALUE IS %d\t\n",odd->data);

            
            i++;

        }
        odd->next = evenhead;
        ptr=head;
        printf("\n[ ");
	
   //start from the beginning
   while(ptr != NULL) {
      printf("%d ",ptr->data);
      ptr = ptr->next;
   }
	
   printf(" ]");

    }
void main()
{
	int i=0,N=0,num;
	printf("Enter how many numbers you want to enter\n");
	scanf("%d",&N);
	for(i=0;i<N;i++)
	{
		
		printf("Enter number %d",i+1);
		scanf("%d",&num);
		insert(num);
	}
	printf("Enter the value wanting to be deleted\n");
	scanf("%d",&N);
	removeElements(N);
	isPalindrome();
	
	printList();
	oddEvenList();
	printf("Enter the value wanting to be deleted\n");
	scanf("%d",&N);
	removeElements(N);

	
}