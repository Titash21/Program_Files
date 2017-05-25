import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class VendingMachineDispenser {

    private static final int MAX_INITIAL_SELTZERS = 1000;
   
    public static void main(String[] args) {
        
        List<Integer> seltzers = seed();

    }
        public static void seed() {
        Random random = new Random();
        int capacity = random.nextInt(MAX_INITIAL_SELTZERS) + 1;
        System.out.println(capacity);
        
    }
    
 }  