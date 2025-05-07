import java.util.Scanner;

public class attendance {
    public static void main(String[] args) {
        Eligible e = new Eligible();
        e.input();
        e.compute();
    }
}

public class Eligible {
    float held, attended;
    float percentage;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of classes held : ");
        held = sc.nextFloat();
        System.out.println("No. of classes attended : ");
        attended = sc.nextFloat();
        sc.close();
    }

    public void compute() {
        float percentage = (attended / held) * 100;
        if (percentage > 80.0) {
            System.out.println("Eligible for exam.");
        } else {
            System.out.println("Not eligible for exam.");
        }
    }
}