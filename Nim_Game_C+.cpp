#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <time.h>  
#include <unistd.h>

#define COMPUTER 0
#define HUMAN 1

struct HeapGame
{
    int heapIndex;
    int size;
};
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
//function to declare winner of the game
void declareWinner(int Turn)
{
    if (Turn == COMPUTER)
        printf ("Player computer has won\n");
    else
        printf("Player human has won\n");
    return;
}

void makeMoveComputer(int HeapSizes[], int heapNum,struct HeapGame *heap)
{
    int flag=1;
    while(flag==1)
    {
        //chose a random heapIndex from 0 to heapNum by random function
        (*heap).heapIndex =(rand() % (heapNum));
       
        if(HeapSizes[(*heap).heapIndex]==0)
        {
            continue;
        }
        // chose the number of elements to be removed from that Heap of chosen heapIndex by random function 
        (*heap).size=1+(rand() % (HeapSizes[(*heap).heapIndex]));
         
         if(HeapSizes[(*heap).heapIndex]>=(*heap).size && (*heap).heapIndex<heapNum)
        {
            HeapSizes[(*heap).heapIndex]=HeapSizes[(*heap).heapIndex]-(*heap).size;
            flag=0;
        }

    }    
    return;
}
// function to calculate nim sum which should be 0 
void makeMoveHuman(int HeapSizes[],int heapNum, struct HeapGame *heap)
{
    int Objects, heapIndex;
    int returnValue;
    while(true)
    {
        printf("Player human enter the number of objects (Y) to take from what heap (X)- in order: Y X\n");
        returnValue=scanf("%d%d",&Objects,&heapIndex);
        char buffers[1024];
        if(returnValue==2)
        {   
             if(HeapSizes[heapIndex-1]>=Objects && (heapIndex<=heapNum))
            {
                (*heap).heapIndex=heapIndex;
                (*heap).size=(HeapSizes[heapIndex-1]-Objects);
                HeapSizes[heapIndex-1]=(*heap).size;
                break;
            }
            else
            {
                printf("Player human that is an invalid move, try again\n");
                continue;
            }

        }
        else
        {
            printf("Player human that is an invalid move, try again\n");
            gets(buffers);
        }
    }       
    
    return;
}
//function to print heap
void printHeap(int HeapSizes[], int heapNum)
{
    int i;
    for(i=0;i<heapNum;i++)
    {
        printf("%d ",HeapSizes[i]);

    }
    printf("\n");
}
// Everytime a check is made to make sure that the heaps have objects in it
// if it has objects, the game continues and checks whose turn it is now
// computer and human take their turns and the state of the heaps are printed after
void Game(int HeapSizes[], int heapNum, int Turn)
{
   
    struct HeapGame move;
    int PrevTurn;
 
    while (CheckGameOver (HeapSizes, heapNum) == false)
    {
       
        if (Turn == COMPUTER)
        {
            makeMoveComputer(HeapSizes, heapNum, &move);
            printf("Player computer took %d objects from heap %d\n",move.size,(move.heapIndex+1));
            PrevTurn=Turn;
            Turn = HUMAN;
        }
        else
        {
            makeMoveHuman(HeapSizes, heapNum, &move);
            PrevTurn=Turn;
            Turn = COMPUTER;
        }
        //after every turn print the Heaps
        printHeap(HeapSizes,heapNum);
    }
    // if all the heaps have 0 elements this means the person who last chose the item is the winner !
   declareWinner(PrevTurn);
    return;
}


void main()
 {
    setbuf(stdout, 0);
    int i=0,heapNum,Choice,Number;
    //generate a random numbers in the range [0,2)
    // 0= 3 heaps   1= 5 heaps 2= 7 heaps 
    //heapNum is the number of heaps created
    srand ( time(NULL) );
    heapNum=rand() % 3;
    if(heapNum==0)
    {
        heapNum=3;
    }
    else if(heapNum==1)
    {
        heapNum=5;
    }
    else
    {
        heapNum=7;
    }
    int HeapSizes[heapNum];
   for(i=0;i<heapNum;i++)
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
    
    printf("Created %d heaps of sizes ",heapNum);
  
   
    for(i=0;i<heapNum;i++)
    {
       printf("%d ", HeapSizes[i]); 
    }
    printf("\n");
    
    // selecting a random number from 0 and 1
    //srand ( time(NULL) );
    Choice=rand() % 2;
   
    if(Choice==0)
    {
        printf("Player computer goes first\n");
        Game(HeapSizes,heapNum,COMPUTER);

    }
    
    else
    {
        printf("Player human goes first\n");
        Game(HeapSizes,heapNum,HUMAN);  
    }
    
 
 }