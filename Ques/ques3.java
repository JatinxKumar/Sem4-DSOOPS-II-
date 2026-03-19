// Question 3 — Warehouse Unique Product
// Finder (Bit Masking)
// Problem Statement
// In a warehouse, product IDs appear three times except one.
// Find the unique ID.
// Constraints
// ● 1≤ n ≤ 10^6

// Sample Input
// 7
// 5 5 5 8 8 8 3
// Sample Output
// 3
// Test Case
// Input
// 4
// 9 9 9 7
// Output
// 7
import java.util.Scanner;
public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ids = new int[n];
        for (int i = 0; i < n; i++) {
            ids[i] = sc.nextInt();
        }
        int uniqueId = findUniqueId(ids);
        System.out.println(uniqueId);
    }

    private static int findUniqueId(int[] ids) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int id : ids) {
                if ((id & (1 << i)) != 0) {
                    sum++;
                }
            }
            if (sum % 3 != 0) {
                result |= (1 << i);
            }
        }
        return result;
    }
}