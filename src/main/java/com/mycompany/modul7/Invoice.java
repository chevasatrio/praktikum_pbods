package com.mycompany.modul7;

public class Invoice implements Payable {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // Konstruktor empat argumen
    public Invoice(String part, String description, int count, double price) {
        partNumber = part;
        partDescription = description;
        setQuantity(count); // validasi lalu simpan jumlah
        setPricePerItem(price); // validasi lalu simpan harga
    }

    public void setPartNumber(String part) {
        partNumber = part;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String description) {
        partDescription = description;
    }

    public String getPartDescription() {
        return partDescription;
    }

    // Jumlah tidak boleh negatif
    public void setQuantity(int count) {
        quantity = (count < 0) ? 0 : count;
    }

    public int getQuantity() {
        return quantity;
    }

    // Harga tidak boleh negatif
    public void setPricePerItem(double price) {
        pricePerItem = (price < 0.0) ? 0.0 : price;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public String toString() {
        return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f",
                "invoice", "part number", getPartNumber(), getPartDescription(),
                "quantity", getQuantity(), "price per item", getPricePerItem());
    }

    // Method yang diwajibkan oleh kontrak interface Payable
    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem(); // total biaya
    }
}