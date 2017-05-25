/**
 * Created by TITASH MANDAL on 5/7/2017.
 */
public class GiftGiver {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Gift Jon = new Gift(computer, 2327d);

        Bicycle bicycle = new Bicycle();
        Gift jerry = new Gift(bicycle, 324332d);

        Computer jerryGift = (Computer) jerry.getGift();
        Bicycle Jongift = (Bicycle) Jon.getGift();
    }
}
