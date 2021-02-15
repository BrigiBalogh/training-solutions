package exam03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    List<Passenger> passengers;

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public void bookPassenger(Passenger passenger) {
        int sum = 0;
        for (Passenger p : passengers) {
            sum ++;
        }
        if (sum < boat.getMaxPassengers())
        {
            passengers.add(passenger);
        }


    }

    public  double getPriceForPassenger(Passenger passenger) {

    }

    public  Passenger findPassengerByName(String name )
    {

    }
    public List<String> getPassengerNamesOrdered()
    {

    }
    public double sumAllBookingsCharged()
    {

    }
    public Map<CruiseClass, Integer> countPassengerByClass()
    {

    }
}
