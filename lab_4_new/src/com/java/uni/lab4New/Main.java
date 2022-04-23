package com.java.uni.lab4New;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = 0;
        int width = 0;
        int side = 0;
        int sideA = 0;
        int sideB = 0;
        int base = 0;
        int height = 0;
        int baseA = 0;
        int baseB = 0;
        int legC = 0;
        int legD = 0;

        int option;
        int figuresOption;
        int calculationOption;

        Rectangle rectangle = null;
        Square square = null;
        Triangle triangle = null;
        Trapezoid trapezoid = null;

        do {
            menu();
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    do {
                        figuresMenu();
                        figuresOption = scanner.nextInt();
                        switch (figuresOption) {
                            case 1:
                                rectangle = new Rectangle(length, width);
                                System.out.println("\n\nObject has been created!");
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
                                    System.out.println(rectangle.display());
                                } else
                                    System.out.println("\n\nError : This object does not exist! Try again.");
                            break;

                            case 0:
                                System.out.println("\n\nReturn to the main menu...");
                            break;

                            default:
                                System.out.println("\n\nWrong number. Try again!");
                        }
                    } while (figuresOption != 0);
                break;

                case 2:
                    do {
                        figuresMenu();
                        figuresOption = scanner.nextInt();
                        switch (figuresOption) {
                            case 1:
                                square = new Square(side);
                                System.out.println("\n\nObject has been created!");
                                break;

                            case 2:
                                if (square != null) {
                                    System.out.println("\n\nFill in the following info : ");
                                    square.enter();
                                } else
                                    System.out.println("\n\nError : This object does not exist! Try again.");
                                break;

                            case 3:
                                if (square != null) {
                                    System.out.println(square.display());
                                } else
                                    System.out.println("\n\nError : This object does not exist! Try again.");
                                break;

                            case 0:
                                System.out.println("\n\nReturn to the main menu...");
                                break;

                            default:
                                System.out.println("\n\nWrong number. Try again!");
                        }
                    } while (figuresOption != 0);
                break;

                case 3:
                    do {
                        calculationMenu();
                        calculationOption = scanner.nextInt();
                        switch (calculationOption) {
                            case 1:
                                do {
                                    figuresMenu();
                                    figuresOption = scanner.nextInt();
                                    switch (figuresOption) {
                                        case 1:
                                            triangle = new Triangle(sideA, sideB, base, height);
                                            System.out.println("\n\nObject has been created!");
                                            break;

                                        case 2:
                                            if (triangle != null) {
                                                System.out.println("\n\nFill in the following info : ");
                                                triangle.enter();
                                            } else
                                                System.out.println("\n\nError : This object does not exist! Try again.");
                                            break;

                                        case 3:
                                            if (triangle != null) {
                                                System.out.println(triangle.display());
                                            } else
                                                System.out.println("\n\nError : This object does not exist! Try again.");
                                            break;

                                        case 0:
                                            System.out.println("\n\nReturn to the main menu...");
                                            break;

                                        default:
                                            System.out.println("\n\nWrong number. Try again!");
                                    }
                                } while (figuresOption != 0);
                            break;

                            case 2:
                                do {
                                    figuresMenu();
                                    figuresOption = scanner.nextInt();
                                    switch (figuresOption) {
                                        case 1:
                                            trapezoid = new Trapezoid(baseA, baseB, legC, legD, height);
                                            System.out.println("\n\nObject has been created!");
                                            break;

                                        case 2:
                                            if (trapezoid != null) {
                                                System.out.println("\n\nFill in the following info : ");
                                                trapezoid.enter();
                                            } else
                                                System.out.println("\n\nError : This object does not exist! Try again.");
                                            break;

                                        case 3:
                                            if (trapezoid != null) {
                                                System.out.println(trapezoid.display());
                                            } else
                                                System.out.println("\n\nError : This object does not exist! Try again.");
                                            break;

                                        case 0:
                                            System.out.println("\n\nReturn to the main menu...");
                                            break;

                                        default:
                                            System.out.println("\n\nWrong number. Try again!");
                                    }
                                } while (figuresOption != 0);
                            break;
                        }
                    } while (calculationOption != 0);
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


                --- Lab 4 :  ---
                1. Rectangle
                2. Square
                3. Calculation (triangle & trapezoid)
                0. End""");
        System.out.print("Enter the number here : ");
    }

    public static void figuresMenu() {
        System.out.println("""


                --- Choose option :  ---
                1. Create an object
                2. Enter data
                3. Display data
                0. End""");
        System.out.print("Enter the number here : ");
    }

    public static void calculationMenu() {
        System.out.println("""


                --- Choose figure :  ---
                1. Triangle
                2. Trapezoid
                0. End""");
        System.out.print("Enter the number here : ");
    }
}