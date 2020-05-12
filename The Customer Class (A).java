import java.util.List;
class Customer {
     
    private String _name;
    private List<Rental> _rentals;

    public Customer (String name, List<Rental> rentals){
        _name = name;
        _rentals = rentals;
    }
    public List<Rental> getRentals() {
        return _rentals;
    }
    public String getName (){
        return _name;
    }
    public String toString(){
        return _name + ": " + _rentals.toString();
    }
 }
 
 //Main method uses the Rental class from previous question to create a list of Rental movies.
 //Then creates a list of type Rental which specifies what is in the list e.g list of strings
 //but in this case it's a list of rentals.