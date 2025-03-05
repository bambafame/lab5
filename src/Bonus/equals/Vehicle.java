package Bonus.equals;

public class Vehicle {
  private String brand;
  private String model;

  public Vehicle() {
  }

  public Vehicle(String brand, String model) {
    this.brand = brand;
    this.model = model;
  }

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Vehicle vehicle)) return false;
    return brand.equals(vehicle.brand) && model.equals(vehicle.model);
  }
}

