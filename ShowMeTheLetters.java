// Create a Word class with one static method called showLetter
public class Word
{
    public static String showLetters(String word, String guess)
    {
        String hangman="";
        boolean check = false;
        for(int i=0; i<word.length(); i++)
        {
            if(containsLetter(guess, word.charAt(i)))
                {
                    hangman += word.substring(i, i+1);
                }
            else {
                hangman += "_";
                }
        }
        return hangman;
    }


/*Using method from previous question*/
public static Boolean containsLetter(String words, char s)
    {
        boolean check = false;
        for(int i=0; i<(words.length()); i++)
        {
            if(words.charAt(i) == s)
            {
                check = true;
            }
        }
        return check;
    }
}