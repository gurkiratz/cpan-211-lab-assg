package com.example;

public class Main {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine("LG", "blue");
        Refrigerator fridge = new Refrigerator("Samsung", "red");

        // Test WashingMachine functionalities
        System.out.println("Testing Washing Machine:");
        System.out.println("Brand: " + wm.getBrand());
        wm.powerOn();
        wm.powerOff();
        wm.isMaintenanceRequired();

        // Test Fridge functionalities
        System.out.println("Testing Fridge:");
        System.out.println("Brand: " + fridge.getBrand());
        fridge.powerOn();
        fridge.powerOff();
        fridge.setCooling(false);
        fridge.isMaintenanceRequired();
        fridge.setCooling(true);
        fridge.isMaintenanceRequired();
    }
}

abstract class Appliance {
    private String brand;
    private String color;

    public Appliance(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    abstract void powerOn();

    abstract void powerOff();
}

interface Maintainable {
    void isMaintenanceRequired();
}