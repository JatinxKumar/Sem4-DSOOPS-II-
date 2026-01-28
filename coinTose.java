public class coinTose {
    public static void coinToss(int n, String result) {
        // base case
        if (n == 0) {
            System.out.println(result);
            return;
        }
        // recursive calls
        coinToss(n - 1, result + "H"); // heads
        coinToss(n - 1, result + "T"); // tails
    }
    public static void main(String[] args) {
        int n = 3; // number of coin tosses
        coinToss(n, "");
    }
}
