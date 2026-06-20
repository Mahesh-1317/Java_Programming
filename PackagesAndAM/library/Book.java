package PackagesAndAM.library;

public class Book extends LibraryItem {
    private String iSBN;

    public Book(String title, String author, String itemId, String iSBN) {
        super(title, author, itemId);
        this.iSBN = iSBN;
    }

    public String getISBN() {
        return iSBN;
    }
    public void setISBN(String iSBN) {
        this.iSBN = iSBN;
    }
}
