package projectThreeLinkedList;

import java.util.*;

public class TestThreeLinkedList {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    LinkedListNode headNode1 = null, newNode1, currentNode1 = null, tailNode1 = null;
    LinkedListNode headNode2 = null, newNode2, currentNode2 = null;
    LinkedListNode headNode3 = null, newNode3, currentNode3 = null, tailNode3 = null;
    int num = 0, diff = 0;

    System.out.println("Please enter number until the end -999: ");
    while (num != -999) {
      num = userInput.nextInt();
      if (num == -999) {
        break;
      }
      // Insert the data in a forward manner for headNode1
      newNode1 = new LinkedListNode(num);
      newNode1.info = num;
      newNode1.link = null;

      if (headNode1 == null) {
        headNode1 = newNode1;
        tailNode1 = newNode1;
      } else {
        tailNode1.link = newNode1;
        tailNode1 = newNode1;
      }

      // Insert the data in a backward manner for headNode2
      newNode2 = new LinkedListNode(num * 2);
      newNode2.link = headNode2;
      headNode2 = newNode2;
    }

    // Display First and Second LinkedListNode
    System.out.println(
        "\n\nDisplaying the components of the linked list stored from user input in forward and backward manners\n\n");
    currentNode1 = headNode1;
    currentNode2 = headNode2;
    while (currentNode1 != null && currentNode2 != null) {
      System.out.printf("Value in the First Linked List: %d, Value in the Second Linked List: %d\n",
          currentNode1.info,
          currentNode2.info);

      // Calculate difference between the Linked Lists for each row of data
      // Add the difference value into newNode3
      diff = currentNode1.info - currentNode2.info;
      newNode3 = new LinkedListNode(diff);
      if (headNode3 == null) {
        headNode3 = newNode3;
        tailNode3 = newNode3;
      } else {
        tailNode3.link = newNode3;
        tailNode3 = newNode3;
      }

      currentNode1 = currentNode1.link;
      currentNode2 = currentNode2.link;
    }

    // Displaying the First Linked List
    System.out.println(
        "\n\nDisplaying the components of the First Linked List in Forward manner");
    currentNode1 = headNode1;
    while (currentNode1 != null) {
      System.out.printf("value: %d\n", currentNode1.info);
      currentNode1 = currentNode1.link;
    }

    // Displaying the Second Linked List
    System.out.println(
        "\n\nDisplaying the components of the Second Linked List in Backward manner");
    currentNode2 = headNode2;
    while (currentNode2 != null) {
      System.out.printf("value: %d\n", currentNode2.info);
      currentNode2 = currentNode2.link;
    }

    // Displaying the Third Linked List
    System.out.println(
        "\n\nDisplaying the components of the Third Linked List in Forward manner");
    currentNode3 = headNode3;
    while (currentNode3 != null) {
      System.out.printf("value: %d\n", currentNode3.info);
      currentNode3 = currentNode3.link;
    }
    userInput.close();
  }
}
