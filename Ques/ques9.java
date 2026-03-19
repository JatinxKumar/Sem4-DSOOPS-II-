// Question 9 — Bitwise Permission System
// Problem Statement

// Each employee has permission encoded as bitmask.
// Find employees having both READ and WRITE permission.
// READ = 1
// WRITE = 2
// EXECUTE = 4
// Sample Input
// 5
// 3 1 7 2 5
// Sample Output
// 3 7
import java.util.Scanner;
public class ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] permissions = new int[n];
        for (int i = 0; i < n; i++) {
            permissions[i] = sc.nextInt();
        }
        for (int permission : permissions) {
            if ((permission & 3) == 3) { // Check if both READ and WRITE are set
                System.out.print(permission + " ");
            }
        }
    }
}