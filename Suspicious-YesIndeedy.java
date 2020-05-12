import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Suspicious
{
    public static void main(String [] args){
        try{
        Scanner in = new Scanner(new File(args[0]));
        Set<String> setNames = new HashSet<String>();
        while(in.hasNextLine()){
            String student = in.nextLine();
            setNames.add(student);
        }
        Scanner in2 = new Scanner(new File(args[1]));
        int i = 1;
        while(in2.hasNextLine()){
            String delinq = in2.nextLine();
            if(setNames.contains(delinq)){
                System.out.println(i + ". " + delinq);
                i++;
            }
        }
        }
        catch(Exception e){
            
        }
    }
}