public class Pair <T, Q>
{
    T Obj1;
    Q Obj2;

    public Pair(T Obj1, Q Obj2)
    {
        this.Obj1 = Obj1;
        this.Obj2 = Obj2;
    }
    
    public String toString()
    {
        return Obj1.toString() + " " + Obj2.toString();
    }
}