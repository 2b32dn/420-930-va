package linkedList2;

import java.util.*;
import java.io.*;

public class TestFileToLinkedList {
  public static void main(String[] args) throws FileNotFoundException {
    // Read Input File data.in and load it into data structure linked List

    Scanner inputFile = new Scanner(new FileReader("./data.in"));
    LinkedListDivideNode headNode = null, newNode = null, currentNode = null;

    while (inputFile.hasNextLine()) {
      Divide dvdObj = new Divide();

      dvdObj.setX(inputFile.nextDouble());
      dvdObj.setY(inputFile.nextDouble());

      newNode = new LinkedListDivideNode();
      newNode.divideInfo = dvdObj;
      newNode.divideLink = null;

      if (headNode == null) {
        headNode = newNode;
      } else {
        currentNode.divideLink = newNode;
      }
      currentNode = newNode;
    }

    // Traverse and print
    System.out.println("Traverse the linked list to print nodes of linked list: ");
    currentNode = headNode;
    while (currentNode != null) {
      // process the current
      System.out.println(
          "The Sum of x = " + currentNode.divideInfo.getX() + ", y = " + currentNode.divideInfo.getY() + " is "
              + String.format("%.2f", currentNode.divideInfo.calAdd()));
      System.out.println(
          "The Substraction of x = " + currentNode.divideInfo.getX() + ", y = " + currentNode.divideInfo.getY() + " is "
              + String.format("%.2f", currentNode.divideInfo.calSubs()));
      System.out.println(
          "The Divsion of x = " + currentNode.divideInfo.getX() + ", y = " + currentNode.divideInfo.getY() + " is "
              + String.format("%.2f", currentNode.divideInfo.calDiv()));
      System.out.println(
          "The Production of x = " + currentNode.divideInfo.getX() + ", y = " + currentNode.divideInfo.getY() + " is "
              + String.format("%.2f", currentNode.divideInfo.calProd()));
      System.out.println("");
      currentNode = currentNode.divideLink;
    }

    inputFile.close();
  }
}
