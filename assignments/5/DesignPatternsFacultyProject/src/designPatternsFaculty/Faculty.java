package designPatternsFaculty;

public class Faculty {
  private Integer f_id;
  private String f_Lname;
  private String f_Fname;
  private double f_Salary;
  private double f_BonusRate;
  private static double f_tax;
  private static double p_tax;

  // Default Constructor
  public Faculty() {
    this.f_id = 0;
    this.f_Lname = "";
    this.f_Fname = "";
    this.f_Salary = 0;
    this.f_BonusRate = 0;
    Faculty.f_tax = 0.075;
    Faculty.p_tax = 0.06;
  }

  // Parameterized Constructor
  public Faculty(Integer facultyId, String facultyLastName, String facultyFirstName, double facultySalary,
      double facultyBonusRate) {
    this.f_id = facultyId;
    this.f_Lname = facultyLastName;
    this.f_Fname = facultyFirstName;
    this.f_Salary = facultySalary;
    this.f_BonusRate = facultyBonusRate;
    Faculty.f_tax = 0.075;
    Faculty.p_tax = 0.06;
  }

  // Getters and Setters
  public Integer getF_id() {
    return f_id;
  }

  public void setF_id(Integer f_id) {
    this.f_id = f_id;
  }

  public String getF_Lname() {
    return f_Lname;
  }

  public void setF_Lname(String f_Lname) {
    this.f_Lname = f_Lname;
  }

  public String getF_Fname() {
    return f_Fname;
  }

  public void setF_Fname(String f_Fname) {
    this.f_Fname = f_Fname;
  }

  public double getF_Salary() {
    return f_Salary;
  }

  public void setF_Salary(double f_Salary) {
    this.f_Salary = f_Salary;
  }

  public double getF_BonusRate() {
    return f_BonusRate;
  }

  public void setF_BonusRate(double f_BonusRate) {
    this.f_BonusRate = f_BonusRate;
  }

  public static double getF_tax() {
    return f_tax;
  }

  public static void setF_tax(double f_tax) {
    Faculty.f_tax = f_tax;
  }

  public static double getP_tax() {
    return p_tax;
  }

  public static void setP_tax(double p_tax) {
    Faculty.p_tax = p_tax;
  }

  // Method
  public String toString() {
    return String.format("Faculty [f_id: %d, f_Lname: %s, f_Fname: %s, f_Salary: %.2f, f_BonusRate: %.2f%%]", f_id,
        f_Lname, f_Fname, f_Salary, f_BonusRate);
  }

  public double doCalc_Bonus() {
    return f_Salary * (f_BonusRate / 100);
  }

  public double doBonus_tax() {
    return doCalc_Bonus() * (f_tax + p_tax);
  }
}
