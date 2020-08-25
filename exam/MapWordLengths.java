import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class MapWordLengths {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String word = in.next();
            map.putIfAbsent(word.length(), 0);
            map.put(word.length(), map.get(word.length())+ 1);
        }
        for(int length : map.keySet()){
            System.out.println(length + ": " + map.get(length));
        }
    }
}