class Node {

  int data;
  Node next;

  public Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class LinkedList {

  Node head;

  public void append(int data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
      return;
    }

    Node last = head;
    while (last.next != null) {
      last = last.next;
    }

    last.next = newNode;
  }

  public void display() {
    Node current = head;

    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }
}

public class Main {

  public static void main(String[] args) {
    LinkedList myList = new LinkedList();

    myList.append(1);
    myList.append(2);
    myList.append(3);

    System.out.println("Linked List:");
    myList.display();
  }
}
