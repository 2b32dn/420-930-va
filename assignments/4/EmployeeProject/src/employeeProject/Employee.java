package employeeProject;

import java.util.*;

public class Employee {
  private Integer e_id;
  private String e_fname;
  private String e_lname;
  private double e_salary;
  private String e_position;
  private String d_id;
  private List<Double> e_bonuses;

  // Default Constructor
  public Employee() {
    this.e_id = 0;
    this.e_fname = "";
    this.e_lname = "";
    this.e_salary = 0;
    this.e_position = "";
    this.d_id = "";
    this.e_bonuses = new ArrayList<>();
  }

  // Parameterized Constructor
  public Employee(Integer id, String fullname, String lastname, Double salary, String position, String departmentId,
      List<Double> bonuses) {
    this.e_id = id;
    this.e_fname = fullname;
    this.e_lname = lastname;
    this.e_salary = salary;
    this.e_position = position;
    this.d_id = departmentId;
    this.e_bonuses = bonuses;
  }

  // Getters and Setters
  public Integer getE_id() {
    return e_id;
  }

  public void setE_id(Integer e_id) {
    this.e_id = e_id;
  }

  public String getE_fname() {
    return e_fname;
  }

  public void setE_fname(String e_fname) {
    this.e_fname = e_fname;
  }

  public String getE_lname() {
    return e_lname;
  }

  public void setE_lname(String e_lname) {
    this.e_lname = e_lname;
  }

  public double getE_salary() {
    return e_salary;
  }

  public void setE_salary(double e_salary) {
    this.e_salary = e_salary;
  }

  public String getE_position() {
    return e_position;
  }

  public void setE_position(String e_position) {
    this.e_position = e_position;
  }

  public String getD_id() {
    return d_id;
  }

  public void setD_id(String d_id) {
    this.d_id = d_id;
  }

  public List<Double> getE_bonuses() {
    return e_bonuses;
  }

  public void setE_bonuses(List<Double> e_bonuses) {
    this.e_bonuses = e_bonuses;
  }

  // Methods
  public String toString() {
    return String.format("Employee #: %d Employee Name: %s, Employee Salary: %.2f$", e_id, e_fname + " " + e_lname,
        e_salary);
  }

  public void getBonuses(List<Double> bonuses) {
    int index = 0;
    for (Double bonus : bonuses) {
      System.out.printf("\tBonus %d: %.2f\n", index + 1, bonus);
      index++;
    }
  }

  public void getBonuses() {
    for (Double bonus : this.e_bonuses) {
      System.out.printf("The Employee Information is: %d//%s//%s//%.2f//%s//%.2f$\n", e_id, e_fname, e_lname, e_salary,
          d_id, bonus);
    }
  }
}
