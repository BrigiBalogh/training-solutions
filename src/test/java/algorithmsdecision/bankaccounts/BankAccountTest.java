package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {


    BankAccount bankAccount = new BankAccount("Kati","123-123-123",1000);

    @Test
    public void testCreateBankAccount() {

        assertEquals("123-123-123",bankAccount.getAccountNumber());
        assertEquals(1000,bankAccount.getBalance());

    }

    @Test
    public void testWithdraw() {
        bankAccount.withdraw(50);
        assertEquals(50,bankAccount.getBalance());
        assertFalse(bankAccount.withdraw(110));
        assertTrue(bankAccount.withdraw(20));
    }

    @Test
    public void testDeposit() {
        bankAccount.deposit(100);
        assertEquals(200,bankAccount.getBalance());
        assertTrue(bankAccount.deposit(20));
    }
}
