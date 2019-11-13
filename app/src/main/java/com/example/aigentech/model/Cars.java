package com.example.aigentech.model;

import android.media.Image;

public class Cars {

    private String nName;
    private int nImage;
    private String nCustomer;
    private String nContact;
    private String nAddress;


    public Cars(String nName,int nImage, String nCustomer, String nContact, String nAddress) {
        this.nName = nName;
        this.nImage = nImage;
        this.nCustomer = nCustomer;
        this.nContact = nContact;
        this.nAddress = nAddress;
    }

    public String getnCustomer() {
        return nCustomer;
    }

    public void setnCustomer(String nCustomer) {
        this.nCustomer = nCustomer;
    }

    public String getnContact() {
        return nContact;
    }

    public void setnContact(String nContact) {
        this.nContact = nContact;
    }

    public String getnAddress() {
        return nAddress;
    }

    public void setnAddress(String nAddress) {
        this.nAddress = nAddress;
    }

    public int getnImage() {
        return nImage;
    }

    public void setnImage(int nImage) {
        this.nImage = nImage;
    }

    public String getnName() {
        return nName;
    }

    public void setnName(String nName) {
        this.nName = nName;
    }
}
