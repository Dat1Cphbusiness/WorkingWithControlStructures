public class Counter {
    
    private int value;
    private int maxValue;
    private String name;
    
    public Counter(String name, int maxValue) {
        this.name = name;
        this.maxValue = maxValue;
        this.value = 0;
    }
    
    // Getters
    public int getValue() {
        return this.value;
    }
    
    public int getMaxValue() {
        return this.maxValue;
    }
    
    public String getName() {
        return this.name;
    }
    
    // Setters
    public void setValue(int value) {
        this.value = value;
    }
    
    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }
    
    // Methods that need implementation using while loops
    public void countToMax() {
        // TODO: Implement using while loop
        // Print numbers from current value up to (but not including) maxValue
        // Example: if value = 0 and maxValue = 5, print: 0 1 2 3 4
    }
    
    public void countDown() {
        // TODO: Implement using while loop
        // Print numbers from current value down to 0
        // Example: if value = 5, print: 5 4 3 2 1 0
    }
    
    public int sumToValue() {
        // TODO: Implement using while loop
        // Return sum of all numbers from 0 to current value (inclusive)
        // Example: if value = 5, return 0+1+2+3+4+5 = 15
        return 0;
    }
    
    public void incrementUntil(int target) {
        // TODO: Implement using while loop
        // Increment value until it reaches target (but don't exceed maxValue)
        // Print value after each increment
    }
    
    public void resetToZero() {
        // TODO: Implement using while loop
        // Decrement value to 0, printing each step
    }
    
    public void displayInfo() {
        System.out.println("Counter: " + name);
        System.out.println("Value: " + value);
        System.out.println("Max: " + maxValue);
    }
}
