package com.company.javaChallange;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Contacts contacts = new Contacts();
        Messages messages = new Messages();


        boolean isFinished = false;
        System.out.println("Hello sire in our program");
        while (!isFinished) {
            System.out.println("Select one please :\n\t1. withdraw.\n\t2. Deposit.\n\t3. transfer.");
            switch (input.nextInt()) {
                case 1 -> {
                    boolean isF = false;
                    while (!isF) {
                        System.out.println("Select one please :\n1. show all contacts.\n" +
                                "2. add a new contact.\n" +
                                "3. search for a contact.\n" +
                                "4. Delete a contact.\n" +
                                "5. Go back to previous menu.");
                        switch (input.nextInt()) {
                            case 1 -> {
                                System.out.println("contacts list :-");
                                contacts.getAllContacts();
                                System.out.println();
                            }
                            case 2 -> {
                                System.out.print("may i have the name : ");
                                String name = input.next();
                                System.out.print("may i have the number : ");
                                String number = input.next();
                                contacts.setContact(name, number);
                            }
                            case 3 -> contacts.findContact();
                            case 4 -> contacts.deleteContact();
                            default -> isF = true;
                        }
                    }
                }
                case 2 -> {
                    boolean isM = false;
                    while (!isM) {
                        System.out.println("Select one please :\n1. see the list of all messages.\n" +
                                "2. send a new message.\n" +
                                "3. Go back to previous menu.");
                        switch (input.nextInt()) {
                            case 1 -> {
                                System.out.println("messages list :-");
                                messages.getAllMessages();
                                System.out.println();
                            }
                            case 2 -> {
                                System.out.println("\t1. send to contact.\n\t2. enter the number of the person.");
                                String message;
                                String name;
                                switch (input.nextInt()) {
                                    case 1:
                                        System.out.print("type the name : ");
                                        name = input.next();
                                        input.nextLine();
                                        if (contacts.chooseContact(name)) {
                                            System.out.print("the message : ");
                                            message = input.nextLine();
                                            messages.sendMessage(name, message);
                                        } else {
                                            System.out.println("no contacts or name doesn't exist !\n");
                                        }
                                        break;
                                    case 2:
                                        System.out.print("type the number of the person : ");
                                        name = input.next();
                                        input.nextLine();
                                        System.out.print("the message : ");
                                        message = input.nextLine();
                                        messages.sendMessage(name, message);
                                        break;
                                    default:
                                        break;
                                }
                            }
                            default -> isM = true;
                        }
                    }
                }
                default -> isFinished = true;
            }
        }
    }
}
