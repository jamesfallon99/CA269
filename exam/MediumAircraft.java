import java.util.List;
import java.util.ArrayList;

public class Test {
    public static List medium(List<AirCraft> aircrafts){
        List<AirCraft> mediumAircrafts = new ArrayList<AirCraft>();
        for(AirCraft a : aircrafts){
            if(a.getNumSeats() >= 20 && a.getNumSeats() <=100){
                mediumAircrafts.add(a);
            }
        }
        return mediumAircrafts;
    }
}