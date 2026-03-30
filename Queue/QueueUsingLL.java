class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}

public class QueueUsingLL {
    Node front;
    Node rear;

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("Queue underflow");
            return;
        }
        System.out.println("Dequeued: " + front.data);
        front = front.next;
        if (front == null) {
            rear = null;
        }
    }

    public void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void peek() {
        if (front == null) {
            System.out.println("Queue empty");
            return;
        }
        System.out.println("Peek: " + front.data);
    }

    public static void main(String[] args) {
        QueueUsingLL q = new QueueUsingLL();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
        q.peek();
        q.enqueue(40);
        q.enqueue(50);
        q.display();
    }
}
