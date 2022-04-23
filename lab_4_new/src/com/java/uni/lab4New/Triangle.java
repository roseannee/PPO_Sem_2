package com.java.uni.lab4New;

import java.util.Scanner;

public class Triangle {
    Scanner scanner = new Scanner(System.in);

    private int sideA;
    private int sideB;
    private int base;
    private int height;

    public Triangle(int sideA, int sideB, int base, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.base = base;
        this.height = height;
    }

    public void enter() {
        System.out.print("- side a : ");
        setSideA(scanner.nextInt());
        System.out.print("- side b : ");
        setSideB(scanner.nextInt());
        System.out.print("- base : ");
        setBase(scanner.nextInt());
        System.out.print("- height : ");
        setHeight(scanner.nextInt());

        if (sideA <= 0 || sideB <= 0 || base <= 0 || height <= 0)
            System.out.println("\n\nError : Positive numbers only!");
    }

    public String display() {
        String output = "";

        if (sideA <= 0 || sideB <= 0 || base <= 0 || height <= 0)
            System.out.println("\n\nError : Positive numbers only!");
        else {
            output = "\n\nOutput :" +
                    "\n- figure name : Triangle" +
                    "\n- side a = " + getSideA() + " cm" +
                    "\n- side b = " + getSideB() + " cm" +
                    "\n- base = " + getBase() + " cm" +
                    "\n- height = " + getHeight() + " cm" +
                    "\n- area = " + Calculations.triangleArea(base, height) + " cm^2" +
                    "\n- perimeter = " + Calculations.trianglePerimeter(sideA, sideB, base) + " cm";
        }
        return output;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}