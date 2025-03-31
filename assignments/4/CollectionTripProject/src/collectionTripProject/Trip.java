package collectionTripProject;

public class Trip {
  private Integer emp_id;
  private String emp_name;
  private String emp_address;
  private Double emp_gasprice;
  private Integer emp_distance;
  private Double emp_costhotel;
  private Double emp_costfood;

  // Default constructor
  public Trip() {
    this.emp_id = 0;
    this.emp_name = "";
    this.emp_address = "";
    this.emp_gasprice = 0.0;
    this.emp_distance = 0;
    this.emp_costhotel = 0.0;
    this.emp_costfood = 0.0;
  }

  // Parameterized constructor
  public Trip(Integer emp_id, String emp_name, String emp_address, Double emp_gasprice, Integer emp_distance,
      Double emp_costhotel, Double emp_costfood) {
    this.emp_id = emp_id;
    this.emp_name = emp_name;
    this.emp_address = emp_address;
    this.emp_gasprice = emp_gasprice;
    this.emp_distance = emp_distance;
    this.emp_costhotel = emp_costhotel;
    this.emp_costfood = emp_costfood;
  }

  // Getters and Setters
  public Integer getEmp_id() {
    return emp_id;
  }

  public void setEmp_id(Integer emp_id) {
    this.emp_id = emp_id;
  }

  public String getEmp_name() {
    return emp_name;
  }

  public void setEmp_name(String emp_name) {
    this.emp_name = emp_name;
  }

  public String getEmp_address() {
    return emp_address;
  }

  public void setEmp_address(String emp_address) {
    this.emp_address = emp_address;
  }

  public Double getEmp_gasprice() {
    return emp_gasprice;
  }

  public void setEmp_gasprice(Double emp_gasprice) {
    this.emp_gasprice = emp_gasprice;
  }

  public Integer getEmp_distance() {
    return emp_distance;
  }

  public void setEmp_distance(Integer emp_distance) {
    this.emp_distance = emp_distance;
  }

  public Double getEmp_costhotel() {
    return emp_costhotel;
  }

  public void setEmp_costhotel(Double emp_costhotel) {
    this.emp_costhotel = emp_costhotel;
  }

  public Double getEmp_costfood() {
    return emp_costfood;
  }

  public void setEmp_costfood(Double emp_costfood) {
    this.emp_costfood = emp_costfood;
  }

  // Methods
  public String toString() {
    return String.format(
        "Emp Id = %d, Emp Name = %s, Emp Add = %s, Gas Price = %.2f, Distance = %d, Hotel Cost = %.2f, Food Cost = %.2f, Total Cost = %.2f$",
        emp_id, emp_name, emp_address, emp_gasprice, emp_distance, emp_costhotel, emp_costfood, CalculateCostTrip());
  }

  public double CalculateCostTrip() {
    return (emp_distance * emp_gasprice) + emp_costhotel + emp_costfood;
  }
}
