import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        int result = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            result = result * 10 + digit;
            temp /= 10;
        }

        if (number == result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}