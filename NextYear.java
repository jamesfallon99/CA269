import java.util.Scanner;

public class NextYear {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("What is your name: ");
        String name = in.next();        // Note that the Scanner method, next(), reads in a word.
        
        System.out.print("What age are you: ");
        int age = in.nextInt();
        int newAge = age + 1;
        System.out.println("Hello " + name + ", next year you will be " + newAge + ".");
    }
}