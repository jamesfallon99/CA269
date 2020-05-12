public class Movie{
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    
    private String _title;
    public Price price;
    
    public Movie(String title, int priceCode){
        _title = title;
        setPriceCode(priceCode);
    }
    public int getPriceCode(){
        return price.getPriceCode();
    }
    public void setPriceCode(int arg){
        if(arg == CHILDRENS){
            price = new ChildrensPrice();
        }
        else if(arg == REGULAR){
            price = new RegularPrice();
        }
        else{
            price = new NewReleasePrice();
        }
    }
    public String getTitle(){
        return _title;
    }
    
    public double getCharge(int _daysRented) {
	    double thisAmount = 0;
	    switch (getPriceCode()) {
            case Movie.REGULAR:
		        thisAmount += 2;
		    if (_daysRented > 2){ 
		        thisAmount += (_daysRented - 2) * 1.5;
		    }
		    break;
	    case Movie.NEW_RELEASE:
		    thisAmount += _daysRented * 3;
		    break;
	    case Movie.CHILDRENS:
		    thisAmount += 1.5;
		    if (_daysRented > 3){ 
		        thisAmount += (_daysRented - 3) * 1.5;
		    }
		    break;
	    }
	return thisAmount;
    }
    public int getFrequentRenterPoints(int _daysRented){
        int frequentRenterPoints=1;
        if ((getPriceCode()==Movie.NEW_RELEASE)&&_daysRented>1){frequentRenterPoints++;}
        return frequentRenterPoints;
    }
}