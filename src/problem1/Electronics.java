package problem1;

public class Electronics extends Product{
  private int warranty;
  private double warrantyCost;

  public Electronics() {
  }

  public Electronics(String productName, double price, int warranty, double warrantyCost) {
    super(productName, price);
    this.warranty = warranty;
    this.warrantyCost = warrantyCost;
  }

  public int getWarranty() {
    return warranty;
  }

  public void setWarranty(int warranty) {
    this.warranty = warranty;
  }

  public double getWarrantyCost() {
    return warrantyCost;
  }

  public void setWarrantyCost(double warrantyCost) {
    this.warrantyCost = warrantyCost;
  }

  @Override
  public double getPrice() {
    return super.getPrice() + this.warrantyCost;
  }

  @Override
  public String toString() {
    return " Product "+this.getProductName()+" is warranted for "+this.warranty+" months for $"+this.warrantyCost;
  }
}
