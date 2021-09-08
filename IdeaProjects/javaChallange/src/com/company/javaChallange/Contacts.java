package com.company.javaChallange;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacts {
    Scanner input = new Scanner(System.in);
    private final ArrayList<String> contactNames = new ArrayList<>();
    private final ArrayList<String> contactNumbers = new ArrayList<>();

    public void setContact (String name , String number) {
            contactNames.add(name);
            contactNumbers.add(number);
            System.out.println("the name added successfully.\n");
    }
    public void findContact () {
        if (contactNames.size() != 0) {
            System.out.print("may i have the name : ");
            String name = input.next();
            for (int i = 0; i < contactNames.size(); i++) {
                if (contactNames.get(i).equalsIgnoreCase(name)) {
                    System.out.println(contactNames.get(i) + " number's is : " + contactNumbers.get(i));
                } else {
                    if (i >= contactNames.size() - 1) {
                        System.out.println("the contact not found !");
                    }
                }
            }
        } else {
            System.out.println("no thing to make search.\n");
        }
    }
    boolean b ;
    public boolean chooseContact (String name) {
        if (contactNames.size() != 0) {
            for (int i = 0; i < contactNames.size(); i++) {
                if (contactNames.get(i).equalsIgnoreCase(name)) {
                    b = true;
                } else {
                    if (i >= contactNames.size() - 1) {
                        b = false;
                    }
                }
            }
        } else {
            b = false;
        }
        return b;
    }
    public void deleteContact () {
        if (contactNames.size() != 0) {
            System.out.print("may i have the name : ");
            String name = input.next();
            for (int i = 0; i < contactNames.size(); i++) {
                if (contactNames.get(i).equalsIgnoreCase(name)) {
                    contactNames.remove(name);
                    String number = contactNumbers.get(i);
                    contactNumbers.remove(number);
                    System.out.println("the contact deleted successfully\n");
                } else {
                    if (i >= contactNames.size() - 1) {
                        System.out.println(name + " is not exist !");
                    }
                }
            }
        } else {
            System.out.println("no contacts to delete.\n");
        }

    }
    public void getAllContacts () {
        if (contactNames.size() != 0) {
            for (int i = 0; i < contactNames.size(); i++) {
                System.out.printf("Name: %s\nNumber: %s\n***********\n", contactNames.get(i), contactNumbers.get(i));
            }
        } else {
            System.out.println("\t...no contacts...");
        }
    }
}
