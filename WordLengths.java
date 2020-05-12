import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class WordLength
{
    public static void main(String [] args)
    {
        Map<Integer, Integer> ourMap = new HashMap<Integer, Integer>();
        
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine())
        {
            String sentence = in.nextLine();
            
            if (sentence.length() > 0)
            {
                String[] tokens = sentence.split("\\s+");
                for(int i = 0;i < tokens.length; i++)
                {   
                    int key = tokens[i].length();
                    ourMap.putIfAbsent(key, 0);
                    ourMap.put(key, ourMap.get(key) + 1);
                }
            }
        }
        for (int length: ourMap.keySet())
            {
                String key = Integer.toString(length);
                String value = ourMap.get(length).toString();
                System.out.println(key + ": " + value);
            }
    }
}