// SubSequence of "abc" recursion se
public class SubSequence{
    public static void subsequence(String str, String newStr){
        // base case
        if (str.length() == 0) {
            System.out.println(newStr);
            return;
        }
        char ch = str.charAt(0);
        String rest = str.substring(1);
        // exclude the character
        subsequence(rest, newStr);
        // include the character
        subsequence(rest, newStr + ch);
    }
    public static void main(String[] args) {
        String str = "abc";
        subsequence(str, "");
    }
}