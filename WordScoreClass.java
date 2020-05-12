public class WordScore{
    String word;
    int score;
    
    public WordScore(String w){
        word = w;
    }
    public int score(String s){
        String [] review;
        review = s.split(" ");
        for(int i=0; i<review.length; i++){
            if(review[i].equals(word)){
                return Integer.parseInt(s.substring(1,2));
            }
        }
        return -1;
    }
    
}