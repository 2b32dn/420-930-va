package arrayListProcess;

import java.util.*;
import java.io.*;

public class TestArrayList2 {
  public static void main(String[] args) throws FileNotFoundException {

    // Read from data.in and load it into arrayList
    Scanner inFile = new Scanner(new FileReader("data.in"));
    List<Divide> inFileArrayList = new ArrayList<>();

    // Read data.in and load it into arrayList object inFileArrayList
    while (inFile.hasNextLine()) {
      // inFileArrayList.add(new Divide(inFile.nextDouble(), inFile.nextDouble()));
      Divide dvdObj = new Divide();
      dvdObj.setX(inFile.nextDouble());
      dvdObj.setY(inFile.nextDouble());
      inFileArrayList.add(dvdObj);
    }

    // Print the content of array of object arrayInFileList
    for (Divide arr : inFileArrayList) {
      System.out.println(
          "The Sum of x = " + arr.getX() + ", y = " + arr.getY() + " is " + String.format("%.2f", arr.calAdd()));
      System.out.println("The Substraction of x = " + arr.getX() + ", y = " + arr.getY() + " is "
          + String.format("%.2f", arr.calSubs()));
      System.out.println(
          "The Divsion of x = " + arr.getX() + ", y = " + arr.getY() + " is " + String.format("%.2f", arr.calDiv()));
      System.out.println("The Production of x = " + arr.getX() + ", y = " + arr.getY() + " is "
          + String.format("%.2f", arr.calProd()));
      System.out.println("");
    }

    for (int i = 0; i < inFileArrayList.size(); i++) {
      double x = inFileArrayList.get(i).getX();
      double y = inFileArrayList.get(i).getY();

      System.out.printf("Addition: x = %.2f, y = %.2f \n", x, y,
          String.format("%.2f", inFileArrayList.get(i).calAdd()));
      System.out.printf("Substraction: x = %.2f, y = %.2f \n", x, y,
          String.format("%.2f", inFileArrayList.get(i).calSubs()));
      System.out.printf("Multiplication: x = %.2f, y = %.2f \n", x, y,
          String.format("%.2f", inFileArrayList.get(i).calDiv()));
      System.out.printf("Division: x = %.2f, y = %.2f \n\n", x, y,
          String.format("%.2f", inFileArrayList.get(i).calProd()));
    }

    inFile.close();
  }
}
