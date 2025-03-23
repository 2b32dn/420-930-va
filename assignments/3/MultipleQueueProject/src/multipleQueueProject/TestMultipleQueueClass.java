package multipleQueueProject;

public class TestMultipleQueueClass {
  public static void main(String[] args) {
    MultipleQueueClass myMultipleQueueClass = new MultipleQueueClass(5);

    myMultipleQueueClass.addQueue(6);
    myMultipleQueueClass.addQueue(17);
    myMultipleQueueClass.addQueue(5);
    myMultipleQueueClass.addQueue(20);
    myMultipleQueueClass.addQueue(15);

    myMultipleQueueClass.displayQueues();

    // Pop 6
    myMultipleQueueClass.deleteQueue();

    System.out.println("After dequeue: ");
    myMultipleQueueClass.displayQueues();

    myMultipleQueueClass.addQueue(30);
    myMultipleQueueClass.displayQueues();

    // Pop 5
    myMultipleQueueClass.deleteQueue();
    myMultipleQueueClass.displayQueues();

    myMultipleQueueClass.deleteQueue();
    myMultipleQueueClass.displayQueues();
  }
}
