import java.util.Scanner;

public class Temp{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Give me a fahrenheit temperature: ");
        double temp = in.nextDouble();
        temp = Convert.fahr2cels(temp);
        System.out.println("In celsius that would be: " + temp);
    }
}