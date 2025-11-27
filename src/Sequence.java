public class Sequence {
    
    private int start;
    private int end;
    private int step;
    
    public Sequence(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }
    
    // Getters
    public int getStart() {
        return this.start;
    }
    
    public int getEnd() {
        return this.end;
    }
    
    public int getStep() {
        return this.step;
    }
    
    // Methods that need implementation using for loops
    public void printSequence() {
        // TODO: Implement using for loop
        // Print numbers from start to end (inclusive) with given step
        // Example: start=0, end=10, step=2 prints: 0 2 4 6 8 10
    }
    
    public int sumSequence() {
        // TODO: Implement using for loop
        // Return sum of all numbers in sequence
        // Example: start=1, end=5, step=1 returns 1+2+3+4+5 = 15
        return 0;
    }
    
    public int countNumbers() {
        // TODO: Implement using for loop
        // Count how many numbers are in the sequence
        // Example: start=0, end=10, step=2 returns 6 (0,2,4,6,8,10)
        return 0;
    }
    
    public void printReverse() {
        // TODO: Implement using for loop
        // Print sequence in reverse order (from end to start)
    }
    
    public int[] toArray() {
        // TODO: Implement using for loop
        // Create and return an array containing all numbers in sequence
        // First count numbers, then create array, then fill it
        return new int[0];
    }
    
    public void displayInfo() {
        System.out.println("Sequence: " + start + " to " + end + " (step " + step + ")");
        System.out.println("Count: " + countNumbers());
        System.out.println("Sum: " + sumSequence());
    }
}
