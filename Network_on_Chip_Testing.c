#include<stdio.h>
#include<stdlib.h>
 struct block
{
    int length,width,core_no;
}input[50];
 struct blocks
{
    int length,width,core_no;
}input1[50];


struct outblock
{
    int length,width,time,core_no;
}out[50];
 int mat[100][100];
int c,pow1[32],part;
int grp1[100],grp2[100],grp3[100],grp4[100];

int pow1[32],part,finalblocks,m,q=0, flag[2]={0};
void finalout(int k, int o, int t)
{
    if(k==1 || k==2)
        flag[k-1]=1;
    q=k;
    //printf("%d\n",k);
    out[q-1].core_no=k;
    out[q-1].length=o;
    out[q-1].width=t;
    out[q-1].time=out[q-1].length*out[q-1].width;

}
 void partition(int blocks, int len, int w)
{
	  part=blocks-1;
	  int twidth1,twidth2,tlength1,tlength2,n,w1,w2,i=0,j=0,p,x=1,y=2;
	  //first time partioning into two parts
	  printf(" enter 1 for vertical partition enter 2 for horizontal partition\n");
	  scanf("%d",&n);
	    if(n==1)
	   {
	    a: printf("enter the partition weightage\n total width is %d\n",w );
	     scanf("%d%d",&w1,&w2);
         if ( w1+w2==w )
         {
          input[i].length=len;
	     input[i].width=w1;
	     input[i].core_no=x;
	     input1[j].length=len;
	     input1[j].width=w2;
	     input1[j].core_no=y;
	     twidth1=w1;
	     twidth2=w2;
	     tlength1=len;
	     tlength2=len;
        }

        else
        {printf("Invalid inputs try again");
         goto a;
        }


     }
	 if (n==2)
	 {
	   b: printf("enter the partition weightage\n total length is %d\n",len );
	    scanf("%d%d",&w1,&w2);
      if (w1+w2==len)
         {
	     input[i].length=w1;
	     input[i].width=w;
	     input[i].core_no=x;
	     input1[j].length=w2;
	     input1[j].width=w;
	     input1[j].core_no=y;
	     tlength1=w1;
	     tlength2=len-w1;
	     twidth1=w;
	     twidth2=w;
	  }
         else
         {
             printf("Invalid inputs try again");
             goto b;
         }
	 }
	//c++;
        i++;
  	j++;
  	finalblocks=2;


	 // the consecutive partitions
	  while( (finalblocks-1)<part)
	{
	          printf("there are total %d blocks\n",finalblocks);
	          printf("choose which block to partition\n");
		  scanf("%d",&p);
	  for(m=0;m<finalblocks;m++)
	       {
		    if(input[m].core_no==p)
		   {


		     printf(" enter 1 for vertical partition enter 2 for horizontal partition\n");
		     scanf("%d",&n);
		    if(n==1)
		  {

		     cr: printf("enter the partition weightage\n the total width left is %d\n",input[m].width );
		        scanf("%d%d",&w1,&w2);
		         if (w1+w2==input[m].width)
		         {
                 input[m].width=w1;
                 finalout(input[m].core_no,input[m].length,input[m].width);
			     y++;
			     input[i].width=w2;
			     input[i].length=input[m].length;
			     input[i].core_no=y;
                 finalout(input[i].core_no,input[i].length,input[i].width);
			     i++;



			 }
			 else
			 {
			     printf("Invalid inputs try again");
			     goto cr;
			 }
                   }

		 if (n==2)
		 {
		   dr: printf("enter the partition weightage\n the total length left is %d\n",input[m].length );
		    scanf("%d%d",&w1,&w2);
		    if (w1+w2==input[m].length )
		    {


                input[m].length=w1;
                                 finalout(input[m].core_no,input[m].length,input[m].width);
			     y++;
			     //printf("j=%d",j);
			     input[i].length=w2;
			     input[i].width=input[m].width;
			      input[i].core_no=y;
			                       finalout(input[i].core_no,input[i].length,input[i].width);
			      i++;



			    }
	                   else
			 {
			     printf("Invalid inputs try again");
			     goto dr;
			 }

	         }
       }

     }


    for(m=0;m<finalblocks;m++)
        {
	   if(input1[m].core_no==p)
		  {
		     printf(" enter 1 for vertical partition enter 2 for horizontal partition\n");
		     scanf("%d",&n);
		    if(n==1)
		  {

		     ct: printf("enter the partition weightage\n the total width left is %d\n",input1[m].width );
		        scanf("%d%d",&w1,&w2);
		         if (w1+w2==input1[m].width)
		         {

			     input1[m].width=w1;
			                      finalout(input1[m].core_no,input1[m].length,input1[m].width);
			     y++;
			     input1[j].width=w2;
			     input1[j].length=input1[m].length;
			     input1[j].core_no=y;
			                      finalout(input1[j].core_no,input1[j].length,input1[j].width);
			     j++;

			 }
			 else
			 {
			     printf("Invalid inputs try again");
			     goto ct;
			 }

                 }
             if (n==2)
		 {

		   ds: printf("enter the partition weightage\n the total length left is %d\n",input1[m].length );
		    scanf("%d%d",&w1,&w2);
		    if (w1+w2==input1[m].length )
		    {

			     input1[m].length=w1;
			                      finalout(input1[m].core_no,input1[m].length,input1[m].width);
			     y++;

			     input1[j].length=w2;
			     input1[j].width=input1[m].width;
			      input1[j].core_no=y;
			                       finalout(input1[j].core_no,input1[j].length,input1[j].width);
			      j++;




	             }
	                   else
			 {
			     printf("Invalid inputs try again");
			     goto ds;
			 }

	         }
       }
  }


    finalblocks++;
}
   if ((finalblocks-1)==part)

    {
        printf("there are total %d blocks\n",finalblocks);
    }

    if(flag[0]==0)
    {
        out[0].core_no=input[0].core_no;
        out[0].length=input[0].length;
        out[0].width=input[0].width;
        out[0].time=out[0].length*out[0].width;
    }
    if(flag[1]==0)
    {
        out[1].core_no=input1[0].core_no;
        out[1].length=input1[0].length;
        out[1].width=input1[0].width;
        out[1].time=out[1].length*out[1].width;
    }
}




		     void display()
  {
    int i;
    printf("\nBlock no	length    width   time \n");
    for(i=0;i<finalblocks;i++)
    {
       printf("%d	%d	%d    %d\n",out[i].core_no,out[i].length,out[i].width,out[i].time);

    }

  }

  //POWER VALUES OF EACH BLOCKS
