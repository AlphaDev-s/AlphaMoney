package com.alpha;

public class Transaction {
    private Account fromAccount;
    private Account toAccount;
    private TransactionType transactionType;
    private Money moneyAmount;
    private ExchangeRate exchangeRate;


    public Transaction(Account fromAccount, Account toAccount, TransactionType transactionType, Money amount, ExchangeRate exchangeRate) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.transactionType = transactionType;
        this.moneyAmount = amount;
        this.exchangeRate = exchangeRate;
    }

    public Transaction(Account fromAccount, Account toAccount, TransactionType transactionType, Money moneyAmount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.transactionType = transactionType;
        this.moneyAmount = moneyAmount;
        this.exchangeRate = null;
    }

    public Account getFromAccount() {
        return fromAccount;
    }

    public Account getToAccount() {
        return toAccount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public Money getMoneyAmount() {
        return moneyAmount;
    }


}
