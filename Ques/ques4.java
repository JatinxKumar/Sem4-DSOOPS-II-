// Question 4 — Student Ranking System
// (Merge Sort Variant)
// Problem Statement
// Sort students by marks.
// If marks equal → sort by roll number.
// Constraints
// ● 1 ≤ n ≤ 10^5

// Sample Input
// 3
// 101 90
// 102 80
// 103 90
// Sample Output
// 102 80
// 101 90
// 103 90
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            int rollNumber = sc.nextInt();
            int marks = sc.nextInt();
            students[i] = new Student(rollNumber, marks);
        }
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.marks != s2.marks) {
                    return Integer.compare(s1.marks, s2.marks);
                } else {
                    return Integer.compare(s1.rollNumber, s2.rollNumber);
                }
            }
        });
        for (Student student : students) {
            System.out.println(student.rollNumber + " " + student.marks);
        }
    }

    static class Student {
        int rollNumber;
        int marks;

        Student(int rollNumber, int marks) {
            this.rollNumber = rollNumber;
            this.marks = marks;
        }
    }
}