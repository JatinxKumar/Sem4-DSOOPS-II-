import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();

        // Add elements to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Print the ArrayList
        System.out.println("Names: " + names);

        // Access an element by index
        String firstName = names.get(0);
        System.out.println("First name: " + firstName);

        // Remove an element
        names.remove("Bob");
        System.out.println("Names after removal: " + names);

        // Check if an element exists
        boolean hasCharlie = names.contains("Charlie");
        System.out.println("Contains Charlie: " + hasCharlie);

        // Get the size of the ArrayList
        int size = names.size();
        System.out.println("Size of the ArrayList: " + size);
    }

}