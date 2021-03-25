package week11d02;

import java.util.ArrayList;
import java.util.List;

public class Courier {

    private List<Ride> rides = new ArrayList<>();




    public void addRide(Ride ride) {

        if (rides.isEmpty() && ride.getCountOfRide() == 1) {
            rides.add(ride);
        } else {
            int newDayOfWeek = ride.getDayOfWeek();
            int newCountOfRide = ride.getCountOfRide();
            Ride prevRide = rides.get(rides.size()-1);
            int prevDayOfWeek = prevRide.getDayOfWeek();
            int prevCountOfRide = prevRide.getCountOfRide();
            if (prevDayOfWeek < newDayOfWeek || prevDayOfWeek == newDayOfWeek && prevCountOfRide < newCountOfRide) {
             rides.add(ride);
            } else {
             throw new IllegalArgumentException("Ride is earlier.");
            }
        }

    }
}
