import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Senti1
{
    public static void main(String [] args) throws FileNotFoundException
    {
        
        int total = 0;
        Scanner in = new Scanner(new File(args[1]));
        while(in.hasNext()){
            String word = in.next();
            if(word.contains(args[0])){
                total ++;
            }
        }
        System.out.println(args[0] + " appears " + total + " times.");
    }
}