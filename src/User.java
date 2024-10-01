
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

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
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
        System.out.println(cart);
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
            System.out.println(order);
        }
    }

    public void checkout() {
        java.time.LocalDate d = java.time.LocalDate.now();
	Date date = new Date(d.getYear(), d.getMonthValue(), d.getDayOfMonth()); 
        Order order = new Order(this, cart.getItems(), shippingAddress, billingAddress, subscription, date, "Pending");
        orders.add(order);
        cart.clear();
    }

    public String toString() {
        return name + " - Role: " + subscription;
    }
}


