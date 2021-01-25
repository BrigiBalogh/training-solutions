package week11d02;

public class Ride {

    private int dayOfWeek;
    private int countOfRide;
    private int distance;


    public Ride(int dayOfWeek, int countOfRide, int distance) {
        if (dayOfWeek < 1 || dayOfWeek > 7) {
            throw new IllegalArgumentException("The number is invalid !");
        }
        this.dayOfWeek = dayOfWeek;
        if (countOfRide == 0){
            throw new IllegalArgumentException(" Ride = 0");
        }
        this.countOfRide = countOfRide;
        if (distance == 0) {
            throw new NullPointerException("The number is invalid !");
        }

        this.distance = distance;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public int getCountOfRide() {
        return countOfRide;
    }

    public int getDistance() {
        return distance;
    }
}
