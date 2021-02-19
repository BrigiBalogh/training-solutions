package exam03;

public class Passenger implements Comparable<Passenger>{

    private String name;
    CruiseClass cruiseClass;

    public Passenger(String name, CruiseClass cruiseClass) {
        this.name = name;
        this.cruiseClass = cruiseClass;
    }

    public String getName() {
        return name;
    }

    public CruiseClass getCruiseClass() {
        return cruiseClass;
    }

    @Override
    public int compareTo(Passenger o) {
        return this.name.compareTo(o.name);
    }
}
