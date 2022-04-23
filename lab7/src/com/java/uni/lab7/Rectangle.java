package com.java.uni.lab7;

import java.util.Scanner;

public class Rectangle extends Polygon {
    Scanner scanner = new Scanner(System.in);

    public Rectangle(int sideA, int sideB) {
        super(sideA, sideB);
    }

    @Override
    public void enter() {
        System.out.print("- side a : ");
        setSideA(scanner.nextInt());
        System.out.print("- side b : ");
        setSideB(scanner.nextInt());
    }

    @Override
    public String display() {
        return ("- figure name : " + Rectangle.class.getSimpleName() +
                "\n- side a : " + getSideA() +
                "\n- side b : " + getSideB() +
                "\n- area : " + area() +
                "\n- perimeter : " + perimeter());
    }

    @Override
    public float area() {
        return getSideA() * getSideB();
    }

    @Override
    public float perimeter() {
        return 2 * (getSideA() + getSideB());
    }
}
