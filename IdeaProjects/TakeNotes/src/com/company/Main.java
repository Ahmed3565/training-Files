package com.company;

import java.io.File;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int randNum ;
        int guess ;

        System.out.print("May i have your name ? ");
        String Username = input.next();
        System.out.println("Hello " + Username);

        while(true) {
        System.out.println("shall we begin? (yes / no) ");
        String answer = input.next();

        if(answer.equals("yes")) {
            System.out.println("the number between 1 - 20");
            randNum = rand.nextInt(20) + 1;
            int i = 0;
            do{
                System.out.print("enter the number ");
                guess = input.nextInt();
                if (guess == randNum) {
                    System.out.println("Congratltion you guessed the number !!!");
                    return;
                } else if (guess > randNum) {
                    System.out.println("the number is smaller than yours !");
                } else if (guess < randNum) {
                    System.out.println("the number is bigger than yours !");
                }
                i++;
            } while (i < 5);
            System.out.println("\nGame Over !!!");
            System.out.println("The number was " + randNum);
            return;
        } }
    }
}
