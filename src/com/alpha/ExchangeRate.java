package com.alpha;

// обменный курс выделен как отдельная сущность, т.к.
// вкл в себя сам курс и тмпы валют друг к другу
public class ExchangeRate {
    private Currency currency1;
    private Currency currency2;
    private Long exchangeRate;

    public ExchangeRate(Currency currency1, Currency currency2, Long exchangeRate) {
        this.currency1 = currency1;
        this.currency2 = currency2;
        this.exchangeRate = exchangeRate;
    }

    public Currency getCurrency1() {
        return currency1;
    }

    public Currency getCurrency2() {
        return currency2;
    }

    public Long getExchangeRate() {
        return exchangeRate;
    }
}
