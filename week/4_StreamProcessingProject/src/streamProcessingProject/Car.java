package streamProcessingProject;

public class Car {
  private String vin;
  private String brand;
  private double price;

  // Default Constructor
  public Car() {
    this.vin = "";
    this.brand = "";
    this.price = 0;
  }

  // Parameterized Constructor
  public Car(String vin, String brand, double price) {
    this.vin = vin;
    this.brand = brand;
    this.price = price;
  }

  // Getters and Setters
  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  // Methods
  public String toString() {
    return String.format("[vin: %s, brand: %s, price: %.2f]", vin, brand, price);
  }
}
