public class Date
{
    private int day;
    private int month;
    private int year;
    
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }
    
    public Date(int d, int m, int y)
    {
        day = d;
        month = m;
        year = y;
    }
}