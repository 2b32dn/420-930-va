package streamProcessingProject;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class TestStreamStringProcessing {
  public static void main(String[] args) {
    Set<String> fruitBasket = new HashSet<>();
    fruitBasket.add("Pear");
    fruitBasket.add("Apple");
    fruitBasket.add("Strawberry");
    fruitBasket.add("Banana");
    fruitBasket.add("orange");
    fruitBasket.add("blackberry");

    System.out.println("\nPrint all elements of fruitBasket");
    fruitBasket.forEach(System.out::println);

    System.out.println("\nPrint all elements in Sorted");
    fruitBasket.stream().sorted().forEach(System.out::println);

    System.out.println("\nPrint all elements in Sorted reverseOrder");
    fruitBasket.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    System.out.println("\nPrint all elements where length > 6");
    fruitBasket.stream().filter(ele -> ele.length() > 6).forEach(System.out::println);

    System.out.println("\nStart with given character: " +
        fruitBasket.stream().anyMatch(ele -> ele.startsWith("St"))); // returns a boolean

    System.out.println("\nEnd with given character: " +
        fruitBasket.stream().anyMatch(ele -> ele.endsWith("ry"))); // returns a boolean

    System.out.println("\nIf Banana exist in collection: " +
        fruitBasket.stream().anyMatch(ele -> ele.contains("Banana"))); // returns a boolean

    Predicate<String> p1 = s -> s.contains("Banana") || s.startsWith("St");
    System.out.printf("\nTesting p1 using fruitBasket: %b\n", fruitBasket.stream().anyMatch(p1));

    System.out.printf("\nTesting p1 against an given element: ");
    if (p1.test("Steward")) {
      System.out.println("Element matches with Steward");
    }
    System.out.println("\nCreate new collection ArrayList from Set colection:");
    List<String> fruitList = fruitBasket.stream().map(e -> e.toUpperCase()).collect(Collectors.toList());
    fruitList.forEach(System.out::println);
  }
}
