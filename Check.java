import java.io.*;
import java.lang.*;
class Check
{
	public static void main(String args[])throws IOException
	{	
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the gps");
		double gps=Double.parseDouble(br.readLine());
		double dGps=gps*(Math.pow(10,5));
		//int decimalGps=(int)dGps+12020000;

		System.out.println(decimalGps);
		String binaryGpsPoint="";
		if(decimalGps<0)
		{
            //left shift adds a 0 at the rightmost end and make it 1 after complementing
    		binaryGpsPoint=Integer.toBinaryString(~decimalGps)+"1";
    		
    	}
    	else {
            ///left shift adds a 0 at the end
    		binaryGpsPoint=Integer.toBinaryString(decimalGps)+"0";
    	}
    	binaryGpsPoint=binaryGpsPoint.substring(1);
    	System.out.println(binaryGpsPoint);
    	int len=binaryGpsPoint.length();
    	System.out.println("length "+len);
    	if(len%5!=0 )
    	{
    		int padding=len%5;
    		
    		System.out.println(padding);
    		switch(padding){
    			case 4: binaryGpsPoint="0"+binaryGpsPoint;
    			break;
    			case 3: binaryGpsPoint="00"+binaryGpsPoint;
    			break;
    			case 2: binaryGpsPoint="000"+binaryGpsPoint;
    			break;
    			case 1: binaryGpsPoint="0000"+binaryGpsPoint;
    			break;
    		}
    	
    	}
    	
    	System.out.println(binaryGpsPoint);
    	String chunks[]=new String[10];
    	int newLen=binaryGpsPoint.length();
    	System.out.println("new lenth="+newLen);
    	int j=-1,i=newLen;
    	int intValueOfChunks[]=new int[10];
    
    	do
    	{
    		j++;
    		chunks[j]=binaryGpsPoint.substring(i-5,i);
    		System.out.println(chunks[j]);
    		

    		i-=5;
    	}while (i>2);
    	
    	System.out.println(j);
    	for(int k=0;k<j;k++)
    	{
    		intValueOfChunks[k]=(Integer.parseInt(chunks[k],2))+95;
    		System.out.println(intValueOfChunks[k]);
    	}
    	intValueOfChunks[j]=(Integer.parseInt(chunks[j],2))+63;
    		System.out.println(intValueOfChunks[j]);

    		String result="";
    		for(int k=0;k<=j;k++)
    		{
    			result=result+((char)intValueOfChunks[k]);

    		}
    		System.out.println(result);
	}
}