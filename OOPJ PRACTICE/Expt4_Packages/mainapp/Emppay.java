package mainapp;

import employee.Emp;

public class Emppay {
    public static void main(String[] args) {
        Emp e = new Emp("John Doe", "E123", "Manager", 50000);
        e.displayPaySlip();
    }
}
