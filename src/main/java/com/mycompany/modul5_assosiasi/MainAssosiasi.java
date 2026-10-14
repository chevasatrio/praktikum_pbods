/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.modul5_assosiasi;

/*
 * FILE   : MainAsosiasi.java
 * PRAKTIK: 1 - Asosiasi
 * PERAN  : Kelas utama (ada method main) untuk menjalankan Praktik 1.
 * ALUR   : 1) buat objek Barang  2) buat objek Kasir
 *          3) Kasir menghitung total dengan menerima objek Barang
 */

public class MainAssosiasi {
    public static void main(String[] args) {
        Barang buku = new Barang("Buku Tulis", 5000, 20);
        Kasir kasir = new Kasir("Rina");
 
        // Objek buku dikirim ke kasir lewat parameter
        int total = kasir.hitungTotal(buku, 3);
 
        System.out.println("Kasir       : " + kasir.getNama());
        System.out.println("Barang      : " + buku.getNama());
        System.out.println("Total bayar : " + total);
        System.out.println("Sisa stok   : " + buku.getStok());
    }
}
 