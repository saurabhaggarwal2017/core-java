package challenges.challenge10;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Do it today.", "Darius", "1234-5678");
        book1.borrowBook();
        book1.returnBook();
        System.out.println(Book.getTotalBooks());

        Book book2 = new Book("4567-7895");
        book2.borrowBook();
        System.out.println(Book.getTotalBooks());
    }
}
