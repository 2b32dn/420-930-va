package lambdaExpressionProject;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestCarHashMapLambdaExpression {
  public static void main(String[] args) {
    Map<String, Car> carHashMap = new HashMap<>();

    // Create HashMap Collection
    Car car1 = new Car("K1875638", "Subaru", 40000.00);
    Car car2 = new Car("M1095638", "Ford", 45000.00);
    Car car3 = new Car("G1555638", "Honda", 25000.00);
    Car car4 = new Car("F1875338", "BMW", 55000.00);

    // Loading HashMap Collection
    carHashMap.put(car1.getVin(), car1);
    carHashMap.put(car2.getVin(), car2);
    carHashMap.put(car3.getVin(), car3);
    carHashMap.put(car4.getVin(), car4);

    System.out.println("Searching by vin: ");
    Car carFound = carHashMap.get(car3.getVin());

    if (carFound != null) {
      System.out.printf("Car has been found with VIN number %s\n", carFound.getVin());
    }

    // Print all keys
    Set<String> carKeys = carHashMap.keySet();
    for (String car : carKeys) {
      System.out.println(car);
    }

    // Print all keys
    Collection<Car> carCollection = carHashMap.values();
    for (Car car : carCollection) {
      System.out.println(car);
    }

    System.out.println("Print all keys using lambda expression:");
    carHashMap.forEach((key, value) -> {
      System.out.println(key);
    });
    carHashMap.forEach((key, value) -> {
      System.out.println(value);
    });
  }
}
