package com.learn.boot.pojo;

public class Message {
    private String name;
    private String wechat;
    private String major;
    private String interest;

    public Message() {

    }

    public Message(String name, String wechat, String major, String interest) {
        this.name = name;
        this.wechat = wechat;
        this.major = major;
        this.interest = interest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }
}
