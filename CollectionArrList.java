import java.util.*;  
class CollectionArrList{  
 public static void main(String args[]){  
   
  ArrayList<String> al=new ArrayList<String>();//creating arraylist  
  al.add("Ravi");//adding object in arraylist  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
  System.out.println("List" + al); 
  Iterator itr=al.iterator();//getting Iterator from arraylist to traverse elements  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}