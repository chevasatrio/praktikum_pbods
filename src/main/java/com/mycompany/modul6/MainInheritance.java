/*
 * Praktikum PBO - Modul 6: Inheritance
 * Nama  : Rifqi Reissal Arasy
 * NIM   : 1201230038
 *
 * File  : MainInheritance.java
 * Desc  : Main class — menjalankan semua demo Modul 6:
 *         6.2 Inheritance, 6.3 Keyword super, 6.4 Overloading, 6.5 Overriding.
 */
package com.mycompany.modul6;

public class MainInheritance {

    public static void main(String[] args) {

        // ===== 6.2 INHERITANCE — Demo Dasar =====
        System.out.println("========================================");
        System.out.println("  6.2 INHERITANCE (Pewarisan)");
        System.out.println("========================================");

        // Objek Manusia hanya punya field dan method milik Manusia sendiri
        Manusia manusia = new Manusia("Budi", 40);
        manusia.sapa(); // method dari Manusia

        // Objek Pria mewarisi field (nama, usia) dan method (sapa) dari Manusia,
        // sekaligus punya field tambahan sendiri (pekerjaan).
        Pria pria = new Pria("Anton", 25, "Programmer");
        pria.sapa();        // method WARISAN dari Manusia — masih bisa dipanggil
        System.out.println("Pekerjaan: " + pria.pekerjaan); // field TAMBAHAN milik Pria

        Wanita wanita = new Wanita("Sari", 22, "Melukis");
        wanita.sapa();      // method WARISAN dari Manusia
        System.out.println("Hobi: " + wanita.hobi); // field TAMBAHAN milik Wanita

        System.out.println();

        // ===== 6.3 KEYWORD SUPER — Demo =====
        System.out.println("========================================");
        System.out.println("  6.3 KEYWORD SUPER");
        System.out.println("========================================");
        // super() di constructor memanggil constructor Manusia (lihat Pria.java & Wanita.java).
        // super.method() di dalam method memanggil versi method dari superclass.
        // Untuk melihat aksi super secara langsung, lihat di method perkenalan() di bawah (6.5).
        System.out.println("(super() digunakan di constructor Pria & Wanita — lihat source code)");
        System.out.println("(super.perkenalan() digunakan dalam overriding — lihat demo 6.5)");

        System.out.println();

        // ===== 6.4 OVERLOADING METHOD — Demo =====
        System.out.println("========================================");
        System.out.println("  6.4 OVERLOADING METHOD");
        System.out.println("========================================");

        Lagu d = new Lagu();
        Lagu e = new Lagu();

        // Java memilih IsiParam(String) karena hanya 1 argumen dikirim
        d.IsiParam("Lagu 1");

        // Java memilih IsiParam(String, String) karena 2 argumen dikirim
        e.IsiParam("Kepastian yang Kutunggu", "GiGi");

        d.CetakKeLayar();
        e.CetakKeLayar();

        System.out.println();

        // ===== 6.5 OVERRIDING METHOD — Demo =====
        System.out.println("========================================");
        System.out.println("  6.5 OVERRIDING METHOD");
        System.out.println("========================================");

        // Manusia.perkenalan() — versi ASLI superclass
        manusia.perkenalan();
        System.out.println();

        // Pria.perkenalan() — versi OVERRIDE: memanggil super.perkenalan() lalu tambah info sendiri
        pria.perkenalan();
        System.out.println();

        // Wanita.perkenalan() — versi OVERRIDE: memanggil super.perkenalan() lalu tambah info sendiri
        wanita.perkenalan();

        System.out.println();
        System.out.println("========================================");
        System.out.println("  Modul 6 Inheritance — SELESAI");
        System.out.println("========================================");
    }
}
