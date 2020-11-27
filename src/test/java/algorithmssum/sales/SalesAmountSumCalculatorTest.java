package algorithmssum.sales;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesAmountSumCalculatorTest {

    @Test
    public void testSumSalesAmount() {
        SalesAmountSumCalculator test = new SalesAmountSumCalculator();

        List<SalePerson> salePersons = Arrays.asList(
                new SalePerson("Kati",1000),
                new SalePerson("Juli",1200),
                new SalePerson("Sanyi",1100),
                new SalePerson("Pisti",1500),
                new SalePerson("Józsi",1800)

        );

        assertEquals(6600, test.salesAmountSum(salePersons));

    }
}
