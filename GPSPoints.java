import java.util.*;
import java.math.BigDecimal;
import java.math.MathContext;
public class GPSPoints{
public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the latitude and longitude");
    String input = scan.nextLine();
    StringTokenizer strToken = new StringTokenizer(input);
    int count = strToken.countTokens();
    double[] arr = new double[count];

    for(int x = 0;x < count;x++){
        arr[x] = Double.parseDouble((String)strToken.nextElement());
    }
      

        double latitudeDecimal = (double) (arr[0] * 1e5);
        double longitudeDecimal= (double)(arr[1]* 1e5);
        System.out.println("original coordinate: " +latitudeDecimal +"  "+longitudeDecimal);
        System.out.println("encoded coordinate: " + encodeSignedNumber(latitudeDecimal,longitudeDecimal));
        


    }

    private static String encodeSignedNumber(double latitude,double longitude){
        int latitudeinInt=(int)latitude;
        int longitudeinInt=(int)longitude;
        int sgn_num = latitudeinInt<<1;
        int sgn_num2 = longitudeinInt<<1;
        
    
        if (latitudeinInt < 0) {
            sgn_num = ~(sgn_num);
        }
        else if(longitudeinInt<0){
            sgn_num2 = ~(sgn_num2);
        }
        return(encodeNumber(sgn_num,sgn_num2));
      }

    private static String encodeNumber(int latitude,int longitude) {

        int nextValue;
        String encodeLatitudeString = "";
        String encodeLongitudeString = "";
        String[] result=new String[2];

        //encode the latitude
        while (latitude >= 0x20) {
            nextValue = (0x20 | (latitude & 0x1f)) + 63;
            if (nextValue == 92) {
                encodeLatitudeString += ((char)nextValue);
            }
            encodeLatitudeString += ((char)nextValue);
            latitude >>= 5;
        }
        int finalValue = latitude + 63;
        if (finalValue == 92) {
            encodeLatitudeString += ((char)finalValue);
        }
        encodeLatitudeString += ((char)finalValue);
        

        //for the longitude the same code is followed
        while (longitude >= 0x20) {
            nextValue = (0x20 | (longitude & 0x1f)) + 63;
            if (nextValue == 92) {
                encodeLongitudeString += ((char)nextValue);
            }
            encodeLongitudeString += ((char)nextValue);
            longitude >>= 5;
        }
        int finalValue2 = longitude + 63;
        if (finalValue2 == 92) {
            encodeLongitudeString += ((char)finalValue2);
        }
        encodeLongitudeString += ((char)finalValue2);
        encodeLatitudeString=encodeLatitudeString.concat(encodeLongitudeString);

        return encodeLatitudeString;
       
    }
    
}
