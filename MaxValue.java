public class MaxValue{
	public class Inner{
		int x;
		void display(){System.out.println("Inner");}
		
	}
	public static void main (String[] args) throws java.lang.Exception{
	System.out.println("MAX_VALUE AND MIN_VALUES");

		Long negativeLongMax= (-Long.MAX_VALUE);
		System.out.println("MAX_VALUE_NEGATIVE of LONG:" + negativeLongMax);
		Long minLong= (Long.MIN_VALUE);
		System.out.println("MIN_VALUE_NEGATIVE of LONG:" + minLong);

		int negativeIntMax=-Integer.MAX_VALUE;
		int intMin=Integer.MIN_VALUE;
		System.out.println("MAX_VALUE_NEGATIVE of Integer:  " + negativeIntMax);
		System.out.println("MIN_VALUE_NEGATIVE of Integer: "+  intMin);
		


		Double negativeDoubletMax= (-Double.MAX_VALUE);
		Double minDouble= (Double.MIN_VALUE);
		System.out.printf("%s%n",negativeDoubletMax>minDouble);
		System.out.println("NegativeDubleMax   "+ negativeDoubletMax+  "  minD  "+minDouble );

	}
}
		