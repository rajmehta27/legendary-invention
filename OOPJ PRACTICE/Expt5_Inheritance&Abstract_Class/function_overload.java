public class function_overload {
    public static void main(String[] args) {
        Person p = new Person();
        p.speak(); // Calls the method in Person class

        Student s = new Student();
        s.speak(); // Calls the method in Student class

        Teacher t = new Teacher();
        t.speak(); // Calls the method in Teacher class
    }

}

class Person {

    void speak() {
        System.out.println("The person is speaking");
    }

}

class Student extends Person {

    void speak() {
        System.out.println("The student is asking a question");
    }
}

class Teacher extends Person {
    void speak() {
        System.out.println("The teacher is giving a lecture");
    }
}
