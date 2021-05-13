package lambdaintro;

import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class BankAccounts {

    private List<BankAccount> accounts;

    public BankAccounts(List<BankAccount> accounts) {
        this.accounts = accounts;
    }

    public List<BankAccount> listBankAccountsByAccountNumber() {
        List<BankAccount> result = new ArrayList<>(accounts);
        result.sort(Comparator.comparing(BankAccount::getAccountNumber));
      //  result.sort(Comparator.naturalOrder());
        return result;
    }

   /* public List<BankAccount> listBankAccountsByBalance() {
        List<BankAccount> result = new ArrayList<>(accounts);
        result.sort((account1,account2) -> Double.valueOf(Math.abs(account1.getBalance())).compareTo(Math.abs(account2.getBalance())));
        return result;
    }*/

    public List<BankAccount> listBankAccountsByBalance() {
        List<BankAccount> result = new ArrayList<>(accounts);
       result.sort(Comparator.comparing((account) -> Math.abs(account.getBalance())));
        return result;
    }

   /* public List<BankAccount> listBankAccountsByBalanceDesc() {
        List<BankAccount> result = new ArrayList<>(accounts);
        result.sort((account1,account2) -> -Double.valueOf(account1.getBalance()).compareTo(account2.getBalance()));
        return result;
    }*/


    public List<BankAccount> listBankAccountsByBalanceDesc() {
        List<BankAccount> result = new ArrayList<>(accounts);
        result.sort(Comparator.comparing(BankAccount::getBalance).reversed());
        return result;
    }

    public List<BankAccount> listBankAccountsByNameThanAccountNumber() {
        List<BankAccount> result = new ArrayList<>(accounts);
        Collator collator = Collator.getInstance(new Locale("hu","HU"));

       result.sort(Comparator.comparing(BankAccount::getNameOfOwner,Comparator.nullsFirst(collator))
               .thenComparing(BankAccount::getAccountNumber));
        return result;
    }
}
