package com.java.uni.lab7;

import java.util.Scanner;

public class Circle extends Figure{
    Scanner scanner = new Scanner(System.in);

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void enter() {
        System.out.print("- radius : ");
        setRadius(scanner.nextInt());
    }

    @Override
    public String display() {
        return ("- figure name : " + Circle.class.getSimpleName() +
                "\n- radius : " + getRadius() +
                "\n- area : " + area() +
                "\n- perimeter : " + perimeter());
    }

    @Override
    public float area() {
        return (float) (Math.PI * getRadius() * getRadius());
    }

    @Override
    public float perimeter() {
        return (float) (2 * Math.PI * getRadius());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
