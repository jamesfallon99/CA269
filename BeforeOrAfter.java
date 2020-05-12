public class Date
{
    private int day;
    private int month;
    private int year;
    
    public Date(String s)
    {
        
        String[] nums = s.split(" ");
        day = Integer.parseInt(nums[0]);
        month = Integer.parseInt(nums[1]);
        year = Integer.parseInt(nums[2]);
    }
    
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }
    
    // Create a boolean method which will check to sae that the date is on or after the date that is passed as a parameter.
    
    public Boolean isOnOrAfter(Date d){
        if(year > d.year){
            return true;
        }
        if(month > d.month && year == d.year){
            return true;
        }
        if(month == d.month && year == d.year && day >= d.day){
            return true;
        }
        return false;
    }
}