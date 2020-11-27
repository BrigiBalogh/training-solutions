package algorithmssum.sales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalePersonTest {


    @Test
    public void testCreateSalePerson() {
        SalePerson salePerson = new SalePerson("Kiss Virág",3000);
        assertEquals("Kiss Virág ",salePerson.getName());
        assertEquals(3000,salePerson.getAmount());
    }
}
