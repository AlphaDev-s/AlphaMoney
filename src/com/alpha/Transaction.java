package com.alpha;

public class Transaction {
    private Account account;
    private MoneyOperations moneyOperations = new MoneyOperations();

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    //добавить деньги на счет
    public void transactionAddMoney(Account account1){
        if (this.account.getMoney().getCurrency()==account1.getMoney().getCurrency()) {
            moneyOperations.summ(this.account.getMoney().getAmount(), account1.getMoney().getAmount());
        }
    }
    //снять деньги со счета
    public void transactionSubtractMoney(Account account1){
        if (this.account.getMoney().getCurrency()==account1.getMoney().getCurrency()) {
            moneyOperations.subtract(this.account.getMoney().getAmount(), account1.getMoney().getAmount());
        }
    }


}
