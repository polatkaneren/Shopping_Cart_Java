# 🛒 Java Shopping Cart GUI Application

A GUI-based shopping cart system built in Java. This application allows users to select items from a catalog, specify quantities, and view the total cost of their order, including optional bulk pricing and discounts.

---

## ✨ Features

- 📦 **Catalog of Items**: Includes both standard and bulk-priced items (e.g., "10 for $19.99").
- 🛍️ **Add to Cart**: Users can enter quantities for each item via a graphical interface.
- 💰 **Dynamic Total Calculation**: Order total updates in real-time based on quantity, bulk pricing, and discounts.
- ✅ **Discount Option**: Users can apply a global discount via a checkbox.
- 💻 **Java Swing GUI**: Built with Java Swing for a clean and interactive interface.

---

## 🧱 Class Overview

- `Catalog`: Holds the list of available `Item`s.
- `Item`: Represents individual products, including optional bulk pricing.
- `ItemOrder`: Stores a user's chosen item and quantity.
- `ShoppingCart`: Manages all `ItemOrder`s and applies total/discount logic.
- `ShoppingFrame`: Main GUI class using Java Swing components.
- `ShoppingMain`: Entry point with pre-loaded catalog and GUI launch.

---

## 🚀 How to Run

1. **Clone or download** the repository.
2. **Compile** the Java files:
   ```bash
   javac *.java
