package Bonus.equals;

public class Car extends Vehicle {
  private int doors;
  private int power;

  public Car() {
  }

  public Car(String brand, String model, int doors, int power) {
    super(brand, model);
    this.doors = doors;
    this.power = power;
  }

  //Same-Class Strategy
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Car car)) return false;
    return getBrand().equals(car.getBrand()) &&
        getModel().equals(car.getModel()) &&
        this.doors == car.doors &&
        this.power == car.power;
  }

}
