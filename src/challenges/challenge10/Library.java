package challenges.challenge10;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Do it today.";
        book1.author = "Darius";
        book1.isbn = "1234-5678";

        book1.borrowBook();
        book1.returnBook();
        System.out.println(Book.getTotalBooks());

        Book book2 = new Book();
        System.out.println(Book.getTotalBooks());
    }
}
