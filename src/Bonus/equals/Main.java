package Bonus.equals;

public class Main {
  public static void main(String[] args) {
    Car car1 = new Car("BMW", "M3", 4, 473);
    Car car2 = new Car("BMW", "M3", 4, 473);
    Car car3 = new Car("Peugeot", "308 GT", 5, 225);

    System.out.println("car1 equals car2? " + car1.equals(car2));
    System.out.println("car1 equals car3? " + car1.equals(car3));



  }
}
