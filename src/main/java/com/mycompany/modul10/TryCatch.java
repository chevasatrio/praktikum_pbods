package com.mycompany.modul10;
import java.util.Scanner;
import java.util.InputMismatchException;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Angka pertama : ");
            int a = sc.nextInt();
            System.out.print("Angka kedua   : ");
            int b = sc.nextInt();
            System.out.println("Hasil bagi    : " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error: tidak bisa dibagi dengan nol");
        } catch (InputMismatchException e) {
            System.out.println("Error: input harus berupa angka");
        }
        System.out.println("Program selesai");
    sc.close();
    }
}