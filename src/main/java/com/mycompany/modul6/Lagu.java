/*
 * Praktikum PBO - Modul 6: Inheritance
 * Nama  : Rifqi Reissal Arasy
 * NIM   : 1201230038
 *
 * File  : Lagu.java
 * Desc  : Demonstrasi Overloading Method (6.4) — method IsiParam() dengan
 *         jumlah parameter berbeda persis seperti contoh di buku modul.
 */
package com.mycompany.modul6;

// ===== 6.4 OVERLOADING METHOD =====

// Overloading = membuat method dengan NAMA SAMA tapi PARAMETER BERBEDA dalam satu kelas.
// Java membedakan method berdasarkan jumlah dan tipe parameter (bukan nama).
public class Lagu {

    String pencipta;
    String judul;

    // Versi 1: hanya menerima 1 parameter (judul saja)
    // Pencipta akan diisi nilai default "Tidak dikenal"
    void IsiParam(String param1) {
        judul    = param1;
        pencipta = "Tidak dikenal";
    }

    // Versi 2: menerima 2 parameter (judul + pencipta)
    // Java otomatis memilih versi yang sesuai berdasarkan argumen yang dikirim
    void IsiParam(String param1, String param2) {
        judul    = param1;
        pencipta = param2;
    }

    // Method untuk mencetak data lagu ke layar
    void CetakKeLayar() {
        System.out.println("Judul : " + judul + ", Pencipta : " + pencipta);
    }
}
