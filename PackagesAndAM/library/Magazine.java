package PackagesAndAM.library;

public class Magazine extends LibraryItem {
    private String issueNumber;

    public Magazine(String title, String author, String itemId, String issueNumber) {
        super(title, author, itemId);
        this.issueNumber = issueNumber;
    }

    public String getIssueNumber() {
        return issueNumber;
    }
    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }
    
}
