class Queue {

  private int maxSize;
  private int[] queueArray;
  private int front;
  private int rear;
  private int nItems;

  public Queue(int size) {
    maxSize = size;
    queueArray = new int[maxSize];
    front = 0;
    rear = -1;
    nItems = 0;
  }

  public void insert(int value) {
    if (rear == maxSize - 1) rear = -1;
    queueArray[++rear] = value;
    nItems++;
  }

  public int remove() {
    int temp = queueArray[front++];
    if (front == maxSize) front = 0;
    nItems--;
    return temp;
  }

  public int peekFront() {
    return queueArray[front];
  }

  public boolean isEmpty() {
    return (nItems == 0);
  }

  public boolean isFull() {
    return (nItems == maxSize);
  }

  public int size() {
    return nItems;
  }
}

public class Main {

  public static void main(String[] args) {
    Queue myQueue = new Queue(5); // Membuat objek Queue dengan kapasitas 5

    myQueue.insert(10);
    myQueue.insert(20);
    myQueue.insert(30);
    myQueue.insert(40);

    System.out.println("Elemen yang dihapus: " + myQueue.remove());

    myQueue.insert(50);
    myQueue.insert(60);

    while (!myQueue.isEmpty()) {
      int n = myQueue.remove();
      System.out.print(n);
      System.out.print(" ");
    }
    System.out.println();
  }
}
