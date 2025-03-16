package linkedList;

import java.util.*;

public class TestLinkedList2 {

  static Scanner console = new Scanner(System.in);

  public static void main(String[] args) {
    // Allow the user to enter data fro console until sentinel is met -999 and
    // insert each value into linked list

    int num = 0;
    LinkedListNode headNode = null, newNode, currentNode = null;
    System.out.println("Please enter number until the end -999: ");

    while (num != -999) {
      num = console.nextInt();
      if (num == -999) {
        break;
      }

      newNode = new LinkedListNode();
      newNode.info = num;
      newNode.link = null;

      if (headNode == null) {
        headNode = newNode;
      } else {
        currentNode.link = newNode;
      }
      currentNode = newNode;
    }
    System.out.println("Displaying the components of the linked list stored from user input: ");
    currentNode = headNode;
    while (currentNode != null) {

      // process the current
      System.out.println("Value: " + currentNode.info);
      currentNode = currentNode.link;
    }
  }
}
