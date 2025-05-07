package mainapp;

import attendance.EmployeeAttendance;
import java.util.Scanner;

public class AttendanceReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Employee ID: ");
        String empId = sc.nextLine();
        System.out.println("Enter Total Working Days: ");
        int totalWorkingDays = sc.nextInt();
        System.out.println("Enter Days Present: ");
        int daysPresent = sc.nextInt();
        EmployeeAttendance e = new EmployeeAttendance(name, empId, totalWorkingDays, daysPresent);
        e.displayAttendance();
        sc.close();
    }
}
