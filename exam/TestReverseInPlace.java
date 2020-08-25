
public class TestReverseInPlace {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,6};
        ReverseInPlace.reverse(num);
        for(int n : num){
            System.out.print(n + " ");
        }
    }
}