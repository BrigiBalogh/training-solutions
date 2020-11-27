package algorithmscount.bankaccounts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountConditionCounterTest {


    @Test
    public void countBankTransactionLessThan() {
        List<BankAccount> bankAccounts = Arrays.asList(
                new BankAccount("Kiss Gergő","2525",100),
                new BankAccount("Kiss Jolán","2424",200),
                new BankAccount("Kiss Győző","2625",300),
                new BankAccount("Kiss Edina","2825",400));

        assertEquals(3 ,new BankAccountConditionCounter().countWithBalanceGreaterthan(bankAccounts,100) );
        assertEquals(0 ,new BankAccountConditionCounter().countWithBalanceGreaterthan(bankAccounts,400) );
    }
}
