import java.io.*;
public class Boxing{
	public static void display(Long i){
		System.out.println("Boxed Function  " + i);
	}
	public static void display(long i){
			System.out.println("Long Function  "+  i);
			}
	/*public static void display(Integer... i)
	{
		for(Integer integer: i){
			System.out.println(integer);
		}
	}*/
			public static void main(String args[]){
				int a=298;
				//int b=238;
				display(a);
			}
}