import java.util.Map;
import java.util.HashMap;

public class MakeMapExam {
    public static Map countLetters(String word){
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int count = 0;
        for(int i=0; i<word.length(); i++){
            map.putIfAbsent(word.charAt(i), count);
            map.put(word.charAt(i), map.get(word.charAt(i))+ 1);
        }
        return map;
    }
}