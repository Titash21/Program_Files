package edu.nyu.cs9053.homework2;

import java.util.Scanner;
import edu.nyu.cs9053.homework2.CompoundInterestCalculator;
import java.math.BigDecimal;
/**
 * User: blangel
 * Date: 8/17/14
 * Time: 10:21 AM
 */
public class Program {

    public static void main(String[] args) {
      String[] inputStringSplit= null;
      int i;
      if(args.length==0)
      {
       System.out.println("Invalid argument");   
       return;
      }
      else if(args[0].equals("gps")){
          //creating array of objects for Gps Class
        Gps[] gpsPoints= new Gps[args.length-1];
        for(i=0;i<args.length-1;i++){
                inputStringSplit= args[i+1].split(",");
                if(inputStringSplit.length!=2){
                    System.out.println("Invalid argument"); 
                    return;
                }
            //check if the input string matches the decimal number format or not
            Boolean isLatitudeDouble = inputStringSplit[0].matches("-?[0-9]+.?[0-9]*");
            Boolean isLongitudeDouble = inputStringSplit[1].matches("-?[0-9]+.?[0-9]*");
            if(!isLatitudeDouble || !isLongitudeDouble){
                System.out.println("Invalid argument"); 
                return;
            }
       double latitudeDouble=Double.valueOf(inputStringSplit[0]);
       double longitudeDouble=Double.valueOf(inputStringSplit[1]);
       gpsPoints[i-1]=new Gps(latitudeDouble,longitudeDouble);
      }
        //go to the file with the class PolylineEncoder
       PolylineEncoder ObjectPoly=new PolylineEncoder();
       String formatGpsString=ObjectPoly.encodePolyline(gpsPoints);
       System.out.println(formatGpsString);
 }
      else if(args[0].equals("interest"))
      {
          //annual interest calculator
          if(args[1].equals("annual"))
          {
                if(args.length!=6){
                  System.out.println("Invalid argument");
                }
                else{
                    //principal, rate, period,years
                    Boolean isPrincipalDouble=inputStringSplit[2].matches("-?[0-9]+.?[0-9]*");
                    Boolean isRateDouble= inputStringSplit[3].matches("-?[0-9]+.?[0-9]*");
                    Boolean isPeriodInt=inputStringSplit[4].matches("-?[0-9]+");
                    Boolean isYearsInt=inputStringSplit[5].matches("-?[0-9]+");
                  
             
                        if(!isPrincipalDouble || !isRateDouble || !isPeriodInt || isYearsInt){
                            System.out.println("Invalid argument");
                        }
                    else{
                    double principal=Double.valueOf(args[2]);
                    double rate=Double.valueOf(args[3]);
                    int period=Integer.valueOf(args[4]);
                    int years=Integer.valueOf(args[5]);
                    CompoundInterestCalculator ObjectCompound=new CompoundInterestCalculator();
                    BigDecimal interestBig = ObjectCompound.compoundAnnually(principal,rate,period,years);
                    System.out.println(interestBig);
                    }
                }
          }
          //interest continuous
          else if(args[1].equals("continuous"))
          {
             
               if(args.length!=5){
                  System.out.println("Invalid argument");
                }
                else{
                    //principal, rate,years
                    Boolean isPrincipalDouble=inputStringSplit[2].matches("-?[0-9]+.?[0-9]*");
                    Boolean isRateDouble=inputStringSplit[3].matches("-?[0-9]+.?[0-9]*");
                    Boolean isYearsInt=inputStringSplit[4].matches("-?[0-9]+");
                  
             
                        if(!isPrincipalDouble || !isRateDouble || isYearsInt){
                            System.out.println("Invalid argument");
                        }
                        else{
                        double principal=Double.valueOf(args[2]);
                        double rate=Double.valueOf(args[3]);
                        int years=Integer.valueOf(args[4]);
                        CompoundInterestCalculator ObjectCompound=new CompoundInterestCalculator();
                        BigDecimal interestBig= ObjectCompound.continuousCompound(principal,rate,years);
                        System.out.println(interestBig);
                        
                        }
                    }
          }
      }  
      else{
           System.out.println("Invalid argument");
      }
             
   }
}

