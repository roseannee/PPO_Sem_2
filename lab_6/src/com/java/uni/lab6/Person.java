package com.java.uni.lab6;

import java.util.Scanner;

public class Person {
    Scanner scanner = new Scanner(System.in);

    private String firstname;
    private String lastname;
    private int birthDate;

    public Person(String firstname, String lastname, int birthDate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthDate;
    }

    public void enter() {
        System.out.print("- firstname : ");
        setFirstname(scanner.next());
        System.out.print("- lastname : ");
        setLastname(scanner.next());
        System.out.print("- birth date : ");
        setBirthDate(scanner.nextInt());
    }

    public String display() {
        return ("\n\nYou entered :" +
                "\n- firstname : " + getFirstname() +
                "\n- lastname : " + getLastname() +
                "\n- birth date : " + getBirthDate());
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }
}
