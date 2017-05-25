#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#include <assert.h>
void insertionSort(int ar_size, int *  ar) {

        int key=0,i,j,t;
        
        
       
        
       for (j = 1; j < ar_size; j++) {
            key = ar[j];
            i = j-1;
            while ( (i > -1) && ( ar[i] > key ) ) {
                ar[i+1] = ar[i];
                i--;
            }
            ar[i+1] = key;
            for(t=0;t<ar_size;t++)
            {
            	printf("%d",ar[t]);
            }
            printf("\n");
        }
            	printf("\n");
            for(i=0;i<ar_size;i++)
            {
            	printf("%d",ar[i]);
            }

            
            
}
int main(void) {
    int _ar_size;
    scanf("%d", &_ar_size);
    int _ar[_ar_size], _ar_i;
    for(_ar_i = 0; _ar_i < _ar_size; _ar_i++) { 
        scanf("%d", &_ar[_ar_i]); 
    }

    insertionSort(_ar_size, _ar);
    return 0;
}
