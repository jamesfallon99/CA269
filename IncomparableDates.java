// Make the Date class implement the comparable interface

public class Date implements Comparable<Date>
{
   private int day, month, year, overallTime;

   public Date(int day, int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;
      this.overallTime = (year * 365) + (month * 30) + day;
   }

   public String toString()
   {
      return day + "/" + month + "/" + year;
   }
   
   public int compareTo(Date other)
   {
       if(other.overallTime == overallTime){
           return 0;
       }
       else if(overallTime > other.overallTime){
           return 1;
       }
       else
           return -1;
     // return Integer.compare(overallTime, other.overallTime);
   }
}