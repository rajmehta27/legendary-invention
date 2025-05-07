import java.util.Scanner;

public class library {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the title of book : ");
        String title = sc.nextLine();
        System.out.println("Enter the author of book : ");
        String author = sc.nextLine();
        System.out.println("Enter the price of book : ");
        double price = sc.nextDouble();

        LibraryBook book = new LibraryBook(title, author, price);
        System.out.println("Book Details : ");
        book.DisplayDetails();
        sc.close();
    }
}

public class LibraryBook {
    String title, author;
    double price;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void DisplayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}