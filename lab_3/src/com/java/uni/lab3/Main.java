package com.java.uni.lab3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;

        Array array = null;

        do {
            menu();
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    try {
                        array = new Array();

                        System.out.print("\n\nEnter the array size : ");
                        array.setArraySize();

                    } catch (NegativeArraySizeException e) {
                        System.out.println("\n\nError : Array size is negative. Try again!");
                    }
                break;

                case 2:
                    try {
                        assert array != null;

                        array.outputArray();

                    } catch (NullPointerException e) {
                        System.out.println("\n\nError : Array is empty. Try again!");
                    }
                break;

                case 3:
                    try {
                        assert array != null;

                        System.out.print("\n\nEnter the start number : ");
                        array.fillArray();

                    } catch (NullPointerException e) {
                        System.out.println("\n\nError : Array is empty. Try again!");
                    }
                break;

                case 4:
                    try {
                        assert array != null;

                        array.outputArray();

                        System.out.print("\nEnter the position : ");
                        array.position = scanner.nextInt();
                        System.out.print("Enter new number : ");
                        array.newNumber = scanner.nextInt();

                        array.newNumberPosition();

                    } catch (NullPointerException e) {
                        System.out.println("\n\nError : Array is empty. Try again!");
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("\n\nError : Position index is out of bounds for length " + array.array.length);
                    }
                break;

                case 5:
                    try {
                        assert array != null;

                        array.outputArray();

                        array.calcSumAverage();
                        System.out.println("\nSum = " + array.sum +
                                "\nAverage = " + array.average);
                    } catch (NullPointerException e) {
                        System.out.println("\n\nError : Array is empty. Try again!");
                    }
                break;

                case 6:
                    try {
                        assert array != null;

                        array.outputArray();

                        array.findMinMax();
                        System.out.println("\nMin = " + array.min +
                                "\nMax = " + array.max);
                    } catch (NullPointerException e) {
                        System.out.println("\n\nError : Array is empty. Try again!");
                    }
                break;

                case 7:
                    try {
                        assert array != null;

                        array.outputArray();

                        System.out.print("\n\nEnter the starting position : ");
                        array.intervalA = scanner.nextInt();
                        System.out.print("Enter the final position : ");
                        array.intervalB = scanner.nextInt();
                        System.out.print("Enter the number : ");
                        array.intervalNumber = scanner.nextInt();

                        array.fillNumberInterval();

                    } catch (NullPointerException e) {
                        System.out.println("\n\nError : Array is empty. Try again!");
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("\n\nError : Position index is out of bounds for length " + array.array.length);
                    }
                break;

                case 8:
                    try {
                        assert array != null;

                        array.outputArray();

                        System.out.print("\n\nIncrease the array by (elements) : ");
                        array.increaseArray();

                    } catch (NullPointerException e) {
                        System.out.println("\n\nError : Array is empty. Try again!");
                    } catch (IllegalArgumentException e) {
                        System.out.println("\n\nError : Argument is less than zero");
                    }
                break;

                case 9:
                    try {
                        assert array != null;

                        array.outputArray();

                        System.out.print("\n\nDecrease the array by (elements) : ");
                        array.decreaseArray();
                    } catch (NullPointerException e) {
                        System.out.println("\n\nError : Array is empty. Try again!");
                    } catch (IllegalArgumentException e) {
                        System.out.println("\n\nError : Argument is less than zero");
                    }
                break;

                case 10:
                    array = null;

                    System.out.println("\n\n---Success!");
                break;

                default:
                    System.out.println("\n\nWrong number. Try again!");
            }
        } while (option != 0);
    }

    public static void menu () {
        System.out.println("""


                --- Lab 3 :  ---
                1. Enter the array size
                2. Output
                3. Enter the number you want to start array with
                4. Enter new number at the specific position
                5. Calculate the sum & average
                6. Find min & max
                7. Enter the number from a to b
                8. Increase the array
                9. Decrease the array
                10. Delete the array
                0. End""");
        System.out.print("Enter the number here : ");
    }
}