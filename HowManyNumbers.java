import java.util.Scanner;
public class HowManyNumbers
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int count = 0;
        int num = in.nextInt();
        while(num != -1){
            num = in.nextInt();
            count += 1;
            
                
        }
        
            System.out.println(count + " numbers were entered.");
        

    }
}