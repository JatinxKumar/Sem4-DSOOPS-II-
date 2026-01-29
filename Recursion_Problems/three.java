// A security team reviews CCTV footage stored frame-by-frame in an array. A suspicious person
// appears multiple times in the footage. The team needs to find the last frame where the person
// appeared.
// Condition:
// The footage can be reviewed only sequentially, but the final answer must be the latest
// appearance.
// Task:

// Use recursion to find the last index of the target frame.
package Recursion_Problems;
import java.util.*;

public class three {
    public static int lastOccurance(int[] arr, int index, int target) {
        if (index == arr.length) {
            return -1;
        }

        int ans = lastOccurance(arr, index + 1, target);

        if (ans != -1) {
            return ans;
        }

        if (arr[index] == target) {
            return index;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        System.out.println(lastOccurance(arr, 0, target));
    }
}