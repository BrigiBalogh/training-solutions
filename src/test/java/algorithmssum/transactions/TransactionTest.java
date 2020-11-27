package algorithmssum.transactions;

import static org.junit.jupiter.api.Assertions.*;

public class TransactionTest {

    public void testCreateTransaction() {
        Transaction transaction = new Transaction("2530-1120-3344",TransactionOperation.CREDIT,1000);

        assertEquals(1000,transaction.getAmount());
        assertTrue(transaction.isCredit());
        assertFalse(transaction.isDebit());
    }
}
