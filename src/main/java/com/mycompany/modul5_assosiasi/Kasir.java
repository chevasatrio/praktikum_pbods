/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul5_assosiasi;

/*
 * FILE   : Kasir.java
 * PRAKTIK: 1 - Asosiasi
 * PERAN  : Kasir yang menghitung total belanja.
 * RELASI : ASOSIASI dengan Barang.
 *          Perhatikan: Kasir TIDAK punya atribut bertipe Barang.
 *          Objek Barang hanya "numpang lewat" sebagai PARAMETER method,
 *          dipakai sebentar, lalu selesai.
 */

public class Kasir {
 
    private String nama;   // hanya ada atribut nama, tidak ada atribut Barang
 
    public Kasir(String nama) {
        this.nama = nama;
    }
 
    public String getNama() {
        return nama;
    }
 
    // Objek Barang masuk lewat parameter (inilah asosiasi)
    public int hitungTotal(Barang b, int jumlah) {
        b.kurangiStok(jumlah);              // memakai method milik Barang
        return b.getHarga() * jumlah;       // mengembalikan total bayar
    }
}
