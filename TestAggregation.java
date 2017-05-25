import java.io.*;
 class Address{
 	
 	String place;
 	int pin;

 	void set(String place,int pin)
 	{
 		this.place= place;
 		this.pin=pin;
 	}


 }

 public class TestAggregation{

 	int ID;
 	String name;
 	Address addr;

 	void setting(int ID, String name,Address addr)
 	{
 		this.ID=ID;
 		this.name=name;
 		this.addr=addr;
 		System.out.println("NAME  \t"+ name + "\tID\t" + ID );
 		System.out.println("\tPLACE  \t"+ addr.place + "\tPIN\t" + addr.pin );


 	}

 	public static void main(String args[])
 	{
 		Address obj1=new Address();
 		Address obj2=new Address();
 		Address obj3=new Address();
 		obj1.set("Kolkata",700032);
 		obj2.set("Manhattan",10017);
 		obj3.set("Kolkata",700035);

 		TestAggregation o1= new TestAggregation();
 		TestAggregation o2= new TestAggregation();
 		TestAggregation o3= new TestAggregation();
 		o1.setting(13592626,"Titash",obj1);
 		o2.setting(174534,"Titli",obj2);
 		o3.setting(1354576,"Tisha",obj3);
 	}
 }