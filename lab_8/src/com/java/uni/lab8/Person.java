package com.java.uni.lab8;

import java.util.Calendar;
import java.util.Scanner;

public class Person implements Description {
    Scanner scanner = new Scanner(System.in);

    private String firstname;
    private String lastname;
    private int birthDate;
    private String address;

    public Person(String firstname, String lastname, int birthDate, String address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.address = address;
    }

    public void enter() {
        System.out.print("- firstname : ");
        setFirstname(scanner.next());
        System.out.print("- lastname : ");
        setLastname(scanner.next());
        System.out.print("- birth date : ");
        setBirthDate(scanner.nextInt());
        System.out.print("- address : ");
        setAddress(scanner.next());
    }

    public int calcAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - birthDate;
    }

    public String getFullName() {
        return firstname + " " + lastname;
    }

    @Override
    public String shortDesc() {
        return (Person.class.getSimpleName() + " : initials - " + getFirstname().charAt(0) + ". " + getLastname().charAt(0) +
                ".; age - " + calcAge() + "; address - " + getAddress());
    }

    @Override
    public String longDesc() {
        return (Person.class.getSimpleName() + " :" +
                "\n- firstname : " + getFirstname() +
                "\n- lastname : " + getLastname() +
                "\n- full name : " +  getFullName() +
                "\n- birth date : " + getBirthDate() +
                "\n- age : " + calcAge() +
                "\n- address : " + getAddress());
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
