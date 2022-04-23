package com.java.uni.lab4New;

import java.util.Scanner;

public class Rectangle {
    Scanner scanner = new Scanner(System.in);

    private int length;
    private int width;

    public Rectangle() {

    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void enter() {
        System.out.print("- length : ");
        setLength(scanner.nextInt());
        System.out.print("- width : ");
        setWidth(scanner.nextInt());

        if (length <= 0 || width <= 0)
            System.out.println("\n\nError : Positive numbers only!");
    }

    public static void className() {
        System.out.println("\n\nThe Class Name is : " + Rectangle.class.getName());
        System.out.println("The simple Class Name is : " + Rectangle.class.getSimpleName());
    }

    public String display() {
        String output = "";

        if (length <= 0 || width <= 0)
            System.out.println("\n\nError : Positive numbers only!");
        else {
            className();
            output = "\nOutput :" +
                    "\n- figure name : Rectangle" +
                    "\n- length = " + getLength() + " cm" +
                    "\n- width = " + getWidth() + " cm" +
                    "\n- area = " + area(length, width) + " cm^2" +
                    "\n- perimeter = " + perimeter(length, width) + " cm";
        }
        return output;
    }

    public double area(int length, int width) {
        return length * width;
    }

    public int perimeter(int length, int width) {
        return 2 * (length + width);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
