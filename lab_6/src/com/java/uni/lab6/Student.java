package com.java.uni.lab6;

public class Student extends Person {
    private int albumNumber;
    private int recruitmentYear;

    public Student(String firstname, String lastname, int birthDate, int albumNumber, int recruitmentYear) {
        super(firstname, lastname, birthDate);
        this.albumNumber = albumNumber;
        this.recruitmentYear = recruitmentYear;
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
        System.out.print("- album number : ");
        setAlbumNumber(scanner.nextInt());
        System.out.print("- recruitment year : ");
        setRecruitmentYear(scanner.nextInt());
    }

    @Override
    public String display() {
        System.out.println(super.display());
        return ("- album number : " + getAlbumNumber() +
                "\n- recruitment year : " + getRecruitmentYear());
    }

    public int getAlbumNumber() {
        return albumNumber;
    }

    public void setAlbumNumber(int albumNumber) {
        this.albumNumber = albumNumber;
    }

    public int getRecruitmentYear() {
        return recruitmentYear;
    }

    public void setRecruitmentYear(int recruitmentYear) {
        this.recruitmentYear = recruitmentYear;
    }
}
