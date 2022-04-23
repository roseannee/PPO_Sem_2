package com.java.uni.lab5;

import java.util.Calendar;
import java.util.Scanner;

public class Person {
    Scanner scanner = new Scanner(System.in);

    private String firstname;
    private String lastname;
    private int tempBirthDate;
    private String address;

    private char lastLetter;

    public Person(String firstname, String lastname, int birthDate, String address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.tempBirthDate = birthDate;
        this.address = address;
    }

    public void enter() {
        System.out.print("- firstname : ");
        setFirstname(scanner.next());
        System.out.print("- lastname : ");
        setLastname(scanner.next());
        System.out.print("- birth date : ");
        setTempBirthDate(scanner.nextInt());
        System.out.print("- address : ");
        setAddress(scanner.next());
    }

    public String display() {
        return ("\n\nYou entered :" +
                "\n- firstname : " + getFirstname() +
                "\n- lastname : " + getLastname() +
                "\n- full name : " +  getFullName() +
                "\n- birth date : " + getTempBirthDate() +
                "\n- age : " + calcAge() +
                "\n- address : " + getAddress());
    }

    public String getFullName() {
        return firstname + " " + lastname;
    }

    public int calcAge() {
        final int birthDate = tempBirthDate;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - birthDate;
    }

    public void setLastLetter(char lastLetter) {
        this.lastLetter = lastLetter;
    }

    public void setAddressNewLastChar() {
        address = address.replace(address.charAt(address.length() - 1), lastLetter);
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

    public int getTempBirthDate() {
        return tempBirthDate;
    }

    public void setTempBirthDate(int tempBirthDate) {
        this.tempBirthDate = tempBirthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}