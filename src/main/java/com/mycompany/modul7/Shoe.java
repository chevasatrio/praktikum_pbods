package com.mycompany.modul7;

public class Shoe implements Product {

    public int getPrice(int id) {
        if (id == 1)
            return 5;
        else
            return 10;
    }

    public String getMaker() {
        return MAKER;
    }
}