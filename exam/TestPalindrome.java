import java.util.Scanner;

public class TestPalindrome
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the word: ");
        String word = in.next();

        String pal = MakeAPalindrome.palindrome(word);

        System.out.println("The palindrome is: " + pal);
    }
}