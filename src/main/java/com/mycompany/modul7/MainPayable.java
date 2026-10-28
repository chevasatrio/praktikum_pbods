package com.mycompany.modul7;

public class MainPayable {
    public static void main(String[] args) {
        Payable[] objekBayar = new Payable[4];

        objekBayar[0] = new Invoice("01234", "seat", 2, 375.00);
        objekBayar[1] = new Invoice("56789", "tire", 4, 79.95);
        objekBayar[2] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        objekBayar[3] = new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00);

        System.out.println("Invoice dan Employee diproses secara polymorpishm:\n");

        for (int i = 0; i < objekBayar.length; i++) {
            System.out.println(objekBayar[i]);
            System.out.printf("payment due: $%,.2f%n%n", objekBayar[i].getPaymentAmount());
        }
    }
}