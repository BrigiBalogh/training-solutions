package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankAccountDecisionMakerTest {

    List<BankAccount>accounts = Arrays.asList(
            new BankAccount("Kati","123-123-123",1000),
            new BankAccount("Juli","124-124-124",2000),
            new BankAccount("Sanyi","125-125-125",3000)
    );

    @Test
    public void testContainsBalanceGreaterThan() {

        BankAccountDecisionMaker test =new BankAccountDecisionMaker();

        assertTrue(test.containsBalanceGreaterThan(accounts,150));
        assertFalse(test.containsBalanceGreaterThan(accounts,250));
    }
}
