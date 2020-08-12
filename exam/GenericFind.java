public class Find {
    public static <T> int find(T [] array, T item){
        for(int i=0; i<array.length; i++){
            if(array[i].equals(item)){
                return i;
            }
        }
        return -1;
    }
}