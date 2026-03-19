// Question 2 — Server Load Analyzer
// (Divide & Conquer)
// Problem Statement
// A company records CPU load every minute.
// Find the maximum load using Divide & Conquer approach.
// Constraints
// ● 1 ≤ n ≤ 10^6

// Sample Input
// 6
// 45 60 20 90 30 80
// Sample Output
// 90
// Test Case
// Input

// 4
// 10 5 2 1
// Output
// 10
import java.util.Scanner;
public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] loads = new int[n];
        for (int i = 0; i < n; i++) {
            loads[i] = sc.nextInt();
        }
        int maxLoad = findMaxLoad(loads, 0, n - 1);
        System.out.println(maxLoad);
    }

    private static int findMaxLoad(int[] loads, int left, int right) {
        if (left == right) {
            return loads[left];
        }
        int mid = left + (right - left) / 2;
        int leftMax = findMaxLoad(loads, left, mid);
        int rightMax = findMaxLoad(loads, mid + 1, right);
        return Math.max(leftMax, rightMax);
    }
}