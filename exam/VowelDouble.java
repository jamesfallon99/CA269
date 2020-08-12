import java.util.Scanner;

public class VowelDouble {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        System.out.print("Enter a word :");
        String vowelDouble = "";
        String vowels = "aeiou";
        for(int j=0; j<word.length(); j++){
            vowelDouble += word.charAt(j);
            for(int i=0; i<vowels.length(); i++){
                if(word.charAt(j) == vowels.charAt(i)){
                    vowelDouble += word.charAt(j);
                }
        
            }
        }
        System.out.println("VowelDoubled is :" + vowelDouble + ":");

    }
}