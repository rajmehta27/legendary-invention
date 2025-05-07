package university;

public class Student {
    private String name;
    private int roll_no;
    private String course;
    private int[] marks;

    public Student(String name, int roll_no, String course, int[] marks) {
        this.name = name;
        this.roll_no = roll_no;
        this.course = course;
        this.marks = marks;
    }

    protected int calculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    protected double calculatePercentage() {
        return calculateTotal() / (double) marks.length;
    }

    protected String calculateGrade() {
        double percentage = calculatePercentage();
        if (percentage >= 90)
            return "A+";
        else if (percentage >= 75)
            return "A";
        else if (percentage >= 60)
            return "B";
        else if (percentage >= 50)
            return "C";
        else
            return "Fail";
    }

    // Getters for safe access
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return roll_no;
    }

    public String getCourse() {
        return course;
    }

    protected int[] getMarks() {
        return marks;
    }
}
