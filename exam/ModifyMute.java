import java.util.Set;
import java.util.HashSet;

public class ModifyMute {
    public static void modifyMute(Mute mute){
        Set<String> set = mute.getNames();
        set.add("James");
        //for(String s : set){
           // System.out.println(s);
        //}
    }
}