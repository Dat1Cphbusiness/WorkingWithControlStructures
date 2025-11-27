public class ArrayProcessor {
    
    private int[] numbers;
    
    public ArrayProcessor(int[] numbers) {
        this.numbers = numbers;
    }
    
    // Getters
    public int[] getNumbers() {
        return this.numbers;
    }
    
    // Setters
    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
    
    // Methods using TRADITIONAL for loops (with index)
    public void printWithIndex() {
        // TODO: Implement using traditional for loop
        // Print each number with its index
        // Example: "Index 0: 10"
    }
    
    public int getAt(int index) {
        // Returns element at given index
        return numbers[index];
    }
    
    public void doubleAllValues() {
        // TODO: Implement using traditional for loop
        // Double each value in the array (modify array)
    }
    
    public void reverseArray() {
        // TODO: Implement using traditional for loop
        // Reverse the array in place (swap elements)
    }
    
    // Methods using ENHANCED for loops (for-each)
    public int sum() {
        // TODO: Implement using enhanced for loop
        // Return sum of all numbers
        // Use: for (int number : numbers)
        return 0;
    }
    
    public int findMax() {
        // TODO: Implement using enhanced for loop
        // Return largest number
        return 0;
    }
    
    public int countPositive() {
        // TODO: Implement using enhanced for loop
        // Count how many numbers are positive (> 0)
        return 0;
    }
    
    public void printAll() {
        // TODO: Implement using enhanced for loop
        // Print all numbers (space separated)
    }
    
    public boolean contains(int target) {
        // TODO: Implement using enhanced for loop
        // Return true if array contains target
        return false;
    }
    
    public void displayInfo() {
        System.out.println("Array length: " + numbers.length);
        System.out.println("Sum: " + sum());
        System.out.println("Max: " + findMax());
        System.out.println("Positive count: " + countPositive());
    }
}
