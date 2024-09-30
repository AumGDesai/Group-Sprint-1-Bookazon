
import java.util.ArrayList;

public class Bookazon {

    private ArrayList<Item> items;
    private ArrayList<User> users;

    public Bookazon() {
        items = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void viewItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public void viewUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void removeUser(User user) {
        users.remove(user);
    }
    
    public static void main(String[] args) {
        
        Bookazon bookazon = new Bookazon();
        
        // create books
        bookazon.addItem(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 7.99, true));
        bookazon.addItem(new Book("To Kill a Mockingbird", "Harper Lee", 1960, 9.99, true));
        bookazon.addItem(new Book("1984", "George Orwell", 1949, 6.99, true));

        //create subscriptions
        Subscription normal = new NormalSubscription();
        Subscription gold = new GoldSubscription();

        // create users
        bookazon.addUser(new User("Alice", normal));
        bookazon.addUser(new User("Bob", gold));

        // add items to cart
        bookazon.users.get(0).addToCart(bookazon.items.get(0), 1);
        bookazon.users.get(0).addToCart(bookazon.items.get(1), 2);
        bookazon.users.get(0).addToCart(bookazon.items.get(2), 3);

        // view cart
        bookazon.users.get(0).viewCart();

        // set shipping address and billing address
        bookazon.users.get(0).setShippingAddress(new Address("123 Main St", "", "San Francisco", "CA", "94105", "USA"));
        bookazon.users.get(0).setBillingAddress(new Address("456 Elm St", "", "San Francisco", "CA", "94105", "USA"));

        // checkout
        bookazon.users.get(0).checkout();

        // view order details
        bookazon.users.get(0).viewOrders();
        
    }
}
