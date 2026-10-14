/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul5_komposisi;

/*
 * FILE   : Rumah.java
 * PRAKTIK: 3 - Komposisi
 * PERAN  : Keseluruhan (whole) yang terdiri dari Kamar dan Dapur.
 * RELASI : KOMPOSISI dengan Kamar dan Dapur.
 *          Kamar dan Dapur dibuat DI DALAM konstruktor Rumah (pakai new).
 *          Dari luar, yang dikirim hanya data biasa (angka dan teks),
 *          bukan objek Kamar atau Dapur.
 */

public class Rumah {
 
    private String alamat;
    private Kamar kamar;
    private Dapur dapur;
 
    public Rumah(String alamat, int luasKamar, String jenisKompor) {
        this.alamat = alamat;
        kamar = new Kamar(luasKamar);       // dibuat di dalam Rumah
        dapur = new Dapur(jenisKompor);     // dibuat di dalam Rumah
    }
 
    public void tampil() {
        System.out.println("Rumah di " + alamat);
        kamar.tampil();
        dapur.tampil();
    }
}
