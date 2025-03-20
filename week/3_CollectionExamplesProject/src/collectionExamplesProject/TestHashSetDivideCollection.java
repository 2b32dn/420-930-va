package collectionExamplesProject;

import java.util.*;
import java.io.*;

public class TestHashSetDivideCollection {
  public static void main(String[] args) throws IOException {
    // read from input file divide.in and load it into hashset collection
    Scanner inputFile = new Scanner(new FileReader("./divide.in"));
    Set<Divide> mySet = new HashSet<>();

    while (inputFile.hasNext()) {
      Divide dvdObj = new Divide();
      dvdObj.setX(inputFile.nextDouble());
      dvdObj.setY(inputFile.nextDouble());
      mySet.add(dvdObj);
    }
    inputFile.close();

    System.out.println("Print all elements");
    for (Divide num : mySet) {
      System.out.printf("Divide Obj [x=%.2f, y=%.2f]\n", num.getX(), num.getY());
    }
  }
}
