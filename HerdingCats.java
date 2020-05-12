// Modify this class so that it implements the Order interface
public class Cat implements Order
{
    private String name;
    
    public Cat(String n)
    {
        name = n;
    }
    
    public boolean lessThan(Order other){
        Cat c = (Cat) other;
        if(name.length() < c.name.length())
            return true;
        return false;
    }
    
    public String toString()
    {
        return "Cat: " + name;
    }
}