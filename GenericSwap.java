public class Swap
{
    public static <T> void swap(T [] rand, Integer a, Integer b)
    {
        T tmp = rand[a];
        rand[a] = rand[b];
        rand[b] = tmp;
    }
}