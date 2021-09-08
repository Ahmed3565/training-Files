package com.company;

import java.util.Scanner;

public class HeartDiagnosis extends DoctorApp {
    Scanner input = new Scanner(System.in);
    private String heartRate ;
    public HeartDiagnosis(String name, String medicalCondition, Status medicalStatus) {
        super(name, medicalCondition, medicalStatus);
    }
    public void showCase () {
        System.out.println("\t1. change the heart rate.");
    }
    public void changeRate (int Case) {
        if (Case == 1) {
            System.out.print("enter the new heart rate ");
            setHeartRate(input.next());
            System.out.println("heart rate has changed to : " + getHeartRate());
            changeMedicalStatus(getHeartRate());
            if (Integer.parseInt(getHeartRate()) > 85) {
                setMedicalCondition("very high");
            } else if (Integer.parseInt(getHeartRate()) < 65) {
                setMedicalCondition("very low");
            }
        } else {
            System.out.println("heart rate is still " + heartRate);
        }
    }

    public String getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate;
    }
}
