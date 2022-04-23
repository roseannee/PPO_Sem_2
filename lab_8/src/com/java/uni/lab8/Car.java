package com.java.uni.lab8;

import java.util.Scanner;

public class Car implements Description {
    Scanner scanner = new Scanner(System.in);

    private String brand;
    private String model;
    private int year;
    private String color;
    private float accelerationTime;

    public Car(String brand, String model, int year, String color, float accelerationTime) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.accelerationTime = accelerationTime;
    }

    public void enter() {
        System.out.print("- brand : ");
        setBrand(scanner.next());
        System.out.print("- model : ");
        setModel(scanner.next());
        System.out.print("- year : ");
        setYear(scanner.nextInt());
        System.out.print("- color : ");
        setColor(scanner.next());
        System.out.print("- acceleration time : ");
        setAccelerationTime(scanner.nextFloat());
    }

    @Override
    public String shortDesc() {
        return (Car.class.getSimpleName() + " : " + brand + " " + model + "; year - " + year +
                "; acceleration time to 100 km/h - " + getAccelerationTime() + " sec");
    }

    @Override
    public String longDesc() {
        return (Car.class.getSimpleName() + " :" +
                "\n- brand : " + getBrand() +
                "\n- model : " + getModel() +
                "\n- year : " +  getYear() +
                "\n- color : " + getColor() +
                "\n- acceleration time to 100 km/h : " + getAccelerationTime()) + " sec";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getAccelerationTime() {
        return accelerationTime;
    }

    public void setAccelerationTime(float accelerationTime) {
        this.accelerationTime = accelerationTime;
    }
}
