// Question 1 — E-commerce Discount
// Optimizer (Recursion + Choice)
// Problem Statement
// An online store gives discount coupons.
// Each coupon reduces price by a certain value.
// You must find the minimum payable price by choosing any subset of coupons.
// Constraints
// ● 1≤ n ≤ 25
// ● 1≤ price ≤ 10^6

// Input
// ● Original price
// ● n
// ● coupon values

// Output
// ● Minimum payable price

// Sample Input
// 500
// 3
// 50 100 30
// Sample Output
// 320
import java.util.Scanner;
public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int n = sc.nextInt();
        int[] coupons = new int[n];
        for (int i = 0; i < n; i++) {
            coupons[i] = sc.nextInt();
        }
        int minPrice = findMinPrice(price, coupons, 0);
        System.out.println(minPrice);
    }

    private static int findMinPrice(int price, int[] coupons, int index) {
        if (index == coupons.length) {
            return price;
        }
        // Case 1: Include the current coupon
        int includePrice = findMinPrice(price - coupons[index], coupons, index + 1);
        // Case 2: Exclude the current coupon
        int excludePrice = findMinPrice(price, coupons, index + 1);
        // Return the minimum of both cases
        return Math.min(includePrice, excludePrice);
    }
}