import java.util.*;

public class super_class_method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, dept;
        int age;
        double salary;
        // employee details
        System.out.println("Enter name of employee: ");
        name = sc.nextLine();
        System.out.println("Enter age of employee: ");
        age = sc.nextInt();
        System.out.println("Enter salary of employee: ");
        salary = sc.nextDouble();

        Employee employee = new Employee(name, age, salary);
        employee.display_Emp();

        // manager details
        System.out.println("Enter name of manager: ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.println("Enter age of manager: ");
        age = sc.nextInt();
        System.out.println("Enter salary of manager: ");
        salary = sc.nextDouble();
        System.out.println("Enter department of manager: ");
        sc.nextLine();
        dept = sc.nextLine();
        Manager manager = new Manager(name, age, salary, dept);
        manager.display_Manager();
        sc.close();
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    double salary;

    Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    void display_Emp() {
        display();
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String dept;

    Manager(String name, int age, double salary, String dept) {
        super(name, age, salary);
        this.dept = dept;
    }

    void display_Manager() {
        display_Emp();
        System.out.println("Department: " + dept);
    }
}