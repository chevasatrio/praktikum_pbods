/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul5_komposisi;

/*
 * FILE   : Dapur.java
 * PRAKTIK: 3 - Komposisi
 * PERAN  : Bagian dari Rumah. Menyimpan jenis kompor.
 * CATATAN: Sama seperti Kamar, Dapur hanya dibuat oleh Rumah.
 */
public class Dapur {
 
    private String jenisKompor;
 
    public Dapur(String jenisKompor) {
        this.jenisKompor = jenisKompor;
    }
 
    public void tampil() {
        System.out.println("Dapur : kompor " + jenisKompor);
    }
}