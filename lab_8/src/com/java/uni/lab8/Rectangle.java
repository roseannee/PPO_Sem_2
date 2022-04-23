package com.java.uni.lab8;

import java.util.Scanner;

public class Rectangle implements Description {
    Scanner scanner = new Scanner(System.in);

    private int length;
    private int width;

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

    public float area() {
        return length * width;
    }

    public float perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String shortDesc() {
        return (Rectangle.class.getSimpleName() + " : " + "area = " + area() + " cm^2" +
                "; perimeter = " + perimeter() + " cm");
    }

    @Override
    public String longDesc() {
        return ("- figure name : " + Rectangle.class.getSimpleName() +
                "\n- length : " + getLength() + " cm" +
                "\n- width : " + getWidth() + " cm" +
                "\n- area : " + area() + " cm^2" +
                "\n- perimeter : " + perimeter() + " cm");
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
