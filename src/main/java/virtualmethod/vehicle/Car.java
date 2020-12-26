package virtualmethod.vehicle;

public class Car extends Vehicle {

    protected int numberPassenger;

    public Car(int vehicleWeight, int numberPassenger) {
        super(vehicleWeight);
        this.numberPassenger = numberPassenger;
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + numberPassenger * PERSON_AVERAGE_WEIGHT;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberPassenger=" + numberPassenger +
                ", vehicleweight=" + getVehicleWeight() +
                '}';
    }
}
