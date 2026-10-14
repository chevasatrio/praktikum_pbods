/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul5_agregasi;

/*
 * FILE   : Playlist.java
 * PRAKTIK: 2 - Agregasi
 * PERAN  : Kumpulan lagu.
 * RELASI : AGREGASI dengan Lagu.
 *          Playlist PUNYA atribut bertipe Lagu (berupa array),
 *          tetapi objek Lagu dibuat DI LUAR Playlist lalu dimasukkan.
 */

public class Playlist {
    
    private String nama;
    private Lagu[] daftar = new Lagu[5];   // atribut bertipe Lagu (kapasitas 5 lagu)
    private int jumlah = 0;                // menghitung lagu yang sudah masuk
 
    public Playlist(String nama) {
        this.nama = nama;
    }
 
    // Objek Lagu dari luar disimpan ke dalam array
    public void tambahLagu(Lagu lagu) {
        daftar[jumlah] = lagu;
        jumlah++;
    }
 
    public void tampil() {
        System.out.println("Playlist : " + nama);
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + daftar[i].getJudul()
                    + " - " + daftar[i].getPenyanyi());
        }
    }
}