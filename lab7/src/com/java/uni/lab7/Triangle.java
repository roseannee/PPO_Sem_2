package com.java.uni.lab7;

import java.util.Scanner;

public class Triangle extends Polygon {
    Scanner scanner = new Scanner(System.in);

    public Triangle(int sideA, int sideB, int sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    public void enter() {
        System.out.print("- side a : ");
        setSideA(scanner.nextInt());
        System.out.print("- side b : ");
        setSideB(scanner.nextInt());
        System.out.print("- side c : ");
        setSideC(scanner.nextInt());
    }

    @Override
    public String display() {

        return ("- figure name : " + Triangle.class.getSimpleName() +
                "\n- side a : " + getSideA() +
                "\n- side b : " + getSideB() +
                "\n- side c : " + getSideC() +
                "\n- area : " + area() +
                "\n- perimeter : " + perimeter());
    }

    @Override
    public float area() {
        float p = perimeter() / 2;
        return (float) Math.sqrt(p * (p - getSideA()) * (p - getSideB()) * (p - getSideC()));
    }

    @Override
    public float perimeter() {
        return getSideA() + getSideB() + getSideC();
    }
}
