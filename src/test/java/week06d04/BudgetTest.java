package week06d04;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BudgetTest {

    private Budget budget = new Budget(Arrays.asList(
            new Item("szegfű",500,11),
            new Item("rózsa",1000,10),
            new Item("tulipán",700,1),
            new Item("liliom",1500,12)
    ));

    @Test
    public void getItemsByMonthTest()
    {
        List<Item> m = budget.getItemsByMonth(10);

        assertEquals(2,m.size());
        assertEquals("rózsa",m.get(1).getName());

    }




}
