// Polatkan Eren Polat
// CS 143, Assignment 1 (Shopping Cart)
// This class represents a catalog of items available for purchase.
// It maintains a collection of items and provides methods to access them.

import java.util.*;

// Class Catalog represents a collection of items available for purchase.
// It stores items in an ArrayList and provides methods to access and modify the collection.
public class Catalog {
    private String name;
    private ArrayList<Item> items;

    // Constructs a new catalog with the given name
    public Catalog(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    // Adds an item to the end of this catalog
    public void add(Item next) {
        items.add(next);
    }

    // Returns the number of items in this catalog
    public int size() {
        return items.size();
    }

    // Returns the item at the given index
    // Throws IndexOutOfBoundsException if index is invalid
    public Item get(int index) {
        return items.get(index);
    }

    // Returns the name of this catalog
    public String getName() {
        return name;
    }
}
