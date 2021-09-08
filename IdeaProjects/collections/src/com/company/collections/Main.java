package com.company.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	    ArrayList<Students> students = new ArrayList<>();
	    boolean isFinished = false;
	    while (!isFinished) {
            System.out.println("\t1. add new student.\n\t2. delete an existing student.\n\t3. show the entire list of students. \n\t4. quit. ");
	        int choise = input.nextInt();
	        switch (choise) {
                case 1:
                    System.out.print("may i have the name : ");
                    String name = input.next();
                    System.out.print("may i have the id : ");
                    int id = input.nextInt();
                    System.out.print("may i have the degree : ");
                    double degree = input.nextDouble();
                    students.add(new Students(name, id , degree));
                    System.out.println("the new student " + students.get(students.size() - 1).getName() + " has been added successfully.");
                    break;
                case 2:
                    if(students.isEmpty()) {
                        System.out.println("no students to delete");
                    } else {
                        System.out.print("type the exact id of the student : ");
                        int lineHasId = input.nextInt();
                        for (int i = 0; i < students.size() ; i++) {
                            if (students.get(i).getId() == lineHasId) {
                                System.out.println("the student " + students.get(i).getName() + " has been deleted.");
                                students.remove(students.get(i));
                            } else {
                                System.out.println("the student doesn't exist");
                            }
                        }
                    }
                break;
                case 3:
                    System.out.println("\n\t -: the list of students :-");
                    if (!students.isEmpty()) {
                        for (Students s : students) {
                            System.out.println(s.getId() + ". " + s.getName());
                        }
                    } else {
                        System.out.println("\t\tempty !");
                    }
                    break;
                default:
                    isFinished = true;
                    break;
            }

        }
    }
}
