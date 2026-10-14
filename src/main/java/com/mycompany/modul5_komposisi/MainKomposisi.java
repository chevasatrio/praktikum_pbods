/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.modul5_komposisi;
/*
 * FILE   : MainKomposisi.java
 * PRAKTIK: 3 - Komposisi
 * PERAN  : Kelas utama (ada method main) untuk menjalankan Praktik 3.
 * ALUR   : Cukup membuat objek Rumah. Kamar dan Dapur otomatis ikut
 *          dibuat di dalamnya, tanpa kita membuatnya di sini.
 */
public class MainKomposisi {
    public static void main(String[] args) {
        Rumah rumah = new Rumah("Jl. Mawar 5", 12, "Gas");
        rumah.tampil();
    }
}