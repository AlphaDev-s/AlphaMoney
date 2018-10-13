package com.alpha;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int accountNumber;
    private String accountType;
    private String accountCurrency;

    //список всех аккаунтов
    private List<Account> accountList = new ArrayList<>();

    public Account(int accountNumber, String accountType, String accountCurrency) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountCurrency = accountCurrency;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void addAccount(Account account) {
        accountList.add(account);
    }
}
