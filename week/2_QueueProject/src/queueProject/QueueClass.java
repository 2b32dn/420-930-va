package queueProject;

public class QueueClass {
  // data attributes
  public int queueFront; // Front of the queue. Keep track of the front of the queue (index)
  public int queueRear; // Rear of the queue. Keep track of the rear of the queue (index)
  public int count;
  public int maxQueueSize; // Maximum number of the queue
  public Integer[] list; // Maintain queue as an implemented Array

  // Constructor
  public QueueClass() {
    queueFront = 0;
    queueRear = maxQueueSize - 1;
    count = 0;
    maxQueueSize = 10;
    list = new Integer[maxQueueSize];
  }

  // Operations
  public void addQueue(Integer num) {
    if (isFullQueue()) {
      System.out.println("Queue is full");
      return;
    } else {
      count++;
      queueRear = (queueRear + 1) % maxQueueSize;
      list[queueRear] = num;
    }
  }

  public void deleteQueue() {

    if (isEmptyQueue()) {
      System.out.println("Queue is empty");
      return;
    } else {
      count--;
      list[queueFront] = null;
      queueFront = (queueFront + 1) % maxQueueSize;
    }
  }

  public boolean isEmptyQueue() {
    return (count == 0 ? true : false);
  }

  public boolean isFullQueue() {
    return (count == maxQueueSize);
  }
}
