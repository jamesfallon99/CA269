import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class MakeMap
{
    public static Map<String, Integer> makeMap(Scanner in)
    {
        Map<String, Integer> ourMap = new HashMap<String, Integer>();
        
        while(in.hasNext())
        {
            String studentName = in.next();
            int mark = in.nextInt();
            
            // use the built in 'put' method for hashmap
            ourMap.put(studentName, mark);
        }
        return ourMap;
    }   
}