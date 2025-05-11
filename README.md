# Java Shopping Cart GUI Application

This is a GUI-based shopping cart system developed in Java using Swing. It allows users to browse a catalog of items, enter desired quantities, apply discounts, and view the total cost of their order dynamically.

## Table of Contents

- [Features](#features)  
  - [General Features](#general-features)  
  - [Item Catalog](#item-catalog)  
  - [Shopping Cart Logic](#shopping-cart-logic)  
  - [GUI Interface](#gui-interface)  
- [Class Overview](#class-overview)  
- [Installation and Setup](#installation-and-setup)  
- [Technologies Used](#technologies-used)  
- [License](#license)

## Features

### General Features

- **Responsive Calculation:** Automatically updates order totals as quantities or discounts change.
- **Bulk Pricing Support:** Items can include optional bulk deals (e.g., "10 for $19.99").
- **Discount Toggle:** A checkbox allows for applying a global discount to the entire cart.

### Item Catalog

- Maintains a collection of products with regular and bulk prices.
- Allows multiple item types to be listed and reused.

### Shopping Cart Logic

- Smart cart system replaces old quantities if the same item is re-added.
- Real-time total calculation, including optional discount logic.
- Prevents negative quantities and handles bad user input.

### GUI Interface

- Built using Java Swing for simplicity and cross-platform compatibility.
- Includes interactive fields, checkboxes, and live updates to totals.
- Designed with a focus on clarity and ease of use.

## Class Overview

- `Catalog` – Stores and manages the item list.
- `Item` – Defines product data, including bulk pricing logic.
- `ItemOrder` – Represents an order with a product and quantity.
- `ShoppingCart` – Manages all orders and calculates total price.
- `ShoppingFrame` – Main Swing GUI class for user interaction.
- `ShoppingMain` – Launches the application with sample data.

## Installation and Setup

1. Clone or download this repository.
2. Open a terminal in the project directory.
3. Compile all `.java` files:
   ```bash
   javac *.java
   ```
4. Run the application:
   ```bash
   java ShoppingMain
   ```

## Technologies Used

- Java  
- Java Swing (GUI)  
- Object-Oriented Programming  

## License

This project is licensed under the MIT License. You are free to use, modify, and distribute this project with attribution.
