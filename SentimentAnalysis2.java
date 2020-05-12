import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Senti2
{
    public static void main(String [] args) throws FileNotFoundException
    {
        int count = 0;
        int countLine = 0;
        double total = 0.00;
        Scanner in = new Scanner(new File(args[1]));
        while(in.hasNextLine()){
            String [] review;
            String s = in.nextLine();
            if(s.contains(args[0])){
                countLine++;
            }
            review = s.split(" ");
            int score = Integer.parseInt(review[0]);
            for(int i=0; i<review.length; i++){
                if(review[i].contains(args[0])){
                    count ++;
                    total = total + score;
            }
            }
        }
        if(count == 0){
            countLine = 1;
        }
        double avg = total/countLine;
        System.out.println(args[0] + " appears " + count + " times.");
        System.out.println("The average score of the reviews containing " + args[0] + " is " + String.format("%.2f", (avg)));
        
    }
}