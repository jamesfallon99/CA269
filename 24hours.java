public class Time
{
   // Private variables
   private int hour;
   private int mins;
   // Constructor (with a String parameter)
   
   public Time(String s)
   {
       
       hour = Integer.parseInt(s.substring(0, 2));
       mins = Integer.parseInt(s.substring(2, 4));
   }
   
    public Boolean isLater(Time t){
        if(hour > t.hour){
            return true;
        }
        if(hour == t.hour && mins > t.mins){
            return true;
        }
        return false;
    }
    
    public String toString()
    {
        if(hour < 10 && mins < 10){
            return "0" + hour + ":0" + mins;
        }
        if(mins < 10){
            return hour + ":0" + mins;
        }
        if(hour < 10){
            return "0" + hour + ":" + mins;
        }
        return (hour + ":" + mins);
    }
   // isLater(Time otherTime) // boolean method to compare two times
   // String toString() // return a String representation of the time (hh:mm)
}