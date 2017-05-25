import java.util.*;
public class CheckStringBuilder {

public static void main(String args[])
	{
		long number=47;
		long remainder=0;
		String remainderString="";
		long numberChange=(number*100000);
	while(numberChange!=0)
	{
		StringBuilder sb=new StringBuilder(remainderString);
		remainder=numberChange%16;
		remainderString=sb.append("remainder");
		System.out.println("  "+remainderString);
		numberChange=(numberChange/16);
	}
	int integerString=remainderString;
	int binaryString=Integer.toBinaryString(integerString);
	System.out.println(" Binary String is "+ binaryString);
	if(number<0)
	{
		remainderString=sb.append("1111");
	}
	else
	{
		remainderString=sb.append("0000");
	}
	System.out.println("  "+remainderString);
	int finalString=remainderString;
	int shiftedBinary=(finalString<<1);
	}
}
