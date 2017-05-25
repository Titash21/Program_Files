public static void main(String[] args) {
        // double coordinate = -179.9832104;
        double coordinate =40.7;
        double coordinate1 =-120.95 ;

        int coordinateDecimal = (int) (coordinate * 1e5);

        System.out.println("original coordinate: " + coordinate);
        System.out.println("encoded coordinate: " + encodeSignedNumber(coordinateDecimal));

    }

    private static String encodeSignedNumber(int num) {

        int sgn_num = num << 1;

        if (num < 0) {
            sgn_num = ~(sgn_num);
        }

        return(encodeNumber(sgn_num));
      }

    private static String encodeNumber(int num) {

        String encodeString = "";
        int nextValue;

        while (num >= 0x20) {
            nextValue = (0x20 | (num & 0x1f)) + 63;
            if (nextValue == 92) {
                encodeString += ((char)nextValue);
            }
            encodeString += ((char)nextValue);
            num >>= 5;
        }

        int finalValue = num + 63;
        if (finalValue == 92) {
            encodeString += ((char)finalValue);
        }
        encodeString += ((char)finalValue);
        
        return encodeString;
        
    }
    
}