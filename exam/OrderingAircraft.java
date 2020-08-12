public class OrderingAircraft implements Order {
   private String make;
   private int numSeats;

   public OrderingAircraft(String make, int numSeats)
   {
      this.make = make;
      this.numSeats = numSeats;
   }

   public String getMake()
   {
      return make;
   }

   public int getNumSeats()
   {
      return numSeats;
   }
   
   public String toString()
   {
       return make + " -> " + numSeats;
   }

   public boolean greaterThan(Order other){
    OrderingAircraft aircraft = (OrderingAircraft) other;
    if(numSeats > aircraft.numSeats){
        return true;
    }
    return false;
   }
}