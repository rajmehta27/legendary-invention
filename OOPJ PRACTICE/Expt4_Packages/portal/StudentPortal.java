package portal;

import university.Student;
import university.Result;

public class StudentPortal {
    public static void main(String[] args) {
        int[] marks = { 85, 90, 78, 92, 88 };
        Student student = new Student("Alice", 101, "Computer Science", marks);

        // Can't access private data directly:
        // System.out.println(student.name); // ❌ ERROR
        // System.out.println(student.marks); // ❌ ERROR

        // Can only access via public getters:
        System.out.println("Accessing via portal:");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Course: " + student.getCourse());

        // Create Result object to show full result
        Result result = new Result("Alice", 101, "Computer Science", marks);
        System.out.println("\nFull result from Result class:");
        result.showResult();
    }
}
