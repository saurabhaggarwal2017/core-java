package challenges.challenge10;

public class Book {
    static int totalBooks;

    String title;
    String author;
    String isbn;
    boolean isBorrow;

    static {
        totalBooks = 0;
    }

    {
        totalBooks++;
    }

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    Book(String isbn) {
        this("Unknown", "Unknown", isbn);
    }


    static int getTotalBooks() {
        return totalBooks;
    }

    void borrowBook() {
        if (isBorrow) {
            System.out.println("Book is already borrowed!");
        } else {
            this.isBorrow = true;
            System.out.println("Enjoy " + this.title);
        }
    }

    void returnBook() {
        if (isBorrow) {
            this.isBorrow = false;
            System.out.println("Hope you enjoyed, Please leave a review");
        } else {
            System.out.println("No one borrowed yet you can borrow!");
        }
    }


}
