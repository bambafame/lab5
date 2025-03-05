package problem2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Professor p1 = new Professor("Albert Einsten", 300000, LocalDate.of(1989, 1, 15), 150);
    Professor p2 = new Professor("Elon Musk", 650000, LocalDate.of(2001, 5, 27), 54);
    Professor p3 = new Professor("Marie Curry", 300000, LocalDate.of(1995, 12, 10), 112);
    Secretary s1 = new Secretary("Shaban", 90000, LocalDate.of(2016, 6, 01), 12);
    Secretary s2 = new Secretary("Lisa", 75000, LocalDate.of(2019, 8, 07), 7);
    DeptEmployee[] deptEmployees = new DeptEmployee[5];
    deptEmployees[0] = p1;
    deptEmployees[1] = s1;
    deptEmployees[2] = p2;
    deptEmployees[3] = s2;
    deptEmployees[4] = p3;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Do you wish to see the sum of all Professor and Secretary salary in the department? (Y/N)");
    String response = scanner.next();
    scanner.nextLine();
    if(response.toUpperCase().equals("Y")) {
      double sum = 0;
      for (DeptEmployee deptEmployee : deptEmployees) {
        sum += deptEmployee.computeSalary();
      }
      System.out.printf("The sum is %.2f and the average %.2f ", sum, sum / deptEmployees.length);
    }



    scanner.close();

  }
}
