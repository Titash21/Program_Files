import java.util.*;
public class factors{
	public static void findFactor(int number){
		 int i=1,k=0;
		int arr[]=new int[number];
		while(i<=number){
			if(number%i==0){
					arr[k]=i;
					k++;
			}
			i++;
		}

		for(i=0;i<k;i++){
			System.out.print(" "+arr[i]);
		}

	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		 findFactor(number);
	}

}