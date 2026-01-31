// A records room contains thousands of files arranged in a line. A clerk is asked to find the first
// occurrence of a document with a specific reference number. He checks one file at a time and if
// it doesn’t match, asks the same process to continue from the next file.
package Recursion_Problems;

import java.util.Scanner;

public class two {
    static int firstOccurance(int[] arr, int index, int target) {
        if (index > arr.length - 1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return firstOccurance(arr, index + 1, target);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(firstOccurance(arr,0,target));
    }
}
