package clientStack;

public class LinkedStackClass {
  ClientNode stackTop;

  public LinkedStackClass() {
    stackTop = null;
  }

  public void push(Client client) {
    ClientNode newClientNode = new ClientNode();
    newClientNode.info = client;

    if (stackTop == null) {
      newClientNode.link = null;
    } else {
      newClientNode.link = stackTop;
    }
    stackTop = newClientNode;
  }

  public void print() {
    ClientNode traveseBookNode = stackTop;
    while (traveseBookNode != null) {
      System.out.println(traveseBookNode.info);
      traveseBookNode = traveseBookNode.link;
    }
  }

  public Client peek() {
    return stackTop.info;
  }
}
