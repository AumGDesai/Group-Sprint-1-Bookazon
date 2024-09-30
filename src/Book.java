public class Book implements Item {
    private String title;
    private String author;
    private int yearPublished;
    private double price;
    private boolean isPaperback;  // true if the book is paperback, false if it is hardcover

    public Book(String title, String author, int yearPublished, double price, boolean isPaperback) {
        this.title = title;
        if (!isTitleValid()) {
            this.title = "Unknown";
        }
        this.author = author;
        if (!isAuthorValid()) {
            this.author = "Unknown";
        }
        this.yearPublished = yearPublished;
        this.price = price;
        if (!isPriceValid()) {
            this.price = 0;
        }
        this.isPaperback = isPaperback;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public double getPrice() {
        return price;
    }

    public boolean isPaperback() {
        return isPaperback;
    }

    public String toString(){
        return "Title: " + title + " | Author: " + author + " | Year Published: " + yearPublished + " | Price: $" + price;
    }

    public boolean isPriceValid() {
        return price >= 0;
    }

    public boolean isTitleValid() {
        return title != null && !title.isEmpty();
    }

    public boolean isAuthorValid() {
        return author != null && !author.isEmpty();
    }
}
