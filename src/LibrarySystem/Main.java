package LibrarySystem;

public class Main {

    public static void main(String[] args) {

        Book book = new Book();
        book.issueItem();

        LibraryUser user = new LibraryUser();

        user.borrowBook();

    }
}