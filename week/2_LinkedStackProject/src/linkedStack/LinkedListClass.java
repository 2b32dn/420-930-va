package linkedStack;

public class LinkedListClass {
  // Data attributes
  private LinkedListNode first;
  private LinkedListNode last;

  public LinkedListClass() {
    this.first = null;
    this.last = null;
  }

  // Add a new node to the linked list
  public void add(int num) {
    LinkedListNode newNode = new LinkedListNode();
    newNode.info = num;
    newNode.link = null;

    if (first == null) {
      first = newNode;
      last = newNode;
    } else {
      last.link = newNode;
    }
    last = newNode;
  }

  // Traverse the linked list and print the info of each node
  public void print() {
    LinkedListNode current = first;

    while (current != null) {
      System.out.println(current.info);
      current = current.link;
    }
  }
}
