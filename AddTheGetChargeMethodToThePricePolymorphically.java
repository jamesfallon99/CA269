public abstract class Price{
    public static int CHILDRENS;
    public static int NEW_RELEASE;
    public static int REGULAR;
    abstract int getPriceCode();
    
    public abstract double getCharge(int _daysRented);
}

public class ChildrensPrice extends Price{
    public int getPriceCode(){
    return CHILDRENS;
    }
    public double getCharge(int _daysRented){
        if(_daysRented > 3){
            return 1.5 + ((_daysRented - 3) * 1.5);
        }
        return 1.5;
    }
}
public class NewReleasePrice extends Price{
    public int getPriceCode(){
    return NEW_RELEASE;
    }
    public double getCharge(int _daysRented){
        return 3 * _daysRented;
    }
}
public class RegularPrice extends Price{
    public int getPriceCode(){
    return REGULAR;
    }
    public double getCharge(int _daysRented){
        if(_daysRented > 2){
            return 2 + ((_daysRented - 2) * 1.5);
        }
        return 2;
    }
}