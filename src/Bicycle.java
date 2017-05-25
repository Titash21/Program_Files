import java.io.IOException;

/**
 * Created by TITASH MANDAL on 5/7/2017.
 */
public class Bicycle {
       private int x;
        public void running() throws IOException{
            try{
                int result=x/0;
            }catch(ArithmeticException ae){
                System.out.println("Division by 0");
            }
        }

}
