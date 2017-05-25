import java.util.Date;

/**
 * Created by TITASH MANDAL on 5/9/2017.
 */
public class DateTest {
    public static void main(String[] args) {
        DateTest dateTest=new DateTest();
        Date date=new Date();
        date.setTime(1L);
        dateTest.invoke(date);
        System.out.println("Time is " + date.getTime());
        dateTest.print();
    }
    //default values are assigned to instance variables not just static instances
    int value;
    public void print(){
        System.out.println("Value is  "+ value);
    }

    public void invoke(Date date){
        date.setTime(2L);
        Date date1=new Date();
        date1.setTime(3L);

    }
}
