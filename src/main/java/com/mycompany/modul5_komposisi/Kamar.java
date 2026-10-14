/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul5_komposisi;

/*
 * FILE   : Kamar.java
 * PRAKTIK: 3 - Komposisi
 * PERAN  : Bagian dari Rumah. Menyimpan luas kamar.
 * CATATAN: Kamar tidak dibuat di MainKomposisi. Kamar hanya dibuat
 *          oleh Rumah, sehingga tidak ada Kamar tanpa Rumah.
 */
public class Kamar {
 
    private int luas;   // dalam meter persegi
 
    public Kamar(int luas) {
        this.luas = luas;
    }
 
    public void tampil() {
        System.out.println("Kamar : " + luas + " m2");
    }
}