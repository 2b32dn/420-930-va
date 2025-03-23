package collectionExamplesProject;

public class Student {
  private int std_Id;
  private String std_FullName;
  private int hrs;
  private double ratePerhrs;

  public Student() {
    this.std_Id = 0;
    this.std_FullName = "";
    this.hrs = 0;
    this.ratePerhrs = 0;
  }

  public Student(int studentId, String studentFullname, int hours, double hourlyrate) {
    this.std_Id = studentId;
    this.std_FullName = studentFullname;
    this.hrs = hours;
    this.ratePerhrs = hourlyrate;
  }

  // Getters and Setters
  public int getStd_Id() {
    return std_Id;
  }

  public void setStd_Id(int std_Id) {
    this.std_Id = std_Id;
  }

  public String getStd_FullName() {
    return std_FullName;
  }

  public void setStd_FullName(String std_FullName) {
    this.std_FullName = std_FullName;
  }

  public int getHrs() {
    return hrs;
  }

  public void setHrs(int hrs) {
    this.hrs = hrs;
  }

  public double getRatePerhrs() {
    return ratePerhrs;
  }

  public void setRatePerhrs(double ratePerhrs) {
    this.ratePerhrs = ratePerhrs;
  }

  public String toString() {
    return String.format("[Student Id: %d, Student Full Name: %s, Hours: %d, Hourly Rate: %.2f]", std_Id,
        std_FullName,
        hrs, ratePerhrs);
  }
}
