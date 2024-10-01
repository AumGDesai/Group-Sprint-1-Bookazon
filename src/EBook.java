public class EBook extends Item{
    private String author;
    private int yearPublished;
    private String format;
    
    public EBook(String title, double price, String author, int yearPublished, String format) {
        super(title, price);
        this.author = author;
        if (!isAuthorValid()) {
            this.author = "Unknown";
        }
        this.yearPublished = yearPublished;
        this.format = format;
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
    
    public int getYearPublished() {
        return yearPublished;
    }
    
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    
    public String getFormat() {
        return format;
    }
    
    public void setFormat(String format) {
        this.format = format;
    }
    
    public String toString() {
        return super.toString() + "\nAuthor: " + author + "\nYear Published: " + yearPublished + "\nFormat: " + format;
    }
}
