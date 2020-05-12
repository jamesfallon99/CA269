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
}