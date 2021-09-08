package com.company.interfaces;

public class LaptopClass extends LaptopInterface {
    @Override
    void LaptopscreenSize(double screensize) {
        System.out.println("the laptop screen size is : " + screensize);
    }

    @Override
    void LaptopType(String laptoptype) {
        System.out.println("the laptop type is : " + laptoptype);
    }

    @Override
    void LaptopCompany(String laptopcompany) {
        System.out.println("the laptop company is : " + laptopcompany);
    }
}
