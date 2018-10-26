package com.alpha;

public class TransactionManager {
    //private Transaction transaction;

    private Account account;
    private MoneyOperations moneyOperations = new MoneyOperations();

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    // Как только пришел запрос Transaction, сразу начинаем с того, что узнаем тип операции
    public void startTransaction(Transaction transaction){
        if (transaction.getTransactionType()==TransactionType.transactionAddMoney) transactionAddMoney(transaction);
        // обязательно с else, чтобы не прошло более одной операции
        else if (transaction.getTransactionType()==TransactionType.transactionSubtractMoney) transactionSubtractMoney(transaction);
    }

    //добавить деньги на счет
    public void transactionAddMoney(Transaction transaction){

        // Проверим, совпадают ли валюты операции
        if (transaction.getFromAccount().getMoney().getCurrency()==transaction.getToAccount().getMoney().getCurrency()) {
            // Проверим, хватает ли денег на счете отправки
            if (transaction.getFromAccount().getMoney().getAmount() >= transaction.getMoneyAmount().getAmount()) {
                // если все ок, переходим к процедуре перечисления денег
                // пробуем
                try {
                    // Провели сферическую операцию в вакууме
                    long g = moneyOperations.summ(transaction.getToAccount().getMoney().getAmount(), transaction.getFromAccount().getMoney().getAmount());
                    // заменили деньги на новые (с учетом операции) на счете получателя
                    transaction.getToAccount().setMoney(new Money(transaction.getToAccount().getMoney().getCurrency(), g));
                    // Провели сферическую операцию в вакууме
                    long y = moneyOperations.subtract(transaction.getFromAccount().getMoney().getAmount(), transaction.getMoneyAmount().getAmount());
                    // убрали денег со счета отправителя
                    transaction.getFromAccount().setMoney(new Money(transaction.getFromAccount().getMoney().getCurrency(), y));
                    // тут операцию мы завершаем, но
                }
                // если что-то пошло не так
                catch (Exception e){
                    System.out.println("Что-то пошло не так");
                    e.printStackTrace();
                }
            }
        }
    }
    // отправка денег на другой счет
    // тут у меня вопрос:
    // Мы отправили деньги туда, куда доступа у нас нет, типа api другого "банка"
    // Нужно типа создать промежуточный объект, который возвращает true/false, что деньги дошли?
    // или что ?
    // тут пока заглушка (типа другой счет мы тоже контролируем)

    public void transactionSubtractMoney(Transaction transaction){
        // Проверим, совпадают ли валюты операции
        if (transaction.getFromAccount().getMoney().getCurrency()==transaction.getToAccount().getMoney().getCurrency()) {
            // Проверим, хватает ли денег на счете отправки
            if (transaction.getFromAccount().getMoney().getAmount() >= transaction.getMoneyAmount().getAmount()) {
                // если все ок, переходим к процедуре перечисления денег
                // пробуем
                try {
                    // Провели сферическую операцию в вакууме
                    long y = moneyOperations.subtract(transaction.getFromAccount().getMoney().getAmount(), transaction.getMoneyAmount().getAmount());
                    // убрали денег со счета отправителя
                    transaction.getFromAccount().setMoney(new Money(transaction.getFromAccount().getMoney().getCurrency(), y));
                    // Провели сферическую операцию в вакууме
                    long g = moneyOperations.summ(transaction.getToAccount().getMoney().getAmount(), transaction.getFromAccount().getMoney().getAmount());
                    // заменили деньги на новые (с учетом операции) на счете получателя
                    transaction.getToAccount().setMoney(new Money(transaction.getToAccount().getMoney().getCurrency(), g));

                    // тут операцию мы завершаем, но
                }
                // если что-то пошло не так
                catch (Exception e){
                    System.out.println("Что-то пошло не так");
                    e.printStackTrace();
                }
            }
        }
    }


    // Обменная операция
    // предполагаем, что деньги
    public void transactionExchangeMoney(Transaction transaction){

    }
}
