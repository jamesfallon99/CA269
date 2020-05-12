import java.util.List;
class Customer {

	private String _name;
	private List < Rental > _rentals;

	public Customer(String name, List < Rental > rentals) {
		_name = name;
		_rentals = rentals;
	}
	public List < Rental > getRentals() {
		return _rentals;
	}
	public String getName() {
		return _name;
	}
	public String toString() {
		return _name + ": " + _rentals.toString();
	}

	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		
		String result = "";
		for(Rental rental: _rentals){
			frequentRenterPoints+=getFrequentRenterPoints(rental);
			result += "  " + rental.getMovie().getTitle() + "  " + String.valueOf(getTotal(rental)) + "\n";
			//determine amounts for each line
			totalAmount += getTotal(rental);
			}
		//add footer lines
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points" + "\n";
		return result;
	}
	public double getTotal(Rental rental) {
	    return rental.getCharge();
	}
	public int getFrequentRenterPoints(Rental rental){
	    int renterPoints=1;
	    if((rental.getMovie().getPriceCode()==Movie.NEW_RELEASE)&&rental.getDaysRented()>1){
	        renterPoints++;
	    }
	    return renterPoints;
	}
	public double getTotalCharge(){
	    double total=0;
	    for(Rental rental: _rentals){
	        total+=getTotal(rental);
	    }
	    return total;
	}
	public int getTotalFrequentRenterPoints(){
	    int frequentPoints=0;
	    for(Rental rental:_rentals){
	        frequentPoints +=getFrequentRenterPoints(rental);
	    }
	    return frequentPoints;
	    }
	    
	}