// Polatkan Eren Polat
// CS 143, Assignment 1 (Shopping Cart)
// This class represents a shopping cart that holds item orders.
// It manages the collection of orders and handles the overall discount.

import java.util.*;

// Class ShoppingCart represents a shopping cart containing item orders.
// It maintains a list of orders and handles the overall discount.
public class ShoppingCart {

    public static final double DISCOUNT_PERCENT = 0.9;

    private ArrayList<ItemOrder> orders;
    private boolean hasDiscount;

    // Constructs an empty shopping cart
    public ShoppingCart() {
        orders = new ArrayList<ItemOrder>();
        hasDiscount = false;
    }

    // Adds an item order to the cart, replacing any existing order for the same item
    // If the new order has quantity 0, it still replaces any existing order
    public void add(ItemOrder next) {
        // Look for existing order for this item
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getItem().equals(next.getItem())) {
                // Replace existing order with new order using set
                orders.set(i, next);
                return;
            }
        }
        // If no existing order found, add the new order
        orders.add(next);
    }

    // Sets whether this cart should apply the discount
    public void setDiscount(boolean discount) {
        hasDiscount = discount;
    }

    // Returns the total cost of all orders in the cart
    // Applies the discount if it is enabled
    public double getTotal() {
        double total = 0.0;
        for (ItemOrder order : orders) {
            total += order.getPrice();
        }
        if (hasDiscount) {
            total *= DISCOUNT_PERCENT;
        }
        return total;
    }
}
