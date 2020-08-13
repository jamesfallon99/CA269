public class Rotate {
    public static String rotateString(String word){
        String newString = "";
        char lastLetter = word.charAt(word.length() -1);
        newString += lastLetter;
        for(int i=0; i<word.length()-1; i++){
            newString += word.charAt(i);
        }
        return newString;
    }
}