package week07d05;

public class Car  extends Vehicle{


    public Car(int numberOfGears, TransmissionType transmissionType) {
        super(numberOfGears, transmissionType);
    }

    @Override
    public int getNumberOfGears() {
        return super.getNumberOfGears();
    }

    @Override
    public TransmissionType getTransmissionType() {
        return TransmissionType.AUTOMATIC;
    }
}
