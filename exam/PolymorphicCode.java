public class PolymorphicCode
{
   public static void main(String [] args)
   {
      Shape [] shapes = {
          new Circle(3),
          new Rectangle(6,1),
          new Rectangle(1, 2),
          new Circle(1)
      		};
      
      // Clunky non polymorphic way of doing it.
      for(Shape shape: shapes)
      {
          System.out.println(shape);
      }
   }
}