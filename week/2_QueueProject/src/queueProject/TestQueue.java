package queueProject;

import java.util.*;

public class TestQueue {
  public static void main(String[] args) {
    // User-defined class
    // QueueClass myQueue = new QueueClass();

    // User-defined class
    QueueClass myQueue = new QueueClass();

    myQueue.deleteQueue();

    myQueue.addQueue(6);
    myQueue.addQueue(16);
    myQueue.addQueue(63);
    myQueue.addQueue(61);
    myQueue.addQueue(18);

    System.out.println("The number of elements in the queue: " + myQueue.count);
    System.out.println(
        "The index of the Queuefront: " + myQueue.queueFront + " and the value at index queueFront: "
            + myQueue.list[myQueue.queueFront]);
    System.out.println(
        "The index of the QueueRear: " + myQueue.queueRear + " and the value at index queueRear: "
            + myQueue.list[myQueue.queueRear]);

    myQueue.deleteQueue();
    System.out.println("The number of elements in the queue: " + myQueue.count);
    System.out.println(
        "The index of the Queuefront: " + myQueue.queueFront + " and the value at index queueFront: "
            + myQueue.list[myQueue.queueFront]);
    System.out.println(
        "The index of the QueueRear: " + myQueue.queueRear + " and the value at index queueRear: "
            + myQueue.list[myQueue.queueRear]);

    myQueue.addQueue(14);
    System.out.println("The number of elements in the queue: " + myQueue.count);
    System.out.println(
        "The index of the Queuefront: " + myQueue.queueFront + " and the value at index queueFront: "
            + myQueue.list[myQueue.queueFront]);
    System.out.println(
        "The index of the QueueRear: " + myQueue.queueRear + " and the value at index queueRear: "
            + myQueue.list[myQueue.queueRear]);

    myQueue.addQueue(20);
    myQueue.addQueue(21);
    myQueue.addQueue(22);
    myQueue.addQueue(23);

    System.out.println("The number of elements in the queue: " + myQueue.count);
    System.out.println(
        "The index of the Queuefront: " + myQueue.queueFront + " and the value at index queueFront: "
            + myQueue.list[myQueue.queueFront]);
    System.out.println(
        "The index of the QueueRear: " + myQueue.queueRear + " and the value at index queueRear: "
            + myQueue.list[myQueue.queueRear]);

    myQueue.addQueue(24);
    myQueue.addQueue(25);
    // System-defined class JCF
    // Queue<Integer> myStack2 = new LinkedList<>();
  }
}
