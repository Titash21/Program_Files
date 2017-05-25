import java.util.*;
import java.math.BigDecimal;
public class Test {

	void postiveLatitudeLongitudeCalculator(double GpsPoint)
    {
        BigDecimal bigGpsPoint=new BigDecimal(GpsPoint);
        //multiply by 10^5
        BigDecimal multiplicant=new BigDecimal(100000);
        BigDecimal multiplies=bigGpsPoint.multiply(multiplicant);
        multiplies=multiplies.setScale(0, BigDecimal.ROUND_CEILING);   
        System.out.println("The big decimal is"+" "+ multiplies);

        //convert it to long and convert long to Hexadecimal

        /*long multipliesToLong=multiplies.longValue();
        System.out.println("Long value is"+" "+ multipliesToLong);
        String longToHexString=Long.toHexString(multipliesToLong);
        System.out.println("Hexadecimal String is "+"  "+ longToHexString);*/
       	
        //convert to binary and append 000s
   		//int i = Integer.parseInt(longToHexString,16);
   		//System.out.println("The integer after string conversion is"+" "+i);
   		long multipliesToLong=multiplies.longValue();
    	String bin = Long.toBinaryString(multipliesToLong);
    	StringBuilder stringBuilder=new StringBuilder(bin);
    	System.out.println("Binary String is" + bin);
    	long binaryValue=Long.parseLong(bin);
    	System.out.println("Long value is"+" "+binaryValue);
    	long shiftedValue=binaryValue<<1;
    	System.out.println("Shifted value is"+" "+ shiftedValue);

    	
  


        /*long hex=Long.parseLong(longToHexString);
        System.out.println("The hexadecimal string converted to long is "+" "+ hex);

		String hexToBinary=Long.toBinaryString(hex);


		System.out.println("Binary String is "+"  "+ hexToBinary);*/
	}	
   public static void main(String args[])
   {
       
           
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the latitude and longitude");
    String input = scan.nextLine();
    StringTokenizer strToken = new StringTokenizer(input);
    int count = strToken.countTokens();
    double[] arr = new double[count];

    for(int x = 0;x < count;x++){
        arr[x] = Double.parseDouble((String)strToken.nextElement());
    }
    Test object=new Test();
    if(arr[0]>0 && arr[1]>0)
    {
    	object.postiveLatitudeLongitudeCalculator(arr[0]);
    	object.postiveLatitudeLongitudeCalculator(arr[1]);

    }	
  
    
    }
}