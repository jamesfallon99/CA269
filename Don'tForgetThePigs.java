// A Pig is an animal which has a name and says "Oink".
// It likes to polymorph in an array.

public class Pig extends Animal{
    String name;
    public Pig(String n){
        super(n);
    }
    public String hello(){
        String s = "Oink";
        return s;
    }
}