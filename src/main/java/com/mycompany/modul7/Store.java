package com.mycompany.modul7;

public class Store {

    static Shoe hightop;

    public static void init() {
        hightop = new Shoe();
    }

    public static void getInfo(Shoe item) {
        System.out.println("This Product is made by " + item.MAKER);
        System.out.println("It costs $" + item.getPrice(1) + '\n');
    }

    public static void orderInfo(Product item) {
        System.out.println("To order from " + item.MAKER + " call " + item.PHONE + ".");
        System.out.println("Each item costs $" + item.getPrice(1));
    }

    public static void main(String[] argv) {
        init();
        getInfo(hightop);
        orderInfo(hightop);
    }
}