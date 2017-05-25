import java.util.*;
public class StackDemo{
	 static void showpush(Stack st,int a)
	 {
	 	st.push(new Integer(a));
	 	System.out.println("Push:"+ a);
	 	System.out.println("Stack:  "+ st);
	 }

	 static void showpop(Stack st)
	 {
	 	Integer a= (Integer)st.pop();
	 	System.out.println("Pop:"+ a);
	 	System.out.println("Stack:  "+ st);

	 }
	 static void finding(Stack st, int a)
	 {
	 	int x= st.search(new Integer(a));
	 	System.out.println("Looking for elements " + x);
	 }

	 public static void main(String[] args) {
	 	Stack st= new Stack();
	 	System.out.println("Stack : " + st);
	 	showpush(st,10);
	 	showpush(st,20);
	 	showpush(st,30);
	 	showpush(st,40);
	 	finding(st,87);
	 	finding(st,40);
	 	showpop(st);
	 	showpop(st);
	 	showpop(st);
	 	showpop(st);
	 	showpop(st);

	 	try {
         showpop(st);
      }catch (EmptyStackException e) {
         System.out.println("empty stack");
	 }
}
}