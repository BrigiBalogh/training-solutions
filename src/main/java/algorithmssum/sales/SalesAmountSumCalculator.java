package algorithmssum.sales;

import java.util.List;

public class SalesAmountSumCalculator {

    public int salesAmountSum (List<SalePerson>sales)  {
        int sum = 0;
        for (SalePerson salePerson : sales) {
            sum += salePerson.getAmount();
        }
        return sum;
    }
}
