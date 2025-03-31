package employeeProject;

import java.util.*;
import java.io.*;

public class TestEmployeeProject2 {
  public static void main(String[] args) throws IOException {
    Scanner inputFile = new Scanner(new FileReader("./Employee.in"));
    Map<Integer, LinkedListNode> myEmpHashMap = new HashMap<>();
    LinkedListNode newNode = null;

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

      newNode = new LinkedListNode(empObj);

      if (!myEmpHashMap.containsKey(empObj.getE_id())) {
        myEmpHashMap.put(empObj.getE_id(), newNode);
      } else {
        LinkedListNode temp = myEmpHashMap.get(empObj.getE_id());
        while (temp.link != null) {
          temp = temp.link;
        }
        temp.link = newNode;
      }
    }
    inputFile.close();

    System.out.println("Displaying all Values of Map Collection\n");
    for (Map.Entry<Integer, LinkedListNode> entry : myEmpHashMap.entrySet()) {
      int emp_id = entry.getKey();
      LinkedListNode currentNode = entry.getValue();
      System.out.println("Employee Id: " + emp_id);
      while (currentNode != null) {
        System.out.printf("Displaying the components of the linked list for emp_id: %d\n",
            currentNode.employee.getE_id());
        System.out.println(currentNode.employee);
        currentNode.employee.getBonuses();
        System.out.printf("Total bonus for emp_id: %d is %.2f$\n\n",
            currentNode.employee.getE_id(),
            currentNode.employee.getE_bonuses().stream().mapToDouble(Double::doubleValue).sum());
        currentNode = currentNode.link;
      }
    }

    Scanner search = new Scanner(System.in);
    System.out.println("\nPlease enter emp_id for search: ");
    int searchId = search.nextInt();

    if (!myEmpHashMap.containsKey(searchId)) {
      System.out.printf("Employee ID: %d not found\n", searchId);
    } else {
      LinkedListNode currentNode = myEmpHashMap.get(searchId);
      System.out.printf("Employee found.\nEmployee Information is:  \n", currentNode.employee);
      currentNode.employee.getBonuses();
      System.out.printf("Total bonus for emp_id: %d is %.2f$\n\n",
          currentNode.employee.getE_id(),
          currentNode.employee.getE_bonuses().stream().mapToDouble(Double::doubleValue).sum());
    }

    search.close();
  }
}
