public class Test
{
    // Create a static void method called reverse which takes an array of ints
    public static int [] reverse(int [] num)
    {
        int j = num.length - 1;
        int tmp = 0;
        for(int i=0; i<(num.length/2); i++)
        {
            tmp = num[i];
            num[i] = num[j];
            num[j] = tmp;
            j--;
        }
        
        return num;
    }
}