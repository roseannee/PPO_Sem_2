package com.java.uni.lab1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;
        int configureOption;

        int kits = 0;
        int days = 0;
        int hours = 0;
        int wholeHours = 0;
        int helmets = 0;
        int goggles = 0;
        double basePrice = 0;
        double totalPrice;
        double optionalElementsBasePrice = 0;
        double optionalElementsTotalPrice;
        double helmetsPrice;
        double gogglesPrice;

        do {
            menu();
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.print("\n\nEnter the number of kits you want to rent : ");
                    kits = scanner.nextInt();

                    System.out.println("--- Success!");
                    break;

                case 2:
                    System.out.println("\n\nEnter the rental time :");
                    System.out.print("- days : ");
                    days = scanner.nextInt();
                    wholeHours = days * 24;

                    System.out.print("- hours : ");
                    hours = scanner.nextInt();
                    if (hours >= 24) {
                        days += hours / 24;
                        wholeHours = days * 24;
                        hours = 0;
                    }
                    wholeHours += hours;

                    System.out.println("--- Success!");
                    break;

                case 3:
                    System.out.print("\n\nEnter the base price : ");
                    basePrice = scanner.nextDouble();

                    System.out.println("--- Success!");
                    break;

                case 4:
                    totalPrice = basePrice * kits * wholeHours;

                    helmetsPrice = optionalElementsBasePrice * helmets * wholeHours;
                    gogglesPrice = optionalElementsBasePrice * goggles * wholeHours;
                    optionalElementsTotalPrice = helmetsPrice + gogglesPrice;
                    totalPrice += optionalElementsTotalPrice;

                    allInfo(kits, days, hours, basePrice, helmets, goggles, optionalElementsBasePrice);
                    System.out.println("\nTotal price : $" + totalPrice);
                    break;

                case 5:
                    System.out.println("\n\nEnter the number of optional elements :");
                    System.out.print("- helmet(s) : ");
                    helmets = scanner.nextInt();
                    System.out.print("- goggles : ");
                    goggles = scanner.nextInt();

                    System.out.print("\nEnter the base price for optional elements : ");
                    optionalElementsBasePrice = scanner.nextDouble();

                    System.out.println("--- Success!");
                    break;

                case 6:
                    do {
                        allInfo(kits, days, hours, basePrice, helmets, goggles, optionalElementsBasePrice);
                        System.out.println("0.   End");
                        System.out.print("Choose the option you want to change : ");
                        configureOption = scanner.nextInt();
                        switch (configureOption) {
                            case 1 -> {
                                System.out.print("\nEnter new value : ");
                                kits = scanner.nextInt();
                                System.out.println("--- Success!");
                            }
                            case 2 -> {
                                System.out.print("\nEnter new value : ");
                                days = scanner.nextInt();
                                wholeHours = days * 24;
                                System.out.println("--- Success!");
                            }
                            case 3 -> {
                                System.out.print("\nEnter new value : ");
                                hours = scanner.nextInt();
                                if (hours >= 24) {
                                    days += hours / 24;
                                    wholeHours = days * 24;
                                    hours = 0;
                                }
                                wholeHours += hours;
                                System.out.println("--- Success!");
                            }
                            case 4 -> {
                                System.out.print("\nEnter new value : ");
                                basePrice = scanner.nextDouble();
                                System.out.println("--- Success!");
                            }
                            case 5 -> {
                                System.out.print("\nEnter new value : ");
                                helmets = scanner.nextInt();
                                System.out.println("--- Success!");
                            }
                            case 6 -> {
                                System.out.print("\nEnter new value : ");
                                goggles = scanner.nextInt();
                                System.out.println("--- Success!");
                            }
                            case 7 -> {
                                System.out.print("\nEnter new value : ");
                                optionalElementsBasePrice = scanner.nextDouble();
                                System.out.println("--- Success!");
                            }
                            case 0 -> System.out.println("\nExit...");
                            default -> System.out.println("\n\nWrong number. Try again!");
                        }
                    } while (configureOption != 0);
                    break;

                case 7:
                    kits = 0;
                    days = 0;
                    hours = 0;
                    wholeHours = 0;
                    helmets = 0;
                    goggles = 0;
                    basePrice = 0;

                    System.out.println("\n\n--- Success!");
                    break;

                case 0:
                    System.out.println("\n\nExit...");
                    break;

                default:
                    System.out.println("\n\nWrong number. Try again!");
                    break;
            }
        } while (option != 0);
    }
    public static void menu() {
        System.out.println("""


                --- Lab 1 : Ski equipment rental ---
                1. Enter the number of kits
                2. Enter the number of days / hours
                3. Enter the base price
                4. Display all info + total price
                5. Add optional elements + base price
                6. Configure options
                7. Clear the data
                0. End""");
        System.out.print("Enter the number here : ");
    }
    public static void allInfo (int kits, int days, int hours, double basePrice, int helmets, int goggles, double optionalElementsBasePrice) {
        System.out.println("\n\nAll info :" +
                "\n1.   " + kits + " kit(s)" +
                "\n2.   " + days + " day(s)" +
                "\n3.   " + hours + " hour(s)" +
                "\n4.   base price : $" + basePrice +
                "\n5.   " + helmets + " helmet(s)" +
                "\n6.   " + goggles + " pair(s) of goggles" +
                "\n7.   base price (optional elements) : $" + optionalElementsBasePrice);
    }
}
