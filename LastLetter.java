import java.util.Scanner;

public class LastLetter
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = in.next();
        int len = name.length();
        String lastLetter = name.substring(len - 1);
        System.out.println("The last letter of your name is " + lastLetter + ".");
        
        // Use the length() method of the String class.
    }
}