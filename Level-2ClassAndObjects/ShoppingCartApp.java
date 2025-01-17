import java.util.ArrayList;
import java.util.Scanner;

// Class representing an item in the shopping cart
class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalCost() {
        return price * quantity;
    }
}

// Class representing the shopping cart
class ShoppingCart {
    private ArrayList<CartItem> cartItems;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        CartItem newItem = new CartItem(itemName, price, quantity);
        cartItems.add(newItem);
        System.out.println("Added " + quantity + " of " + itemName + " to the cart.");
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).getItemName().equalsIgnoreCase(itemName)) {
                cartItems.remove(i);
                System.out.println("Removed " + itemName + " from the cart.");
                return;
            }
        }
        System.out.println(itemName + " not found in the cart.");
    }

    // Method to display the total cost of items in the cart
    public void displayTotalCost() {
        double totalCost = 0.0;
        for (CartItem item : cartItems) {
            totalCost += item.totalCost();
        }
        System.out.printf("Total cost of items in the cart: $%.2f%n", totalCost);
    }
}

// Main class to run the shopping cart simulation
public class ShoppingCartApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart shoppingCart = new ShoppingCart();
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("1) Add item to shopping cart");
            System.out.println("2) Remove item from shopping cart");
            System.out.println("3) Display total cost");
            System.out.println("0) Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter item price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter item quantity: ");
                    int quantity = scanner.nextInt();
                    shoppingCart.addItem(name, price, quantity);
                    break;

                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeName = scanner.nextLine();
                    shoppingCart.removeItem(removeName);
                    break;

                case 3:
                    shoppingCart.displayTotalCost();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
