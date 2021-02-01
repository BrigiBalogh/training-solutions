package bank2;

import bank.Account;
import bank.ErrorCode;
import bank.InvalidBankOperationException;

import java.util.List;

public class Bank {

    private List<bank.Account> accounts;

    public Bank(List<bank.Account> accounts) {
        if (accounts == null) {
            throw new IllegalArgumentException("List is null");
        }
        this.accounts = accounts;
    }

    public void balanceReduced(String accountNumber, double amount)throws bank.InvalidBankOperationException {
        bank.Account account = accountNumberCheck(accountNumber);
        account.subtract(amount);
    }

    private void balanceIncreases(String accountNumber, double amount) throws bank.InvalidBankOperationException {
        bank.Account account = accountNumberCheck(accountNumber);
        account.deposit(amount);
    }

    private bank.Account accountNumberCheck(String accountNumber) throws bank.InvalidBankOperationException {
        for (Account account : accounts) {
            if (account.equals(account.getAccountNumber())) {
                return account;
            }
        }
        throw new InvalidBankOperationException(ErrorCode.INVALID_ACCOUNTNUMBER);
    }


}


