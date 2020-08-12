import java.util.Set;
import java.util.HashSet;

public class HowManyLetters {
    public static int howManyCorrect(String word, String guesses){
        Set<Character> set = new HashSet<Character>();
        String uniqueGuess = "";
        int count = 0;
        for(int x=0; x < guesses.length(); x++){
            set.add(guesses.charAt(x));
        }
        for(char c : set){
            uniqueGuess += c;
        }

        for(int i=0; i<word.length(); i++){
            for(int j=0; j< uniqueGuess.length(); j++){
                if(word.charAt(i) == uniqueGuess.charAt(j)){
                    count += 1;
                }
            }
        }
        return count;
    }
}