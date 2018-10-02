package com.alpha;

import java.util.ArrayList;
import java.util.List;

public class Money {
    private String currencyName;
    private double amount;

    //тут список всех возможных валют
    private List<Money> currencys = new ArrayList<>();

    public Money(String currencyName, double amount) {
        this.currencyName = currencyName;
        this.amount = amount;
    }

    public List<Money> getCurrencys() {
        return currencys;
    }

    public void addCurrency(Money currencyName) {
        currencys.add(currencyName);
    }
}
