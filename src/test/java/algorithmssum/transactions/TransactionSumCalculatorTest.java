package algorithmssum.transactions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionSumCalculatorTest {

    @Test
    public void TestSumAmountOfCreditEntries() {
        TransactionSumCalculator calculator = new TransactionSumCalculator();

        List<Transaction> transactions = Arrays.asList(
                new Transaction("2530-1120-3344", TransactionOperation.CREDIT,1000),
                new Transaction("2530-1120-3344", TransactionOperation.DEBIT,50),
                new Transaction("2530-1120-3344", TransactionOperation.CREDIT,0),
                new Transaction("2530-1120-3344", TransactionOperation.CREDIT,1),
                new Transaction("2530-1120-3344", TransactionOperation.CREDIT,-20),
                new Transaction("2530-1120-3344", TransactionOperation.DEBIT,1000)
        );

        assertEquals(981,calculator.sumAmountOfCreditEntries(transactions));
    }
}
