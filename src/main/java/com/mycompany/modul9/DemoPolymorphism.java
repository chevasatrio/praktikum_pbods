package com.mycompany.modul9;

/**
 * Demo Polymorphism: Upcasting & Downcasting.
 *
 * UPCASTING  : Subclass → Superclass (otomatis, aman)
 *              Referensi superclass hanya bisa akses method superclass,
 *              tapi method yang di-override tetap menjalankan versi subclass.
 *
 * DOWNCASTING: Superclass → Subclass (manual, perlu cast eksplisit)
 *              Dipakai saat butuh akses method spesifik milik subclass.
 *              Gunakan instanceof sebelum cast untuk hindari ClassCastException.
 *
 * Nama   : Rifqi Reissal Arasy
 * NIM    : 1201230038
 */
public class DemoPolymorphism {

    public static void main(String[] args) {

        // === UPCASTING ===
        // Kucing di-assign ke referensi Hewan (upcasting otomatis)
        Hewan h = new Kucing("Whisker");
        h.suara();          // memanggil suara() versi Kucing (polymorphism)
        // h.terkam();      // ERROR — referensi Hewan tidak tahu method terkam()

        // === DOWNCASTING ===
        // Kembalikan ke tipe Kucing agar bisa akses terkam()
        if (h instanceof Kucing) {          // cek dulu sebelum cast — hindari ClassCastException
            Kucing k = (Kucing) h;          // cast eksplisit
            k.terkam();
        }

        // Contoh downcast gagal: ClassCastException saat runtime
        try {
            Hewan burung = new Hewan("Pipit");
            Kucing salah = (Kucing) burung;  // burung bukan Kucing → exception
        } catch (ClassCastException e) {
            System.out.println("Gagal downcast: " + e.getMessage());
        }
    }
}
