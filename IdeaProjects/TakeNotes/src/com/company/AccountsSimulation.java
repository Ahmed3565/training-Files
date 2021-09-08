package com.company;
import java.util.Scanner;

public class AccountsSimulation {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"ahmed" , "yousif" , "nooraldeen" , "abdo elsalam"};
        String[] numbers = {"09986" , "099223" , "09213" , "09102"};

        System.out.print("Database contains : ");
        for (String n : names) {
            System.out.print(n + " ");
        }

        System.out.print("\n\nWhat's the name you are looking for ? ");
        String name = input.nextLine();

        for (int i = 0 ; i < names.length ; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                System.out.println("the phone number of " + names[i] + " is " + numbers[i]);
                break;
            } else if (i < names.length - 1) {
                continue;
            } else {
                System.out.println("Something went wrong or " + name + " is not exist in the database !");
            }
        }
    }
}
