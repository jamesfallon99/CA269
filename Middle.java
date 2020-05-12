public class Point
{
   private double x;
   private double y;

   public Point(double newX, double newY)
   {
      x = newX;
      y = newY;
   }

   public String toString()
   {
      return "(" + x + ", " + y + ")";
   }
   
   public Point midPoint(Point p1){
       return new Point((x + p1.x)/2, (y + p1.y)/ 2);
   }
}