// Question 5 — Traffic Signal Queue
// Simulation (Queue Logic)
// Problem Statement
// Vehicles arrive at signal.
// Signal allows k vehicles per green cycle.
// Print departure order.
// Constraints
// ● 1 ≤ n ≤ 10^5

// Sample Input
// 5
// 10 20 30 40 50
// 2
// Sample Output
// 10 20 30 40 50
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }
        int k = sc.nextInt();
        while (!queue.isEmpty()) {
            for (int i = 0; i < k && !queue.isEmpty(); i++) {
                System.out.print(queue.poll() + " ");
            }
        }
    }
}