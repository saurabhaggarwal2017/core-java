package challenges.challenge15;

public class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public void checkOut(){
        System.out.println("Checkout..");
    }
    public void itemReturn(){
        System.out.println("Return item...");
    }
}
