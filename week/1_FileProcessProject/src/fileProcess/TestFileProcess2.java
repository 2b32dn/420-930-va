// Compile:
// On ~/420-930-va/week/1_FileProcessProject/src
// javac fileProcess/TestFileProcess2.java
// java fileProcess/TestFileProcess2.java

package fileProcess;

import java.util.*;
import java.io.*;

public class TestFileProcess2 {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner inFile = new Scanner(new FileReader("../data.in"));

    double[] x = new double[4];
    double[] y = new double[4];

    while (inFile.hasNextLine()) {
      for (int i = 0; i < 4; i++) {

        x[i] = inFile.nextDouble();
        y[i] = inFile.nextDouble();

        System.out.println("x = " + x[i] + ", y = " + y[i] + ", Division is " + String.format("%.2f", x[i] / y[i]));
      }
    }
    inFile.close();
  }
}