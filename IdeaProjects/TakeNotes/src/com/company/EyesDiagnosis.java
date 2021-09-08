package com.company;

public class EyesDiagnosis extends DoctorApp{
    private boolean hasClosed = true;
    public EyesDiagnosis(String name, String medicalCondition, Status medicalStatus) {
        super(name, medicalCondition, medicalStatus);
    }
    public void showCase () {
        System.out.println("\t1. close the eye.");
    }
    public void closeEye (int Case) {
        if (Case == 1) {
            System.out.println("the eye has closed");
            hasClosed = true;
        } else {
            hasClosed = false;
        }
    }
}
