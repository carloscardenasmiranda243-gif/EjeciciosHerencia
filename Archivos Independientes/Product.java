public class Product {
    // Private attributes: hidden from outside classes so no external code
    // can set an invalid value directly (this is the core of encapsulation).
    private String name;
    private int stock;

    // Minimum stock threshold used to warn the user before the product
    // runs out completely. This turns the class into more than a simple
    // data holder: it adds basic inventory-management intelligence.
    private int minStock;

    // Constructor: receives a starting name, stock and minimum threshold.
    public Product(String name, int stock, int minStock) {
        this.name = name;
        this.stock = stock;
        this.minStock = minStock;
    }

    // Adds stock only if the quantity is valid (greater than zero).
    // Rejecting invalid input here, instead of trusting the caller,
    // is what keeps the inventory data always in a consistent state.
    public void addStock(int quantity) {
        if (quantity <= 0) {
            System.out.println("Error: Quantity must be greater than zero.");
            return;
        }
        stock += quantity;
        System.out.println("Stock added. New stock: " + stock);
    }

    // Sells (removes) stock, but only when the sale is possible.
    // Two checks guard the operation: the quantity must be positive,
    // and it cannot exceed what is currently available.
    public void sell(int quantity) {
        if (quantity <= 0) {
            System.out.println("Error: Quantity must be greater than zero.");
            return;
        }

        if (quantity > stock) {
            System.out.println("Error: Not enough stock available.");
            return;
        }

        stock -= quantity;
        System.out.println("Sale completed. Remaining stock: " + stock);
        checkLowStock();
    }

    // Creative addition: automatically warns when stock drops to or
    // below the minimum threshold, so restocking decisions can be made
    // before the product runs out completely.
    private void checkLowStock() {
        if (stock <= minStock) {
            System.out.println("Warning: " + name + " stock is low (" + stock + " left).");
        }
    }

    // Read-only access to stock. No public method allows setting stock
    // directly, which is what forces every change to go through
    // addStock() or sell() and their validation rules.
    public int checkStock() {
        return stock;
    }

    // Read-only access to the product name.
    public String checkName() {
        return name;
    }
}