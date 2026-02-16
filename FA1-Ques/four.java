// Generate All Subsets (Bit Masking)
import java.util.ArrayList;
import java.util.List;
public class four {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> subsets = generateSubsets(arr);
        System.out.println(subsets);
    }

    public static List<List<Integer>> generateSubsets(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;
        int totalSubsets = 1 << n; // 2^n subsets

        for (int i = 0; i < totalSubsets; i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) { // Check if the j-th bit is set
                    subset.add(arr[j]);
                }
            }
            result.add(subset);
        }
        return result;
    }
}


// or toher method
import java.util.*;

public static void generateSubsets(int[] arr) {
    int n = arr.length;
    int total = 1 << n;

    for (int mask = 0; mask < total; mask++) {
        List<Integer> subset = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if ((mask & (1 << i)) != 0)
                subset.add(arr[i]);
        }
        System.out.println(subset);
    }
}
 