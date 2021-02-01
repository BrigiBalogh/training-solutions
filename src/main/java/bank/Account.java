package bank;

public class Account {

    private static final double INITIAL_MAX_SUBTRACT = 100000;

private String AccountNumber;
private double balance;
private double maxSubtract;

    public Account(String accountNumber, double balance, double maxSubtract) {
        if(accountNumber == null) {
            throw new IllegalArgumentException("Invalid account number.");
        }
        AccountNumber = accountNumber;
        this.balance = balance;
        this.maxSubtract = INITIAL_MAX_SUBTRACT;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public void setMaxSubtract(double maxSubtract) {
        if (maxSubtract <= 0) {
            throw new InvalidBankOperationException(ErrorCode.INVALID_AMOUNT);
        }
        this.maxSubtract = maxSubtract;
    }

    public double subtract(double amount)  {
        if (amount <= 0 || amount > this.maxSubtract) {
            throw new InvalidBankOperationException(ErrorCode.INVALID_AMOUNT);
        }
        double newBalance = this.balance - amount;
        if (newBalance < 0) {
            throw new InvalidBankOperationException(ErrorCode.LOW_BALANCE);
        }
        this.balance = newBalance;
        return this.balance;
    }

    public double deposit(double amount) {
        if (amount <= 0) {
            throw new  InvalidBankOperationException(ErrorCode.INVALID_AMOUNT);
        }
        this.balance += amount;
        return this.balance;
    }
}
