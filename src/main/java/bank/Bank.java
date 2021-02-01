package bank;

import java.util.List;

public class Bank {

    private List<Account> accounts;

    public Bank(List<Account> accounts) {
        if (accounts == null) {
            throw new IllegalArgumentException("List is null");
        }
        this.accounts = accounts;
    }

    public void balanceReduced(String accountNumber, double amount)throws InvalidBankOperationException {
        Account account = accountNumberCheck(accountNumber);
        account.subtract(amount);
    }

    private void balanceIncreases(String accountNumber, double amount) throws InvalidBankOperationException {
        Account account = accountNumberCheck(accountNumber);
        account.deposit(amount);
    }

    private Account accountNumberCheck(String accountNumber) throws InvalidBankOperationException{
        for (Account account : accounts) {
            if (account.equals(account.getAccountNumber())) {
                return account;
            }
        }
        throw new InvalidBankOperationException(ErrorCode.INVALID_ACCOUNTNUMBER);
    }


}
