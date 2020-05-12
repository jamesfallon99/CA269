import java.util.Scanner;

public class Hangman
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // First get the word
        int wordSeed = in.nextInt();

        String word = Word.getWord(wordSeed);
        
        System.out.println("The word is");
        String line = "";
        for(int i=0;i<word.length();i++)
        {
            line=line+"_";
        }
        Boolean check= true;
        String guess= "";
            System.out.println(line);
        
        while(check)
            {
            System.out.println("Guess a letter:");
            String newguess = in.next();
            guess=guess+newguess;
            String answer= Word.showLetters(word, guess);
            System.out.println(answer);
            if(answer.equals(word))
                {
                    check= false;
                    System.out.println("Well Done, the word was "+word+".");
                }
                
		    }
		
    }
    
}