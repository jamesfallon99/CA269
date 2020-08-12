public class Rectangle extends Shape {
    double width;
    double length;
    public Rectangle(double w, double l){
        width = w;
        length = l;
    }
    public double area(){
        return length * width;
    }
}