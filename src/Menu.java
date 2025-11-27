public class Menu {
    
    private String menuChoice;
    private int quantity;
    
    public Menu(String menuChoice, int quantity) {
        this.menuChoice = menuChoice;
        this.quantity = quantity;
    }
    
    // Getters
    public String getMenuChoice() {
        return this.menuChoice;
    }
    
    public int getQuantity() {
        return this.quantity;
    }
    
    // Setters
    public void setMenuChoice(String menuChoice) {
        this.menuChoice = menuChoice;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    // Methods that need implementation using switch
    public double getPrice() {
        // TODO: Implement using switch
        // "burger" -> 50.0
        // "pizza" -> 65.0
        // "salad" -> 45.0
        // "fries" -> 25.0
        // "drink" -> 15.0
        // default -> 0.0
        return 0.0;
    }
    
    public String getCategory() {
        // TODO: Implement using switch
        // "burger", "pizza" -> "Main Course"
        // "salad" -> "Healthy"
        // "fries" -> "Side Dish"
        // "drink" -> "Beverage"
        // default -> "Unknown"
        return "";
    }
    
    public int getCalories() {
        // TODO: Implement using switch
        // "burger" -> 500
        // "pizza" -> 650
        // "salad" -> 150
        // "fries" -> 350
        // "drink" -> 100
        // default -> 0
        return 0;
    }
    
    public double getTotalPrice() {
        return getPrice() * quantity;
    }
    
    public void displayInfo() {
        System.out.println("Item: " + menuChoice);
        System.out.println("Category: " + getCategory());
        System.out.println("Price: " + getPrice() + " kr");
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + getTotalPrice() + " kr");
    }
}
