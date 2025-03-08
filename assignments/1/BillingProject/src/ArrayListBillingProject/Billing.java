package ArrayListBillingProject;

public class Billing {
  private double prd_Price;
  private int prd_Qty;
  public static double Fed_Tax;
  public static double Prv_Tax;

  // Default constructor
  public Billing() {
  }

  // Constructor with parameters
  public Billing(double prd_Price, int prd_Qty, double fed_Tax, double prv_Tax) {
    this.prd_Price = prd_Price;
    this.prd_Qty = prd_Qty;
    this.Fed_Tax = fed_Tax;
    this.Prv_Tax = prv_Tax;
  }

  public double getPrd_Price() {
    return prd_Price;
  }

  public void setPrd_Price(double prd_Price) {
    this.prd_Price = prd_Price;
  }

  public int getPrd_Qty() {
    return prd_Qty;
  }

  public void setPrd_Qty(int prd_Qty) {
    this.prd_Qty = prd_Qty;
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

  // Method to calculate billing
  public double calculateBilling() {
    double baseAmount = prd_Price * prd_Qty;
    return baseAmount + baseAmount * Fed_Tax + baseAmount * Prv_Tax;
  }

  // Method to convert to String
  public String toString() {
    return String.format("Product Price: %f\nProduct Quantity: %d\nFederal Tax: %f\nProvincial Tax: %f\n",
        prd_Price, prd_Qty, Fed_Tax, Prv_Tax);
  }
}
