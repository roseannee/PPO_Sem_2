package com.java.uni.lab2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;
        int configureOption;
        Rent rent = null;

        do {
            menu();
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    try {
                        rent = new Rent();
                        System.out.print("\n\nEnter the amount of kits : ");
                        rent.kits = scanner.nextInt();

                        System.out.println("\nEnter the rental time :");
                        System.out.print("- days : ");
                        rent.days = scanner.nextInt();
                        System.out.print("- hours : ");
                        rent.hours = scanner.nextInt();
                        rent.calcHours();

                        System.out.print("\nEnter the base price : ");
                        rent.basePrice = scanner.nextDouble();
                    } catch (NullPointerException e) {
                        System.err.println("\nError : rent = null");
                        System.exit(1);
                    }

                break;

                case 2:
                    try {
                        assert rent != null;
                        System.out.println(rent.display());
                        System.out.println("Total price : $" + rent.totalValue(rent.totalPrice));
                    } catch (NullPointerException e) {
                        System.err.println("\nError : rent = null");
                        System.exit(1);
                    }
                break;

                case 3:
                    try {
                        System.out.println("\n\nEnter the amount of optional elements :");
                        System.out.print("- helmet(s) : ");
                        assert rent != null;
                        rent.helmets = scanner.nextInt();
                        System.out.print("- goggles : ");
                        rent.goggles = scanner.nextInt();

                        System.out.print("\nEnter the base price for optional elements : ");
                        rent.optionalElementsBP = scanner.nextDouble();
                    } catch (NullPointerException e) {
                        System.err.println("\nError : rent = null");
                        System.exit(1);
                    }

                break;

                case 4:
                    try {
                        do {
                            assert rent != null;
                            System.out.println(rent.display());
                            System.out.println("0.   End");
                            System.out.print("Choose the option you want to change : ");
                            configureOption = scanner.nextInt();
                            switch (configureOption) {
                                case 1 -> {
                                    System.out.print("\nEnter new value : ");
                                    rent.kits = scanner.nextInt();
                                }
                                case 2 -> {
                                    System.out.print("\nEnter new value : ");
                                    rent.days = scanner.nextInt();
                                    rent.calcHours();
                                }
                                case 3 -> {
                                    System.out.print("\nEnter new value : ");
                                    rent.hours = scanner.nextInt();
                                    rent.calcHours();
                                }
                                case 4 -> {
                                    System.out.print("\nEnter new value : ");
                                    rent.basePrice = scanner.nextDouble();
                                }
                                case 5 -> {
                                    System.out.print("\nEnter new value : ");
                                    rent.helmets = scanner.nextInt();
                                }
                                case 6 -> {
                                    System.out.print("\nEnter new value : ");
                                    rent.goggles = scanner.nextInt();
                                }
                                case 7 -> {
                                    System.out.print("\nEnter new value : ");
                                    rent.optionalElementsBP = scanner.nextDouble();
                                }
                                case 0 -> System.out.println("\nReturn...");
                                default -> System.out.println("\n\nWrong number. Try again!");
                            }
                        } while (configureOption != 0);
                    } catch (NullPointerException e) {
                        System.err.println("\nError : rent = null");
                        System.exit(1);
                    }

                break;

                case 5:
                    rent = null;
                    if (rent == null)
                        System.out.println("\n---Success!");
                    else
                        System.out.println("\nError. Try again!");
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


                --- Lab 2 : Ski equipment rental ---
                1. Enter the rental data
                2. Display the rental data + total price
                3. Enter optional elements
                4. Change the data
                5. Clear the data
                0. End""");
        System.out.print("Enter the number here : ");
    }
}