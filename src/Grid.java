public class Grid {
    
    private int rows;
    private int cols;
    private char[][] cells;
    
    public Grid(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.cells = new char[rows][cols];
        // Initialize all cells with '.'
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                cells[i][j] = '.';
            }
        }
    }
    
    // Getters
    public int getRows() {
        return this.rows;
    }
    
    public int getCols() {
        return this.cols;
    }
    
    public char getCell(int row, int col) {
        return cells[row][col];
    }
    
    // Setters
    public void setCell(int row, int col, char value) {
        cells[row][col] = value;
    }
    
    // Methods that need implementation using nested loops
    public void printGrid() {
        // TODO: Implement using nested for loops
        // Print entire grid
    }
    
    public void fillGrid(char symbol) {
        // TODO: Implement using nested for loops
        // Fill all cells with given symbol
    }
    
    public void fillRow(int row, char symbol) {
        // TODO: Implement using for loop (single)
        // Fill specific row with symbol
    }
    
    public void fillColumn(int col, char symbol) {
        // TODO: Implement using for loop (single)
        // Fill specific column with symbol
    }
    
    public void fillBorder(char symbol) {
        // TODO: Implement using nested for loops
        // Fill only border cells (first/last row and first/last column)
    }
    
    public int countSymbol(char symbol) {
        // TODO: Implement using nested for loops
        // Count how many cells contain given symbol
        return 0;
    }
    
    public void fillDiagonal(char symbol) {
        // TODO: Implement using for loop (single)
        // Fill main diagonal (top-left to bottom-right)
        // Only works for square grids
    }
    
    public void fillCheckerboard(char symbol1, char symbol2) {
        // TODO: Implement using nested for loops
        // Fill in checkerboard pattern
        // Use (row + col) % 2 to determine which symbol
    }
}
