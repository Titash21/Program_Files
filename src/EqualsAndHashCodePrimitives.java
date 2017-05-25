/**
 * Created by TITASH MANDAL on 5/10/2017.
 */
public class EqualsAndHashCodePrimitives {
    private final int value;
    private final String name;
    private final String dValue;
    private final char c;
    private final long lvalue;
    private final double dvalue;

    public EqualsAndHashCodePrimitives(int value, String name, String dValue, char c, long lvalue, double dvalue) {
        this.value = value;
        this.name = name;
        this.dValue = dValue;
        this.c = c;
        this.lvalue = lvalue;
        this.dvalue = dvalue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EqualsAndHashCodePrimitives)) return false;

        EqualsAndHashCodePrimitives that = (EqualsAndHashCodePrimitives) o;

        if (value != that.value) return false;
        if (c != that.c) return false;
        if (lvalue != that.lvalue) return false;
        if (Double.compare(that.dvalue, dvalue) != 0) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return dValue != null ? dValue.equals(that.dValue) : that.dValue == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = value;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (dValue != null ? dValue.hashCode() : 0);
        result = 31 * result + (int) c;
        result = 31 * result + (int) (lvalue ^ (lvalue >>> 32));
        temp = Double.doubleToLongBits(dvalue);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
