package com.mycompany.modul7;

public abstract class Employee implements Payable {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    // Konstruktor dengan tiga argumen
    public Employee(String first, String last, String ssn) {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
    }

    public void setFirstName(String first) {
        firstName = first;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String last) {
        lastName = last;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSocialSecurityNumber(String ssn) {
        socialSecurityNumber = ssn;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // Representasi String dari objek Employee
    public String toString() {
        return String.format("%s %s\nsocial security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }

    // METHOD ABSTRACT: tidak ada isi, wajib di-override oleh turunan
    public abstract double earnings();

    // [PRAKTIK 2] Memenuhi "kontrak" interface Payable
    public double getPaymentAmount() {
        return earnings();
    }
}