package com.java.uni.lab5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;

        String firstname = "";
        String lastname = "";
        int birthDate = 0;
        String address = "";

        Person person = null;

        do {
            menu();
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    person = new Person(firstname, lastname, birthDate, address);
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
                        System.out.println("\n\n- old address : " + person.getAddress());

                        System.out.print("Enter new last char : ");
                        person.setLastLetter(scanner.next().charAt(0));

                        person.setAddressNewLastChar();
                        System.out.println("- new address : " + person.getAddress());
                    }  else
                        System.out.println("\n\nError : There is no such object! Try again.");
                break;

                case 5: //изменить
                    if (person != null) {
                        System.out.print("\n\nEnter new first name : ");
                        person.setFirstname(scanner.next());
                        System.out.print("Enter new last name : ");
                        person.setLastname(scanner.next());
                        System.out.println("New full name : " + person.getFullName());
                    }  else
                        System.out.println("\n\nError : There is no such object! Try again.");
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


                --- Lab 5 :  ---
                1. Create an object
                2. Data entry
                3. Display info
                4. Change last letter
                5. Change full name
                0. End""");
        System.out.print("Enter the number here : ");
    }
}
