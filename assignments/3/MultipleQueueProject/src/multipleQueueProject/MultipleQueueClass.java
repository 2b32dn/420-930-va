package multipleQueueProject;

public class MultipleQueueClass {
  public int queueFrontA;
  public int queueRearA;
  public int queueFrontB;
  public int queueRearB;
  public int maxQueueSize;
  public int countA;
  public int countB;
  public Integer[][] list;

  public MultipleQueueClass(int maxSize) {
    this.queueFrontA = 0;
    this.queueRearA = maxQueueSize - 1;
    this.queueFrontB = 0;
    this.queueRearB = maxQueueSize - 1;
    this.countA = 0;
    this.countB = 0;
    this.maxQueueSize = 5;
    this.list = new Integer[2][maxSize];
  }

  // Operations
  public void addQueue(Integer num) {
    if (countA == maxQueueSize || countB == maxQueueSize) {
      System.out.println("Queue is full");
      return;
    } else if (countA == 0) {
      countA++;
      queueRearA = (queueRearA + 1) % maxQueueSize;
      list[0][queueRearA] = num;
      System.out.printf("The element named %d is queued in queueA system\n", num);
    } else if (countB == 0) {
      countB++;
      queueRearB = (queueRearB + 1) % maxQueueSize;
      list[1][queueRearB] = num;
      System.out.printf("The element named %d is queued in queueB system\n", num);
    } else if (countA == countB) {
      countA++;
      queueRearA = (queueRearA + 1) % maxQueueSize;
      list[0][queueRearA] = num;
      System.out.printf("The element named %d is queued in queueA system\n", num);
    } else if (countA < countB) {
      countB++;
      queueRearB = (queueRearB + 1) % maxQueueSize;
      list[0][queueRearB] = num;
      System.out.printf("The element named %d is queued in queueB system\n", num);
    } else {
      countB++;
      queueRearB = (queueRearB + 1) % maxQueueSize;
      list[1][queueRearB] = num;
      System.out.printf("The element named %d is queued in queueB system\n", num);
    }
  }

  public void deleteQueue() {
    if (countA > countB) {
      System.out.printf("\n%d has withdrawn from the queueA\n", list[0][queueFrontA]);
      countA--;
      list[0][queueFrontA] = null;
      queueFrontA = (queueFrontA + 1) % maxQueueSize;
    } else if (countA < countB) {
      System.out.printf("\n%d has withdrawn from the queueB\n", list[1][queueFrontB]);
      countB--;
      list[1][queueFrontB] = null;
      queueFrontB = (queueFrontB + 1) % maxQueueSize;
    } else {
      System.out.printf("\n%d has withdrawn from the queueA\n", list[0][queueFrontA]);
      countA--;
      list[0][queueFrontA] = null;
      queueFrontA = (queueFrontA + 1) % maxQueueSize;
    }
  }

  public void displayQueues() {
    System.out.printf("\nThe front of the queue A is: %d\n", list[0][queueFrontA]);
    System.out.printf("The back of the queue A is: %d\n", list[0][queueRearA]);
    System.out.printf("The number of elements in the queue A is: %d\n", countA);
  }
}
