#include <stdio.h>
#include <stdbool.h>
#include <conio.h>
void main()
{
	int data=0;
	
	/*while(data!=1)
	{
		printf("ENTER ONE NUMBER\n");
		int re=scanf("%d %d",&a,&c);
		//char buf1[1024];
		char buf[1024];
		if(re==2)
		{	
			printf("data is %d %d ",a,c);
			data=1; 
		}
		else
		{
			printf("Invalid entry try again\n");
			//eat all input and dicard
			gets(buf);
			//gets(buf1);
		}
			
		}*/


char buffer[255] = {0};
int count = 0;
while( kbhit() )
{
    buffer[count++] = getch();
}
		
}