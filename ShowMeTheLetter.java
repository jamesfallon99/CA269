public class Word
{
    public static String showLetter(String word, char guess)
    {
        String hangman = "";
        for(int i=0; i<word.length(); i++)
        {
            if(word.charAt(i) == guess)
            {
                hangman+=guess;
            }
            else
            {
                hangman+="_";
            }
        }
        return hangman;
   