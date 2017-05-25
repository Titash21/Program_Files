/**
 * Created by TITASH MANDAL on 5/9/2017.
 */
public class EqualsAndHashCode {
    private final String fname;
    private final String sname;
    private final int age;

    public int getAge() {
        return age;
    }

    public String getFname() {

        return fname;
    }

    public EqualsAndHashCode(String fname, String sname, int age) {
        this.fname = fname;
        this.sname = sname;
        this.age = age;
    }

    @Override
    public boolean equals(Object object){
        if(this==object){ return true;}
        if(object==null || getClass()!=object.getClass()){
            return false;
        }
        EqualsAndHashCode that=(EqualsAndHashCode) object;
        if(age!=that.age){ return false;}
        return( (fname==null? that.fname==null: fname.equals(that.fname)) &&
                (sname==null ? that.sname==null : sname.equals(that.sname))
                );
    }

    @Override
    public int hashCode() {
        final int prime=31;
        int hash=1;
        hash=(prime*hash)+(fname==null?0:fname.hashCode());
        hash=(prime*hash)+(sname==null? 0 : sname.hashCode());
        hash=(hash*prime)+age;
        return hash;
    }

}
