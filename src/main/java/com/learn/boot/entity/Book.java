package com.learn.boot.entity;

public class Book {
    private String pictureUrl;
    private String bookName;

    public Book(String pictureUrl, String bookName) {
        this.pictureUrl = pictureUrl;
        this.bookName = bookName;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
