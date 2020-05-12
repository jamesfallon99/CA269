public class Word
{
    public static Boolean allDone(String word, String seq)
    {
        int count = 0;
        for(int i = 0; i<word.length(); i++)
        {
            for(int j=0; j<seq.length(); j++)
            {
                if(word.charAt(i) == seq.charAt(j))
                {
                    count++;
                }
            }
        }
        return count == word.length();
    }
}