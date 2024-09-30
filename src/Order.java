import java.util.ArrayList;

public class Order {
    private String dateCreated;
    private String dateShipped;
    private User user;
    private String orderStatus;
    private Address shippingAddress;
    private Address billingAddress;
    private ArrayList<CartItem> items;
    private double orderPrice;

    public Order(User user, ArrayList<CartItem> items, Address shipping, Address billing, Subscription subscription, String date, String status) {
        this.user = user;
        this.shippingAddress = shipping;
        this.billingAddress = billing;
        this.items = items;
        this.orderPrice = calculatePrice(user.getSubscription());
        this.dateCreated = date;
        this.orderStatus = status;
    }

    public void setOrderStatus(String status) {
        this.orderStatus = status;
    }

    public void setDateCreated(String date) {
        this.dateCreated = date;
    }

    public void setDateShipped(String date) {
        this.dateShipped = date;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public void printOrderDetails() {
        System.out.println("Order Details:");
        System.out.println("Date Created: " + dateCreated);
        System.out.println("Date Shipped: " + dateShipped);
        System.out.println("User Name: " + userName);
        System.out.println("Order Status: " + orderStatus);
        System.out.println("Shipping Address: " + shippingAddress);
        System.out.println("Billing Address: " + billingAddress);
        System.out.println("Order Price: $" + orderPrice);
    }

    public double calculatePrice(String subscription) {
        double totalPrice = 0.0;

        for (CartItem item : items) {
            totalPrice += item.getTotalPrice();
        }

        if (subscription == "gold") {
            totalPrice *= 0.15; // 15% discount for prime members
        } else if (subscription == "platinum") {
            totalPrice *= 0.10; // 10% discount for platinum members
        } else if (subscription == "silver") {
            totalPrice *= 0.05; // 5% discount for silver members
        } 

        return totalPrice;
    }
}
