package PackagesAndAM.library;

public class LibraryTest {
    public static void main(String[] args) {
        Book book1 = new Book("Why I Am Athiest ?", "Sadar Bhagat Singh", "B001", "978-075");
        DVD dvd1 = new DVD("Inception", "Christopher Nolan", "D001", 148);
        Magazine magazine1 = new Magazine("National Geographic", "Various Authors", "M001", "2024-09");

        System.out.println("Book Title: " + book1.getTitle());
        System.out.println("DVD Title: " + dvd1.getTitle());
        System.out.println("Magazine Title: " + magazine1.getTitle());

        System.out.println("Book ISBN: " + book1.getISBN());
        System.out.println("DVD Duration: " + dvd1.getDuration() + " minutes");
        System.out.println("Magazine Issue Number: " + magazine1.getIssueNumber());
    }
}
