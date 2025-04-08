package streamProcessingProject;

import java.util.*;
import java.io.*;

public class TestStreamDivideProcessing {
  public static void main(String[] args) throws IOException {
    Scanner inputFile = new Scanner(new FileReader("./Divide.in"));
    Set<Divide> divideSet = new HashSet<>();
    while (inputFile.hasNext()) {
      divideSet.add(new Divide(inputFile.nextDouble(), inputFile.nextDouble()));
    }
    inputFile.close();

    divideSet.forEach(n -> {
      System.out.println(n);
    });
    divideSet.forEach(n -> {
      System.out.println(n.calculateDivision2());
    });

    // Apply Stream Processing
    System.out.println("\nUsing Stream Processing Filter method calculateDivision2");
    divideSet.stream().filter(e -> e.calculateDivision2() > 20.0).forEach(System.out::println);

    System.out.println("\nUsing Stream Procesing Filter method and count the record: ");
    System.out.println(divideSet.stream().filter(e -> e.calculateDivision2() > 20.0).count());

    System.out.println("\ndivideSet sorted by first column x:");
    divideSet.stream().sorted(Comparator.comparingDouble(n -> n.getX())).forEach(System.out::println);

    System.out.println("\ndivideSet sorted by first column x using ::");
    divideSet.stream().sorted(Comparator.comparingDouble(Divide::getX)).forEach(System.out::println);

    System.out.println("\ndivideSet sorted by first column y using ::");
    divideSet.stream().sorted(Comparator.comparingDouble(Divide::getY)).forEach(System.out::println);

    System.out.println("\ndivideSet sorted by calculateDivision2() ::");
    divideSet.stream().sorted(Comparator.comparingDouble(Divide::calculateDivision2)).forEach(
        n -> System.out.println(n + " calculateDivision2() = " + n.calculateDivision2()));
    ;

    System.out.println("\nUsing max(): ");
    System.out.println(
        divideSet.stream().max(Comparator.comparingDouble(Divide::calculateDivision2)).get().calculateDivision2());

    System.out.println("\nUsing min(): ");
    System.out.println(
        divideSet.stream().min(Comparator.comparingDouble(Divide::calculateDivision2)).get().calculateDivision2());
  }
}
