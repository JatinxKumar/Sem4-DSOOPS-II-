// Find Unique Element (XOR)
public class three {
    public static int findUnique(int[] arr) {
    int result = 0;
    for (int x : arr) result ^= x;
    return result;
}
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 4}; // Example array
        int unique = findUnique(arr);
        System.out.println("The unique element is: " + unique);
    }
}
