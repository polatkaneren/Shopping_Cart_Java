// Polatkan Eren Polat
// CS 143, Assignment 1 (Shopping Cart)
// This class represents an order for a specific item with a quantity.
// It combines an item with the quantity ordered.

// Class ItemOrder represents an order for a specific quantity of an item.
// It stores both the item and the quantity ordered.
public class ItemOrder {
    private Item item;
    private int quantity;

    // Constructs an order for the given item and quantity
    public ItemOrder(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    // Returns the total price for this order based on the item's pricing rules
    public double getPrice() {
        return item.priceFor(quantity);
    }

    // Returns the item associated with this order
    public Item getItem() {
        return item;
    }
}
