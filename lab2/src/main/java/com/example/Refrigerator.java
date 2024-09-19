package com.example;

public class Refrigerator extends Appliance implements Maintainable {
  private boolean isCooling;

  public Refrigerator(String brand, String color) {
    super(brand, color);
  }

  public void setCooling(boolean isCooling) {
    this.isCooling = isCooling;
  }

  @Override
  public void isMaintenanceRequired() {
    String output = isCooling ? "Not required" : "is required"; 
    System.out.println("Referigerator maintenence " + output);
  }

  @Override
  void powerOn() {
    System.out.println("Refrigerator is turned on!");
  }

  @Override
  void powerOff() {
    System.out.println("Refrigerator is turned off!");
  }
  
}
