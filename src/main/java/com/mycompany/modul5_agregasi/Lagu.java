/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul5_agregasi;

/*
 * FILE   : Lagu.java
 * PRAKTIK: 2 - Agregasi
 * PERAN  : Menyimpan data satu lagu (judul dan penyanyi).
 * CATATAN: Lagu bisa dibuat sendiri tanpa Playlist. Inilah yang
 *          membuat hubungannya agregasi (bagian tetap bisa hidup sendiri).
 */

public class Lagu {
 
    private String judul;
    private String penyanyi;
 
    public Lagu(String judul, String penyanyi) {
        this.judul = judul;
        this.penyanyi = penyanyi;
    }
 
    public String getJudul() {
        return judul;
    }
 
    public String getPenyanyi() {
        return penyanyi;
    }
}