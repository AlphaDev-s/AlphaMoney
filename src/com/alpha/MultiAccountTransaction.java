package com.alpha;

import java.util.ArrayList;
import java.util.List;

//
public class MultiAccountTransaction {
    private Transaction transaction;
    private List<Transaction> transactionList = new ArrayList<>();

    public MultiAccountTransaction(Transaction transaction) {
        this.transaction = transaction;
        transactionList.add(transaction);
    }



    public void addTransaction(Transaction transaction1){
        transactionList.add(transaction1);
    }

    public void executeMultiAccountTransactionAddOperation(){
        for (int i = 0; i < transactionList.size()-1; i++) {
             transactionList.get(i).transactionAddMoney(transactionList.get(i).getAccount());
        }
    }
    public void executeMultiAccountTransactionSubtractOperation(){
        for (int i = 0; i < transactionList.size()-1; i++) {
            transactionList.get(i).transactionSubtractMoney(transactionList.get(i).getAccount());
        }
    }
}
