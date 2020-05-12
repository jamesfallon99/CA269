import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GroupStudents
{
   public static void main(String [] args)
   {
       Scanner in = null;
       try{
           in = new Scanner(new File(args[0]));
           int number_of_names = in.nextInt();
           Student [] group = new Student[number_of_names];
           String name = null;
           for(int i=0; i<number_of_names; i++){
                name = in.next();
                int mark = in.nextInt();
                Student s = new Student(name, mark);
                group[i] = s;
           }
           
           Student.print(group);
       }
       catch(FileNotFoundException e){
           System.out.println("The file does not exist");
       }
       finally{
           in.close();
       }

   }
}