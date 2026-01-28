public class Lexicographical {
    public static void printLexicographical(int n, int current) {
        if (current > n) {
            return;
        }
        System.out.println(current);
        for (int i = 0; i <= 9; i++) {
            int next = current * 10 + i;
            if (next > n) {
                break;
            }
            printLexicographical(n, next);
        }
    }
    public static void main(String[] args) {
        int n = 100;
        for (int i = 1; i <= 9; i++) {
            printLexicographical(n, i);
        }
    }
}
