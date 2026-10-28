package com.mycompany.modul7;

public class MainAbstract {
    public static void main(String[] args) {
        SalariedEmployee pegawai = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);

        System.out.println(pegawai);
        System.out.printf("Penghasilan : $%,.2f%n", pegawai.earnings());

        // Variabel class abstrak BOLEH menunjuk objek turunannya
        Employee e = pegawai;
        System.out.printf("Lewat variabel Employee : $%,.2f%n", e.earnings());

        // Employee x = new Employee("A", "B", "C"); // ERROR: Employee is abstract
    }
}