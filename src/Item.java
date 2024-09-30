public abstract class Item {

    private String title;
    private double price;

    public Item(String title, double price) {
	    this.title = title;

	    if (!isTitleValid()) {
		    this.title = "Unknown";
	    }

	    this.price = price;

	    if (!isPriceValid()) {
		    this.price = 0;
	    }
    }

    public String getTitle() {
	    return title;
    }

    public void setTitle(String title) {
	    this.title = title;
	    if (!isTitleValid()) {
		    this.title = "Unknown";
	    }
    }

    public double getPrice() {
	    return price;
    }

    public void setPrice(double price) {
	    this.price = price;
	    if (!isPriceValid()) {
		    this.price = 0;
	    }
    }

    public String toString() {
	    return "Title: " + title + "\nPrice: $" + price;
    }

    public boolean isPriceValid() {
	    return price >= 0;
    }

    public boolean isTitleValid() {
	    return title != null && !title.isEmpty();
    }
}
