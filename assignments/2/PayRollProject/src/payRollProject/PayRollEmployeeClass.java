package payRollProject;

public class PayRollEmployeeClass {
  private int emp_id;
  private String emp_name;
  private String emp_ssn;
  private int number_whr;
  private double h_rate;
  public static double Fed_Tax;
  public static double Prv_Tax;
  public static double QP_Ins;
  public static double E_ins;
  public static double Qpp;
  public static double Union_d;

  // Default constructor
  public PayRollEmployeeClass() {
    this.emp_id = 0;
    this.emp_name = "";
    this.emp_ssn = "";
    this.number_whr = 0;
    this.h_rate = 0;
    Fed_Tax = 0.07;
    Prv_Tax = 0.09;
    QP_Ins = 0.0055;
    E_ins = 0.014;
    Qpp = 0.045;
    Union_d = 0.0165;
  }

  // Constructor with parameters
  public PayRollEmployeeClass(int emp_id, String emp_name, String emp_ssn, int number_whr, double h_rate,
      double fed_Tax,
      double prv_Tax, double qP_Ins, double e_ins, double qpp, double union_d) {
    this.emp_id = emp_id;
    this.emp_name = emp_name;
    this.emp_ssn = emp_ssn;
    this.number_whr = number_whr;
    this.h_rate = h_rate;
    Fed_Tax = fed_Tax;
    Prv_Tax = prv_Tax;
    QP_Ins = qP_Ins;
    E_ins = e_ins;
    Qpp = qpp;
    Union_d = union_d;
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

  public String getEmp_ssn() {
    return emp_ssn;
  }

  public void setEmp_ssn(String emp_ssn) {
    this.emp_ssn = emp_ssn;
  }

  public int getNumber_whr() {
    return number_whr;
  }

  public void setNumber_whr(int number_whr) {
    this.number_whr = number_whr;
  }

  public double getH_rate() {
    return h_rate;
  }

  public void setH_rate(double h_rate) {
    this.h_rate = h_rate;
  }

  public static double getFed_Tax() {
    return Fed_Tax;
  }

  public static void setFed_Tax(double fed_Tax) {
    Fed_Tax = fed_Tax;
  }

  public static double getPrv_Tax() {
    return Prv_Tax;
  }

  public static void setPrv_Tax(double prv_Tax) {
    Prv_Tax = prv_Tax;
  }

  public static double getQP_Ins() {
    return QP_Ins;
  }

  public static void setQP_Ins(double qP_Ins) {
    QP_Ins = qP_Ins;
  }

  public static double getE_ins() {
    return E_ins;
  }

  public static void setE_ins(double e_ins) {
    E_ins = e_ins;
  }

  public static double getQpp() {
    return Qpp;
  }

  public static void setQpp(double qpp) {
    Qpp = qpp;
  }

  public static double getUnion_d() {
    return Union_d;
  }

  public static void setUnion_d(double union_d) {
    Union_d = union_d;
  }

  // Method for Payroll calculation
  public double calculate_FedTaxDeduction() {
    return calculate_TotalIncome() * Fed_Tax;
  }

  public double calculate_PrvTaxDeduction() {
    return calculate_TotalIncome() * Prv_Tax;
  }

  public double calculate_QP_InsDeduction() {
    return calculate_TotalIncome() * QP_Ins;
  }

  public double calculate_E_InsDeduction() {
    return calculate_TotalIncome() * E_ins;
  }

  public double calculate_QppDeduction() {
    return calculate_TotalIncome() * Qpp;
  }

  public double calculate_UnionDeduction() {
    return calculate_TotalIncome() * Union_d;
  }

  public double calculate_TotalIncome() {
    double totalIncome = number_whr * h_rate;
    return totalIncome;
  }

  public double calculate_TotalDeduction() {
    double totalDeduction = (calculate_TotalIncome() * Fed_Tax) + (calculate_TotalIncome() * Prv_Tax)
        + (calculate_TotalIncome() * QP_Ins) + (calculate_TotalIncome() * E_ins) + (calculate_TotalIncome() * Qpp)
        + Union_d;
    return totalDeduction;
  }

  public double calculate_TotalNetAmount() {
    return calculate_TotalIncome() - calculate_TotalDeduction();
  }

}
