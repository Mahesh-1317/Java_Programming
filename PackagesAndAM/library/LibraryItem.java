package PackagesAndAM.library;

public class LibraryItem {
    private String title;
    private String author;
    private String itemId;

    public LibraryItem(String title, String author, String itemId) {
        this.title = title;
        this.author = author;
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getItemId() {
        return itemId;
    }
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void checkOut() {
        System.out.println("Checking out: " + title);
    }

    public void returnItem() {
        System.out.println("Returning: " + title);
    }
}
