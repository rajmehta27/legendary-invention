import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of terms : ");
        int n = sc.nextInt();
        int a = 0, b = 1, c;
        System.out.print("Fibonacci series: " + a + " " + b + " ");
        int i = 2;
        do {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            i++;
        } while (i < n);
        System.out.println();
        sc.close();
    }
}