package lambdaExpressionProject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class TestFunctionLambdaExpression {
  public static void main(String[] args) {
    // half references method that returns double
    Function<Integer, Double> half = n -> { // Integer = input, Double = output
      return n / 2.0;
    };

    double numYear = half.apply(10);
    System.out.printf("Half of numYear, %.1f\n", numYear);

    Function<Integer, Double> half2 = half.andThen(b -> {
      return b * 3;
    });
    System.out.println("Testing andThen method " + half2.apply(10)); // 15.0

    List<Integer> numberList = new ArrayList<>();
    numberList.add(10);
    numberList.add(15);
    numberList.add(05);
    numberList.add(-9);
    numberList.add(3);

    System.out.println("Way 1: Apply half against each element of numberList:");
    numberList.forEach(n -> {
      System.out.println(half.apply(n));
    });

    System.out.println("Way 2: Apply half against each element of numberList:");
    numberList.forEach(n -> {
      useHalf(n, half);
    });

    System.out.println("Printing element of collection using the method Reference operator :: ");
    numberList.forEach(System.out::println);
    // numberList.forEach(n->{System.out.println(n);}); equal

    // studentList.forEach(Student::calculate);
  }

  public static void useHalf(int n, Function<Integer, Double> half) {
    double halfResult = half.apply(n).doubleValue();
    System.out.println(halfResult);
  }
}
