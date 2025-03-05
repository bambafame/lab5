package problem1;

public class TestClass {

  public static void main(String[] args) {
    Product[] products = {
        new Electronics("Smartphone", 799.99, 24, 100.0),
        new Electronics("Laptop", 1299.99, 3, 150.0),
        new Clothing("T-Shirt", 29.99, "Nike", 10),
        new Clothing("Jeans", 59.99, "Levi's", 15),
        new Furniture("Office Chair", 150.0, "Leather", 20.0)

    };

    for(Product product : products){
      System.out.println(product);
    }

    double sumProducts = sumProducts(products);
    System.out.println("Total of all products cost : $"+sumProducts);
  }

  public static double sumProducts(Product[] col) {
    double sum = 0;
    for (Product p : col) {
      sum += p.getPrice();
    }
    return sum;
  }

}
