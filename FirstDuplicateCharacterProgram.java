
 
import java.util.HashMap;
import java.util.Map;
 
public class FirstDuplicateCharacterProgram {
 
    private static char findFirstDuplicateCharacter(String str)
            throws RuntimeException {
 
        checkForInvalidInput(str);
 
        char[] charArray = str.toCharArray();
        Map<Character, Integer> charCountMap = createCharacterCountMap(charArray);
 
        for (int i = 0; i < charArray.length; i++) {
            if (charCountMap.get(charArray[i]) > 1) {
                return charArray[i];
            }
        }
 
        throw new RuntimeException(
                "There is no duplicate character in the string.");
    }
 
    private static Map<Character, Integer> createCharacterCountMap(
            char[] charArray) {
 
        Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            charCountMap.put(c,
                    charCountMap.containsKey(c) ? charCountMap.get(c) + 1 : 1);
        }
 
        return charCountMap;
    }
 
    private static void checkForInvalidInput(String str) {
        if (str == null || str.isEmpty()) {
            throw new RuntimeException("Input is invalid.");
        }
 
    }
 
    public static void main(String[] args) {
        String str = "color";
        try {
            System.out.println("First duplicate character in a string : "
                    + findFirstDuplicateCharacter(str));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}