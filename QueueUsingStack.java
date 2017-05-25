import java.util.*;
public class QueueUsingStack{
	Stack<Integer> s1=new Stack<Integer>();
	Stack<Integer> s2=new Stack<Integer>();
	void push(int data)
	{
			if(s1.isEmpty())
			{
					s1.push(data);
			}
			else{
				while(!(s1.isEmpty()))
				{
					s2.push(s1.pop());
				}
				s1.push(data);
			System.out.println("The queue is");
			for(Integer i : s2) {
					System.out.println(i);
				}
				while(!(s2.isEmpty()))
				{
					s1.push(s2.pop());
				}

			}
			
			System.out.println("The queue is");
			for(Integer i : s1) {
					System.out.println(i);
				}
	}

	int pop()
	{
		if(s1.peek()==null)
		{
			System.out.println("Queue is empty");
			int i=0;
			return i;
		}
		else
		{
			int data=s1.pop();
			return data;
		}
	}

	 public static void main(String args[])
         {
            int i,ch=0;
            Scanner sc=new Scanner(System.in);
            QueueUsingStack obj=new QueueUsingStack();

            
            while(ch==0 || ch==1)

           {
                System.out.println("Enter 1 to Enqueue and Enter 0 to Dequeue ");
                ch=sc.nextInt();
                switch(ch){
                    case 0:
                    int item=obj.pop();
                    System.out.println("Item Dequeued"+" "+item);
                    break;
                    case 1:
                    System.out.println("Enter item to be Enqueued");
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