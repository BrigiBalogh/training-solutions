package algorithmscount.bankaccounts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    @Test
    public void createBankAccount() {
        BankAccount bankAccount = new BankAccount("Kiss Gergő","2525",100);
        assertEquals("Kiss Gergő",bankAccount.getNameOfOwner());
        assertEquals("2525",bankAccount.getAccountNumber());
        assertEquals(100,bankAccount.getBalance());
    }
}
