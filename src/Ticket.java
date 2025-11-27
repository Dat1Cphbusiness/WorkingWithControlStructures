public class Ticket {
    
    private String eventName;
    private int age;
    private boolean isStudent;
    private boolean isWeekend;
    private double basePrice;
    
    public Ticket(String eventName, int age, boolean isStudent, boolean isWeekend, double basePrice) {
        this.eventName = eventName;
        this.age = age;
        this.isStudent = isStudent;
        this.isWeekend = isWeekend;
        this.basePrice = basePrice;
    }
    
    // Getters
    public String getEventName() {
        return this.eventName;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public boolean isStudent() {
        return this.isStudent;
    }
    
    public boolean isWeekend() {
        return this.isWeekend;
    }
    
    public double getBasePrice() {
        return this.basePrice;
    }
    
    // Methods that need implementation using complex conditionals
    public boolean isEligibleForDiscount() {
        // TODO: Implement using logical operators
        // Eligible if (age < 18 OR age >= 65) OR isStudent
        return false;
    }
    
    public boolean canBuyAlcohol() {
        // TODO: Implement using logical operators
        // Can buy alcohol if age >= 18 AND age < 100
        return false;
    }
    
    public double getFinalPrice() {
        // TODO: Implement using nested if and logical operators
        // Start with basePrice
        // If isWeekend AND age >= 18, add 50 kr
        // If isStudent AND age >= 18, subtract 20% from current price
        // If age < 12, subtract 50% from current price
        // If age >= 65, subtract 30% from current price
        return basePrice;
    }
    
    public boolean isPremiumTime() {
        // TODO: Implement using logical operators
        // Premium time if isWeekend AND (age >= 18 AND age < 65)
        return false;
    }
    
    public String getTicketType() {
        // TODO: Implement using nested if and logical operators
        // "Child" if age < 12
        // "Student" if age >= 12 AND age < 25 AND isStudent
        // "Adult" if age >= 18 AND age < 65 AND NOT student
        // "Senior" if age >= 65
        // "Teen" otherwise
        return "";
    }
    
    public void displayInfo() {
        System.out.println("Event: " + eventName);
        System.out.println("Ticket Type: " + getTicketType());
        System.out.println("Base Price: " + basePrice + " kr");
        System.out.println("Final Price: " + getFinalPrice() + " kr");
        System.out.println("Premium Time: " + isPremiumTime());
    }
}
