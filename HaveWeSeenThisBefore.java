import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Previous
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        Set<Integer> set = new HashSet<Integer>();
        int num = in.nextInt();
        System.out.println("Enter some numbers (-1 to end)");
        System.out.println("Previous:");
        while(num != -1){
            if(set.contains(num))
                System.out.println(num);
            set.add(num);
            num = in.nextInt();
        }
        
    }
}