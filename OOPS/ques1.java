// Q1. University Result Processing System
// Problem Statement
// Chitkara University wants to build a result processing system.
// Each student has:
// ● roll number
// ● name
// ● marks in 5 subjects

// Tasks:
// 1. Create a Student class.
// 2. Calculate total marks using recursion.
// 3. Sort students based on total marks using Divide & Conquer strategy.
// 4. Count how many students were originally out of rank order (inversions).
import java.util.Arrays;
import java.util.Comparator;
class Student {
    int rollNumber;
    String name;
    int[] marks;

    public Student(int rollNumber, String name, int[] marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    public int getTotalMarks() {
        return calculateTotalMarks(marks, 0);
    }

    private int calculateTotalMarks(int[] marks, int index) {
        if (index == marks.length) {
            return 0;
        }
        return marks[index] + calculateTotalMarks(marks, index + 1);
    }
}
public class ques1 {
    public static void main(String[] args) {
        Student[] students = {
            new Student(1, "Alice", new int[]{85, 90, 78, 92, 88}),
            new Student(2, "Bob", new int[]{80, 85, 82, 88, 90}),
            new Student(3, "Charlie", new int[]{90, 92, 95, 91, 89}),
            new Student(4, "David", new int[]{70, 75, 80, 85, 90}),
            new Student(5, "Eve", new int[]{88, 90, 85, 87, 91})
        };

        // Sort students based on total marks
        Arrays.sort(students, Comparator.comparingInt(Student::getTotalMarks).reversed());

        // Print sorted students
        System.out.println("Sorted Students:");
        for (Student student : students) {
            System.out.println(student.name + " - Total Marks: " + student.getTotalMarks());
        }

        // Count inversions
        int inversions = countInversions(students);
        System.out.println("Number of inversions: " + inversions);
    }

    private static int countInversions(Student[] students) {
        int inversions = 0;
        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getTotalMarks() < students[j].getTotalMarks()) {
                    inversions++;
                }
            }
        }
        return inversions;
    }
}