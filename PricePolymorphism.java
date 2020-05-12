public abstract class Price{
    public static int CHILDRENS;
    public static int NEW_RELEASE;
    public static int REGULAR;
    abstract int getPriceCode();
}
public class ChildrensPrice extends Price{
    public int getPriceCode(){
    return CHILDRENS;
    }
}
public class NewReleasePrice extends Price{
    public int getPriceCode(){
    return NEW_RELEASE;
    }
}
public class RegularPrice extends Price{
    public int getPriceCode(){
    return REGULAR;
    }
}