package com.mycompany.modul9;

/**
 * Demo Static Variable & Static Method.
 *
 * STATIC VARIABLE : milik kelas, bukan milik object.
 *                   Satu nilai dipakai bersama semua instance.
 *                   Berubah di satu object → berubah untuk semua.
 *
 * STATIC METHOD   : bisa dipanggil tanpa buat object (NamaKelas.method()).
 *                   Tidak bisa akses field/method non-static.
 *
 * Nama   : Rifqi Reissal Arasy
 * NIM    : 1201230038
 */
public class DemoStatic {

    // Field biasa — nilainya unik per object
    private int privateInt;

    // Static field — satu nilai, dipakai bersama semua object
    private static int staticInt;

    // Static method — counter tanpa butuh instance
    static int counter = 0;

    public static void count() {
        counter++;  // boleh akses counter karena sama-sama static
    }

    public DemoStatic(int pr, int si) {
        privateInt = pr;
        staticInt = si;     // mengubah staticInt berdampak ke semua object
    }

    @Override
    public String toString() {
        return "privateInt=" + privateInt + ", staticInt=" + staticInt;
    }

    public static void main(String[] args) {

        // === Static Variable ===
        DemoStatic s1 = new DemoStatic(4, 4);
        System.out.println("s1: " + s1);            // privateInt=4, staticInt=4

        DemoStatic s2 = new DemoStatic(8, 2);
        System.out.println("s1: " + s1);            // staticInt ikut berubah jadi 2!
        System.out.println("s2: " + s2);

        DemoStatic s3 = new DemoStatic(6, 22);
        System.out.println("s1: " + s1);            // staticInt = 22
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);

        // === Static Method ===
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                DemoStatic.count();     // panggil tanpa object
            }
        }
        System.out.println("Counter: " + DemoStatic.counter); // 5
    }
}
