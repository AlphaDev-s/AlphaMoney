package com.alpha;

import java.util.List;

public class User {
    private double UID;
    private String firstName;
    private String lastName;
    private String middleName;
    private List<String> accountList;
    private List<String> identificationDocumentList;
    private List<String> residentialAddressList;
    private String currentAddress;

    public User() {
        this.UID = Math.random();
    }

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
