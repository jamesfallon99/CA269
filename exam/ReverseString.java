public class ReverseString {
    public static boolean reverseString(String s1, String s2){
        int j=s2.length()-1;
        boolean trueOrFalse = false;
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(j)){
                trueOrFalse = false;
                break;
            }
            j--;
            trueOrFalse = true;
        }
        return trueOrFalse;
    }
}