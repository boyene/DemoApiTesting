package Demo1;

import java.util.Scanner;

public class StudentMarksAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];

        // Input marks from the user
        System.out.println("Enter marks of 5 students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Calculate total and average
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        double average = total / 5.0;

        // Find highest and lowest marks
        int highest = marks[0];
        int lowest = marks[0];
        for (int mark : marks) {
            if (mark > highest) {
                highest = mark;
            }
            if (mark < lowest) {
                lowest = mark;
            }
        }

        // Count students who scored above average
        int countAboveAverage = 0;
        for (int mark : marks) {
            if (mark > average) {
                countAboveAverage++;
            }
        }

        // Display results
        System.out.println("\n--- Analysis Result ---");
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
        System.out.println("Number of students who scored above average: " + countAboveAverage);
    }
}
