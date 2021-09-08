package com.company;

import java.util.Scanner;

public class Diagnosis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        People person = new People("ahmed" , 20);
        EyesDiagnosis LeftEye = new EyesDiagnosis("Left Eye" , "short sighted" , new Status("color" , "blue"));
        EyesDiagnosis RightEye = new EyesDiagnosis("Right Eye" , "short sighted" , new Status("color" , "blue"));
        HeartDiagnosis Heart = new HeartDiagnosis("Heart", "Normal" , new Status("heart rate" , "75"));
        Stomach stomach = new Stomach("Stomach", "PUD" , new Status("need to be fed"));
        Skin skin = new Skin("Skin" , "burned");

        System.out.println("Name : " + person.getName() + "\nAge : " + person.getAge());
        while (true) {
            System.out.println("Choose an organ :\n" + "\t1. Left Eye.\n\t2. Right Eye.\n\t3. Heart.\n\t4. Stomach.\n\t5. Skin.\n\t6. Quit.");
            int chooseOrgan = input.nextInt();
            if (chooseOrgan == 1) {
                System.out.println(LeftEye.getName() + "\n" + LeftEye.getMedicalCondition() + "\n" + LeftEye.getMedicalStatus());
                LeftEye.showCase();
                LeftEye.closeEye(input.nextInt());
            } else if (chooseOrgan == 2) {
                System.out.println(RightEye.getName() + "\n" + RightEye.getMedicalCondition() + "\n" + RightEye.getMedicalStatus());
                RightEye.showCase();
                RightEye.closeEye(input.nextInt());
            } else if (chooseOrgan == 3) {
                System.out.println(Heart.getName() + "\n" + Heart.getMedicalCondition() + "\n" + Heart.getMedicalStatus());
                Heart.showCase();
                Heart.changeRate(input.nextInt());
            } else if (chooseOrgan == 4) {
                System.out.println(stomach.getName() + "\n" + stomach.getMedicalCondition() + "\n" + stomach.getMedicalStatus());
                stomach.showCase();
                stomach.digest(input.nextInt());
            } else if (chooseOrgan == 5) {
                System.out.println(skin.getName() + "\n" + skin.getMedicalCondition());
            } else {
                break;
            }

        }
    }
}
