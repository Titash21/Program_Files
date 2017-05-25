import java.util.*;
public class InnerOuterExample{
	
	private final int x=120;
	
	private class Inner{
		public int inner=223232;
		public final int innerFinal=323;
		public int display2(){
			return x;
		}
	}

	public void display(){
		System.out.printf("The OUTER Display is %d%n",new Inner().inner);
		System.out.printf("The OUTER Display is %d%n",new Inner().innerFinal);
	}
	public static void main(String args[]){
		InnerOuterExample outer=new InnerOuterExample();
		outer.display();
		InnerOuterExample.Inner object=outer.new Inner();
		int value=object.display2();
		System.out.printf("The inner can access private members is %d%n",value);
		
		//InnerOuterExample.Inner innerObj=new InnerOuterExample().new Inner();
		//innerObj.display();
	}
}