// An email filter removes all special symbols (like #) from incoming messages before delivery.
// The system reads one character, decides whether to keep it or discard it, and then applies the
// same rule to the rest of the message.
// Task:
// Using recursion, remove a given character from the string.
package Recursion_Problems;

public class five {
    public static String removeChar(String str, char ch) {
        // Base case: if the string is empty, return an empty string
        if (str.isEmpty()) {
            return "";
        }

        // Check the first character
        char firstChar = str.charAt(0);
        String restOfString = str.substring(1);

        // Recursive call for the rest of the string
        String processedRest = removeChar(restOfString, ch);

        // If the first character is the one to be removed, skip it
        if (firstChar == ch) {
            return processedRest;
        } else {
            // Otherwise, include it in the result
            return firstChar + processedRest;
        }
    }

    public static void main(String[] args) {
        String input = "a#bc#d#ef#g";
        char charToRemove = '#';
        String result = removeChar(input, charToRemove);
        System.out.println(result); // Output: abcdefg
    }
}
