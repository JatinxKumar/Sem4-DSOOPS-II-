public class fibbn {
    public static int fibbn(int n) {
        if (n == 0 || n == 1)
            return n;
        return fibbn(n - 1) + fibbn(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <=n; i++) {
            System.out.println(fibbn(i));
        }
    }
}
