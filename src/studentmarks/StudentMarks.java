// Naoyuki Christopher Higaki [ST10462415]
// ICE Task 1 - LU 1
package studentmarks;
import java.util.Scanner;
public class StudentMarks {
    public static void main(String[] args) {
        // Step 1: Identify the variables and their datatypes
        String studentName;
        double test1Mark, examMark, averageMark;

        // Step 2: Declare the variables
        Scanner scanner = new Scanner(System.in);

        // Step 3: Use the Scanner Object to get user input
        System.out.println("Enter student name:");
        studentName = scanner.nextLine();

        System.out.println("Enter test 1 mark:");
        test1Mark = scanner.nextDouble();

        System.out.println("Enter exam mark:");
        examMark = scanner.nextDouble();

        // Step 4: Do calculations
        averageMark = (test1Mark + examMark) / 2;

        // Step 5: Display the results on the screen
        System.out.println("Student Name: " + studentName);
        System.out.println("Test 1 Mark: " + test1Mark);
        System.out.println("Exam Mark: " + examMark);
        System.out.println("Average Mark: " + averageMark);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

