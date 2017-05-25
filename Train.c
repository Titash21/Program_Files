
#include<stdio.h>

int platforms(double arr[], double dep[], int s) {
			int nplats[2*s];
			for (int i = 0; i < s; i++)
			nplats[i] = 0;
			int i = 0, j = 0, ct = 0;
			int mx = 0;
			while (i < s) {
					if (i == 0) {
						nplats[ct] = 1;
						if (mx < nplats[ct])
						mx = nplats[ct];
						i++; ct++;
						}
					if (arr[i] < dep[j]) {
						nplats[ct] = nplats[ct-1] + 1;
						if (mx < nplats[ct])
						mx = nplats[ct];
						i++; ct++;
						} 
						else if (arr[i] > dep[j]) {
						nplats[ct] = nplats[ct-1] - 1;
						j++; ct++;
						} 
						else if (arr[i] == dep[j]) {
							nplats[ct] = nplats[ct-1];
							i++; j++; ct++;
						}
				}
	return mx;
	}

int main() {
double arr[] = {9.0,9.4,9.5,11.0,15.0,18.0};
double dep[] = {9.1, 12.0, 11.20, 11.30, 19.0, 20.0};
sort(dep,dep+6);
int platforms=platforms(arr,dep,6);

printf("%d",platforms);

return 0;
}