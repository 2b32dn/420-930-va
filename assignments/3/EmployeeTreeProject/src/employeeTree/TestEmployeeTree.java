package employeeTree;

import java.util.*;
import java.io.*;

public class TestEmployeeTree {
  public static void main(String[] args) throws IOException {
    Scanner inputFile = new Scanner(new FileReader("./Employee.in"));
    BinaryEmployeeTreeClass myEmployeeTreeClass = new BinaryEmployeeTreeClass();

    while (inputFile.hasNextLine()) {
      Employee empObj = new Employee();
      String emp = inputFile.nextLine();
      String[] empParts = emp.split("\t");

      empObj.setEmp_id(Integer.parseInt(empParts[0]));
      empObj.setEmp_name(empParts[1]);
      empObj.setEmp_salary(Double.parseDouble(empParts[2]));

      myEmployeeTreeClass.put(empObj);
    }
    inputFile.close();

    myEmployeeTreeClass.inOrderTraversal();
  }
}
