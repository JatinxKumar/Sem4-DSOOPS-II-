// An HR system stores employee IDs in an array. The HR manager wants to verify whether the
// IDs are arranged in increasing order before uploading them to the central server. Due to security
// rules, the system can only check one adjacent pair at a time and then pass the remaining work
// to the same process.
package Recursion_Problems;

import java.util.Scanner;

public class one {
    public static boolean isSorted(int[] arr,int index){
        if (index ==arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isSorted(arr, index + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr,0));
    }
}
