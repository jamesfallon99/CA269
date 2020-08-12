public class MakeAPalindrome {
    public static String palindrome(String word){
        String pal = "";
        for(int i = word.length()-1; i>=0; i--){
            pal = pal + word.charAt(i);
        }
        return word + pal;
    }
}