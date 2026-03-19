// Question 8 — Smart Dictionary Search
// (HashMap)
// Problem Statement
// Store words and frequency.
// Find the most frequent word.
// Sample Input
// 6
// java
// python
// java
// c
// python
// java
// Sample Output
// java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> wordFrequency = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }
        String mostFrequentWord = null;
        int maxFrequency = 0;
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }
        System.out.println(mostFrequentWord);
    }
}