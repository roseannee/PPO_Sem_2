package com.java.uni.lab6;

public class Teacher extends Person {
    private String degree;

    public Teacher(String firstname, String lastname, int birthDate, String degree) {
        super(firstname, lastname, birthDate);
        this.degree = degree;
    }

    public String showNames() {
        return ("\n\nYour names are :" +
                "\n- firstname : " + getFirstname() +
                "\n- lastname : " + getLastname());
    }

    public void changeNames() {
        System.out.print("- firstname : ");
        setFirstname(scanner.next());
        System.out.print("- lastname : ");
        setLastname(scanner.next());
    }

    @Override
    public void enter() {
        super.enter();
        System.out.print("- degree : ");
        setDegree(scanner.next());
    }

    @Override
    public String display() {
        System.out.println(super.display());
        return ("- degree : " + getDegree());
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}