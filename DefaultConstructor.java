public class Date
{
    private int day;
    private int month;
    private int year;
    
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }
    
    public Date()
    {
        day = 1;
        month = 1;
        year = 2000;
    }
}