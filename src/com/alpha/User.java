package com.alpha;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String firstName;
    private String lastName;
    private String middleName;
    private String currentAddress;
    private double UID;
    private String userType;

    private int accountNumber;

    //login & password предлагаю оставить
    private String login;
    private String password;

    //где-то все юзеры должны храниться это кастыль пока нет БД
    //где он будет храниться?
    //private List<User> userList = new ArrayList<>();

    //это типа аккаунты конкретного пользователя?
    private List<String> accountList;
    //Что это?
    private List<String> identificationDocumentList;
    private List<String> residentialAddressList;


    //предлагаю другую реализацию конструктора без параметров:
    //этот авторег не будет рабьотать сразу пока пользователь не заполнит свои и данные и непройдет верификацию
    public User() {
        this.firstName = "";
        this.lastName = "";
        this.middleName = "";
        this.currentAddress = "";
        this.userType = "1";//это параметр может использоваться если ЮР или ФИЗ лицо например
        this.UID = (0 + (int) (Math.random() * 1000000000));//Math.random возвращает не целые числа, а 0.05546919624573865, предлагаю целые числа
        this.accountNumber = 0; // это параметр нужен для привязки юзер к счету
        this.login = "user"; // эти параметры инициализируются и юзеру предлагается сменить логин и парол сразу.
        // чуть позже напишу генератор логинов и паролей
        this.password = "12345";
    }

    // есть вариант где все данные будет заполнять служащий банка
    public User(String firstName, String lastName, String middleName, String currentAddress,
                double UID, String userType, int accountNumber, String login, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.currentAddress = currentAddress;
        this.UID = UID;
        this.userType = userType;
        this.accountNumber = accountNumber;
        this.login = login;
        this.password = password;
    }

    // а это вариант, чтобы служащий банка мог все менть в офисе. так?
    public double getUID() {
        return UID;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getCurrentAddress() {
        return currentAddress;
    }


}
