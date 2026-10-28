package com.mycompany.modul7;

public class Example implements MyInterface {

    // Mengisi method abstract
    public void existingMethod(String str) {
        System.out.println("String is: " + str);
    }

    public static void main(String[] args) {
        Example obj = new Example();

        obj.newMethod(); // default method
        MyInterface.anotherNewMethod(); // static method: lewat nama interface
        obj.existingMethod("Java 8 is easy to learn");
        
    }
}