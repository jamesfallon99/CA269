public class Circle extends Shape {
    double radius;

    public Circle(double r){
        radius = r;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
}