/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.modul5_agregasi;

/*
 * FILE   : MainAgregasi.java
 * PRAKTIK: 2 - Agregasi
 * PERAN  : Kelas utama (ada method main) untuk menjalankan Praktik 2.
 * ALUR   : 1) buat objek Lagu DULU, di luar Playlist
 *          2) buat Playlist lalu masukkan lagu
 *          3) buktikan Lagu tetap ada walau Playlist dihapus
 */

public class MainAgregasi {
    public static void main(String[] args) {
        // Lagu dibuat sendiri, belum ada hubungan dengan Playlist
        Lagu l1 = new Lagu("Senja", "Dina");
        Lagu l2 = new Lagu("Hujan", "Raka");
        Lagu l3 = new Lagu("Pagi", "Sinta");
 
        Playlist p = new Playlist("Santai");
        p.tambahLagu(l1);
        p.tambahLagu(l2);
        p.tambahLagu(l3);
        p.tampil();
 
        // Playlist dihapus (tidak dipakai lagi)
        p = null;
 
        // Lagu masih ada, karena dibuat di luar Playlist
        System.out.println("Lagu masih ada : " + l1.getJudul());
    }
}