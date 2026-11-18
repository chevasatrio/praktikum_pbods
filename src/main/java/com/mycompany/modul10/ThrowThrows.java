package com.mycompany.modul10;
import java.util.Scanner;

public class ThrowThrows {

    // throws: method ini bisa melempar Exception ke pemanggilnya
    static void cekUmur(int umur) throws Exception {
        if (umur < 17) {
            throw new Exception("Umur belum cukup untuk membuat KTP");
        }
        System.out.println("Umur memenuhi syarat");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan umur : ");
        int umur = sc.nextInt();
        try {
            cekUmur(umur);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Program selesai");
    sc.close();
    }
}