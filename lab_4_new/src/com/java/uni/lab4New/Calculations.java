package com.java.uni.lab4New;

public class Calculations {
    public static double triangleArea(double base, double height) {
        return (base * height) / 2;
    }

    public static int trianglePerimeter(int sideA, int sideB, int base) {
        return sideA + sideB + base;
    }

    public static double trapezoidArea(double baseA, double baseB, double height) {
        return ((baseA + baseB) / 2) * height;
    }

    public static int trapezoidPerimeter(int baseA, int baseB, int legC, int legD) {
        return baseA + baseB + legC + legD;
    }
}