// A warehouse stores packages in a straight line. Due to a conveyor belt issue, the order of
// packages must be completely reversed using an automated robot.
// The robot swaps the first and last package, then calls itself to rearrange the remaining middle
// section.
// Task:
// Use recursion to reverse the array of package IDs.
package Recursion_Problems;

public class four {
    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        // Swap the elements at start and end indices
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call for the next pair
        reverseArray(arr, start + 1, end - 1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr, 0, arr.length - 1);

        // Print the reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
