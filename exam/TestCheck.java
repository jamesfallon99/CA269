import java.util.Scanner;

public class TestCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        boolean rotated = CheckIfRotated.isRotated(s1,s2);
        System.out.println(rotated);
    }

}