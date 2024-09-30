public class Book extends Item {
    private String author;
    private int yearPublished;
    private boolean isPaperback;  // true if the book is paperback, false if it is hardcover

    public Book(String title, String author, int yearPublished, double price, boolean isPaperback) {
       	super(title, price);
        this.author = author;
        if (!isAuthorValid()) {
            this.author = "Unknown";
        }
        this.yearPublished = yearPublished;
        this.isPaperback = isPaperback;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public boolean isPaperback() {
        return isPaperback;
    }

    public String toString(){
        return super.toString() + "\nAuthor: " + author + 
		"\nYear Published: " + yearPublished;
    }

    public boolean isAuthorValid() {
        return author != null && !author.isEmpty();
    }
}
