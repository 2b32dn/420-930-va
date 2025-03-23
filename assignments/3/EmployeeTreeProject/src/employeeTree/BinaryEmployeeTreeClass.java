package employeeTree;

public class BinaryEmployeeTreeClass {
  BinaryEmployeeTreeNode rootTree;

  public BinaryEmployeeTreeClass() {
    this.rootTree = null;
  }

  public void put(Employee employee) {
    BinaryEmployeeTreeNode newEmployeeTreeNode = new BinaryEmployeeTreeNode();
    newEmployeeTreeNode.employee = employee;
    newEmployeeTreeNode.llink = null;
    newEmployeeTreeNode.rlink = null;

    BinaryEmployeeTreeNode currentNode;
    if (rootTree == null) {
      newEmployeeTreeNode.employee = employee;
      rootTree = newEmployeeTreeNode;
    } else {
      currentNode = rootTree;
      Boolean insert = false;
      while (!insert) {
        if (employee.getEmp_salary() < currentNode.employee.getEmp_salary()) {
          if (currentNode.llink == null) {
            currentNode.llink = newEmployeeTreeNode;
            insert = true;
          }
          currentNode = currentNode.llink;
        } else {
          if (currentNode.rlink == null) {
            currentNode.rlink = newEmployeeTreeNode;
            insert = true;
          }
          currentNode = currentNode.rlink;
        }
      }
    }
  }

  public void inOrderTraversal() {
    inOrder(rootTree);
  }

  private void inOrder(BinaryEmployeeTreeNode employee) {
    if (employee.llink != null) {
      inOrder(employee.llink);
    }
    System.out.println(employee.employee);
    if (employee.rlink != null) {
      inOrder(employee.rlink);
    }
  }
}
