package week07d05;

public class Motorcycle  extends Vehicle {

    public Motorcycle(int numberOfGears, TransmissionType transmissionType) {
        super(numberOfGears, TransmissionType.SEQUENTIAL);
    }

    @Override
    public int getNumberOfGears() {
        return super.getNumberOfGears();
    }

    @Override
    public TransmissionType getTransmissionType() {
        return TransmissionType.SEQUENTIAL;
    }
}
