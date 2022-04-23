package com.java.uni.lab4New;

import java.util.Scanner;

public class Trapezoid {
    Scanner scanner = new Scanner(System.in);

    private int baseA;
    private int baseB;
    private int legC;
    private int legD;
    private int height;

    public Trapezoid (int baseA, int baseB, int legC, int legD, int height) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.legC = legC;
        this.legD = legD;
        this.height = height;
    }

    public void enter() {
        System.out.print("- base a : ");
        setBaseA(scanner.nextInt());
        System.out.print("- base b : ");
        setBaseB(scanner.nextInt());
        System.out.print("- leg c : ");
        setLegC(scanner.nextInt());
        System.out.print("- leg d : ");
        setLegD(scanner.nextInt());
        System.out.print("- height : ");
        setHeight(scanner.nextInt());

        if (baseA <= 0 || baseB <= 0 || legC <= 0 || legD <= 0)
            System.out.println("\n\nError : Positive numbers only!");
    }

    public String display() {
        String output = "";

        if (baseA <= 0 || baseB <= 0 || legC <= 0 || legD <= 0)
            System.out.println("\n\nError : Positive numbers only!");
        else {
            output = "\n\nOutput :" +
                    "\n- figure name : Trapezoid" +
                    "\n- base a = " + getBaseA() + " cm" +
                    "\n- base b = " + getBaseB() + " cm" +
                    "\n- leg c = " + getLegC() + " cm" +
                    "\n- leg d = " + getLegD() + " cm" +
                    "\n- height = " + getHeight() + " cm" +
                    "\n- area = " + Calculations.trapezoidArea(baseA, baseB, height) + " cm^2" +
                    "\n- perimeter = " + Calculations.trapezoidPerimeter(baseA, baseB, legC, legD) + " cm";
        }
        return output;
    }

    public int getBaseA() {
        return baseA;
    }

    public void setBaseA(int baseA) {
        this.baseA = baseA;
    }

    public int getBaseB() {
        return baseB;
    }

    public void setBaseB(int baseB) {
        this.baseB = baseB;
    }

    public int getLegC() {
        return legC;
    }

    public void setLegC(int legC) {
        this.legC = legC;
    }

    public int getLegD() {
        return legD;
    }

    public void setLegD(int legD) {
        this.legD = legD;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
