import java.util.Scanner;

public class EvenOdd {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        System.out.print("Enter a number: ");
        
        if(n % 2 == 0) {
            System.out.println(n + " is even.");
        }
        else {
            System.out.println(n + " is odd.");
        }
    }
}
