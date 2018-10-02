package com.alpha;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String firstName;
    private String lastName;
    private String userType;
    private double id;
    private int accountNumber;
    private String login;
    private String password;

    //список пользователей
    private List<User> userList = new ArrayList<>();

    public User() {
        this.firstName = "";
        this.lastName = "";
        this.userType = "1";
        this.id = 0 + (int) (Math.random() * 1000000);
        this.accountNumber = (0 + (int) (Math.random() * 1000000000));
        this.login = "user";
        this.password = "12345";
    }

    public User(String firstName, String lastName, String userType, double id, int accountNumber, String login, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userType = userType;
        this.id = id;
        this.accountNumber = accountNumber;
        this.login = login;
        this.password = password;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void addUser(User user) {
        userList.add(user);
    }
}
