// Question 10 — Recursive Folder Size
// Calculator
// Problem Statement
// A folder contains subfolders and file sizes.
// Compute total size recursively.
// Sample Input
// 3
// 100
// 200
// 300
// Sample Output
// 600
import java.util.Scanner;
public class ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalSize = calculateFolderSize(n, sc);
        System.out.println(totalSize);
    }

    private static int calculateFolderSize(int n, Scanner sc) {
        if (n == 0) {
            return 0;
        }
        int size = sc.nextInt();
        return size + calculateFolderSize(n - 1, sc);
    }
}
