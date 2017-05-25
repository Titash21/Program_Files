/**
 * Created by TITASH MANDAL on 5/5/2017.
 */
public class GenericsTest<T> {
    public T getValue(T value){
        return value;
    }
    public GenericsTest<T> getValue(GenericsTest<T> value){
        return value;
    }

}
