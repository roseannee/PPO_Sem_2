package com.java.uni.lab7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;
        int subOption;

        int sideA = 0;
        int sideB = 0;
        int sideC = 0;
        int radius = 0;

        Triangle triangle = null;
        Rectangle rectangle = null;
        Square square = null;
        Circle circle = null;
        Parallelogram parallelogram = null;
        Rhombus rhombus = null;
        List<Figure> list = new ArrayList<>();

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
                                triangle = new Triangle(sideA, sideB, sideC);
                                System.out.println("\n\nObject has been created!");
                            break;

                            case 2:
                                if (triangle != null) {
                                    System.out.println("\n\nFill in the following info : ");
                                    triangle.enter();

                                    list.add(triangle);

                                } else
                                    System.out.println("\n\nError : This object does not exist! Try again.");
                            break;

                            case 3:
                                if (triangle != null) {
                                    System.out.println("\n\nYou entered : ");
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
                    } while (subOption != 0);
                break;

                case 2:
                    do {
                        submenu();
                        subOption = scanner.nextInt();
                        switch (subOption) {
                            case 1:
                                rectangle = new Rectangle(sideA, sideB);
                                System.out.println("\n\nObject has been created!");
                                break;

                            case 2:
                                if (rectangle != null) {
                                    System.out.println("\n\nFill in the following info : ");
                                    rectangle.enter();

                                    list.add(rectangle);

                                } else
                                    System.out.println("\n\nError : This object does not exist! Try again.");
                                break;

                            case 3:
                                if (rectangle != null) {
                                    System.out.println("\n\nYou entered : ");
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
                    } while (subOption != 0);
                break;

                case 3:
                    do {
                        submenu();
                        subOption = scanner.nextInt();
                        switch (subOption) {
                            case 1:
                                square = new Square(sideA);
                                System.out.println("\n\nObject has been created!");
                                break;

                            case 2:
                                if (square != null) {
                                    System.out.println("\n\nFill in the following info : ");
                                    square.enter();

                                    list.add(square);
                                } else
                                    System.out.println("\n\nError : This object does not exist! Try again.");
                                break;

                            case 3:
                                if (square != null) {
                                    System.out.println("\n\nYou entered : ");
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
                    } while (subOption != 0);
                break;

                case 4:
                    do {
                        submenu();
                        subOption = scanner.nextInt();
                        switch (subOption) {
                            case 1:
                                circle = new Circle(radius);
                                System.out.println("\n\nObject has been created!");
                                break;

                            case 2:
                                if (circle != null) {
                                    System.out.println("\n\nFill in the following info : ");
                                    circle.enter();

                                    list.add(circle);
                                } else
                                    System.out.println("\n\nError : This object does not exist! Try again.");
                                break;

                            case 3:
                                if (circle != null) {
                                    System.out.println("\n\nYou entered : ");
                                    System.out.println(circle.display());
                                } else
                                    System.out.println("\n\nError : This object does not exist! Try again.");
                                break;

                            case 0:
                                System.out.println("\n\nReturn to the main menu...");
                                break;

                            default:
                                System.out.println("\n\nWrong number. Try again!");
                        }
                    } while (subOption != 0);
                break;

                case 5:
                    do {
                        submenu();
                        subOption = scanner.nextInt();
                        switch (subOption) {
                            case 1:
                                parallelogram = new Parallelogram(sideA, sideB);
                                System.out.println("\n\nObject has been created!");
                                break;

                            case 2:
                                if (parallelogram != null) {
                                    System.out.println("\n\nFill in the following info : ");
                                    parallelogram.enter();

                                    list.add(parallelogram);

                                } else
                                    System.out.println("\n\nError : This object does not exist! Try again.");
                                break;

                            case 3:
                                if (parallelogram != null) {
                                    System.out.println("\n\nYou entered : ");
                                    System.out.println(parallelogram.display());
                                } else
                                    System.out.println("\n\nError : This object does not exist! Try again.");
                                break;

                            case 0:
                                System.out.println("\n\nReturn to the main menu...");
                                break;

                            default:
                                System.out.println("\n\nWrong number. Try again!");
                        }
                    } while (subOption != 0);
                break;

                case 6:
                    do {
                        submenu();
                        subOption = scanner.nextInt();
                        switch (subOption) {
                            case 1:
                                rhombus = new Rhombus(sideA, sideB);
                                System.out.println("\n\nObject has been created!");
                                break;

                            case 2:
                                if (rhombus != null) {
                                    System.out.println("\n\nFill in the following info : ");
                                    rhombus.enter();

                                    list.add(rhombus);

                                } else
                                    System.out.println("\n\nError : This object does not exist! Try again.");
                                break;

                            case 3:
                                if (rhombus != null) {
                                    System.out.println("\n\nYou entered : ");
                                    System.out.println(rhombus.display());
                                } else
                                    System.out.println("\n\nError : This object does not exist! Try again.");
                                break;

                            case 0:
                                System.out.println("\n\nReturn to the main menu...");
                                break;

                            default:
                                System.out.println("\n\nWrong number. Try again!");
                        }
                    } while (subOption != 0);
                break;

                case 7:
                    System.out.println("\n\n");
                    for (Figure i : list) {
                        System.out.println(i.display());
                        System.out.println("------------------");
                    }
                    System.out.println();
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


                --- Lab 7 :  ---
                1. Triangle
                2. Rectangle
                3. Square
                4. Circle
                5. Parallelogram
                6. Rhombus
                7. List
                0. End""");
        System.out.print("Enter the number here : ");
    }

    public static void submenu() {
        System.out.println("""


                --- Choose option :  ---
                1. Create an object
                2. Enter data
                3. Display data
                0. End""");
        System.out.print("Enter the number here : ");
    }
}
