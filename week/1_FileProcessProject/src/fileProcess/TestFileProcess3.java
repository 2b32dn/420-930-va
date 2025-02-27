// Compile:
// On ~/420-930-va/week/1_FileProcessProject/src
// javac fileProcess/TestFileProcess3.java
// java fileProcess/TestFileProcess3.java

package fileProcess;

import java.util.*;
import java.io.*;

// Advantage: Data type of columns is not of the same type
// Retrieve: input file data divide.in and store array of objects
// Inconvenient: size must be known

public class TestFileProcess3 {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner inFile = new Scanner(new FileReader("../data.in"));

    // Create class template Divide to increase resuability
    // We can include instance methods to calculate
    Divide[] arrayInFile = new Divide[4];
    double x, y;
    int index = 0;

    // Complete this by storing input file data.in into array of object arrayInFile
    // Loading data input data.in into array of object arrayInfile
    while (inFile.hasNextLine()) {
      x = inFile.nextDouble();
      y = inFile.nextDouble();

      arrayInFile[index] = new Divide(x, y);
      index++;
    }

    for (int i = 0; i < arrayInFile.length; i++) {
      System.out.println("x = " + arrayInFile[i].getX() + ", y = " + arrayInFile[i].getY()
          + ", Division is " + String.format("%.2f", arrayInFile[i].calDiv())
          + ", Addition is " + String.format("%.2f", arrayInFile[i].calAdd())
          + ", Substraction is " + String.format("%.2f", arrayInFile[i].calSubs())
          + ", Multiplication is " + String.format("%.2f", arrayInFile[i].calProd()));
    }

    inFile.close();
  }
}