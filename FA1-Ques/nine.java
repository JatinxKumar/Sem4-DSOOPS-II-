// Java program to count inversions in an array using merge sort
public class nine {
    static int count = 0;

public static void mergeSortCount(int[] arr, int l, int r) {
    if (l >= r) return;
    int mid = (l + r) / 2;

    mergeSortCount(arr, l, mid);
    mergeSortCount(arr, mid + 1, r);
    mergeAndCount(arr, l, mid, r);
}

static void mergeAndCount(int[] arr, int l, int mid, int r) {
    int[] temp = new int[r - l + 1];
    int i = l, j = mid + 1, k = 0;

    while (i <= mid && j <= r) {
        if (arr[i] <= arr[j]) temp[k++] = arr[i++];
        else {
            temp[k++] = arr[j++];
            count += (mid - i + 1);
        }
    }

    while (i <= mid) temp[k++] = arr[i++];
    while (j <= r) temp[k++] = arr[j++];

    System.arraycopy(temp, 0, arr, l, temp.length);
}
    public static void main(String[] args) {
        int[] arr = {1, 20, 6, 4, 5};
        mergeSortCount(arr, 0, arr.length - 1);
        System.out.println("Number of inversions: " + count);
    }
}
