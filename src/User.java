
import java.util.ArrayList;

public class User {
    private String name;
    private Subscription subscription;
    private Cart cart;
    private ArrayList<Order> orders;
    private Address shippingAddress;
    private Address billingAddress;

    public User(String name, Subscription subscription) {
        this.name = name;
        this.subscription = subscription;  // normal, gold, platinum, silver membership
        this.cart = new Cart();
        this.orders = new ArrayList<>();
    }

    public User(String name, Subscription subscription, Address ship, Address bill) {
        this.name = name;
        this.subscription = subscription;  // normal, gold, platinum, silver membership
        this.cart = new Cart();
        this.orders = new ArrayList<>();
        this.shippingAddress = ship;
        this.billingAddress = bill;
    }

    public String getName() {
        return name;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription role) {
        this.subscription = role;
    }

    public void viewCart() {
        cart.viewCartDetails();
    }

    public void addToCart(Item item, int quantity) {  
        cart.addItem(item, quantity);
    }

    public void removeFromCart(Item itemToRemove) {
        for (CartItem item : cart.getItems()) {
            if (item.getItem().equals(itemToRemove)) {
                cart.getItems().remove(item);
                break;
            }
        }
    }

    public void viewOrders() {
        for (Order order : orders) {
            order.printOrderDetails();
        }
    }

    public void checkout(String date) {
        Order order = new Order(this, cart.getItems(), shippingAddress, billingAddress, subscription, date, "Pending");
        orders.add(order);
        cart = new Cart();
    }

    public String toString() {
        return name + " - Role: " + subscription;
    }
}


