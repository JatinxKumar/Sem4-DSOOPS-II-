// Question 7 — Duplicate Email Detector
// (HashSet Thinking)
// Problem Statement

// Company wants to count number of unique email IDs.
// Sample Input
// 5
// a@gmail.com
// b@gmail.com
// a@gmail.com
// c@gmail.com
// b@gmail.com
// Sample Output
// 3
import java.util.HashSet;
import java.util.Scanner;
public class ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<String> emailSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String email = sc.next();
            emailSet.add(email);
        }
        System.out.println(emailSet.size());
    }
}