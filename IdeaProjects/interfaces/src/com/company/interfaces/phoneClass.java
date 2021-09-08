package com.company.interfaces;

public class phoneClass implements PhoneInterface {
    private String Name;
    private String price;
    private String OS;

    @Override
    public void screenSize(double screensize) {
        System.out.println("the phone's screen size is : " + screensize + " inch");
    }

    @Override
    public void phoneType(String phonetype) {
        System.out.println("the phone's type is : " + phonetype);
    }

    @Override
    public void phoneCompany(String phonecompany) {
        System.out.println("the phone's company is : " + phonecompany);
    }

    public phoneClass(String name, String price, String OS) {
        Name = name;
        this.price = price;
        this.OS = OS;
    }
}
