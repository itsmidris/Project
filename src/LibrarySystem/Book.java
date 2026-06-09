package LibrarySystem;

class Book extends LibraryItem {

    @Override
    void issueItem() {
        System.out.println("Book Issued");
    }
}