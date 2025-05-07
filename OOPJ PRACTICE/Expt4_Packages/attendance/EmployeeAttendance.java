package attendance;

public class EmployeeAttendance {
    private String name;
    private String empId;
    private int totalWorkingDays;
    private int daysPresent;
    private int daysAbsent;
    private double attendancePercentage;

    public EmployeeAttendance(String name, String empId, int totalWorkingDays, int daysPresent) {
        this.name = name;
        this.empId = empId;
        this.totalWorkingDays = totalWorkingDays;
        this.daysPresent = daysPresent;
        calculateAttendancePercentage();
    }

    private void calculateAttendancePercentage() {
        if (totalWorkingDays > 0) {
            this.daysAbsent = totalWorkingDays - daysPresent;
            this.attendancePercentage = ((double) daysPresent / totalWorkingDays) * 100;
        } else {
            this.attendancePercentage = 0;
        }
    }

    public void displayAttendance() {
        System.out.println("\n-------- EMPLOYEE ATTENDANCE --------");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Days Present: " + daysPresent);
        System.out.println("Days Absent: " + daysAbsent);
        System.out.println("Attendance Percentage: " + attendancePercentage);

        if (attendancePercentage >= 75) {
            System.out.println("Attendance Satisified");
        } else {
            System.out.println("Attendance Not Satisified");
        }
    }
}
