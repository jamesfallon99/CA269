import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class WriteStudents
{
   public static void main(String [] args)
   {
       Scanner in = null;
        try{
            in = new Scanner(new File(args[0]));
            int number = in.nextInt();
            Student [] group = new Student[number];
            String name = null;
            PrintWriter out = new PrintWriter(new File(args[1]));
            for(int i=0; i<=number; i++){
                name = in.next();
                int mark = in.nextInt() + 1;
                Student s = new Student(name, mark);
                group[i] = s;
            }
            out.println(number);
            for(int j=0; j<number; j++){
                out.println(group[j]);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("The file does not exist");
        }
        finally{
            in.close();
        }
   }
}