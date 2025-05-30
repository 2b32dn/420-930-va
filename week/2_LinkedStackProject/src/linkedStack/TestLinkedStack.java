package linkedStack;

public class TestLinkedStack {
  public static void main(String[] args) throws Exception {
    // Call Methods: add, print...
    // LinkedListClass is USER-DEFINED Class
    LinkedListClass myClass = new LinkedListClass();
    myClass.add(10);
    myClass.add(15);
    myClass.add(20);
    myClass.add(25);
    myClass.print();

    // Call Methods: push, peek, pop...
    // USER-DEFINED Class: StackClass
    StackClass myStack = new StackClass();
    myStack.push(40);
    myStack.push(50);
    myStack.push(60);
    myStack.push(70);

    // System-defined Class: Stack in the Java Collection Framework
    // Stack myStack2 = new Stack(); Same concept as StackClass

    System.out.println("Top of the stack: " + myStack.peek());
    System.out.println("Pop the top of the stack");
    myStack.pop();
    System.out.println("Traverse the linked list and prind the nodes of the stack: ");
    myStack.print();
    System.out.println("Top of the stack: " + myStack.peek());

  }
}
