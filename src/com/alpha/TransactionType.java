package com.alpha;

public enum TransactionType {
    transactionAddMoney(001),
    transactionSubtractMoney(002),
    transactionExchange(003);

    TransactionType (int code){this.code = code;}

    public int getCode() {
        return code;
    }

    private int code;

}
