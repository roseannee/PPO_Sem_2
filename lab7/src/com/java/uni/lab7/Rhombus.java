package com.java.uni.lab7;


public class Rhombus extends Parallelogram {
    public Rhombus(int sideA, int height) {
        super(sideA, height);
    }

    @Override
    public void enter() {
        super.enter();
    }

    @Override
    public String display() {
        return ("- figure name : " + Rhombus.class.getSimpleName() +
                "\n- side a : " + getSideA() +
                "\n- height : " + getSideB() +
                "\n- area : " + area() +
                "\n- perimeter : " + perimeter());
    }

    @Override
    public float area() {
        return super.area();
    }

    @Override
    public float perimeter() {
        return 4 * getSideA();
    }
}
