package employeeProject;

public class LinkedListNode {
  public Employee employee;
  public LinkedListNode link;

  public LinkedListNode(Employee employee) {
    this.employee = employee;
    this.link = null;
  }
}