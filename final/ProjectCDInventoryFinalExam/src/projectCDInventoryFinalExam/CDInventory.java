package projectCDInventoryFinalExam;

public class CDInventory {
  private Integer CD_No;
  private String CD_Name;
  private Integer CD_Qty;
  private double CD_Price;

  // Default Constructor
  public CDInventory() {
    this.CD_No = 0;
    this.CD_Name = "";
    this.CD_Qty = 0;
    this.CD_Price = 0;
  }

  // Parameterized Constructor
  public CDInventory(Integer id, String name, Integer qty, double price) {
    this.CD_No = id;
    this.CD_Name = name;
    this.CD_Qty = qty;
    this.CD_Price = price;
  }

  // Getters and Setters
  public Integer getCD_No() {
    return CD_No;
  }

  public void setCD_No(Integer cD_No) {
    CD_No = cD_No;
  }

  public String getCD_Name() {
    return CD_Name;
  }

  public void setCD_Name(String cD_Name) {
    CD_Name = cD_Name;
  }

  public double getCD_Qty() {
    return CD_Qty;
  }

  public void setCD_Qty(Integer cD_Qty) {
    CD_Qty = cD_Qty;
  }

  public double getCD_Price() {
    return CD_Price;
  }

  public void setCD_Price(double cD_Price) {
    CD_Price = cD_Price;
  }

  // Methods
  public Double caculateTotalInv() {
    return CD_Qty * CD_Price;
  }

  public String toString() {
    return String.format("The information is %d//%s//%d//%.2f//%.2f$",
        CD_No, CD_Name, CD_Qty, CD_Price, caculateTotalInv());
  }
}
