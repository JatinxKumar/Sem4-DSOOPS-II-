public class SumOfNaturalNo {
    public static int SumNatu(int n) {
        if (n == 0) {
            return n;
        }
        return n + SumNatu(n-1);
    }
    public static void main(String[] args) {
        System.out.println(SumNatu(5));
    }
}
