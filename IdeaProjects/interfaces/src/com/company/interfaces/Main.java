package com.company.interfaces;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int k = in.nextInt();
	    String letter =  in.next();
	    char[] letters = letter.toLowerCase().toCharArray();
		for (int i = 0 ; i < letter.length() ; i++) {
			if (letters[i] == 'o' || letters[i] == 'a' || letters[i] == 'e' ||letters[i] == 'i' || letters[i] == 'u' || letters[i] == 'y') {
				letters[i] = ' ';
			} else {
				letters[i] = (char) ('.' + letters[i]);
			}
		}
    }
}
