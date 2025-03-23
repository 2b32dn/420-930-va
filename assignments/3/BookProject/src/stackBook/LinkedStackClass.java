package stackBook;

public class LinkedStackClass {
  BookNode stackTop;

  public LinkedStackClass() {
    stackTop = null;
  }

  public void push(Book book) {
    BookNode newBookNode = new BookNode();
    newBookNode.info = book;

    if (stackTop == null) {
      newBookNode.link = null;
    } else {
      newBookNode.link = stackTop;
    }
    stackTop = newBookNode;
  }

  public Book pop() {
    BookNode temp = stackTop;
    stackTop = stackTop.link;
    return temp.info;
  }

  public Book peek() {
    return stackTop.info;
  }

  public void print() {
    BookNode traveseBookNode = stackTop;
    while (traveseBookNode != null) {
      System.out.println(traveseBookNode.info);
      traveseBookNode = traveseBookNode.link;
    }
  }
}
