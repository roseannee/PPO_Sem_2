package com.java.uni.lab7;

import java.util.Scanner;

public class Parallelogram extends Polygon {
    Scanner scanner = new Scanner(System.in);

    public Parallelogram(int sideA, int height) {
        super(sideA, height);
    }

    @Override
    public void enter() {
        System.out.print("- side a : ");
        setSideA(scanner.nextInt());
        System.out.print("- height : ");
        setSideB(scanner.nextInt());
    }

    @Override
    public String display() {
        return ("- figure name : " + Parallelogram.class.getSimpleName() +
                "\n- side a : " + getSideA() +
                "\n- height : " + getSideB() +
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
