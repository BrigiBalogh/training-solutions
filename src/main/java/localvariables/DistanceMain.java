package localvariables;

public class DistanceMain {

    public static void main(String[] args) {
        Distance distance = new Distance(3.14, false);
        System.out.println(distance.getDistancelnKm() + "" + distance.isExact());
        int integerPart = (int) distance.getDistancelnKm();
        System.out.println(integerPart);
    }
}
