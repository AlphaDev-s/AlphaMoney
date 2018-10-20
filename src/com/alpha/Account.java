package com.alpha;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int accountNumber;
    // TODO: accountOpeningDate;
    // TODO: accountClosingDate;
    private double accountOwnerUID;  // основной владелец
    private double accountAdditionalUserUID;  // дополнительный пользователь
    private int accountCurrencyID;  // валюта счета
    private String accInitialBalance;  // начальный остаток
    private String accClosingBalance;  // остаток при закрытия счета
    private String accountStatus;  // статус счета
    private String accountType;

    //для возможности проведния операций добавляем сюда класс Money
    private Money money;

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    public Account(int accountNumber, double accountOwnerUID, Money money) {
        this.accountNumber = accountNumber;
        this.accountOwnerUID = accountOwnerUID;
        this.money = money;
    }


    public Account(int accountNumber, double accountOwnerUID) {
        this.accountNumber = accountNumber;
        this.accountOwnerUID = accountOwnerUID;
    }


    public double getAccountAdditionalUserUID() {
        return accountAdditionalUserUID;
    }

    public void setAccountAdditionalUserUID(double accountAdditionalUserUID) {
        this.accountAdditionalUserUID = accountAdditionalUserUID;
    }

    public int getAccountCurrencyID() {
        return accountCurrencyID;
    }

    public void setAccountCurrencyID(int accountCurrencyID) {
        this.accountCurrencyID = accountCurrencyID;
    }

    public String getAccInitialBalance() {
        return accInitialBalance;
    }

    public void setAccInitialBalance(String accInitialBalance) {
        this.accInitialBalance = accInitialBalance;
    }

    public String getAccClosingBalance() {
        return accClosingBalance;
    }

    public void setAccClosingBalance(String accClosingBalance) {
        this.accClosingBalance = accClosingBalance;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

}
