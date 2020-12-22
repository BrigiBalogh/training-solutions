package interfacestaticmethods;

import java.util.List;

public interface Valued {

    static double sum(List<Valued> items) {
        double result = 0;
        for (Valued value : items) {
            result += value.getValue();
        }
        return result;
    }

    double getValue();
}
