package nameIteratorPattern;

public class TestNameIteratorPattern {
  public static void main(String[] args) {
    // Program to an interface, not to the implementation
    // Return an object of typer iterator
    // Not of type NameIterator
    // Not of type oddNameIterator

    // All your traversal objects are of type Iterator
    // Testing in Iterator Design Pattern

    System.out.println("Without USING iterator pattern");
    NameIterator nameIteratorObj = new NameIterator();
    for (int i = 0; i < nameIteratorObj.names.length; i++) {
      System.out.printf("Name: %s\n", nameIteratorObj.names[i]);
    }

    System.out.println("\nWith USING iterator pattern");
    System.out.println("Works with ANY collection, no exposing of Collection within current tester class");
    NameRepository myNameRepository = new NameRepository();
    for (Iterator iterator = myNameRepository.getIterator(); iterator.hasNext();) {
      System.out.printf("Name: %s\n", iterator.next());
    }

    System.out.println("\nOdd Traversal USING iterator pattern");
    for (Iterator iterator = myNameRepository.getOddIterator(); iterator.hasNext();) {
      System.out.printf("Name: %s\n", iterator.next());
    }
  }
}
