public class Word
{
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