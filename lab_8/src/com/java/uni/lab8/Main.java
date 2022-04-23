package com.java.uni.lab8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;
        int subOption;
        int shortOrLongOption;

        int length = 0;
        int width = 0;

        String firstname = "";
        String lastname = "";
        int birthDate = 0;
        String address = "";

        String brand = "";
        String model = "";
        int year = 0;
        String color = "";
        float accelerationTime = 0;

        Rectangle rectangle = null;
        Person person = null;
        Car car = null;
        ArrayList<Description> list = new ArrayList<>();

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
                                rectangle = new Rectangle(length, width);
                                System.out.println("\n\nObject has been created!");
                                list.add(rectangle);

                            break;

                            case 2:
                                if (rectangle != null) {
                                    System.out.println("\n\nFill in the following info : ");
                                    rectangle.enter();
                                } else
                                    System.out.println("\n\nError : This object does not exist! Try again.");
                            break;

                            case 3:
                                if (rectangle != null) {
                                    System.out.println("\n\n--- Short desc : ---");
                                    System.out.println(shortDesc(rectangle));

                                } else
                                    System.out.println("\n\nError : This object does not exist! Try again.");
                            break;

                            case 4:
                                if (rectangle != null) {
                                    System.out.println("\n\n--- Long desc : ---");
                                    System.out.println(longDesc(rectangle));
                                } else
                                    System.out.println("\n\nError : This object does not exist! Try again.");
                            break;

                            case 5:
                                if (rectangle != null) {
                                    do {
                                        shortOrLongMenu();
                                        System.out.print("\nEnter the number here : ");
                                        shortOrLongOption = scanner.nextInt();

                                        System.out.println("\n\n" + descWDecor(rectangle, shortOrLongOption));

                                    } while (shortOrLongOption != 0);
                                } else
                                    System.out.println("\n\nError : This object does not exist! Try again.");
                            break;

                            case 0:
                                System.out.println("\n\nExit...");
                            break;

                            default:
                                System.out.println("\n\nWrong number. Try again!");
                        }
                    } while (subOption != 0);
                break;

                case 2:
                    do {
                        submenu();
                        subOption = scanner.nextInt();
                        switch (subOption) {
                            case 1:
                                person = new Person(firstname, lastname, birthDate, address);
                                System.out.println("\n\nObject has been created!");

                                list.add(person);
                            break;

                            case 2:
                                if (person != null) {
                                    System.out.println("\n\nFill in the following info : ");
                                    person.enter();
                                } else
                                    System.out.println("\n\nError : This object does not exist! Try again.");
                            break;

                            case 3:
                                if (person != null) {
                                    System.out.println("\n\n--- Short desc : ---");
                                    System.out.println(shortDesc(person));
                                } else
                                    System.out.println("\n\nError : This object does not exist! Try again.");
                            break;

                            case 4:
                                if (person != null) {
                                    System.out.println("\n\n--- Long desc : ---");
                                    System.out.println(longDesc(person));
                                } else
                                    System.out.println("\n\nError : This object does not exist! Try again.");
                            break;

                            case 5:
                                if (person != null) {
                                    do {
                                        shortOrLongMenu();
                                        System.out.print("\nEnter the number here : ");
                                        shortOrLongOption = scanner.nextInt();

                                        System.out.println("\n\n" + descWDecor(person, shortOrLongOption));

                                    } while (shortOrLongOption != 0);
                                } else
                                    System.out.println("\n\nError : This object does not exist! Try again.");
                            break;

                            case 0:
                                System.out.println("\n\nExit...");
                            break;

                            default:
                                System.out.println("\n\nWrong number. Try again!");
                        }
                    } while (subOption != 0);
                break;

                case 3:
                    do {
                        submenu();
                        subOption = scanner.nextInt();
                        switch (subOption) {
                            case 1:
                                car = new Car(brand, model, year, color, accelerationTime);
                                System.out.println("\n\nObject has been created!");

                                list.add(car);
                            break;

                            case 2:
                                if (car != null) {
                                    System.out.println("\n\nFill in the following info : ");
                                    car.enter();
                                } else
                                    System.out.println("\n\nError : This object does not exist! Try again.");
                            break;

                            case 3:
                                if (car != null) {
                                    System.out.println("\n\n--- Short desc : ---");
                                    System.out.println(shortDesc(car));
                                } else
                                    System.out.println("\n\nError : This object does not exist! Try again.");

                            break;

                            case 4:
                                if (car != null) {
                                    System.out.println("\n\n--- Long desc : ---");
                                    System.out.println(longDesc(car));
                                } else
                                    System.out.println("\n\nError : This object does not exist! Try again.");
                            break;

                            case 5:
                                if (car != null) {
                                    do {
                                        shortOrLongMenu();
                                        System.out.print("\nEnter the number here : ");
                                        shortOrLongOption = scanner.nextInt();

                                        System.out.println("\n\n" + descWDecor(car, shortOrLongOption));

                                    } while (shortOrLongOption != 0);
                                } else
                                    System.out.println("\n\nError : This object does not exist! Try again.");
                            break;

                            case 0:
                                System.out.println("\n\nExit...");
                            break;

                            default:
                                System.out.println("\n\nWrong number. Try again!");
                        }
                    } while (subOption != 0);
                break;

                case 4:
                    System.out.println("\n\n");
                    for (Description i : list) {
                        System.out.println(i.longDesc());
                        System.out.println("------------------");
                    }
                    System.out.println();
                    break;

                case 5:

                break;

                case 6:

                break;

                case 0:
                    System.out.println("\n\nExit...");
                break;

                default:
                    System.out.println("\n\nWrong number. Try again!");
            }
        } while (option != 0);
    }

    static String shortDesc(Description description) {
        return description.shortDesc();
    }

    static String longDesc(Description description) {
        return description.longDesc();
    }

    static String descWDecor(Description description, int shortOrLong) {
        String descWDecor;
        switch (shortOrLong) {
            case 1 -> descWDecor = "╰☆☆ " + description.shortDesc() + " ☆☆╮";
            case 2 -> descWDecor = "➶➶➶➶➶ \n" + description.longDesc() + "\n➷➷➷➷➷";
            case 0 -> descWDecor = "Exit...";
            default -> descWDecor = "Wrong number. Try again!";
        }
        return descWDecor;
    }

    public static void menu() {
        System.out.println("""


                --- Lab 8 :  ---
                1. Rectangle
                2. Person
                3. Car
                4. Display the table
                5. Display only short desc from the table
                6. Display the table (parameter)
                0. End""");
        System.out.print("\nEnter the number here : ");
    }

    public static void submenu() {
        System.out.println("""


                --- Choose option :  ---
                1. Create an object
                2. Enter data
                3. Display short desc
                4. Display long desc
                5. Display desc w/ decorations
                0. Back to Main Menu""");
        System.out.print("\nEnter the number here : ");
    }

    public static void shortOrLongMenu() {
        System.out.println("""


                Choose a desc type :
                1. Short
                2. Long
                0. Back to Sub Menu""");
    }
}
