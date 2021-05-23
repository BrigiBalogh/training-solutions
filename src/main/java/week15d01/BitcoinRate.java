package week15d01;

import java.util.List;

public class BitcoinRate {
    private List<Integer> rates;

    public BitcoinRate(List<Integer> rates) {
        this.rates = rates;
    }

    public BestRate statisticOfRates(List<Integer> rates) {

        BestRate br = new BestRate(0, 0, Integer.MIN_VALUE);
        int actualMin = Integer.MAX_VALUE;

        for (int i = 0; i < rates.size()-1;) {
            if (rates.get(i) < actualMin) {
                actualMin = rates.get(i);
                compereToOthers(i, br);
            }
        }
        return br;
    }

    private int compereToOthers(int i, BestRate br) {
        for (int j = i + 1; j < rates.size(); i++) {
            checkDifference(i, j, br);
        }
        return br.getDifference();
    }

    private void checkDifference (int i, int j, BestRate br) {
        int actualDiff = rates.get(j) - rates.get(i);
        if (actualDiff > br.getDifference()) {
            br.setNewValues(i+1, j+1, actualDiff);
        }
    }


}
