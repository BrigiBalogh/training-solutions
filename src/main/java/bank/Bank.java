package bank;

import java.util.List;

public class Bank {

    private List<String> accounts;

    public Bank(List<String> accounts) {
        if (accounts == null) {
            throw new IllegalArgumentException("List is null");
        }
        this.accounts = accounts;
    }


}
