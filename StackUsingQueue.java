import java.util.*;

public class StackUsingQueue{

    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    public int pop() {
        //The java.util.LinkedList.peek() method retrieves, 
        //but does not remove, the head (first element) of this list.
        if (q1.peek() == null) {
            System.out.println("The stack is empty, nothing to return");
            int i = 0;
            return i;
        } else {
            //This method retrieves and removes the head (first element) of this list.
            int pop = q1.remove();
            return pop;
        }
    }

    public void push(int data) {

        if (q1.peek() == null) {
            q1.add(data);
        } else {
            for (int i = q1.size(); i > 0; i--) 
            {
                q2.add(q1.remove());
            }
            q1.add(data);
            for (int j = q2.size(); j > 0; j--) 
            {
                q1.add(q2.remove());
            }

        }
        System.out.println("STACK ELEMENTS ARE\n");
        Iterator it = q1.iterator(1);
        while(it.hasNext())
        {
            System.out.println(it.next());
        }


    }
            public static void main(String args[])
         {
            int i,ch=0;
            Scanner sc=new Scanner(System.in);
            StackUsingQueue obj=new StackUsingQueue();

            
            while(ch==0 || ch==1)

           {
                System.out.println("Enter 1 to Push and Enter 0 to pop ");
                ch=sc.nextInt();
                switch(ch){
                    case 0:
                    int item=obj.pop();
                    System.out.println("Item popped"+" "+item);
                    break;
                    case 1:
                    System.out.println("Enter item to be pushed");
                    i=sc.nextInt();
                    obj.push(i);
                    break;
                    default:
                    System.out.println("Wrong input try again\n");
                    break;
                }
                
           }     
            
        }
}

