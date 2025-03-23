package genericPointProject;

public class TestGenericPoint {
  public static void main(String[] args) {
    // Instantiate an object where its data attribute of type String
    // Call toString()
    Point<String> strPoint = new Point<String>("Dickson", "Lee");
    System.out.println(strPoint);

    // Instantiate an object where its data attribute of type Number
    // Call toString()
    Point<Number> intNumber = new Point<Number>(12.3, 66.6);
    System.out.println(intNumber);

    // Test printArray
    String[] y = { "A", "B", "C", "D" };
    Integer[] x = { 2, 4, 9, 10 };
    strPoint.printArray(y);
    intNumber.printArray(x);

    // printArray2 accepts any amount of actual parameters
    strPoint.printArray2(10, 20);
  }
}
