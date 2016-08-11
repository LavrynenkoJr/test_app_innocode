package com.s_lavrynenko.testappinnoc;


public class Charges {
    private String name;
    private int price;

    public static final Charges[] charges = {
            new Charges("Tea", 20),
            new Charges("Cokke", 40)
    };
    private Charges(String name, int price) {
        this.name = name;
        this.price = price;
        }
    public String getName() {
        return name;
        }
    public int getPrice() {
        return price;
        }
}
