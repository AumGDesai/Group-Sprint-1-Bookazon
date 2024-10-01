public class DVD extends Item {
    private String director;
    private int length;
    
    public DVD(String title, double price, String director, int length) {
        super(title, price);
        this.director = director;
        if (!isDirectorValid()) {
            this.director = "Unknown";
        }
        this.length = length;
    }
    
    public String getDirector() {
        return director;
    }
    
    public void setDirector(String director) {
        this.director = director;
        if (!isDirectorValid()) {
            this.director = "Unknown";
        }
    }

    public boolean isDirectorValid() {
        return director != null && !director.isEmpty();
    }
    
    public int getLength() {
        return length;
    }
    
    public void setLength(int length) {
        this.length = length;
    }
    
    public String toString() {
        return super.toString() + "\nDirector: " + director + "\nLength: " + length + " minutes";
    }
}
