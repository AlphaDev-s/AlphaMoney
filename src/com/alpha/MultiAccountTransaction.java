package com.alpha;

import java.util.ArrayList;
import java.util.List;

//
public class MultiAccountTransaction {

    private List<TransactionManager> transactionList = new ArrayList<>();

    public void addTransaction(TransactionManager transaction1){
        transactionList.add(transaction1);
    }

//    public void executeMultiAccountTransactionAddOperation(){
//        for (int i = 0; i < transactionList.size()-1; i++) {
//             transactionList.get(i).transactionAddMoney(transactionList.get(i).getAccount());
//        }
//    }
//    public void executeMultiAccountTransactionSubtractOperation(){
//        for (int i = 0; i < transactionList.size()-1; i++) {
//            transactionList.get(i).transactionSubtractMoney(transactionList.get(i).getAccount());
//        }
//    }
}
