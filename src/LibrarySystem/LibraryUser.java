package LibrarySystem;

class LibraryUser {

    public void borrowBook() {

        checkMembership();
        checkBookAvailability();

        System.out.println("Book Borrowed Successfully");
    }

    private void checkMembership() {
        System.out.println("Membership Verified");
    }

    private void checkBookAvailability() {
        System.out.println("Book Available");
    }
}