// Kth Smallest (Quick Select)
public class eight {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                int t = arr[i]; arr[i] = arr[j]; arr[j] = t;
                i++;
            }
        }

        int t = arr[i]; arr[i] = arr[high]; arr[high] = t;
        return i;
    }

    public static int quickSelect(int[] arr, int low, int high, int k) {
        if (low == high) return arr[low];

        int pi = partition(arr, low, high);
        if (pi == k) return arr[pi];
        else if (pi > k) return quickSelect(arr, low, pi - 1, k);
        else return quickSelect(arr, pi + 1, high, k);
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 4};
        int k = 3;
        System.out.println(k + "rd smallest element is: " + quickSelect(arr, 0, arr.length - 1, k - 1));
    }
}
