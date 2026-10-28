package com.mycompany.modul7;

public class SalariedEmployee extends Employee {

    private double weeklySalary;

    // Konstruktor empat argumen
    public SalariedEmployee(String first, String last, String ssn, double salary) {
        super(first, last, ssn); // kirim ke konstruktor Employee
        setWeeklySalary(salary); // validasi lalu simpan gaji
    }

    // Gaji tidak boleh negatif
    public void setWeeklySalary(double salary) {
        weeklySalary = salary < 0.0 ? 0.0 : salary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    // Mengisi method abstract earnings() milik Employee
    public double earnings() {
        return getWeeklySalary();
    }

    public String toString() {
        return String.format("salaried employee: %s\n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    }
}