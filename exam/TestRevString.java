import java.util.Scanner;

public class TestRevString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        boolean result = ReverseString.reverseString(s1, s2);
        System.out.println(result);
    }
}