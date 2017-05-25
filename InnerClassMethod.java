import java.util.*;
public class InnerClassMethod{
			String str=String.format("%d int | %.f float | %.2f float", 10,10.121212,10.121212);
			System.out.println(str);
	InnerOuterExample anony=new InnerOuterExample(){
		
		 public void displaying(){
				System.out.println("This is an anonymous class");
			}
	};
	public static void main(String args[]){
		InnerClassMethod innerMe=new InnerClassMethod();
		innerMe.anony.display();
	}
}