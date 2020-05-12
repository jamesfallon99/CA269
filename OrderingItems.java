public class Point implements Order
{
    private double x, y;
    
    public Point(double newX, double newY)
    {
        x = newX;
        y = newY;
    }
    
        public boolean lessThan(Order other){
            Point p = (Point) other;
            if(x < p.x)
                return true;

            if(x == p.x)
                if(y < p.y)
                    return true;
                return false;
        }
    
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
}