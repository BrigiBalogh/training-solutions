package methodparam.measuring;

public class Measurement {

    private double[] values;

    public Measurement(double[] values) {
        this.values = values;
    }

    public int findFirstIndexInLimit(int lower, int upper) {
        for (int i = 0; i < values.length; i++) {
            if (lower < values[i] && upper > values[i]) {
                return i;
            }
        }
        return -1;
    }

    public double minimum() {
        double min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values [i] < min) {
                min = values[i];
            }
        }
        return min;
    }

    public double maximum() {
        double max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

    ExtremValues minmax() {
        return new ExtremValues(minimum(),maximum());

    }
}
