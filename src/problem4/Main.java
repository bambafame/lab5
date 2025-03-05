package problem4;

public class Main {

  public static void main(String[] args) {
     Employee[] employees = {
        new CommissionEmployee("Yaakoub", "Kadri", "IO1234567", 8000, 0.25),
        new BasePlusCommissionEmployee("Shaban", "Lukyamuzi", "IO7145623", 10000, 0.25, 50000),
        new HourlyEmployee("Cheikh", "Fame", "IO2712199", 5000, 40),
        new SalariedEmployee("Mohamed", "Salah", "IO6509123", 300000),
        new SalariedEmployee("Sadio", "Mane", "IO8954660", 250000)
    };

    System.out.println(findMaxSalary(employees));
  }

  public static Employee findMaxSalary(Employee[] col) {
    double maxSalay = Integer.MIN_VALUE;
    Employee emp = null;
    for(Employee employee : col) {
      if(employee != null) {
        if(employee.getPayment() > maxSalay) {
          maxSalay = employee.getPayment();
          emp = employee;
        }
      }
    }
    return emp;
  }

}
