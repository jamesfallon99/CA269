public class ReverseInPlace {
    public static int [] reverse(int [] num){
        int j = num.length-1;
        for(int i=0; i<num.length/2; i++){
            int tmp = num[i];
            num[i] = num[j];
            num[j] = tmp;

            j--;
        }
        return num;
    }
}