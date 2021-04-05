package com.learn.boot.entity;

public class User {
    private String userName;
    private String passWord;
    private String power;

    public User(String userName, String passWord, String power) {
        this.userName = userName;
        this.passWord = passWord;
        this.power = power;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }


}
