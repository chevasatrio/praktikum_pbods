/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul5_assosiasi;

/*
 * FILE   : Barang.java
 * PRAKTIK: 1 - Asosiasi
 * PERAN  : Menyimpan data barang yang dijual (nama, harga, stok).
 * CATATAN: Kelas ini tidak tahu apa-apa tentang Kasir. Dia hanya
 *          menyediakan data dan method untuk dipakai kelas lain.
 */
public class Barang {
 
    // Atribut dibuat private (enkapsulasi), diakses lewat method
    private String nama;
    private int harga;
    private int stok;
 
    // Konstruktor: dipanggil saat objek dibuat dengan new
    public Barang(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
 
    // Getter: untuk membaca nilai atribut
    public String getNama() {
        return nama;
    }
 
    public int getHarga() {
        return harga;
    }
 
    public int getStok() {
        return stok;
    }
 
    // Method untuk mengurangi stok setelah barang terjual
    public void kurangiStok(int jumlah) {
        stok = stok - jumlah;
    }
}
