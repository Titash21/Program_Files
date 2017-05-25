#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define COMPUTER 0
#define HUMAN 1

struct heapGame
{
 	int HeapIndex;
 	int size;
};
// function to calculate nim sum which should be 0 
int Calculate_nimSum(int Heap[],int n)
{
	int i=0,NimSum=0;
	for(i=0;i<n;i++)
	{
		NimSum=(NimSum^Heap[i]);
	}
	return NimSum;
}
// function to check if the game is over or not 
// It checks if all the heaps have objects or not
bool CheckGameOver(int HeapSizes[], int n)
{
    int i;
    for (i=0; i<n; i++)
        if (HeapSizes[i]!=0)
            return (false);
 
    return (true);
}
//function to print heap
void printHeap(int HeapSizes[], int HeapNum)
{
	int i;
	for(i=0;i<HeapNum;i++)
	{
		printf("%d\t",HeapSizes[i]);

	}
	printf("\n");
}

//function to declare winner of the game
void declareWinner(int Turn)
{
    if (Turn == COMPUTER)
        printf ("\nPlayer computer has won\n");
    else
        printf("\nPlayer human has won\n\n");
    return;
}

//Computer will be making an optimal move and trying to set the nim_Sum to 0 always if it is not previously 0 !
void makeMoveComputer(int HeapSizes[], int HeapNum,struct heapGame *heap)
{
	int i;
	int NimSum=Calculate_nimSum(HeapSizes,HeapNum);
	//if NimSum is not 0 this means that the computer has the choice to make an optimal selection as the human did not

	if (NimSum != 0)
    {
			for(i=0;i<HeapNum;i++)
			{
			
					if((NimSum^HeapSizes[i])<HeapSizes[i])
					{
						(*heap).HeapIndex = i+1;
                		(*heap).size=HeapSizes[i]-(NimSum^HeapSizes[i]);
                		HeapSizes[i] = (NimSum^HeapSizes[i]);
						break;
					}

			}
	}
	 else
    {
        
        //if NimSum==0 already then the human has played optimally so we have to generate a random heap index from which items have to be removed
        int non_zero_Heap[HeapNum], count;
 
        for (i=0, count=0; i<HeapNum; i++)
            {
            	if (HeapSizes[i] > 0)
                non_zero_Heap[count++] = i;
            } 
 		//chose a random HeapIndex from 0 to count by random function
        (*heap).HeapIndex = (rand() % (count));
        // chose the number of elements to be removed from that Heap of chosen heap Index by random function 
        (*heap).size=1 + (rand() % (HeapSizes[(*heap).HeapIndex]));
        //modify the HeapSizes array 
        HeapSizes[(*heap).HeapIndex]=HeapSizes[(*heap).HeapIndex] - (*heap).size;
 
       if (HeapSizes[(*heap).HeapIndex] < 0)
        {
            HeapSizes[(*heap).HeapIndex]=0;
        }
    }
    return;
	
}
void makeMoveHuman(int HeapSizes[],int HeapNum, struct heapGame *heap)
{
	int objects, heapIndex;
	while(true)
	{
		printf("Player human enter the number of objects (Y) to take from what heap (X)- in order: Y X");
 		scanf("%d%d",&objects,&heapIndex);
 	
 		if(HeapSizes[heapIndex-1]>=objects && (heapIndex<=HeapNum))
 		{
 			(*heap).HeapIndex=heapIndex;
 			(*heap).size=(HeapSizes[heapIndex-1]-objects);
 		 	HeapSizes[heapIndex-1]=(*heap).size;
 		 	break;
 		}

 			else
 		{
 			printf("Player human that is an invalid move, try again\n");

		}
	}		
 	
 	
 	
 	return;

}
// Everytime a check is made to make sure that the heaps have objects in it
// if it has objects, the game continues and checks whose turn it is now
// computer and human take their turns and the state of the heaps are printed after
void Game(int HeapSizes[], int HeapNum, int Turn)
{
   
    struct heapGame move;
 
    while (CheckGameOver (HeapSizes, HeapNum) == false)
    {
       
 
      if (Turn == COMPUTER)
        {
           
            makeMoveComputer(HeapSizes, HeapNum, &move);
            printf("Player computer took %d objects from heap at index %d\n",move.size,move.HeapIndex);
            Turn = HUMAN;
        }
        else
        {
        	makeMoveHuman(HeapSizes, HeapNum, &move);
            Turn = COMPUTER;
        }
        //after every turn print the Heaps
        printHeap(HeapSizes,HeapNum);
    }
 	// if all the heaps have 0 elements this means the person who last chose the item is the winner !
    declareWinner(Turn);
    return;
}



void main()
 {
    setbuf(stdout, 0);
    int i=0,HeapNum,Choice,Number;
    //generate a random numbers in the range [0,2)
    // 0= 3 heaps   1= 5 heaps 2= 7 heaps 
    //HeapNum is the number of heaps created
    HeapNum=rand() % 3;
    if(HeapNum==0)
    {
    	HeapNum=3;
    }
    else if(HeapNum==1)
    {
    	HeapNum=5;
    }
    else
    {
    	HeapNum=7;
    }
    int HeapSizes[HeapNum];
   for(i=0;i<HeapNum;i++)
        {   
            Number=rand() % 3;

            if(Number==0)
            {
                 HeapSizes[i]=9;
            }
            else if(Number==1)
            {
            	HeapSizes[i]=11;
            }
			else{
				HeapSizes[i]=13;
			}

        }
    
    printf("Created %d heaps of sizes  ",HeapNum);
  
   
    for(i=0;i<HeapNum;i++)
    {
       printf("%d\t", HeapSizes[i]); 
    }
    printf("\n");
    
    // selecting a random number from 0 and 1
    Choice=rand() % 2;
   
    if(Choice==0)
    {
    	printf("Player computer goes first\n");
    	Game(HeapSizes,HeapNum,COMPUTER);

    }
    
    else
    {
    	printf("Player HUMAN goes first");
    	Game(HeapSizes,HeapNum,HUMAN);	
    }
    
 
 }