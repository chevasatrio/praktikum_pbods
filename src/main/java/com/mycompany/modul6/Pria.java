/*
 * Praktikum PBO - Modul 6: Inheritance
 * Nama  : Rifqi Reissal Arasy
 * NIM   : 1201230038
 *
 * File  : Pria.java
 * Desc  : Subclass Pria — mewarisi Manusia, menambah field & method sendiri.
 *         Demonstrasi: keyword "extends" dan keyword "super" (6.2, 6.3).
 */
package com.mycompany.modul6;

// ===== 6.2 INHERITANCE =====

// Pria adalah SUBCLASS (kelas turunan / derived class) dari Manusia.
// Kata kunci "extends" menyatakan hubungan pewarisan.
// Pria mewarisi semua field (nama, usia) dan method (sapa, perkenalan) dari Manusia.
public class Pria extends Manusia {

    // Field tambahan yang HANYA dimiliki Pria, tidak ada di Manusia
    String pekerjaan;

    // ===== 6.3 KEYWORD SUPER =====

    // Constructor Pria memanggil constructor Manusia dengan "super(nama, usia)".
    // super() WAJIB dipanggil di baris pertama constructor subclass
    // agar field superclass terinisialisasi dengan benar.
    public Pria(String nama, int usia, String pekerjaan) {
        super(nama, usia); // memanggil constructor Manusia
        this.pekerjaan = pekerjaan;
    }

    // ===== 6.5 OVERRIDING METHOD =====

    // Method perkenalan() di sini meng-OVERRIDE method yang sama dari Manusia.
    // Saat objek Pria memanggil perkenalan(), versi inilah yang dieksekusi,
    // bukan versi milik Manusia.
    @Override
    public void perkenalan() {
        // super.perkenalan() memanggil versi METHOD milik superclass (Manusia) terlebih dulu
        super.perkenalan();
        System.out.println("[Pria] Saya bekerja sebagai " + pekerjaan + ".");
    }
}
