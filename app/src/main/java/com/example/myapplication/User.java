package com.example.myapplication;

public class User {
    private String fristName;
    private String lastName;
    private int phone;

    public User(String fristName, String lastName, int phone) {
        this.fristName = fristName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
