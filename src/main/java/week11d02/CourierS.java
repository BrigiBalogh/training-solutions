package week11d02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CourierS {

    public static final String SEPARATOR = " ";

    private List<Ride> rides = new ArrayList<>();


    public void fileRider(String file) {
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine() )!= null) {
                String[] linePart = line.split(SEPARATOR);
                rides.add(new Ride(Integer.parseInt(linePart[0]),
                                   Integer.parseInt(linePart[1]),
                                   Integer.parseInt(linePart[2])));
            }

        }catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file !", ioe);
        }
    }

    public Ride getFirstRideOfWeek() {

        Ride firstRide = rides.get(0);
        for (Ride ride : rides) {
            if (ride.getDayOfWeek() <= firstRide.getDayOfWeek()  )  {
                if (ride.getCountOfRide() == 1) {
                    firstRide = ride;
                }
            }
        }
        return firstRide;
    }

    public List<Integer> getFreeDays() {

        List<Integer> freeDays = new ArrayList<>();

        for (Ride ride : rides) {
            if (ride.getDayOfWeek() == 0) {
                freeDays.add(ride.getDayOfWeek());
            }
        }
        return freeDays;
    }

    public int[] getSumDistanceOfDay() {
        int[] week = new int[7];
        for (Ride ride : rides) {
             week[ride.getDayOfWeek() - 1] += ride.getDistance();
        }
        return week;
    }

}
