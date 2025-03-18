import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        // Step 1: Get the student's score
        double score = getStudentScore();

        // Step 2: Calculate the grade based on the score
        String grade = calculateGrade(score);

        // Step 3: Display the grade to the user
        System.out.println("Your Grade is: " + grade);
    }

    public static double getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        double score = -1; // Initialize with an invalid value

        // Loop until a valid score is entered
        while (score < 0 || score > 100) {
            System.out.print("Enter your score (0-100): ");
            if (scanner.hasNextDouble()) {
                score = scanner.nextDouble();
                if (score < 0 || score > 100) {
                    System.out.println("Invalid input! Score must be between 0 and 100.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }

        scanner.close(); // Close the scanner to avoid resource leak
        return score;
    }

    public static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
