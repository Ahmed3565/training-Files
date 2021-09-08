package com.company.javaChallange;


import java.util.*;

public class User {
    Random rand = new Random();
    private static final ArrayList<String> UserFullName = new ArrayList<>();
    private static final ArrayList<String> UserAccountNumber = new ArrayList<>();
    private static final ArrayList<String> UserPassword = new ArrayList<>();
    private static final ArrayList<Double> UserBalance = new ArrayList<>();
    private static final ArrayList<Integer> UserAccountType = new ArrayList<>();
    private static final ArrayList<String> UserGender = new ArrayList<>();
    private static final ArrayList<String> UserPhoneNumber = new ArrayList<>();
    private static boolean justCtreated;

    public static boolean isJustCtreated() {
        return justCtreated;
    }

    public static void setJustCtreated(boolean justCtreated) {
        User.justCtreated = justCtreated;
    }

    public static String getUserFullName(String accountNumber) {
        for (String it: UserAccountNumber) {
            if(it.equals(accountNumber)) {
                return UserFullName.get(UserAccountNumber.indexOf(it));
            }
        }
        return "no name";
    }

    public static void setUserFullName(String userFullName) {
        UserFullName.add(userFullName);
    }

    public static boolean getUserAccountNumber(String accountNumber) {
        for (String it: UserAccountNumber) {
            if(it.equals(accountNumber)) {
                return true;
            }
        }
        return false;
    }
    public static boolean getUserAccountNumberCheck(String accountNumber) {
        for (String it: UserAccountNumber) {
            if (it.equals(accountNumber)) {
                return true;
            }
        }
        return false;

    }

    public static void setUserAccountNumber(String userAccountNumber) {
        UserAccountNumber.add(userAccountNumber);
    }

    public static boolean getUserPassword(String accountNumber , String password) {
        for (String it: UserAccountNumber) {
            if(it.equals(accountNumber)) {
                if (password.equals(UserPassword.get(UserAccountNumber.indexOf(it)))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void setUserPassword(String userPassword) {
        UserPassword.add(userPassword);
    }
    public static void changeUserPassword(String userPassword, String accountNumber) {
        for (String it: UserAccountNumber) {
            if(it.equals(accountNumber)) {
                UserPassword.set(UserAccountNumber.indexOf(it) ,userPassword);
            }
        }
    }

    public static ArrayList<Double> getUserBalance() {
        return UserBalance;
    }

    public static void setUserBalance(double userBalance) {
        UserBalance.add(userBalance);
    }

    public static ArrayList<Integer> getUserAccountType() {
        return UserAccountType;
    }

    public static void setUserAccountType(int userAccountType) {
        UserAccountType.add(userAccountType);
    }

    public static ArrayList<String> getUserGender() {
        return UserGender;
    }

    public static void setUserGender(String userGender) {
        UserGender.add(userGender);
    }

    public static ArrayList<String> getUserPhoneNumber() {
        return UserPhoneNumber;
    }

    public static void setUserPhoneNumber(String userPhoneNumber) {
        UserPhoneNumber.add(userPhoneNumber);
    }

    public String accountNumberGenerator () {
        ArrayList<Integer> numbers = new ArrayList<>(7);
        String result = "";
        for (int i = 0 ; i < 7 ; i++) {
            numbers.add(rand.nextInt(10));
        }

        for (int number: numbers) {
            result += number;
        }
        for (String it : UserAccountNumber) {
            if (it.equals(result)) {
                accountNumberGenerator();
            }
        }
        return result;
    }

    public String accountPasswordGenerator () {
        ArrayList<Integer> numbers = new ArrayList<>(4);
        String onePass = "";
        for (int i = 0 ; i < 4 ; i++) {
            numbers.add(rand.nextInt(10));
        }

        for (int number: numbers) {
            onePass += number;
        }
        return onePass;
    }
    public String getLastAccountNumber (String phone) {
        for (String it: UserPhoneNumber) {
            if (it.equals(phone)) {
                return UserAccountNumber.get(UserPhoneNumber.indexOf(phone));
            }
        }
        return "no account number";
    }
    public String getLastPassword (String phone) {
        for (String it: UserPhoneNumber) {
            if (it.equals(phone)) {
                return UserPassword.get(UserPhoneNumber.indexOf(phone));
            }
        }
        return "no password generated";
    }

        public String transfer (double amount , String accountNumber, String personNumber) {
            for (String number: UserAccountNumber) {
                if (number.equals(accountNumber)) {
                    int num = UserAccountNumber.indexOf(accountNumber);
                    if (amount <= UserBalance.get(num)) {
                        for (String person: UserAccountNumber) {
                            if (person.equals(personNumber)) {
                                UserBalance.set(num, UserBalance.get(num) - amount);
                                int num2 = UserAccountNumber.indexOf(personNumber);
                                UserBalance.set(num2, UserBalance.get(num2) + amount);
                                return amount + " is transfered to " + UserFullName.get(num2) + " your remain balance is " + UserBalance.get(num);
                            }
                        }
                            return "receiver account does does not exist";

                    }
                    return "you don't have enough balance";


                }
            }
            return "?";
        }
    public void operation (int operation, double amount , String accountNumber) {
        for (String number: UserAccountNumber) {
            if (number.equals(accountNumber)) {
                int num = UserAccountNumber.indexOf(accountNumber);
                    switch (operation) {
                        case 2 -> {
                            UserBalance.set(num, UserBalance.get(num) + amount);
                            System.out.println("your balance now is " + UserBalance.get(num));
                        }
                        case 1 -> {
                            if (amount <= UserBalance.get(num)) {
                                UserBalance.set(num, UserBalance.get(num) - amount);
                                System.out.println("your remain balance is " + UserBalance.get(num));
                            } else {
                                System.out.println("you don't have enough balance");
                            }

                        }
                    }



            }
        }
    }

}
