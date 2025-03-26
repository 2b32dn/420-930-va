package lambdaExpressionProject;

import java.util.*;
import java.util.function.Consumer;

public class TestLambdaExpressionConsumerMethod {
  public static void main(String[] args) {
    List<Integer> numberList = new ArrayList<>();

    numberList.add(10);
    numberList.add(15);
    numberList.add(05);
    numberList.add(-9);
    numberList.add(3);

    System.out.println("Invoke simple method: ");
    numberList.forEach((n) -> {
      System.out.println(n * 2);
    });

    // Apply this methodToDouble to each element of numberList collection
    System.out.println("Invoke simple method: ");
    Consumer<Integer> methodToDouble = n -> {
      System.out.println(n);
    };
    numberList.forEach(methodToDouble);

    System.out.println("Invoke complex Method: ");
    Consumer<Integer> fullMethod = n -> {
      int x = 2;
      System.out.println(n * 2 + x);
    };
    numberList.forEach(fullMethod);

    // Apply this fullMethod to each element of numberList collection
    System.out.println("Invoke full method providing clear coding: ");
    fullMethod = n -> invokeFullmethod(n);
    System.out.println("testing this fullMethod variable to given element:");
    fullMethod.accept(numberList.get(0));
    System.out.println("Apple this fullMethod to each element of numberList collection:");
    numberList.forEach(fullMethod);
  }

  public static void invokeFullmethod(int n) {
    int x = 2;
    double y = x - 6;
    System.out.println(n * 2 + x * y);
  }
}
