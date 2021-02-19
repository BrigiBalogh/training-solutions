package exam03;

import java.time.LocalDate;
import java.util.*;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public void bookPassenger(Passenger passenger) {
        /*int sum = 0;
        for (Passenger p : passengers) {
            sum ++;
        }*/
        if (passengers.size() < boat.getMaxPassengers()) {
            passengers.add(passenger);
        }


    }

    public double getPriceForPassenger(Passenger passenger) {
        return basicPrice * passenger.getCruiseClass().getValue();
        /*double price= 0;
        for (Passenger p : passengers) {
            if(p.getName().equals(passenger))
            {
                price = basicPrice * p.getCruiseClass().getValue();
            }
        }
       return price;*/
    }

    public Passenger findPassengerByName(String name) {
        for (Passenger p : passengers) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }


    public List<String> getPassengerNamesOrdered()
    {
      List<String> ret = new ArrayList<>();
      for (Passenger p : passengers) {
          ret.add(p.getName());
      }
        Collections.sort(ret);
      return ret;
    }
    public List<String> getPassengerNamesOrdered2() {
        List<Passenger> ret = new ArrayList<>(passengers);
        Collections.sort(ret);

        List<String> names = new ArrayList<>();
        for (Passenger p : ret) {
            names.add(p.getName());
        }
        return names;
    }
    public List<String> getPassengerNamesOrdered3 () {
        Comparator<Passenger> cmp = new Comparator<Passenger>() {
            @Override
            public int compare(Passenger o1, Passenger o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        List<Passenger> ret = new ArrayList<>(passengers);
        Collections.sort(ret, cmp);

        List<String> names = new ArrayList<>();
        for (Passenger p : ret) {
            names.add(p.getName());
        }
        return names;
    }

    public double sumAllBookingsCharged2() {
        Map<CruiseClass, Integer> countMap = countPassengerByClass();
        double luxuryIncome = countMap.get(CruiseClass.LUXURY) * basicPrice * CruiseClass.LUXURY.getValue();
        double firstIncome = countMap.get(CruiseClass.FIRST) * basicPrice * CruiseClass.FIRST.getValue();
        double secondIncome = countMap.get(CruiseClass.SECOND) * basicPrice * CruiseClass.SECOND.getValue();
        return luxuryIncome + firstIncome + secondIncome;
    }

    public double sumAllBookingsCharged3() {
        Map<CruiseClass, Integer> countMap = countPassengerByClass();
        double sumOfIncome = 0;
        for (CruiseClass cruiseClass : CruiseClass.values()) {
            double income = countMap.get(cruiseClass) * basicPrice * cruiseClass.getValue();
            sumOfIncome += income;
        }
        return sumOfIncome;
    }

    public double sumAllBookingsCharged()
    {

      double sum = 0;
      for (Passenger p : passengers) {
          //double ticketPrice = p.getCruiseClass().getValue() * basicPrice;
          double ticketPrice = getPriceForPassenger(p);
          sum += ticketPrice;
      }
      return sum;
    }
    public Map<CruiseClass, Integer> countPassengerByClass()
    {

        Map<CruiseClass, Integer> counts = new HashMap<>();
        for (Passenger p : passengers) {
            CruiseClass c = p.getCruiseClass();
            if (counts.containsKey(c)) {
                int cnt = counts.get(c);
                cnt++;
                counts.put(c, cnt);
            } else {
                counts.put(c, 1);
            }
        }
        return counts;
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
