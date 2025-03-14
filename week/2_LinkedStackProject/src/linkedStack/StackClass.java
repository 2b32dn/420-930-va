package linkedStack;

public class StackClass {
  LinkedListNode stackTop;

  public StackClass() {
    stackTop = null;
  }

  public void push(int num) {
    LinkedListNode newNode = new LinkedListNode();
    newNode.info = num;

    if (stackTop == null) {
      newNode.link = null;
    } else {
      newNode.link = stackTop;
    }
    stackTop = newNode;
  }

  public int peek() throws Exception {
    if (stackTop == null) {
      throw new Exception("Stack is empty");
    }
    return stackTop.info;
  }

  public void pop() throws Exception {
    if (stackTop == null) {
      throw new Exception("Stack is empty");
    }
    stackTop = stackTop.link;
  }

  public void print() {
    LinkedListNode traverseNode = stackTop;
    while (traverseNode != null) {
      System.out.println(traverseNode.info);
      traverseNode = traverseNode.link;
    }
  }
}
