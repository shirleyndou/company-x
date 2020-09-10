package com.example.companyx.model;

public class User {
    private int idNumber;
    private String name, surname;

    public User(int idNumber, String name, String surname) {
        this.idNumber = idNumber;
        this.name = name;
        this.surname = surname;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
