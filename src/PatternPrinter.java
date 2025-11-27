public class PatternPrinter {
    
    private int size;
    private char symbol;
    
    public PatternPrinter(int size, char symbol) {
        this.size = size;
        this.symbol = symbol;
    }
    
    // Getters
    public int getSize() {
        return this.size;
    }
    
    public char getSymbol() {
        return this.symbol;
    }
    
    // Setters
    public void setSize(int size) {
        this.size = size;
    }
    
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
    
    // Methods that need implementation using nested loops
    public void printSquare() {
        // TODO: Implement using nested for loops
        // Print a square of size x size using symbol
        // Example: size=3, symbol='*'
        // ***
        // ***
        // ***
    }
    
    public void printRectangle(int width, int height) {
        // TODO: Implement using nested for loops
        // Print rectangle of width x height using symbol
    }
    
    public void printRightTriangle() {
        // TODO: Implement using nested for loops
        // Print right-aligned triangle
        // Example: size=4, symbol='*'
        // *
        // **
        // ***
        // ****
    }
    
    public void printLeftTriangle() {
        // TODO: Implement using nested for loops
        // Print left-aligned triangle (inverted pyramid on right side)
        // Example: size=4, symbol='*'
        //    *
        //   **
        //  ***
        // ****
    }
    
    public void printInvertedTriangle() {
        // TODO: Implement using nested for loops
        // Print inverted right triangle
        // Example: size=4, symbol='*'
        // ****
        // ***
        // **
        // *
    }
    
    public void printHollowSquare() {
        // TODO: Implement using nested for loops
        // Print square but only border (hollow inside)
        // Example: size=4, symbol='*'
        // ****
        // *  *
        // *  *
        // ****
    }
}
