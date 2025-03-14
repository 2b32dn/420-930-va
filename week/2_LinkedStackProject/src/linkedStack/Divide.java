package linkedStack;

public class Divide {
  private double x;
  private double y;

  public Divide() {
    this.x = 0;
    this.y = 0;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public void setX(double x) {
    this.x = x;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double calDiv() {
    if (y == 0) {
      throw new ArithmeticException("Error: Cannot divide by 0");
    }
    return (x / y);
  }

  public double calAdd() {
    return x + y;
  }

  public double calSubs() {
    return x - y;
  }

  public double calProd() {
    return x * y;
  }
}
