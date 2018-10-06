package com.alpha;

import java.util.HashMap;
import java.util.Map;

public abstract class User {

    private double UID;  // уникальный идентификатор
    private String firstName;
    private String lastName;
    private String middleName;
    private char   Gender;
    private Map<String, Account> accountList = new HashMap<>();                // массив всех аккаунтов пользователя
    private Map<String, IdentificationDocument> identificationDocumentList = new HashMap<>();  // массив всех документов
    private Map<String, ResidentialAddress> residentialAddressList = new HashMap<>();      // массив всех адресов
    private String currentAddressID;                    // текущий адрес

    public void setUID(double uid) {
        this.UID = uid;
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

    public void setGender(char Gender) {
        this.Gender = Gender;
    }

    public char getGender() {
        return Gender;
    }

    public void setAccountList(String id, Account account) {
        this.accountList.put(id, account);
    }

    public Account getAccountList(String id) {
        return accountList.get(id);
    }

    public void setIdentificationDocumentList(String id, IdentificationDocument identificationDocument) {
        this.identificationDocumentList.put(id, identificationDocument);
    }

    public IdentificationDocument getIdentificationDocumentList(String id) {
        return identificationDocumentList.get(id);
    }

    public void setResidentialAddressList(String id, ResidentialAddress residentialAddress) {
        this.residentialAddressList.put(id, residentialAddress);
    }

    public ResidentialAddress getResidentialAddressList(String id) {
        return residentialAddressList.get(id);
    }

    public void setCurrentAddress(String id) {
        this.currentAddressID = id;
    }

    public String getCurrentAddressID() {
        return currentAddressID;
    }
}
