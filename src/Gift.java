import java.util.Objects;

/**
 * Created by TITASH MANDAL on 5/7/2017.
 */
public class Gift<T> {
    private final T gift;
    private final Double price;

    public Gift(T gift, Double price) {
        this.gift = gift;
        this.price = price;
    }


    public Object getGift() {
        return gift;
    }

    public Double getPrice() {
        return price;
    }
}
