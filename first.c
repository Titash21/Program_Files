#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
int day_returned,
    month_returned,
    year_returned;
    
    
int day_expected,
    month_expected,
    year_expected,fine=0;
   
    scanf("%d %d %d",&day_returned,&month_returned,&year_returned);
    scanf("%d %d %d",&day_expected,&month_expected,&year_expected);
   
    if(day_returned==day_expected)
          {
            if(month_returned==month_expected && year_returned==year_expected)
                {
                    printf("%d",fine);
                }
              else if(month_returned<month_expected && year_returned==year_expected)
                {
                    printf("%d",fine);
                }
               else if(month_returned==month_expected && year_returned>year_expected)
               {
                    printf("1000");
               }
               else if(month_returned>month_expected && year_returned==year_expected)
                {
                    fine=500*(month_returned-month_expected);
                    printf("%d",fine);
                }
                else if(month_returned>month_expected && year_returned>year_expected)
                {
                   printf("1000");
                }
                else if(month_returned<month_expected && year_returned>year_expected)
                   {
                        printf("1000");
                   }
             
        
          }
     else if(day_returned<day_expected)
          {
            if(month_returned==month_expected && year_returned==year_expected)
                {
                    printf("%d",fine);
                }
                else if(month_returned<month_expected && year_returned==year_expected)
                {
                    printf("%d",fine);
                }
               else if(month_returned==month_expected && year_returned>year_expected)
               {
                    printf("1000");
               }
               else if(month_returned>month_expected && year_returned==year_expected)
                {
                    fine=500*(month_returned-month_expected);
                    printf("%d",fine);
                }
                else if(month_returned>month_expected && year_returned>year_expected)
                {
                   printf("1000");
                }
                else if(month_returned<month_expected && year_returned>year_expected)
                   {
                        printf("1000");
                   }
                else if(year_returned>year_expected)
              {
                  printf("1000");
              }
        
          }
    else if(day_returned>day_expected)
         {
            if(month_returned==month_expected && year_returned==year_expected)
                {
                    fine=15*(day_returned-day_expected);
                    printf("%d",fine);
                }
                else if(month_returned<month_expected && year_returned==year_expected)
                {
                    printf("%d",fine);
                }
                else if(year_returned>year_expected)
              {
                  printf("1000");
              }
                else if(month_returned==month_expected && year_returned>year_expected)
               {
                    printf("1000");
               }
        
                 else if(month_returned>month_expected && year_returned==year_expected)
                {
                    fine=500*(month_returned-month_expected);
                    printf("%d",fine);
                }
                else if(month_returned>month_expected && year_returned>year_expected)
                {
                   printf("1000");
                }
                 else if(month_returned<month_expected && year_returned>year_expected)
                   {
                        printf("1000");
                   }
         }
   
 
    
    
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    return 0;
}