package transaction;

public class BankAccount {

    private String name;
    private String AccountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        AccountNumber = accountNumber;
        this.balance = balance;
    }


    public void setBalance(double balance) {
        this.balance += balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
