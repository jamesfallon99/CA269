import java.util.Scanner;

public class TestRotate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        String rote = Rotate.rotateString(word);
        System.out.println(rote);
    }

}