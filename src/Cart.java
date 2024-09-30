import java.util.ArrayList;

public class Cart {
    private ArrayList<CartItem> items;
    
    public Cart() {
        items = new ArrayList<>();
    }
    
    public void addItem(Item item, int quantity) {
        items.add(new CartItem(item, quantity));
    }

    public void removeItem(CartItem item) {
        items.remove(item);
    }
    
    public ArrayList<CartItem> getItems() {
        return items;
    }

    public void clear() {
        items.clear();
    }

    public String toString() {
        String cartDetails = "Cart Details:\n";
        for (CartItem item : items) {
            cartDetails += item + "\n";
        }
        return cartDetails;
    }
}
