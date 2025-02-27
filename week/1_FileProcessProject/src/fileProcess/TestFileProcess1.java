// Compile:
// On ~/420-930-va/week/1_FileProcessProject/src
// javac fileProcess/TestFileProcess1.java
// java fileProcess/TestFileProcess1.java

package fileProcess;

import java.util.*;
import java.io.*;

public class TestFileProcess1 {
  public static void main(String[] args) throws IOException {
    System.out.println("hello world");
    Scanner inFile = new Scanner(new FileReader("../data.in"));

    double x, y;
    while (inFile.hasNextLine()) {
      x = inFile.nextDouble();
      y = inFile.nextDouble();

      // printf only works for console
      System.out.printf("x = %.2f, y = %.2f, Division is %.2f\n", x, y, x / y);
    }
    inFile.close();
  }
}