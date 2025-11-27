public class Accumulator {
    
    private int total;
    private int count;
    
    public Accumulator() {
        this.total = 0;
        this.count = 0;
    }
    
    // Getters
    public int getTotal() {
        return this.total;
    }
    
    public int getCount() {
        return this.count;
    }
    
    // Methods that need implementation using while loops
    public void addNumbers(int[] numbers) {
        // TODO: Implement using while loop
        // Add all numbers in the array to total
        // Increment count for each number added
        // Use index variable
    }
    
    public int findSum(int start, int end) {
        // TODO: Implement using while loop
        // Return sum of all numbers from start to end (inclusive)
        // Example: findSum(1, 5) returns 1+2+3+4+5 = 15
        return 0;
    }
    
    public int countEven(int[] numbers) {
        // TODO: Implement using while loop
        // Count how many numbers in the array are even
        // Use index variable
        return 0;
    }
    
    public int findMax(int[] numbers) {
        // TODO: Implement using while loop
        // Find and return the largest number in the array
        // Start with first element as max
        // Use index variable
        return 0;
    }
    
    public double getAverage() {
        if (count == 0) {
            return 0.0;
        }
        return (double) total / count;
    }
    
    public void reset() {
        total = 0;
        count = 0;
    }
    
    public void displayInfo() {
        System.out.println("Total: " + total);
        System.out.println("Count: " + count);
        System.out.println("Average: " + getAverage());
    }
}
