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
            if(Math.sqrt(x*x + y*y) < Math.sqrt(p.x*p.x + p.y*p.y))
                return true;
            return false;
        }
    
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
}