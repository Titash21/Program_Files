/**
 * Created by TITASH MANDAL on 5/9/2017.
 */
public class WrapperGotcha {
    public static void main(String[] args) {
        WrapperGotcha wrapperGotcha=new WrapperGotcha();
        wrapperGotcha.print(wrapperGotcha.load());

    }
    public Integer load(){
        Integer value=null;
        return value;
    }
    // will throw a null pointer exception
    public void print(int value){
        System.out.printf("Integer value is %d", value);
    }
}
