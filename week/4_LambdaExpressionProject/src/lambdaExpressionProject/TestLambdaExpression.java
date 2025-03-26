package lambdaExpressionProject;

import java.util.HashSet;
import java.util.Set;

public class TestLambdaExpression {
  public static void main(String[] args) {
    Set<String> set1 = new HashSet<>();

    set1.add("pear");
    set1.add("grape");
    set1.add("apple");
    set1.add("banana");
    set1.add("lychee");

    System.out.println("Print Elements");
    for (String str : set1) {
      System.out.println(str);
    }

    System.out.println("Printing elements using Lambda expression");
    set1.forEach(fruit -> {
      System.out.println(fruit);
    });
    set1.forEach(fruit -> {
      String str = " fruit";
      System.out.println(fruit + str);
    });
  }
}
