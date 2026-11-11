package com.mycompany.modul9;

/**
 * Superclass untuk demo Polymorphism (Upcasting & Downcasting).
 * Hewan adalah tipe umum — subclass (Kucing, Burung) punya perilaku spesifik.
 *
 * Nama   : Rifqi Reissal Arasy
 * NIM    : 1201230038
 */
public class Hewan {

    String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    // Method umum yang bisa di-override subclass (dasar polymorphism)
    public void suara() {
        System.out.println(nama + " mengeluarkan suara.");
    }
}
