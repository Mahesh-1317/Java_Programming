package PackagesAndAM.library;

public class DVD extends LibraryItem {
    private int duration; // Duration in minutes

    public DVD(String title, String author, String itemId, int duration) {
        super(title, author, itemId);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
}
