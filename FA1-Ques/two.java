// Count Set Bits
public class two {
    public static int countBits(int n) {
    int count = 0;
    while (n > 0) {
        count += (n & 1); // check last bit
        n >>= 1;
    }
    return count;
}
    public static void main(String[] args) {
        int n = 29; // Example number
        int setBits = countBits(n);
        System.out.println("Number of set bits in " + n + " is: " + setBits);
    }
}
