import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class MidTermTension extends MidTerm{
	
	public static void main(String args[]){
		MidTerm obj=new MidTermTension();
				//obj.testFeature();
				obj.printName("Honey");
	}
		@Override public void printName(String name){
			String value="Crazy"+name;
			System.out.println(value);
		}
		public void testFeature(){
			System.out.println("DOES THIS WORK?");
		}
}