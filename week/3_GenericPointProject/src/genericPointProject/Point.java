package genericPointProject;

// Generic Class for all Data Types
public class Point<T> {
  private T x;
  private T y;

  // Constructor
  public Point(T x, T y) {
    this.x = x;
    this.y = y;
  }

  // Getters and Setters
  public T getX() {
    return x;
  }

  public void setX(T x) {
    this.x = x;
  }

  public T getY() {
    return y;
  }

  public void setY(T y) {
    this.y = y;
  }

  // Generic Method Case 1
  public void printArray(T[] v_array) {
    for (int i = 0; i < v_array.length; i++) {
      System.out.print(v_array[i] + " ");
    }
    System.out.println("");
  }

  // Generic Method Case 2
  // printArray2(T num1)
  // printArray2(T num1, T num2)
  // printArray2(T num1, T num2, T num3)
  // Rule: ... parameter has to be the last argument
  public <T> void printArray2(T... v_list) {
    for (T elem : v_list) {
      System.out.print(elem + " ");
    }
    System.out.println("");
  }

  // Methods to toString
  public String toString() {
    return "Point [x=" + x + ", y=" + y + "]";
  }
}
