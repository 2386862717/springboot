package com.learn.boot.entity;

import java.sql.Timestamp;

public class Time {
    private String userName;
    private Timestamp date;

    public Time(String userName, Timestamp date) {
        this.userName = userName;
        this.date = date;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

}
