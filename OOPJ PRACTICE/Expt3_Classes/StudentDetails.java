import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Student student = new Student();
        student.inputDetails();
        student.printInfo();
    }
}

class Student {
    String name;
    int rollNumber;
    int marks1, marks2, marks3;

    void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        rollNumber = scanner.nextInt();
        System.out.print("Enter marks for subject 1: ");
        marks1 = scanner.nextInt();
        System.out.print("Enter marks for subject 2: ");
        marks2 = scanner.nextInt();
        System.out.print("Enter marks for subject 3: ");
        marks3 = scanner.nextInt();
        scanner.close();
    }

    double average() {
        return (marks1 + marks2 + marks3) / 3.0;
    }

    void printInfo() {
        System.out.println("\nName: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Average Marks: " + average());
    }
}