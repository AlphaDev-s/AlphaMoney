package com.alpha;


public class Money {

    private Currency currency;
    private String amount;

    public Money(Currency currency, String amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getAmount() {
        return amount;
    }
}
