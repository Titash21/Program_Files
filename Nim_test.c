#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
 
#define COMPUTER 1
#define HUMAN 2
 struct heapGame
 {
 	int heapIndex;
 	int size;
};

//to print the sizes of each heap
void printHeap(int Heap[], int n)
{
	int i;
	for(i=0;i<n;i++)
	{
		printf("%d\t",Heap[i]);
	}
	printf("\n");
}
//Calculate the nim sum after every game
int Calculate_nimSum(int Heap[],int sum)
{
	int i=0,nim_sum=0;
	for(i=0;i<n;i++)
	{
		nim_sum=(nim_sum^Heap[i]);
	}
	return nim_sum;
}

bool gameOver(int piles[], int n)
{
    int i;
    for (i=0; i<n; i++)
        if (piles[i]!=0)
            return (false);
 
    return (true);
}
 void choose_Coin(int Heap,int n)
 {
 	int nim_sum=Calculate_nimSum(Heap,n);
	int non_zero_indices[n],i,count;
	struct HeapGame *newNode;

 	if(nim_sum!=0)
	{
		for(i=0;i<n;i++)
		{
			if(nim_sum^Heap[i]<Heap[i])
			{
				(*newNode).heapIndex=i;
				(*newNode).size=((Heap[i]-nim_sum)^Heap[i]);
				Heap[i]=Heap[i]-nim_sum;
				break;
			}
		}
	}

//Our goal is to assume the nim_sum==0 
//and then take the next coin from a Heap 
	else
	{
 	
 		 // Creating an array to hold indices of non-empty Heaps
        for (i=0, count=0; i<n; i++)
           {
           		if (Heap[i] > 0)
                non_zero_indices [count++] = i;
           } 
 
        (*newNode).heapIndex = (rand() % (count));
        printf("newNode.heapIndex is %d\n", (*newNode).heapIndex);
        (*moves).size = 1 + (rand() % (Heap[(*newNode).heapIndex]));
        Heap[(*newNode).heapIndex] =
         Heap[(*newNode).heapIndex] - (*Heap).heapIndex;
 
        if (Heap[(*newNode).heapIndex] < 0)
            Heap[(*newNode).heapIndex]=0;
    }	
 }
//start game
void StartGame(int Heap[],int n,int whoseTurn)
{
	struct HeapGame moves;
	
	 while (gameOver (piles, n) == false)
    {
    	
    	  if (whoseTurn == COMPUTER)
        {
        	choose_Coin(Heap,n);
            printf("COMPUTER removes %d stones from pile "
                   "at index %d\n", moves.size,
                   moves.heapIndex);
            whoseTurn = HUMAN;
        }
        else
        {
          
             printf("Player human enter the number of objects (Y) to take from what heap (X)- in order: Y X\n");
            scanf("%d%d",&X,&Y);
            whoseTurn = COMPUTER;
        }
    }
}
	//assuming nim_sum !=0 
	//Take a coin from the heap such that the value is less than the Heap Size
	
    


 void main()
 {
    int i=0,HeapNum,num;
    scanf("%d",&HeapNum);
    int HeapSizes[HeapNum];
    if(HeapNum==3 || HeapNum==5 || HeapNum==7)
   {
        for(i=0;i<HeapNum;i++)
        {   
            scanf("%d",&num);
            if(num==9 || num==13|| num==11)
            {
                 HeapSizes[i]=num;
            }
            else
            {
                break;
            }
           
        }
    
   }     
   
    printf("Created %d heaps of sizes\t",HeapNum);
    for(i=0;i<HeapNum;i++)
    {
       printf("%d\t", HeapSizes[i]); 
    }
 	printHeap(Heap,n);
 	printf("Player Computer goes first");
 	StartGame(Heap,n,COMPUTER);
 }