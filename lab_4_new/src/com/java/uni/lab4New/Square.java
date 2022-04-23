package com.java.uni.lab4New;

import java.util.Scanner;

public class Square {
    Scanner scanner = new Scanner(System.in);

    private int side;

    public Square() {

    }

    public Square(int side) {
        this.side = side;
    }

    public void enter() {
        System.out.print("- side : ");
        setSide(scanner.nextInt());

        if (side <= 0)
            System.out.println("\n\nError : Positive numbers only!");
    }

    public static void className() {
        System.out.println("\n\nThe Class Name is : " + Square.class.getName());
        System.out.println("The simple Class Name is : " + Square.class.getSimpleName());
    }

    public String display() {
        String output = "";

        if (side <= 0)
            System.out.println("\n\nError : Positive numbers only!");
        else {
            className();
            output = "\nOutput :" +
                    "\n- figure name : Square" +
                    "\n- side = " + getSide() + " cm" +
                    "\n- area = " + area() + " cm^2" +
                    "\n- perimeter = " + perimeter() + " cm";
        }
        return output;
    }

    public double area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
