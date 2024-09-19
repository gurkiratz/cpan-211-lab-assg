package com.example;

public class WashingMachine extends Appliance implements Maintainable {

  public WashingMachine(String brand, String color) {
    super(brand, color);
  }

  @Override
  public void powerOn() {
    System.out.println("Washing machine powered on.");
  }

  @Override
  public void powerOff() {
    System.out.println("Washing machine powered off!!");
  }

  @Override
  public void isMaintenanceRequired() {
    System.out.println("Washing machine maintenence: Not Required");
  }
}
