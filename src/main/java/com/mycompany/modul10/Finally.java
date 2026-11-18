package com.mycompany.modul10;
import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nama = {"Budi", "Sari", "Dewi"};

        System.out.print("Pilih nomor urut (0-2) : ");
        int i = sc.nextInt();
        try {
            System.out.println("Nama : " + nama[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: nomor urut tidak ada");
        } finally {
            System.out.println("Blok finally selalu dijalankan");
        }
    sc.close();
    }
}