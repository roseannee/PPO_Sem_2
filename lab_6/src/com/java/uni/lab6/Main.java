package com.java.uni.lab6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstname = "";
        String lastname = "";
        int birthDate = 0;
        int albumNumber = 0;
        int recruitmentYear = 0;
        String degree = "";

        int option;
        int subOption;

        Person person = null;
        Student student = null;
        Teacher teacher = null;

        do {
            menu();
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    do {
                        submenu();
                        subOption = scanner.nextInt();
                        switch (subOption) {
                            case 1:
                                person = new Person(firstname, lastname, birthDate);
                                System.out.println("\n\nObject has been created!");
                            break;

                            case 2:
                                if (person != null) {
                                    System.out.println("\n\nFill in the following info : ");
                                    person.enter();
                                } else
                                    System.out.println("\n\nError : There is no such object! Try again.");
                            break;

                            case 3:
                                if (person != null)
                                    System.out.println(person.display());
                                else
                                    System.out.println("\n\nError : There is no such object! Try again.");
                            break;

                            case 4:
                                if (person != null) {
                                    System.out.println("\n\nChange the following info : ");
                                    person.enter();
                                } else
                                    System.out.println("\n\nError : There is no such object! Try again.");
                            break;

                            case 0:
                                System.out.println("\n\nBack to Main Menu...");
                            break;

                            default:
                                System.out.println("\n\nWrong number. Try again!");
                        }
                    } while (subOption != 0);
                break;

                case 2:
                    do {
                        submenuWithNames();
                        subOption = scanner.nextInt();
                        switch (subOption) {
                            case 1:
                                student = new Student(firstname, lastname, birthDate, albumNumber, recruitmentYear);
                                System.out.println("\n\nObject has been created!");
                            break;

                            case 2:
                                if (student != null) {
                                    System.out.println("\n\nFill in the following info : ");
                                    student.enter();
                                } else
                                    System.out.println("\n\nError : There is no such object! Try again.");
                            break;

                            case 3:
                                if (student != null)
                                    System.out.println(student.display());
                                else
                                    System.out.println("\n\nError : There is no such object! Try again.");
                            break;

                            case 4:
                                if (student != null) {
                                    System.out.println("\n\nChange the following info : ");
                                    student.enter();
                                } else
                                    System.out.println("\n\nError : There is no such object! Try again.");
                            break;

                            case 5:
                                if (student != null) {
                                    System.out.println(student.showNames());
                                } else
                                    System.out.println("\n\nError : There is no such object! Try again.");
                            break;

                            case 6:
                                if (student != null) {
                                    System.out.println(student.showNames());
                                    System.out.println("\nChange the following info : ");
                                    student.changeNames();
                                } else
                                    System.out.println("\n\nError : There is no such object! Try again.");
                            break;

                            case 0:
                                System.out.println("\n\nBack to Main Menu...");
                            break;

                            default:
                                System.out.println("\n\nWrong number. Try again!");
                        }
                    } while (subOption!= 0);
                break;

                case 3:
                    do {
                        submenuWithNames();
                        subOption = scanner.nextInt();
                        switch (subOption) {
                            case 1:
                                teacher = new Teacher(firstname, lastname, birthDate, degree);
                                System.out.println("\n\nObject has been created!");
                            break;

                            case 2:
                                if (teacher != null) {
                                    System.out.println("\n\nFill in the following info : ");
                                    teacher.enter();
                                } else
                                    System.out.println("\n\nError : There is no such object! Try again.");
                            break;

                            case 3:
                                if (teacher != null)
                                    System.out.println(teacher.display());
                                else
                                    System.out.println("\n\nError : There is no such object! Try again.");
                            break;

                            case 4:
                                if (teacher != null) {
                                    System.out.println("\n\nChange the following info : ");
                                    teacher.enter();
                                } else
                                    System.out.println("\n\nError : There is no such object! Try again.");
                            break;

                            case 5:
                                if (teacher != null) {
                                    System.out.println(teacher.showNames());
                                } else
                                    System.out.println("\n\nError : There is no such object! Try again.");
                            break;

                            case 6:
                                if (teacher != null) {
                                    System.out.println(teacher.showNames());
                                    System.out.println("\nChange the following info : ");
                                    teacher.changeNames();
                                } else
                                    System.out.println("\n\nError : There is no such object! Try again.");
                            break;

                            case 0:
                                System.out.println("\n\nBack to Main Menu...");
                            break;

                            default:
                                System.out.println("\n\nWrong number. Try again!");
                        }
                    } while (subOption != 0);
                break;

                case 0:
                    System.out.println("\n\nExit...");
                break;

                default:
                    System.out.println("\n\nWrong number. Try again!");
            }
        } while (option != 0);
    }

    public static void menu() {
        System.out.println("""


                --- Lab 6 :  ---
                1. Add Person
                2. Add Student
                3. Add Teacher
                0. End""");
        System.out.print("Enter the number here : ");
    }

    public static void submenu() {
        System.out.println("""


                --- Submenu :  ---
                1. Create an object
                2. Enter data
                3. Display data
                4. Edit data
                0. End""");
        System.out.print("Enter the number here : ");
    }

    public static void submenuWithNames() {
        System.out.println("""


                --- Submenu :  ---
                1. Create an object
                2. Enter data
                3. Display data
                4. Edit data
                5. Show names
                6. Change names
                0. End""");
        System.out.print("Enter the number here : ");
    }
}
