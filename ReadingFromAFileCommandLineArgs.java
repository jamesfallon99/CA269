import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*To read a file, we will use the following Java classes.
A File object is used to represent a filename. It is constructed with a string, the filename.
We can then use this File object to construct a Scanner to read the name. However, constructing a Scanner
with a File can throw a FileNotFoundException which we have to catch.*/

public class ReadNames{
    public static void main(String [] args){
        if(args.length < 1){
            System.out.println("Usage: java ReadNames <filename>");
        }
        else{
            Scanner in = null;
            try{
                in = new Scanner(new File(args[0]));
                /*args[0] contains the name of the file*/
                
                int number_of_names = in.nextInt();
                String [] names = new String[number_of_names];
                for(int i=0; i<number_of_names; i++)
                    names[i] = in.next();
                
                System.out.println("The names in reverse order are:");
                for(int i=number_of_names-1; i>=0; i--)
                    System.out.print(names[i] + " ");
                    System.out.println();
                
            }
                catch(FileNotFoundException e){
                    System.out.println("The file does not exist");
                }
                finally{
                    in.close();
                }
                
            }
        }
    }