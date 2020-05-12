import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Senti3
{
    public static String score(String file, String word) throws FileNotFoundException{
        double total = 0;
        int countLine = 0;
        Scanner in = new Scanner(new File(file));
        while(in.hasNextLine()){
            String [] review;
            String line = in.nextLine();
            review = line.split(" ");
            int score = Integer.parseInt(review[0]);
            if(containWord(review, word)){
                countLine ++;
                total = total + score;
            }
        }
        double avg = total/countLine;
        return String.format("%.2f",(avg));
    }
    
    public static boolean containWord(String [] lis, String word){
        for(int i = 0; i < lis.length; i++){
            if(lis[i].equals(word)){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String [] args) throws FileNotFoundException
    {
        Scanner in = new Scanner(new File(args[0]));
        while(in.hasNext()){
            String word = in.next();
            String score = score(args[1], word);
            System.out.println("The score of " + word + " is " + score + ".");
        }
    }
}