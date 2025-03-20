package collectionExamplesProject;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSetCollection {
  public static void main(String[] args) {
    Set<String> set1 = new TreeSet<>();
    set1.add("Pear");
    set1.add("Pear");
    set1.add("Pear");
    set1.add("Pear");
    set1.add("Pear");

    System.out.println("Print Elements");
    for (String str : set1) {
      System.out.println(str);
    }
  }
}