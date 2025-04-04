package employeeTree;

public class Employee {
  private int emp_id;
  private String emp_name;
  private double emp_salary;

  // Default Constructor
  public Employee() {
    this.emp_id = 0;
    this.emp_name = "";
    this.emp_salary = 0;
  }

  // Parameterized Constructor
  public Employee(int id, String name, double salary) {
    this.emp_id = id;
    this.emp_name = name;
    this.emp_salary = salary;
  }

  // Getters and Setters
  public int getEmp_id() {
    return emp_id;
  }

  public void setEmp_id(int emp_id) {
    this.emp_id = emp_id;
  }

  public String getEmp_name() {
    return emp_name;
  }

  public void setEmp_name(String emp_name) {
    this.emp_name = emp_name;
  }

  public double getEmp_salary() {
    return emp_salary;
  }

  public void setEmp_salary(double emp_salary) {
    this.emp_salary = emp_salary;
  }

  // Methods
  public String toString() {
    return String.format("Employee Id: %d, Employee Name: %s, Employee Salary: %.2f$\n", emp_id, emp_name, emp_salary);
  }
}
