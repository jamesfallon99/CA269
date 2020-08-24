public class ReverseArray {
    public static boolean reverse(int [] array1, int [] array2){
        boolean check = false;
        int j = array2.length -1;
        for(int i=0; i<array1.length; i++){
            if(array1[i] != array2[j]){
                check = false;
                break;
            }
            j--;
            check = true;
        }
        return check;
    }
}