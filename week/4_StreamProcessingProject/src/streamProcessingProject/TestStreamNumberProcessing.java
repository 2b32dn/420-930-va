package streamProcessingProject;

import java.util.*;

public class TestStreamNumberProcessing {
  public static void main(String[] args) {
    List<Double> numberList = new ArrayList<>();

    numberList.add(149.99);
    numberList.add(25.0);
    numberList.add(55.99);
    numberList.add(14.99);
    numberList.add(69.99);
    numberList.add(189.99);

    System.out.println("\nPrint all elements of numberlist:");
    numberList.forEach(System.out::println);

    System.out.println("\nCount the number of elements higher than 60:");
    int count = 0;
    for (Double price : numberList) {
      if (price > 60) {
        count++;
      }
    }
    System.out.println(count);

    System.out.println("\nNumber of elements using Stream processing calling filter() method:");
    System.out.println(numberList.stream().filter(e -> e > 60).count());

    System.out.println("\nUsing sorted(), Number of elements sorted:");

    numberList.stream().sorted().forEach(System.out::println);

    System.out.println("\nUsing max(), Max in numberList is:");
    System.out.println(numberList.stream().max(Double::compare).get());

    System.out.println("\nUsing min(), Max in numberList is:");
    System.out.println(numberList.stream().min(Double::compare).get());

    System.out.println("\nUsing sorted(reverseOrder()), Number of elements sorted:");
    numberList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    int comp = Double.compare(9, 9);
  }
}
