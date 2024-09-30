public class CartItem {
    private Item item;
    private int quantity;

    public CartItem(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() {
        return this.item;
    }

    public double getPrice() {
        return item.getPrice();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean equals(CartItem cartitem) {
        return this.item.equals(cartitem.getItem());
    }

    public double getTotalPrice() {
        return getPrice() * quantity;
    }
    
    public String toString() {
        return item.toString() + " | Quantity: " + quantity + " | Total Price: $" + getTotalPrice();
    }
}
