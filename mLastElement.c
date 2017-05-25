#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
int size=0;
struct node {
   int data;
   struct node *next;
};

struct node *head = NULL;

void printList()
{
  struct node *ptr=head;
  if(ptr==NULL)
  {
    printf("EMPTY LIST\n");
  }
  else
  {
    while(ptr!=NULL){
      printf("%d\t",ptr->data);
      ptr=ptr->next;
    }
  }
}

//insert link at the first location
void insertFirst(int data) {
   //create a link
   struct node *link = (struct node*) malloc(sizeof(struct node));
	
   
   link->data = data;
	
   
   link->next = head;
   head = link;
}
void printLast(int index)
    {
        int net=size-index,i=1;
        struct node *ptr;
        ptr=head;
        
        if(index>size || ptr==NULL)
            {
            printf("nil");
        }
    else
        {
            while(i<=net)
                {
                  ptr=ptr->next;
                   i++;
                }

                printf("%d",ptr->data);
    }
        
    
}
int main() {
    
    int val=0,t=1,m;
    while(t)
   {
       printf("Enter a value\n");
       scanf("%d",&val);
       insertFirst(val);
       size++ ;
       printf("Size of linklist is %d\n",size);
       printf("DO YOU WANT TO CONTINUE?    IF YES PRESS 1 ELSE PRESS 0\n");
       scanf("%d",&t); 
    }
    printList();
    printf("Print the index from last you need\n");
    scanf("%d",&m);
    printLast(m);
  
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    
    return 0;
}
