package studentmarks;

import java.util.Scanner;

public class StudentMarks
{
    public static void main(String[] args)
    {
        String studentName;
        double test1Mark, examMark, averageMark;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name:");
        studentName = scanner.nextLine();

        System.out.println("Enter test 1 mark:");
        test1Mark = scanner.nextDouble();

        System.out.println("Enter exam mark:");
        examMark = scanner.nextDouble();

        averageMark = (test1Mark + examMark) / 2;

        System.out.println("Student Name: " + studentName);
        System.out.println("Test 1 Mark: " + test1Mark);
        System.out.println("Exam Mark: " + examMark);
        System.out.println("Average Mark: " + averageMark);

        scanner.close();
    }
}
