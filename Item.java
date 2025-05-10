// Polatkan Eren Polat
// CS 143, Assignment 1 (Shopping Cart)
// This class represents an item in the shopping catalog with its pricing information.
// Each item has a name, price, and optional bulk pricing.

import java.text.*;

// Class Item represents a single item in the shopping catalog with its pricing information.
// An item can have both a regular price and an optional bulk price.
public class Item {
    private String name;
    private double price;
    private int bulkQuantity;
    private double bulkPrice;
    private NumberFormat formatter;

    // Constructs an item with the given name and price
    // Throws IllegalArgumentException if price is negative
    public Item(String name, double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.name = name;
        this.price = price;
        this.formatter = NumberFormat.getCurrencyInstance();
    }

    // Constructs an item with the given name, price, and bulk pricing
    // Throws IllegalArgumentException if any numeric parameter is negative
    public Item(String name, double price, int bulkQuantity, double bulkPrice) {
        this(name, price);
        if (bulkQuantity < 0 || bulkPrice < 0) {
            throw new IllegalArgumentException("Bulk quantity and bulk price cannot be negative");
        }
        this.bulkQuantity = bulkQuantity;
        this.bulkPrice = bulkPrice;
    }

    // Returns the price for a given quantity of this item, taking into account bulk pricing
    // Throws IllegalArgumentException if quantity is negative
    public double priceFor(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        
        if (bulkQuantity > 0 && quantity >= bulkQuantity) {
            int numBulks = quantity / bulkQuantity;
            int remainder = quantity % bulkQuantity;
            return (numBulks * bulkPrice) + (remainder * price);
        }
        return quantity * price;
    }

    // Returns a string representation of this item including its name and price
    // If bulk pricing is available, includes that information in parentheses
    public String toString() {
        String result = name + ", " + formatter.format(price);
        if (bulkQuantity > 0) {
            result += " (" + bulkQuantity + " for " + formatter.format(bulkPrice) + ")";
        }
        return result;
    }

    // Returns true if this item is equal to the other item
    // Two items are equal if they have the same name and price
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Item other = (Item) obj;
        return name.equals(other.name) && price == other.price;
    }
}
