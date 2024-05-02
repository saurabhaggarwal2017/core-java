package challenges.challenge10;

public class Book {
    public static int totalBooks;

    public String title;
    public String author;
    public String isbn;

    static {
        totalBooks = 0;
    }
    {
        totalBooks++;
    }

    public void borrowBook() {
        System.out.println("this " + this.title + " is borrowed.");
    }

    public void returnBook() {
        System.out.println("this " + this.title + " is returned.");
    }

    public static int getTotalBooks() {
        return totalBooks;
    }
}
