import java.util.*;
import java.math.BigDecimal;
import java.math.MathContext;
public class DecimaltoBinary {
	void appendZero(double coordinate)
	{
		int flag=0;
		if(coordinate<0) {flag=1;}
        int value=((int) Math.ceil(coordinate * 1e5));

        System.out.println(value);
        binaryCalculator(value,flag);
	}
	void binaryCalculator(int value,int flag)
	{
		String binaryString=Integer.toBinaryString(value);
		System.out.println("Binary String is"+ binaryString);
		StringBuilder sb=new StringBuilder(binaryString);
		binaryString=sb.deleteCharAt(0).toString();
		binaryString=sb.append(0).toString();
		System.out.println("shfited string is "+ binaryString);
		int length=binaryString.length();
		int[] binaryArray=new int[length];
		//complement 
		for(int i=0;i<length;i++)
		{
			
			if(binaryString.charAt(i)=='1')
			{
				StringBuilder sb1=new StringBuilder(binaryString);
				binaryString=sb1.deleteCharAt(i).toString();
				binaryString=sb1.insert(i,'0').toString();
			}
			else if(binaryString.charAt(i)=='0')
				{
					StringBuilder sb2=new StringBuilder(binaryString);
					binaryString=sb2.deleteCharAt(i).toString();
					binaryString=sb2.insert(i,'1').toString();
				}
			
		}

		System.out.println(binaryString);
		divideIntoFiveGroups(binaryString);


	}
	void divideIntoFiveGroups(String binaryString)
	{
		
		/*List<String> list = new LinkedList<String>();
			list.add(0,add_string);
			read list.add(index, object). Simple reversal*/
		int length=binaryString.length();
		int i=length;
		String reverseBinaryString=" ";
		while((i-1-5)>0)
		{	
			
			String substring=binaryString.substring((i-1-5),(i-1));
			System.out.println("substring length 5 is"+ " "+ substring);
			i-=5;
		}
	}
	
	public static void main(String[] args) {
       
       DecimaltoBinary obj=new DecimaltoBinary();
       Scanner scan=new Scanner(System.in);
       double coordinate=scan.nextDouble();
       obj.appendZero(coordinate);
    	}
   }     