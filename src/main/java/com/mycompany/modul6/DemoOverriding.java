package com.mycompany.modul6;

class A2 {
    public void tampilkanKeLayar() {
        System.out.println("Method milik class A dipanggil...");
    }
}

class B2 extends A2 {
    public void tampilkanKeLayar() {
        super.tampilkanKeLayar(); // Method milik superclass dipanggil
        System.out.println("Method milik class B dipanggil...");
    }
}

class DemoOverriding {
    public static void main(String[] args) {
        B2 subOb = new B2();
        subOb.tampilkanKeLayar();
    }
}
