package problem1;

public class Furniture extends Product{
  private String material;
  private double shippingCost;

  public Furniture() {
  }

  public Furniture(String productName, double price, String material, double shippingCost) {
    super(productName, price);
    this.material = material;
    this.shippingCost = shippingCost;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public double getShippingCost() {
    return shippingCost;
  }

  public void setShippingCost(double shippingCost) {
    this.shippingCost = shippingCost;
  }

  @Override
  public double getPrice() {
    return super.getPrice() + this.shippingCost;
  }

  @Override
  public String toString() {
    return "Product "+this.getProductName()+" is a "+this.material+", the shipping will cost $"+this.shippingCost;
  }
}
