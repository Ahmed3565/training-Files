package com.company;

public class Stomach extends DoctorApp {
    public Stomach (String name, String medicalCondition, Status medicalStatus) {
        super(name , medicalCondition, medicalStatus);
    }
    public void showCase () {
        System.out.println("\t1. digest.");
    }
    public void digest (int Case) {
        if (Case == 1) {
            System.out.println("digesting begin...");
        }
    }
}
