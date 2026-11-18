package com.mycompany.modul10;
import java.util.Scanner;
import java.util.InputMismatchException;

public class InputUlang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print("Masukkan nilai (angka) : ");
                nilai = sc.nextInt();
                valid = true;                      // sampai sini = input benar
            } catch (InputMismatchException e) {
                System.out.println("Error: harus angka, coba lagi");
                sc.nextLine();                     // buang input yang salah
            }
        }
        System.out.println("Nilai tersimpan : " + nilai);
        sc.close();
    }
}