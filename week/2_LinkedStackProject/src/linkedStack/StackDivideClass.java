package linkedStack;

public class StackDivideClass {

  LinkedListDivideNode stackDivideTop;

  public StackDivideClass() {
    stackDivideTop = null;
  }

  public void push(Divide dvd) {
    LinkedListDivideNode newDivideNode = new LinkedListDivideNode();
    newDivideNode.info = dvd;

    if (stackDivideTop == null) {
      newDivideNode.link = null;
    } else {
      newDivideNode.link = stackDivideTop;
    }

    stackDivideTop = newDivideNode;
  }

  public Divide peek() {
    return stackDivideTop.info;
  }

  public void pop() throws Exception {
    if (stackDivideTop == null) {
      throw new Exception("Stack is empty");
    }
    stackDivideTop = stackDivideTop.link;
  }

  public void print() {
    LinkedListDivideNode traverseNode = stackDivideTop;
    while (traverseNode != null) {
      System.out.println(traverseNode.info.getX() + " " + traverseNode.info.getY());
      traverseNode = traverseNode.link;
    }
  }
}
