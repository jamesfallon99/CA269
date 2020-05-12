import java.util.Scanner;
public class NoMinusOne
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int num = in.nextInt();
        int previous_num = num;
        while(num != -1){
            previous_num = num;
            num = in.nextInt();
                
        }
        
            System.out.println("The penultimate number was: " + previous_num);
        

    }
}