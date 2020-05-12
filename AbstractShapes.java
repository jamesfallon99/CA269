public class Average{
    public static double averageArea(Shape [] shapes){
        double total = 0;
        for(Shape shape: shapes){
            total = total + shape.area();
        }
        return total/shapes.length;
    }
}