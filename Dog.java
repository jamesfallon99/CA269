public class Dog extends Animal{
    String name;
    public Dog(String n){
        super(n);
    }
    public String hello(){
        String s = "Woof";
        return s;
    }
}