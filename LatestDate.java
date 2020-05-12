import java.util.Scanner;

public class Date
{
   int day;
   int month;
   int year;
   public Date(int d, int m, int y)
   {
	   day = d;
	   month = m;
	   year = y;
   }
   public Date()
   {
	   day = 1;
	   month = 1;
	   year = 2000;
   }
   public Date(String s)
   {
	   
	   String[] nums = s.split(" ");
	   if(s.length() > 0)
	   {
	   day = Integer.parseInt(nums[0]);
	   month = Integer.parseInt(nums[1]);
	   year = Integer.parseInt(nums[2]);
       }
   }

    
   public boolean isOnOrAfter(Date d)
   {
	   if(year < d.year)
	   {
		   return true;
	   }
	   if (year == d.year && month < d.month)
	   {
		   return true;
	   }
	   if (year == d.year && month == d.month && day <= d.day)
	   {
		   return true;
	   }
	   return false;
   }
   public String toString()
   {
      return day + "/" + month + "/" + year;
   }
   public static void main(String [] args)
   {
       Scanner in = new Scanner(System.in);
       String line;
       Date latest = new Date("0 0 0");
       while(in.hasNextLine())
       {
          line = in.nextLine();
          Date date = new Date(line);
          if (latest.isOnOrAfter(date))
          {
        	  latest = date;
          }
       }
       System.out.println(latest);
   }
}