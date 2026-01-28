public class TowerOfHanoi {
    public static void hanoi(int total, String src, String helper, String dest) {
        if (total == 1) {
            System.out.println("Transfer disc " + total + " from " + src + " to " + dest);
            return;
        }
        hanoi(total - 1, src, dest, helper);
        System.out.println("Transfer disc " + total + " from " + src + " to " + dest);
        hanoi(total - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int total = 5;
        hanoi(total, "Source", "Helper", "Destination");
    }
}