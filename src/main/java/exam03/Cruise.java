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
        double price= 0;
        for (Passenger p : passengers) {
            if(p.getName().equals(passenger))
            {
                price = basicPrice * p.getCruiseClass().getValue();
            }
        }
       return price;
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

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }
}
