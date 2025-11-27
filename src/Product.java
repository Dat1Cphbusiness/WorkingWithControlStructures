public class Product {
    
    private String name;
    private double price;
    private int stock;
    private String category;
    
    public Product(String name, double price, int stock, String category) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }
    
    // Getters
    public String getName() {
        return this.name;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public int getStock() {
        return this.stock;
    }
    
    public String getCategory() {
        return this.category;
    }
    
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    
    // Methods that need implementation using conditionals
    public double getDiscountedPrice() {
        // TODO: Implement using if-else if-else
        // 20% discount if price >= 1000
        // 10% discount if price >= 500
        // 5% discount if price >= 100
        // No discount otherwise
        return price;
    }
    
    public String getStockStatus() {
        // TODO: Implement using if-else if-else
        // "Out of Stock" if stock == 0
        // "Low Stock" if stock < 5
        // "In Stock" if stock < 20
        // "Well Stocked" if stock >= 20
        return "";
    }
    
    public boolean isAvailable() {
        // TODO: Implement using if
        // Available if stock > 0
        return false;
    }
    
    public boolean isExpensive() {
        // TODO: Implement using if
        // Expensive if price > 500
        return false;
    }
    
    public void displayInfo() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price + " kr");
        System.out.println("Discounted Price: " + getDiscountedPrice() + " kr");
        System.out.println("Stock: " + stock);
        System.out.println("Status: " + getStockStatus());
    }
}
