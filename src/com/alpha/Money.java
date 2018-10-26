package com.alpha;


public class Money {

    private Currency currency;
    private Long amount;

    public Money(Currency currency, Long amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Long getAmount() {
        return amount;
    }

}
