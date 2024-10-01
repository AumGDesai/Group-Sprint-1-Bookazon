public class Audiobook extends Item {
    private String author;
    private int length;
    
    public Audiobook(String title, double price, String author, int length) {
        super(title, price);
        this.author = author;
        if (!isAuthorValid()) {
            this.author = "Unknown";
        }
        this.length = length;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
        if (!isAuthorValid()) {
            this.author = "Unknown";
        }
    }

    public boolean isAuthorValid() {
        return author != null && !author.isEmpty();
    }
    
    public int getLength() {
        return length;
    }
    
    public void setLength(int length) {
        this.length = length;
    }
    
    public String toString() {
        return super.toString() + "\nAuthor: " + author + "\nLength: " + length + " minutes";
    }
}
