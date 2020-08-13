public class CheckIfRotated {
    public static boolean isRotated(String s1, String s2){
        if(s1.charAt(0) == s2.charAt(s2.length()-1)){
            int j=0;
            for(int i=0; i< s2.length()-1; i++){
                j++;
                if(s1.charAt(j) != s2.charAt(i)){
                    
                    return false;
                }
            }
        }
        return true;
    }
}