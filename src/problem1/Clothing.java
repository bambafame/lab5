package problem1;

public class Clothing extends Product{
  private String brand;
  private int discountPercentage;

  public Clothing() {
  }

  public Clothing(String productName, double price, String brand, int discountPercentage) {
    super(productName, price);
    this.brand = brand;
    this.discountPercentage = discountPercentage;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getDiscountPercentage() {
    return discountPercentage;
  }

  public void setDiscountPercentage(int discountPercentage) {
    this.discountPercentage = discountPercentage;
  }

  @Override
  public double getPrice() {
    double price = super.getPrice();
    return price - (price * discountPercentage / 100);
  }

  @Override
  public String toString() {
    return "Product "+this.getProductName()+" of brand "+this.brand+" is reduced to "+this.discountPercentage+"%";
  }
}
