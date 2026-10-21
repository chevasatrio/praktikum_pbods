/*
 * Praktikum PBO - Modul 6: Inheritance
 * Nama  : Rifqi Reissal Arasy
 * NIM   : 1201230038
 *
 * File  : Wanita.java
 * Desc  : Subclass Wanita — mewarisi Manusia, menambah field & method sendiri.
 *         Demonstrasi: keyword "extends", keyword "super", dan overriding (6.2, 6.3, 6.5).
 */
package com.mycompany.modul6;

// ===== 6.2 INHERITANCE =====

// Wanita juga merupakan subclass dari Manusia.
// Ini menggambarkan hierarki: Manusia → Pria / Wanita
// seperti ilustrasi di buku (Gambar 6-1).
public class Wanita extends Manusia {

    // Field tambahan khusus Wanita
    String hobi;

    // ===== 6.3 KEYWORD SUPER =====

    // Constructor memanggil super(nama, usia) untuk menginisialisasi field dari Manusia.
    public Wanita(String nama, int usia, String hobi) {
        super(nama, usia); // memanggil constructor Manusia
        this.hobi = hobi;
    }

    // ===== 6.5 OVERRIDING METHOD =====

    // Method perkenalan() di-override — versi Wanita menggantikan versi Manusia.
    @Override
    public void perkenalan() {
        super.perkenalan(); // tetap panggil versi superclass dulu
        System.out.println("[Wanita] Hobi saya adalah " + hobi + ".");
    }
}
