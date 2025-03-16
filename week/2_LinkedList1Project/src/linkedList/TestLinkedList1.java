package linkedList;

public class TestLinkedList1 {
  public static void main(String[] args) {
    // LinkedList construction of 5 nodes with info 20, 15, 4, 3, 10

    LinkedListNode head, newNode;

    head = new LinkedListNode();
    head.info = 24;

    newNode = new LinkedListNode();
    newNode.info = 56;
    head.link = newNode; // Linking the first node to the second one

    newNode = new LinkedListNode();
    newNode.info = 285;
    head.link.link = newNode; // Linking the second node to the third one

    newNode = new LinkedListNode();
    newNode.info = 3;
    head.link.link.link = newNode; // Linking the third node to the fourth one

    newNode = new LinkedListNode();
    newNode.info = 9;
    head.link.link.link.link = newNode; // Linking the fourth node to the fifth one

    newNode = new LinkedListNode();
    newNode.info = 77;
    head.link.link.link.link.link = newNode; // Linking the fourth node to the fifth one

    // Printing the data
    // System.out.println(head.info); // 20
    // System.out.println(head.link.info); // 15
    // System.out.println(head.link.link.info); // 4
    // System.out.println(head.link.link.link.info); // 3
    // System.out.println(head.link.link.link.link.info); // 10
    // System.out.println(newNode.info); // print the last reference address's value

    // Printing data using looping
    System.out.println("Displaying the components of the linked list");
    LinkedListNode current;
    current = head;
    while (current != null) {

      // process the current
      System.out.println("Value: " + current.info);
      current = current.link;
    }

    // Do not traverse with the head. it would reach null which will throw an error
    // while (head != null) {

    // // process the current
    // System.out.println(head.info);
    // current = current.link;
    // }
    // System.out.println(head.info);
  }
}
