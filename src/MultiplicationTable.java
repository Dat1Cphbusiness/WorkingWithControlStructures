public class MultiplicationTable {
    
    private int maxNumber;
    
    public MultiplicationTable(int maxNumber) {
        this.maxNumber = maxNumber;
    }
    
    // Getters
    public int getMaxNumber() {
        return this.maxNumber;
    }
    
    // Setters
    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }
    
    // Methods that need implementation using nested loops
    public void printTable() {
        // TODO: Implement using nested for loops
        // Print multiplication table from 1 to maxNumber
        // Example: maxNumber=3
        // 1  2  3
        // 2  4  6
        // 3  6  9
    }
    
    public void printTableWithHeaders() {
        // TODO: Implement using nested for loops
        // Print table with row and column headers
        // Example: maxNumber=3
        //    1  2  3
        // 1  1  2  3
        // 2  2  4  6
        // 3  3  6  9
    }
    
    public int countEvenProducts() {
        // TODO: Implement using nested for loops
        // Count how many products in table are even
        // Loop through all i*j combinations
        return 0;
    }
    
    public int findLargestProduct() {
        // TODO: Implement using nested for loops
        // Find largest product in table (maxNumber * maxNumber)
        return 0;
    }
    
    public void printRow(int rowNumber) {
        // TODO: Implement using for loop (single, not nested)
        // Print one row of multiplication table
        // Example: rowNumber=3, maxNumber=5
        // 3  6  9  12  15
    }
}
