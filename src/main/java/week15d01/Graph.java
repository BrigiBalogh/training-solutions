package week15d01;

import java.util.Map;

public class Graph {

    public Map.Entry<Double,Double>maxValueEntry(Map<Double,Double> graphOfFunction){
        if (graphOfFunction == null) {
            throw new IllegalArgumentException("Wrong param !");
        }

        Map.Entry<Double,Double> result = null;
        for (Map.Entry<Double,Double> entry : graphOfFunction.entrySet()) {
            if (result == null || result.getValue() < entry.getValue()) {
                result = entry;
            }
        }
        return result;
    }
}
