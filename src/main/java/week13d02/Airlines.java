package week13d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Airlines {

    private List<Airways> flights= new ArrayList<>();

    public void readOfFile() {
        InputStreamReader isr =new InputStreamReader(Airlines.class.getResourceAsStream("cities.txt"));
        try(BufferedReader reader = new BufferedReader(isr)) {
            String line;
            while((line = reader.readLine()) != null) {
                // FC5354 Arrival Dublin 18:16
                Airways obj = transform(line);
                flights.add(obj);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file.");
        }
    }

    public FlightDirection whichIsMoreOften() {
        int counterArr = 0;
        int counterDep = 0;
        for (Airways flight : flights ) {
            if (flight.getDirection().equals(FlightDirection.ARRIVAL)){
                counterArr++;
            }else {
                counterDep++;
            }
        }
        /*if (counterArr > counterDep) {
            return FlightDirection.ARRIVAL;
        } else {
            return FlightDirection.DEPARTURE;
        }*/
        return counterArr > counterDep ? FlightDirection.ARRIVAL : FlightDirection.DEPARTURE;
    }

    public Airways flightSearcher(String flightId) {
        for ( Airways s :flights) {
            if(s.getAirlineID().equals(flightId)) {
                return s;
            }
        }
        throw new IllegalArgumentException("Can not find flight.");
    }

    public List<Airways> findByCityAndFlightDirection(String city, FlightDirection direction) {
        List<Airways> result = new ArrayList<>();
        for (Airways a : flights) {
            if (a.getCity().equals(city) && a.getDirection().equals(direction)) {
                result.add(a);
            }
        }
        return result;
    }

    public Airways getFirstDeparture() {
        Airways earliest = null;
        for (Airways s : flights) {
            if (s.getDirection().equals(FlightDirection.DEPARTURE)) {
                if (earliest == null || earliest.getTime().isAfter(s.getTime())) {
                    earliest = s;
                }
            }
        }
        if (earliest == null) {
            throw new IllegalArgumentException("no departure flight");
        } else {
            return earliest;
        }
    }

    private Airways transform(String line) {
        String[] splitLine = line.split(" ");
        String airlineId = splitLine[0];
        FlightDirection direction = FlightDirection.valueOf(splitLine[1].toUpperCase());
        String city = splitLine[2];
        String[] splitTime = splitLine[3].split(":");
        int hour = Integer.parseInt(splitTime[0]);
        int minute = Integer.parseInt(splitTime[1]);
        LocalTime time = LocalTime.of(hour, minute);
        Airways obj = new Airways(airlineId, direction, city, time);
        // új sor:
        return obj;
    }

    public static void main(String[] args) {

    }
}