void power(int blocks)
{
   int i,power1,n;
   for(i=1;i<=blocks;i++)
   {
        printf("enter power value for block %d\n",i);
        scanf("%d",&power1);
        pow1[i]=power1;

    }

    printf("the power values of differt blocks are\n");
    for(i=1;i<=blocks;i++)
    {
      printf(" BLOCK %d power %d\n",i,pow1[i]);
    }
 }
void blankin(int row,int col);
// SToring the values of the output core arbitarily in the matrix...
   void map()
   {

     int ro,col,i,j,n,blanks;
     char ch;
      printf("the number of blocks are %d\n",part+1);
      printf("enter the dimensions of the matrix\n");
      scanf("%d%d",&ro,&col);
     
      blanks=(ro*col)-(part+1);
      printf("the number of blank spaces are%d\n",blanks);
      for(i=0;i<ro;i++)
      {
        for(j=0;j<col;j++)
        {
           h: printf("which core you want to keep at positin %d%d\n",i,j);
           printf(" or do you want it empty? if you want it empty press 88\n");
           w: scanf("%d",&n);
           if(n==88)
           {
            if (blanks>0)
           {
                mat[i][j]=0;
               blanks--;
            }

              else
             {
              printf("You have exceeded the number of blanks allowed\n please enter core numbers only\n");
              goto w;
           }
           }

           else
           {

           if(out[n-1].core_no!=0)
           {
              mat[i][j]=n;
              out[n-1].core_no=0;

           }
           else
           {

            printf("this core is already placed\n");
            goto h;
           }
         }
        }
      }
       printf("THE  FINAL MATRIX\n");
       printf("\ncore power size\n");
       for(i=0;i<ro;i++)
       {
         for(j=0;j<col;j++)
         {

            if(mat[i][j]==0)
            {
            printf("%d %d 0\n",mat[i][j],mat[i][j]);
            }
            else
            {
                printf("%d %d %d\n",mat[i][j],pow1[mat[i][j]],out[mat[i][j]-1].time);
            }
       }


     }
     printf("only printing the NOC\n");
      for(i=0;i<ro;i++)
   {
     for(j=0;j<col;j++)
     {
       printf("%d\t",mat[i][j]);
     }
     printf("\n");
   }    
     printf("number of rows %d,no of colums %d in NOC",ro,col);
     blankin(ro,col);

  }
 //function definiton
void calculate(int u,int m,int t,int s);

