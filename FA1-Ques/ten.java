// Differ by Exactly One Bit
public class ten {
public static boolean differByOneBit(int a, int b) {
    int x = a ^ b;
    return x != 0 && (x & (x - 1)) == 0;
}
    public static void main(String[] args) {
        int a = 5; // 0101 in binary
        int b = 4; // 0100 in binary
        System.out.println("Do " + a + " and " + b + " differ by exactly one bit? " + differByOneBit(a, b));
    }
}
