package employeeProject;

import java.util.*;
import java.io.*;

public class TestEmployeeProject1 {
  public static void main(String[] args) throws IOException {
    Scanner inputFile = new Scanner(new FileReader("./Employee.in"));
    List<Employee> myEmployeesList = new LinkedList<>();

    while (inputFile.hasNext()) {
      Employee empObj = new Employee();
      String emp = inputFile.nextLine();
      String[] emp_parts = emp.split("\\s+");

      empObj.setE_id(Integer.parseInt(emp_parts[0]));
      empObj.setE_fname(emp_parts[1]);
      empObj.setE_lname(emp_parts[2]);
      empObj.setE_salary(Double.parseDouble(emp_parts[3]));
      empObj.setE_position(emp_parts[4]);
      empObj.setD_id(emp_parts[5]);

      List<Double> bonuses = new ArrayList<>();
      for (int index = 6; index < emp_parts.length; index++) {
        if (!emp_parts[index].equals("-999")) {
          bonuses.add(Double.parseDouble(emp_parts[index]));
        }
      }
      empObj.setE_bonuses(bonuses);
      myEmployeesList.add(empObj);
    }
    inputFile.close();

    for (Employee employee : myEmployeesList) {
      int index = 0;
      System.out.println(employee);
      employee.getBonuses(myEmployeesList.get(index).getE_bonuses());
      System.out.println("");
      index++;
    }

  }
}
