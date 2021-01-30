package week13d02;

import java.time.LocalTime;

public class Airways {

    private int airlineId;
    private FlightDirection direction;
    private String city;
    private LocalTime time;


    public Airways(int airlineId, FlightDirection direction, String city, LocalTime time) {
        this.airlineId = airlineId;
        this.direction = direction;
        this.city = city;
        this.time = time;
    }

    public int getAirlineID() {
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
