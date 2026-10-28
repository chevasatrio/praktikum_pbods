package com.mycompany.modul7;

public interface MyInterface {

    // DEFAULT method: punya isi, kelas pengimplementasi TIDAK wajib mengisinya
    default void newMethod() {
        System.out.println("Newly added default method");
    }

    // STATIC method: milik interface, dipanggil lewat nama interface
    static void anotherNewMethod() {
        System.out.println("Newly added static method");
    }

    // Method abstract biasa: WAJIB diisi oleh kelas pengimplementasi
    void existingMethod(String str);
}