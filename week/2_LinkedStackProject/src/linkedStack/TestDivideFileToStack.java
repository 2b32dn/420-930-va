package linkedStack;

import java.util.*;
import java.io.*;

public class TestDivideFileToStack {
  public static void main(String[] args) throws Exception {
    // Read from input File divide.in and load it into Stack
    Scanner inputFile = new Scanner(new FileReader("./divide.in"));
    StackDivideClass myStack = new StackDivideClass();

    while (inputFile.hasNextLine()) {
      Divide dvdObj = new Divide();
      dvdObj.setX(inputFile.nextInt());
      dvdObj.setY(inputFile.nextInt());
      myStack.push(dvdObj);
    }
    inputFile.close();

    myStack.print();
    myStack.pop();
    System.out.println("Top of the stack: " + myStack.peek().getX() + " " + myStack.peek().getY());
    myStack.print();
  }
}
