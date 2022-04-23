package com.java.uni.lab7;

public abstract class Polygon extends Figure {
    private int sideA;
    private int sideB;
    private int sideC;

    public Polygon(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Polygon(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Polygon(int sideA) {
        this.sideA = sideA;
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

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }
}
