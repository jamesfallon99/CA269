import java.util.List;
class Customer {
    private String _name;
    private List<Rental> _rentals;
    public Customer (String name, List<Rental> rentals){
        _name = name;
        _rentals=rentals;
    }
  
    public String getName(){
        return _name;
    }
    public List<Rental> getRentals(){
        return _rentals;
    }
    public String toString(){
        return _name+": "+_rentals.toString();
    }
    public String statement(){
        double totalAmount =0;
        int points=0;
        String result="";
        for (Rental rental:_rentals){
            double thisAmount=0;
            thisAmount=getTotal(rental);
            points+=getFrequentRenterPoints(rental);
            result+="  "+ rental.getMovie().getTitle()+"  "+String.valueOf(thisAmount)+"\n";
            totalAmount+=thisAmount;
        }
        result += "Amount owed is " + String.valueOf(totalAmount) +"\n";
        result += "You earned " + String.valueOf(points)+" frequent renter points"+"\n";
        return result;
    }
    public double getTotal(Rental rental){
        return rental.getCharge();
    }
    public int getFrequentRenterPoints(Rental rental){
        int frequentRenterPoints=1;
        if ((rental.getMovie().getPriceCode()==Movie.NEW_RELEASE)&&rental.getDaysRented()>1){frequentRenterPoints++;}
        return frequentRenterPoints;
    }
}