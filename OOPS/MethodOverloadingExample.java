class sum1 {
    void add() {
        int a = 10, b = 20;
        System.out.println("Sum of two numbers: " + (a + b));
    }

    void add(int a, int b) {
        System.out.println("Sum of two numbers: " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Sum of two numbers: " + (a + b));
    }
    public static void main(String[] args) {
        sum1 s = new sum1();
        s.add();
        s.add(15, 25);
        s.add(10.5, 20.5);
    }
}