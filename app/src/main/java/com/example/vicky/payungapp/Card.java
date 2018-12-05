package com.example.vicky.payungapp;

public class Card {
    private String imgURL;
    private String title1;
    private String title2;

    public Card(String imgURL, String title1,String title2) {
        this.imgURL = imgURL;
        this.title1 = title1;
        this.title2 = title2;
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }
}
