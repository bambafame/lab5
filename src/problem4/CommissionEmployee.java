package problem4;

public class CommissionEmployee extends Employee{
  private double grossSales;
  private double commissionRate;

  public CommissionEmployee() {
  }

  public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
      double grossSales, double commissionRate) {
    super(firstName, lastName, socialSecurityNumber);
    this.grossSales = grossSales;
    this.commissionRate = commissionRate;
  }

  @Override
  public double getPayment() {
    return this.grossSales * this.commissionRate;
  }

  @Override
  public String toString() {
    return super.toString() + ", grossSales=" + grossSales +
        ", commissionRate=" + commissionRate;
  }
}
