import java.util.Scanner;

public class Single_inheritance {
    public static void main(String[] args) {
        marks m = new marks();
        m.InputData();
        m.readdata();
        m.compute();
        m.show();
    }
}

class Student {
    String name;
    int rollNo;
    String dob;

    void InputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        name = sc.nextLine();
        System.out.println("Enter rollNo. : ");
        rollNo = sc.nextInt();
        System.out.println("Enter dob : ");
        sc.nextLine(); // Consume the newline character left by nextInt()
        dob = sc.nextLine();
    }
}

class marks extends Student {
    int[] marks;
    double percentage;
    int total_subjects;
    int total = 0;
    char grade;

    void readdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of subjects : ");
        total_subjects = sc.nextInt();
        marks = new int[total_subjects];
        for (int i = 0; i < total_subjects; i++) {
            System.out.println("Enter Makrs for subject " + i + " :");
            marks[i] = sc.nextInt();
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid Marks Entered. Please enter again.");
                i--;
            } else {
                total += marks[i];
            }
        }
    }

    void compute() {
        percentage = ((double) total / (total_subjects * 100)) * 100;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
    }

    void show() {
        System.out.println("Name : " + name);
        System.out.println("Roll No. : " + rollNo);
        System.out.println("DOB : " + dob);
        System.out.println("Total Marks : " + total);
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade : " + grade);
    }
}