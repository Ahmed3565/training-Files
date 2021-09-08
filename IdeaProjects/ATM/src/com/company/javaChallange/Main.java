package com.company.javaChallange;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final ArrayList<User> users = new ArrayList<User>();

        boolean running = true;
        while (running) {
            System.out.println("\n");
            for (int i = 0; i < 50; i++) {
                System.out.print("-");
            }
            System.out.println();
            System.out.println("Select number please :\n\t1. create new account.\n\t2. log in.");
            for (int i = 0; i < 50; i++) {
                System.out.print("-");
            }
            System.out.print("\n-> ");
            switch (input.nextInt()) {
                case 1 -> {
                    User user = new User();
                    System.out.print("username-> ");
                    String name = input.next();
                    user.setUserFullName(name);
                    System.out.print("gender-> ");
                    String gender = input.next();
                    user.setUserGender(gender);
                    System.out.print("phone number-> ");
                    String phone = input.next();
                    user.setUserPhoneNumber(phone);
                    System.out.println("account type:\n1- for provide\t2- for saving\t3- for active");
                    System.out.print("answer-> ");
                    int type = Integer.parseInt(input.next());
                    user.setUserAccountType(type);
                    System.out.print("deposit 500+ -> ");
                    double deposite = Double.parseDouble(input.next());
                    user.setUserBalance(deposite);

                    user.setUserAccountNumber(user.accountNumberGenerator());
                    user.setUserPassword(user.accountPasswordGenerator());

                    user.setJustCtreated(true);
                    users.add(user);
                    for (int i = 0; i < 50; i++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    System.out.println("your account number is " + user.getLastAccountNumber(phone) + "\nyour for one use password is < " + user.getLastPassword(phone) + " >");
                    for (int i = 0; i < 50; i++) {
                        System.out.print("*");
                    }
                    continue;
                }
                case 2 -> {
                    int counter = 3;
                    while (counter > 0){

                        boolean isFinished = false;
                        System.out.print("account number-> ");
                        String accountNum = input.next();

                        System.out.print("password -> ");
                        String password = input.next();


                        for (User user : users) {
                            if (user.getUserAccountNumber(accountNum) && user.getUserPassword(accountNum, password)) {
                                if (user.isJustCtreated()) {
                                    System.out.print("you have to change ypur password\ntype the old password-> ");
                                    String oldPassword = input.next();
                                    if (password.equals(oldPassword)) {
                                        boolean confirm = false;
                                        while (!confirm) {
                                            System.out.print("type the new password-> ");
                                            String newPassword = input.next();
                                            System.out.print("type the new password to confirm-> ");
                                            String confirmPassword = input.next();
                                           if (newPassword.equals(confirmPassword)) {
                                               user.changeUserPassword(newPassword, accountNum);
                                               confirm = true;
                                           } else {
                                               System.out.println("password does not much !");
                                           }
                                       }
                                        user.setJustCtreated(false);
                                    }

                                } else {
                                    System.out.println("some thing bad");
                                }


                                while (!isFinished) {
                                    for (int i = 0; i < 50; i++) {
                                        System.out.print("+");
                                    }
                                    System.out.println();
                                    System.out.println("Hello " + user.getUserFullName(accountNum));

                                    System.out.println("\n");
                                    System.out.println("Select one please :\n\t1. withdraw.\n\t2. Deposit.\n\t3. transfer.\n\t4. log out");
                                    switch (input.nextInt()) {
                                        case 1 -> {
                                            System.out.println("Enter the amount you want to withdraw : ");
                                            double amount = input.nextDouble();
                                            user.operation(1, amount, accountNum);
                                        }
                                        case 2 -> {
                                            System.out.println("Enter the amount you want to deposit : ");
                                            double amount = input.nextDouble();
                                            user.operation(2, amount, accountNum);
                                        }
                                        case 3 -> {
                                            System.out.println("Enter the receiver number you want to transfer to : ");
                                            String receiver = input.next();
                                            System.out.println("Enter the amount you want to transfer : ");
                                            double amount = input.nextDouble();
                                            System.out.println(user.transfer(amount, accountNum, receiver));
                                        }
                                        default -> isFinished = true;
                                    }
                                }
                            } else {
                                System.out.println("Invalid account number Or password");
                                counter--;
                            }
                        }
                    }
                    System.out.println("call the customer services to check");
                }
            }


        }




    }
}
