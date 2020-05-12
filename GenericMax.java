public class Test {
    public static <T extends Order> T max(T n1, T n2)
    {
        if(n1.greaterThan(n2))
        {
            return n1;
        }
        return n2;
    }
}