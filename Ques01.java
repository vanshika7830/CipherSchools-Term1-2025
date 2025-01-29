import java.util.Scanner;

public class Ques01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalMarks = 0;
        int subjects = 5;

        System.out.println("Enter marks for 5 subjects (0-100):");

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Subject " + i + " marks: ");
            if (scanner.hasNextInt()) {
                int marks = scanner.nextInt();
                if (marks >= 0 && marks <= 100) {
                    totalMarks += marks;
                } else {
                    System.out.println("Invalid input! Marks should be between 0 and 100.");
                    i--; 
                }
            } else {
                System.out.println("Invalid input! Please enter a valid integer.");
                scanner.next();
                i--; 
            }
        }

        double percentage = (double) totalMarks / subjects;
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        scanner.close();
    }
}
