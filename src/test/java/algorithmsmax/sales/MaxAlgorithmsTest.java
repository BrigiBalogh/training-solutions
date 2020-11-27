package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxAlgorithmsTest {

    List<Salesperson> salespersons = Arrays.asList(
            new Salesperson("Ildi",600, 500),
            new Salesperson("Józsi",200, 300),
            new Salesperson("Andris",700, 100),
            new Salesperson("Jancsi",700, 300),
            new Salesperson("Sanyi",200, 50)
    );

    @Test
    public void testSelectSalesPersonWithMaxSalesAmount() {
        SalesAmountMaxSelector maxAmount = new SalesAmountMaxSelector();

        assertEquals(700, maxAmount.selectSalesPersonWithMaxSalesAmount(salespersons).getAmount());
        assertEquals(100, maxAmount.selectSalesPersonWithMaxSalesAmount(salespersons).getTarget());
    }

    @Test
    public void testSelectSalesPersonWithFurthestAboveTarget() {
        SalespersonWithFurthesAboveTargetSelector aboveTarget = new SalespersonWithFurthesAboveTargetSelector();

        assertEquals(600,aboveTarget.selectSalesPersonWithFurthestAboveTarget(salespersons).getDifferenceFromTarget());
        assertEquals(700,aboveTarget.selectSalesPersonWithFurthestAboveTarget(salespersons).getAmount());
        assertEquals(100,aboveTarget.selectSalesPersonWithFurthestAboveTarget(salespersons).getTarget());
    }

    @Test
    public void testSelectSalesPersonWithFurthestBelowTarget()  {
        SalespersonWithFurthestBelowTargetSelector belowTarget = new SalespersonWithFurthestBelowTargetSelector();

        assertEquals(-100,belowTarget.selectSalespersonWithFurthestBelowTarget(salespersons).getDifferenceFromTarget());
        assertEquals(200,belowTarget.selectSalespersonWithFurthestBelowTarget(salespersons).getAmount());
        assertEquals(300,belowTarget.selectSalespersonWithFurthestBelowTarget(salespersons).getTarget());
    }
}
