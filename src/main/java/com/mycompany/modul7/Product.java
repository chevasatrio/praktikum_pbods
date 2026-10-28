package com.mycompany.modul7;

public interface Product {
    static final String MAKER = "My Corp";
    static final String PHONE = "555-123-4567";

    public int getPrice(int id); // tanpa isi, diisi oleh kelas yang implements
}