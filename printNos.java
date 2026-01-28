// print n elements using recursion
public class printNos{
    public static void printN(int n){
        // base case
        if(n==0){
            return;
        }
        // recursive call
        printN(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 5;
        printN(n);
    }
}