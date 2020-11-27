package algorithmscount.bankaccounts;

import java.util.List;

public class BankAccountConditionCounter {

    public int countWithBalanceGreaterthan (List<BankAccount> accounts,int min) {
        int count = 0;
        for (BankAccount account: accounts) {
            if (account.getBalance() >min) {
                count++;
            }
        }
        return count;

    }
}
