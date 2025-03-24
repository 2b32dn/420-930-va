package clientStack;

public class Client {
  public int client_id;
  public String client_Name;
  public int client_Qty;
  public double client_Price;

  // Default Constructor
  public Client() {
    this.client_id = 0;
    this.client_Name = "";
    this.client_Qty = 0;
    this.client_Price = 0;
  }

  public Client(int clientId, String clientName, int clientQty, double clientPrice) {
    this.client_id = clientId;
    this.client_Name = clientName;
    this.client_Qty = clientQty;
    this.client_Price = clientPrice;
  }

  // Getters and Setters
  public int getClient_id() {
    return client_id;
  }

  public void setClient_id(int client_id) {
    this.client_id = client_id;
  }

  public String getClient_Name() {
    return client_Name;
  }

  public void setClient_Name(String client_Name) {
    this.client_Name = client_Name;
  }

  public int getClient_Qty() {
    return client_Qty;
  }

  public void setClient_Qty(int client_Qty) {
    this.client_Qty = client_Qty;
  }

  public double getClient_Price() {
    return client_Price;
  }

  public void setClient_Price(double client_Price) {
    this.client_Price = client_Price;
  }

  // Methods
  public double calculateTotal() {
    return client_Qty * client_Price;
  }

  public String toString() {
    return String.format(
        "The Client Information is %d//%s//%d//%.2f -> Client Total: %.2f$",
        client_id, client_Name,
        client_Qty,
        client_Price, calculateTotal());
  }
}
