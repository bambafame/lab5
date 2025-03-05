package problem4;

public class SalariedEmployee extends Employee{
  private double weeklySalary;

  public SalariedEmployee(double weeklySalary) {
    this.weeklySalary = weeklySalary;
  }

  public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber,
      double weeklySalary) {
    super(firstName, lastName, socialSecurityNumber);
    this.weeklySalary = weeklySalary;
  }

  @Override
  public double getPayment() {
    return this.weeklySalary;
  }

  @Override
  public String toString() {
    return super.toString()+ ", weeklySalary=" + weeklySalary;
  }
}
