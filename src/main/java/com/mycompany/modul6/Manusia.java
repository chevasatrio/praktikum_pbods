/*
 * Praktikum PBO - Modul 6: Inheritance
 * Nama  : Rifqi Reissal Arasy
 * NIM   : 1201230038
 *
 * File  : Manusia.java
 * Desc  : Superclass Manusia — kelas induk yang akan diwariskan ke Pria dan Wanita.
 *         Sesuai contoh di buku modul (6.1 Pendahuluan & 6.2 Inheritance).
 */
package com.mycompany.modul6;

// ===== 6.2 INHERITANCE =====

// Kelas Manusia adalah SUPERCLASS (kelas induk / base class).
// Field dan method di sini akan otomatis diwarisi oleh semua subclass-nya.
public class Manusia {

    // Field umum yang dimiliki semua manusia
    String nama;
    int    usia;

    // Constructor: dipanggil saat objek Manusia (atau turunannya) dibuat
    public Manusia(String nama, int usia) {
        this.nama  = nama;
        this.usia  = usia;
    }

    // Method umum — bisa dipanggil dari objek Manusia maupun subclass-nya
    public void sapa() {
        System.out.println("Halo, nama saya " + nama + ", usia " + usia + " tahun.");
    }

    // Method ini akan di-OVERRIDE oleh subclass (lihat 6.5)
    public void perkenalan() {
        System.out.println("[Manusia] " + nama + " memperkenalkan diri.");
    }
}
