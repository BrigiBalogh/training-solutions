package week10d01;

import java.util.List;

public class Hiking {

    public double getPlusElevation(List<Double> heights){

        if (heights == null){
                throw new IllegalArgumentException(" The date is null.");
        }
        double sum =0;
        for (int i= 1; i < heights.size(); i++){
            double h = heights.get(i);
            double hi = heights.get(i - 1);

            if (h > hi )  {
                sum += h -hi;
            }
        }
        return sum;
    }
}
