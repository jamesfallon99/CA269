import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class PhoneNumbers
{
    public static void main(String [] args)
    {
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        System.out.println("Enter a name and number, or a name and ? to query (!! to exit)");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        while(!s.equals("!!")){
            String [] contact = s.split(" ");
            if(contact[1].length() == 1){
                if(phoneBook.get(contact[0]) != null){
                    System.out.println(contact[0] + " has number " + phoneBook.get(contact[0]));
                }else{
                    System.out.println("Sorry, there is no " + contact[0]);
                }
            }else{
                phoneBook.put(contact[0],Integer.parseInt(contact[1]));
            }
            s = in.nextLine();
        }
        System.out.println("Bye");
    }
}