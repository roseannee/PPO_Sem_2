package com.java.uni.lab7;

import java.util.Scanner;

public class Square extends Polygon {
    Scanner scanner = new Scanner(System.in);

    public Square(int sideA) {
        super(sideA);
    }

    @Override
    public void enter() {
        System.out.print("- side a : ");
        setSideA(scanner.nextInt());
    }

    @Override
    public String display() {
        return ("- figure name : " + Square.class.getSimpleName() +
                "\n- side a : " + getSideA() +
                "\n- area : " + area() +
                "\n- perimeter : " + perimeter());
    }

    @Override
    public float area() {
        return getSideA() * getSideA();
    }

    @Override
    public float perimeter() {
        return 4 * getSideA();
    }
}
