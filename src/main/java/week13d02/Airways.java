package week13d02;

import java.time.LocalTime;

public class Airways {

    private String airlineId;
    private FlightDirection direction;
    private String city;
    private LocalTime time;


    public Airways(String airlineId, FlightDirection direction, String city, LocalTime time) {
        this.airlineId = airlineId;
        this.direction = direction;
        this.city = city;
        this.time = time;
    }

    public String getAirlineID() {
        return airlineId;
    }

    public FlightDirection getDirection() {
        return direction;
    }

    public String getCity() {
        return city;
    }

    public LocalTime getTime() {
        return time;
    }
}
