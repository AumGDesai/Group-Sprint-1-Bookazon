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
    
    public void viewCartDetails() {
        System.out.println("Cart Details:");
        for (CartItem item : items) {
            System.out.println(item);
        }
        System.out.println("\n");
    }
    
    public ArrayList<CartItem> getItems() {
        return items;
    }

    public String toString() {
        return "Cart Details: " + items;
    }
}