//finding the location of the blank spaces and giving precedence first to center, then side ,then corner
  void blankin(int row,int col)
{
   int i,j,bb[10],u=0,m=0,blnk=0,t=0,s=0;
   //counting the no.of blanks
   for(i=0;i<row;i++)
   {
     for(j=0;j<col;j++)
     {
        if(mat[i][j]==0)
        {
          blnk++;
        }
      }
    }  
   
     printf("only printing the NOC\n");
      for(i=0;i<row;i++)
   {
     for(j=0;j<col;j++)
     {
       printf("%d\t",mat[i][j]);
     }
     printf("\n");
   }  
    for(i=0;i<row;i++)
   {
     for(j=0;j<col;j++)
     {
       if((mat[i][j]==0 && j==0 && (i==0 || i==row-1))  || (mat[i][j]==0 && j==col-1 &&(i==0 || i==row-1)))//corner blank
             
        {
          mat[i][j]=11;
        }
        
       if(mat[i][j]==0 && ((i>0 && i<(row-1))  && (j>0 && j<(col-1) )))
        {
          mat[i][j]=31;
        }

       
       if((mat[i][j]==0 && j==0 && i>0 && i<(row-1)) || (mat[i][j]==0 && j==(col-1) && i>0 && i<(row-1)) || (mat[i][j]==0 && i==0 && j>0 && j<(col-1)) || (mat[i][j]==0 && i==(row-1)  && j>0 && j<(col-1) ) )//side blank
        {
          
          mat[i][j]=21;
        }
       
      }
    } 
    printf("the final matrix is\n");
     for(i=0;i<row;i++)
   {
      for(j=0;j<col;j++)
      {
         printf("%d\t",mat[i][j]);
      }
      printf("\n");
   }     

  
 /*  

 //grouping the blanks while hop =1
 while(blnk>0)
{    
  for(i=0;i<row;i++)
  {
    for(j=0;j<col;j++)
    {
       if(mat[i][j]==11 && (mat[i+1][j] !=11 || mat[i+1][j]!=21 || mat[i+1][j]!=31))//central block with no blank neighbour start grouping
       {
          grp1[u]=mat[i-1][j];u++;
          mat[i-1][j]=000;
          grp1[u]=mat[i+i][j];u++;
          mat[i+1][j]=000;
          grp1[u]=mat[i][j-1];u++;
          mat[i][j-1]=000;
          grp1[u]=mat[i][j+1];u++;
          mat[i][j+1]=000;
          blnk++;
        } 
       

       if(mat[i][j]==21 && (mat[i+1][j]!=21 || mat[i+1][j]!=31 || mat[i+1][j]!=11) && (mat[i][j+1]!=21 || mat[i][j+1]!=31 || mat[i][j+1]!=11) && (mat[i-1][j]!=21 || mat[i-1][j]!=31 || mat[i-1][j]!=11))//side (right nd left side)with no blank neighbours 
       {
           grp2[m]=mat[i+1][j];
           mat[i+1][j]==000;m++;
           grp2[m]=mat[i][j+1];
           mat[i][j+1]==000;m++;
           grp2[m]=mat[i-1][j];
           mat[i-1][j]==000;m++;
           blnk++;
        }  
          
          if(mat[i][j]=21 && (mat[i][j-1]!=21 || mat[i][j-1]!=11 || mat[i][j-1]!=31) && (mat[i+1][j]!=21 || mat[i+1][j]!=11 || mat[i+1][j]!=31) && (mat[i][j+1]!=21 || mat[i][j+1]!=11 || mat[i][j+1]!=31 )) //side (top nd down side)with no blank neighbours 
          {
            grp3[t]=mat[i][j-1];
           mat[i][j-1]==000;t++;
           grp3[t]=mat[i+1][j];
           mat[i+1][j]==000;t++;
           grp2[t]=mat[i][j+1];
           mat[i][j+1]==000;t++; 
           blnk++;
           
           } 

           if(mat[i][j]==31 && (mat[i+1][j]!=21 || mat[i+1][j]!=11) && (mat[i][j+1]=21 || mat[i][j+1]!=31))//side wd no neighbours
           {
             grp4[s]=mat[i+1][j];
             mat[i+1][j]==000;s++;
             grp4[s]=mat[i][j+1];s++;
             mat[i][j+1]=000;
             blnk++;
           }
           
      }     
  } 
}
 calculate(u,m,t,s);*/
}/*
//calculating total power of each group          		  
          void calculate(int u,int m,int t,int s)
     {
            int i,j,k,totalgrp1=0,totalgrp2=0,totalgrp3=0,totalgrp4=0;
            for(i=0;i<u;i++)
            {
              totalgrp1=totalgrp1+pow1[grp1[i]];
            }  
                 
            for(i=0;i<m;i++)
            {
              totalgrp2=totalgrp2+pow1[grp2[i]];
            }           
           for(i=0;i<t;i++)
            {
              totalgrp3=totalgrp3+pow1[grp3[i]];
            }
            for(i=0;i<u;i++)
            {
              totalgrp4=totalgrp4+pow1[grp4[i]];
            } 
            
            printf("Total power of each group is given as\n");
            printf("TOTAL POWER OF CENTER GROUP IS %d\n",totalgrp1); 
            printf("TOTAL POWER OF right left SIDE GROUP IS %d\n",totalgrp2); 
            printf("TOTAL POWER OF top down SIDE GROUP IS %d\n",totalgrp3); 
            printf("TOTAL POWER OF CORNER GROUP IS %d\n",totalgrp4); 
     }        
    
  */ 
    main()
{
   int blocks,l,w;
   printf("enter the number of blocks, length and width of rectangle\n");
   scanf("%d%d%d",&blocks,&l,&w);
   if(blocks==1)
    {
   printf("Block_no  Length  Breadth\n");
   printf("%d   %d   %d",blocks,l,w);
   exit(1);
    }
   partition(blocks,l,w);
   display();
   power(blocks);
   map(c);
   

}




