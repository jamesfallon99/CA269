import java.util.Scanner;

public class Cent2Fahr {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        
        // final double c2fConversion = (9 / 5) + 32;
        
        int cent = in.nextInt();
        double fahr = (double) cent * 9 / 5 + 32;
        
        System.out.printf(cent + " " + fahr);
    }
}