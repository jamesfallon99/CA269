import java.util.Scanner;

public class Absolute {
    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        if(n < 0) {
            int m = n * -1;
            System.out.print("Enter a number: ");
            System.out.println("The absolute value is " + m + ".");
        }
        else {
        System.out.print("Enter a number: ");
        System.out.println("The absolute value is " + n + ".");
        }
    }
}