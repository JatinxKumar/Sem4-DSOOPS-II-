public class QueueUsingArray {
    static int[] q = new int[5];
    static int front = 0;
    static int rear = -1;

    public static void enqueue(int data) {
        if (rear == q.length - 1) {
            System.out.println("Queue overflow");
            return;
        }
        q[++rear] = data;
    }

    public static void dequeue() {
        if (front > rear) {
            System.out.println("Queue underflow");
            return;
        }
        System.out.println("Dequeued: " + q[front]);
        front++;
    }

    public static void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(q[i] + " ");
        }
        System.out.println();
    }
    public static void peek() {
        if (front > rear) {
            System.out.println("Queue empty");
            return;
        }
        System.out.println("Peek: " + q[front]);
    }

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        display();
        dequeue();
        display();
        peek();
        enqueue(40);
        enqueue(50);
        enqueue(60);
        display();
    }
}
