import java.util.*;
class Main{
    public static void main(String[] args){
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(10);
        dq.addFirst(20);
        dq.addFirst(5);

        System.out.println(dq.removeLast()); // 10
        System.out.println(dq.removeFirst()); // 5
        System.out.println(dq.peekFirst()); // 20

        System.out.println(dq); // [20]);

    }
}