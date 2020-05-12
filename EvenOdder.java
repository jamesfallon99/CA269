import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class EvenOdd{
    public static void main(String [] args){
        List<Integer> even = new ArrayList<Integer>();
        List<Integer> odd = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        while(num != -1){
            if(num % 2 != 0)
                odd.add(num);
            else
                even.add(num);
            num = in.nextInt();
        }
        System.out.println("Odd: ");
        for(int n: odd){
            System.out.print(n + " ");
        }
        System.out.println("Even: ");
        for(int n: even){
            System.out.print(n + " ");
        }
    }
}