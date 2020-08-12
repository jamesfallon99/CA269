public abstract class Shape {
    
    public abstract double area();

    public String toString(){
        return "The area is " + String.format("%.3f", area());
    }
}