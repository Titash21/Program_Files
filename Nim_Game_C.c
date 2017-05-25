#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <time.h>  
#include <unistd.h>

#define COMPUTER 0
#define HUMAN 1

int Num_of_heaps[3] = {3,5,7};
int Size_of_heap[3] = {9,11,13};

int rand_num(int n){    
    return rand()%n;
}


struct HeapGame
{
    int heapIndex;
    int size;
};
// function to check if the game is over or not 
// It checks if all the heaps have objects or not
bool CheckGameOver(int HeapSize[], int n)
{
    int i;
    for (i=0; i<n; i++)
        if (HeapSize[i]!=0)
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

void makeMoveComputer(int HeapSize[], int heapNum,struct HeapGame *heap)
{
    int flag=1;
    while(flag==1)
    {
        //chose a random heapIndex from 0 to heapNum by random function
        (*heap).heapIndex =(rand() % (heapNum));
       
        if(HeapSize[(*heap).heapIndex]==0)
        {
            continue;
        }
        // chose the number of elements to be removed from that Heap of chosen heapIndex by random function 
        (*heap).size=1+(rand() % (HeapSize[(*heap).heapIndex]));
         
         if(HeapSize[(*heap).heapIndex]>=(*heap).size && (*heap).heapIndex<heapNum)
        {
            HeapSize[(*heap).heapIndex]=HeapSize[(*heap).heapIndex]-(*heap).size;
            flag=0;
        }

    }    
    return;
}

void makeMoveHuman(int HeapSize[],int heapNum, struct HeapGame *heap)
{
    int Objects, heapIndex;
    int returnValue1,returnValue2;
    char buffers[1024];
    char Input[200];
     //buffer = (char *)malloc(bufsize * sizeof(char));
    while(true)
    {
        printf("Player human enter the number of objects (Y) to take from what heap (X)- in order: Y X\n");
    
       scanf("%[^\n]s",Input);

       int val=Input[0];
        if(isalpha(Input[0]) || isalpha(Input[2]) && (input.length<5))
            {
                printf("Player human that is an invalid move, try again\n");
                continue;
            } 
            else if(isdigit(Input[0]) && isdigit(Input[2]))
            {
                    Objects=Input[0];
                    heapIndex=Input[2];
                    printf("%d\n",Objects );
                    printf("%d\n",heapIndex );
             if(HeapSize[heapIndex-1]>=Objects && (heapIndex<=heapNum && heapIndex>=0) && Objects>0)
            {
                (*heap).heapIndex=heapIndex;
                (*heap).size=(HeapSize[heapIndex-1]-Objects);
                HeapSize[heapIndex-1]=(*heap).size;
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
void printHeap(int HeapSize[], int heapNum)
{
    int i;
    for(i=0;i<heapNum;i++)
    {
        printf("%d ",HeapSize[i]);

    }
    printf("\n");
}
// Everytime a check is made to make sure that the heaps have objects in it
// if it has objects, the game continues and checks whose turn it is now
// computer and human take their turns and the state of the heaps are printed after
void Game(int HeapSize[], int heapNum, int Turn)
{
   
    struct HeapGame move;
    int PrevTurn;
 
    while (CheckGameOver (HeapSize, heapNum) == false)
    {
       
        if (Turn == COMPUTER)
        {
            makeMoveComputer(HeapSize, heapNum, &move);
            printf("Player computer took %d objects from heap %d\n",move.size,(move.heapIndex+1));
            PrevTurn=Turn;
            Turn = HUMAN;
        }
        else
        {
            makeMoveHuman(HeapSize, heapNum, &move);
            PrevTurn=Turn;
            Turn = COMPUTER;
        }
        //after every turn print the Heaps
        printHeap(HeapSize,heapNum);
    }
    // if all the heaps have 0 elements this means the person who last chose the item is the winner !
   declareWinner(PrevTurn);
    return;
}


void main()
 {
    setbuf(stdout, 0);
    int i,Choice;
    //generate a random numbers in the range [0,2)
    srand (time(NULL));
    srand(rand());
    int heapNum=Num_of_heaps[rand_num(3)];
    int HeapSize[heapNum];
   for(i=0;i<heapNum;i++)
        {   
            HeapSize[i]=Size_of_heap[rand_num(3)];
        }
    
    printf("Created %d heaps of sizes ",heapNum);
  
   
    for(i=0;i<heapNum;i++)
    {
       printf("%d ", HeapSize[i]); 
    }
    printf("\n");
    
    // selecting a random number from 0 and 1
    Choice=rand() % 2;
   
    if(Choice==0)
    {
        printf("Player computer goes first\n");
        Game(HeapSize,heapNum,COMPUTER);

    }
    
    else
    {
        printf("Player human goes first\n");
        Game(HeapSize,heapNum,HUMAN);  
    }
    
 
 }