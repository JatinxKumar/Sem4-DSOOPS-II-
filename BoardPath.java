public class BoardPath {
    public static int countPath(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        int count = 0;
        for (int dice = 1; dice <= 6; dice++) {
            count += countPath(n - dice);
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 10; // Example board size
        System.out.println("Number of paths to reach the end: " + countPath(n));
    }
}
