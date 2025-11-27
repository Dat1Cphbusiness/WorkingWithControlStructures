# Level 6: Nested Loops

## Level 6 fokuserer på:
- Nested loop struktur (loops inde i loops)
- Outer loop vs inner loop
- 2D patterns og grids
- Row og column iteration
- Loop variable relationships
- Når nested loops er nødvendige
- Performance considerations (basics)

---

## Begrebsgennemgang

### Nested Loops Basics
En **nested loop** er en loop inde i en anden loop:

```java
for (int i = 0; i < 3; i++) {        // Outer loop
    for (int j = 0; j < 3; j++) {    // Inner loop
        System.out.print("(" + i + "," + j + ") ");
    }
    System.out.println();  // New line efter hver row
}
```

**Output:**
```
(0,0) (0,1) (0,2) 
(1,0) (1,1) (1,2) 
(2,0) (2,1) (2,2) 
```

### Outer Loop vs Inner Loop

**Outer loop** kontrollerer hvor mange gange **hele** inner loop kører:
- Outer loop kører én iteration
- Inner loop kører ALLE sine iterationer
- Så outer loop kører næste iteration

```java
for (int row = 0; row < 3; row++) {      // Outer: 3 iterations
    for (int col = 0; col < 4; col++) {  // Inner: 4 iterations hver gang
        System.out.print("* ");
    }
    System.out.println();
}
```

**Output:**
```
* * * * 
* * * * 
* * * * 
```

Outer loop kører 3 gange (rows), inner loop kører 4 gange hver gang (columns).
Total iterationer: 3 × 4 = 12

### Understanding Execution Flow

```java
for (int i = 0; i < 2; i++) {
    System.out.println("Outer: " + i);
    for (int j = 0; j < 3; j++) {
        System.out.println("  Inner: " + j);
    }
}
```

**Output:**
```
Outer: 0
  Inner: 0
  Inner: 1
  Inner: 2
Outer: 1
  Inner: 0
  Inner: 1
  Inner: 2
```

### Printing Patterns

**Square:**
```java
int size = 4;
for (int i = 0; i < size; i++) {
    for (int j = 0; j < size; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

**Output:**
```
* * * * 
* * * * 
* * * * 
* * * * 
```

**Right triangle:**
```java
int size = 4;
for (int i = 1; i <= size; i++) {
    for (int j = 0; j < i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

**Output:**
```
* 
* * 
* * * 
* * * * 
```

### Row and Column Relationship

I nested loops tænker vi ofte på:
- Outer loop = ROWS (lines)
- Inner loop = COLUMNS (characters per line)

```java
for (int row = 0; row < 3; row++) {
    for (int col = 0; col < 5; col++) {
        System.out.print(col + " ");
    }
    System.out.println();
}
```

**Output:**
```
0 1 2 3 4 
0 1 2 3 4 
0 1 2 3 4 
```

### 2D Arrays med Nested Loops

```java
int[][] grid = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

for (int row = 0; row < grid.length; row++) {
    for (int col = 0; col < grid[row].length; col++) {
        System.out.print(grid[row][col] + " ");
    }
    System.out.println();
}
```

**Output:**
```
1 2 3 
4 5 6 
7 8 9 
```

### Loop Variable Relationships

Nogle gange er inner loop afhængig af outer loop variable:

```java
// Inverted triangle
for (int i = 5; i > 0; i--) {
    for (int j = 0; j < i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

**Output:**
```
* * * * * 
* * * * 
* * * 
* * 
* 
```

### Common Patterns

**Multiplication table:**
```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.print((i * j) + " ");
    }
    System.out.println();
}
```

**Border/hollow pattern:**
```java
int size = 5;
for (int i = 0; i < size; i++) {
    for (int j = 0; j < size; j++) {
        if (i == 0 || i == size-1 || j == 0 || j == size-1) {
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
    }
    System.out.println();
}
```

**Checkerboard:**
```java
for (int i = 0; i < 4; i++) {
    for (int j = 0; j < 4; j++) {
        if ((i + j) % 2 == 0) {
            System.out.print("X ");
        } else {
            System.out.print("O ");
        }
    }
    System.out.println();
}
```

### Performance Note

Nested loops multiply iterations:
- Single loop: n iterations
- Nested (2 levels): n × m iterations
- Triple nested: n × m × p iterations

```java
// 3 × 4 = 12 iterations
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 4; j++) {
        // This runs 12 times
    }
}
```

**Tag udgangspunkt i klasserne PatternPrinter, MultiplicationTable, og Grid.**  
**Skriv din kode i Main.java i testLevel6() metoden.**

**VIGTIGT:** Implementer TODO metoderne ved hjælp af nested loops.

---

## Tips
- Outer loop = rows, inner loop = columns
- Husk println() EFTER inner loop (for ny linje)
- Brug meaningful names: row, col (ikke bare i, j)
- Test med small sizes først (3x3, ikke 100x100)
- Visualize: Tegn pattern på papir først
- Inner loop variable kan afhænge af outer loop variable
- Al din kode skal placeres inde i `testLevel6()` metoden mellem tuborgklammerne `{}`

---

## Del A: Basic Nested Loops

### Opgave 6.1: Dit første nested loop
**Opgave:** 
1. I testLevel6(), skriv nested for loops der:
   - Outer loop: i from 0 to 2
   - Inner loop: j from 0 to 2
   - Print "(i,j) " for each combination
   - Print newline efter inner loop

**Forventet Output:**
```
(0,0) (0,1) (0,2) 
(1,0) (1,1) (1,2) 
(2,0) (2,1) (2,2) 
```

---

### Opgave 6.2: Simple square
**Opgave:** 
1. Opret en PatternPrinter: size 4, symbol '*'
2. Implementer `printSquare()` metoden:
   - Use nested for loops
   - Print size x size square

**Forventet Output:**
```
****
****
****
****
```

---

### Opgave 6.3: Rectangle
**Opgave:** 
1. Opret en PatternPrinter: size 5, symbol '#'
2. Implementer `printRectangle(int width, int height)` metoden:
   - Use nested for loops
3. Call printRectangle(6, 3)

**Forventet Output:**
```
######
######
######
```

---

### Opgave 6.4: Understanding execution flow
**Opgave:** 
1. I testLevel6(), skriv nested loops der:
   - Outer loop: 0 to 1
   - Before inner loop: print "Row " + i
   - Inner loop: 0 to 2
   - Print "  Col " + j
   - Dette viser execution order!

**Forventet Output:**
```
Row 0
  Col 0
  Col 1
  Col 2
Row 1
  Col 0
  Col 1
  Col 2
```

---

### Opgave 6.5: Counting iterations
**Opgave:** 
1. I testLevel6(), skriv nested loops der:
   - Outer loop: 0 to 3
   - Inner loop: 0 to 4
   - Count total iterations (brug en counter)
   - Print final count

**Forventet Output:**
```
Total iterations: 20
```
(4 rows × 5 columns = 20)

---

## Del B: Triangular Patterns

### Opgave 6.6: Right triangle
**Opgave:** 
1. Opret en PatternPrinter: size 5, symbol '*'
2. Implementer `printRightTriangle()` metoden:
   - Outer loop: row from 1 to size
   - Inner loop: print row antal stars

**Forventet Output:**
```
*
**
***
****
*****
```

---

### Opgave 6.7: Inverted triangle
**Opgave:** 
1. Opret en PatternPrinter: size 5, symbol '*'
2. Implementer `printInvertedTriangle()` metoden:
   - Start med size stars, reduce hver row

**Forventet Output:**
```
*****
****
***
**
*
```

---

### Opgave 6.8: Number triangle
**Opgave:** 
1. I testLevel6(), print number triangle:
   - Row 1: 1
   - Row 2: 1 2
   - Row 3: 1 2 3
   - Row 4: 1 2 3 4
   - Row 5: 1 2 3 4 5

**Forventet Output:**
```
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
```

---

### Opgave 6.9: Left-aligned triangle
**Opgave:** 
1. Opret en PatternPrinter: size 4, symbol '*'
2. Implementer `printLeftTriangle()` metoden:
   - Print spaces først, then stars
   - Row 1: 3 spaces, 1 star
   - Row 2: 2 spaces, 2 stars
   - etc.

**Forventet Output:**
```
   *
  **
 ***
****
```

---

### Opgave 6.10: Both triangles
**Opgave:** 
1. Opret en PatternPrinter: size 6, symbol '#'
2. Print både right triangle og inverted triangle

**Forventet Output:**
```
#
##
###
####
#####
######
######
#####
####
###
##
#
```

---

## Del C: Multiplication Tables

### Opgave 6.11: Simple multiplication table
**Opgave:** 
1. Opret en MultiplicationTable: maxNumber 3
2. Implementer `printTable()` metoden:
   - Print i * j for each combination

**Forventet Output:**
```
1 2 3 
2 4 6 
3 6 9 
```

---

### Opgave 6.12: Larger table
**Opgave:** 
1. Opret en MultiplicationTable: maxNumber 5
2. Call printTable()

**Forventet Output:**
```
1 2 3 4 5 
2 4 6 8 10 
3 6 9 12 15 
4 8 12 16 20 
5 10 15 20 25 
```

---

### Opgave 6.13: Table with headers
**Opgave:** 
1. Opret en MultiplicationTable: maxNumber 4
2. Implementer `printTableWithHeaders()` metoden:
   - Print column headers first
   - Then row header + products

**Forventet Output:**
```
   1  2  3  4
1  1  2  3  4
2  2  4  6  8
3  3  6  9  12
4  4  8  12 16
```

---

### Opgave 6.14: Count even products
**Opgave:** 
1. Opret en MultiplicationTable: maxNumber 5
2. Implementer `countEvenProducts()` metoden:
   - Count how many i*j products are even
3. Print count

**Forventet Output:**
```
20
```

---

### Opgave 6.15: Print single row
**Opgave:** 
1. Opret en MultiplicationTable: maxNumber 7
2. Implementer `printRow(int rowNumber)` metoden:
   - Print one row of table (single loop)
3. Test med rowNumber = 4

**Forventet Output:**
```
4 8 12 16 20 24 28
```

---

## Del D: Grids and 2D Arrays

### Opgave 6.16: Create and print grid
**Opgave:** 
1. Opret en Grid: 4 rows, 6 cols
2. Implementer `printGrid()` metoden:
   - Use nested for loops
   - Print all cells
3. Call printGrid()

**Forventet Output:**
```
......
......
......
......
```

---

### Opgave 6.17: Fill grid
**Opgave:** 
1. Opret en Grid: 3 rows, 5 cols
2. Implementer `fillGrid(char symbol)` metoden:
   - Use nested loops
   - Set all cells to symbol
3. Call fillGrid('X')
4. Print grid

**Forventet Output:**
```
XXXXX
XXXXX
XXXXX
```

---

### Opgave 6.18: Fill specific row
**Opgave:** 
1. Opret en Grid: 5 rows, 5 cols
2. Implementer `fillRow(int row, char symbol)` metoden:
   - Single loop (not nested)
3. Fill row 2 med '*'
4. Print grid

**Forventet Output:**
```
.....
.....
*****
.....
.....
```

---

### Opgave 6.19: Fill specific column
**Opgave:** 
1. Opret en Grid: 5 rows, 5 cols
2. Implementer `fillColumn(int col, char symbol)` metoden:
   - Single loop
3. Fill column 3 med '|'
4. Print grid

**Forventet Output:**
```
...|.
...|.
...|.
...|.
...|.
```

---

### Opgave 6.20: Count symbols
**Opgave:** 
1. Opret en Grid: 4 rows, 4 cols
2. Fill some cells with 'X' (brug setCell)
3. Implementer `countSymbol(char symbol)` metoden:
   - Use nested loops
   - Count occurrences
4. Count 'X' symbols

**Forventet Output:** (depends on how many you set)

---

## Del E: Advanced Patterns

### Opgave 6.21: Hollow square
**Opgave:** 
1. Opret en PatternPrinter: size 5, symbol '#'
2. Implementer `printHollowSquare()` metoden:
   - Print symbol if on border (first/last row OR first/last col)
   - Print space otherwise

**Forventet Output:**
```
#####
#   #
#   #
#   #
#####
```

---

### Opgave 6.22: Grid border
**Opgave:** 
1. Opret en Grid: 6 rows, 8 cols
2. Implementer `fillBorder(char symbol)` metoden:
   - Use nested loops
   - Fill only border cells
3. Call fillBorder('#')
4. Print grid

**Forventet Output:**
```
########
#......#
#......#
#......#
#......#
########
```

---

### Opgave 6.23: Diagonal
**Opgave:** 
1. Opret en Grid: 5 rows, 5 cols (square)
2. Implementer `fillDiagonal(char symbol)` metoden:
   - Single loop
   - Fill cells where row == col
3. Call fillDiagonal('\\')
4. Print grid

**Forventet Output:**
```
\....
.\...
..\..
...\. 
....\
```

---

### Opgave 6.24: Checkerboard pattern
**Opgave:** 
1. Opret en Grid: 6 rows, 6 cols
2. Implementer `fillCheckerboard(char symbol1, char symbol2)` metoden:
   - Use (row + col) % 2 til at determine which symbol
3. Call fillCheckerboard('X', 'O')
4. Print grid

**Forventet Output:**
```
XOXOXO
OXOXOX
XOXOXO
OXOXOX
XOXOXO
OXOXOX
```

---

### Opgave 6.25: Number grid
**Opgave:** 
1. I testLevel6(), opret 2D int array: 4x4
2. Use nested loops til at fill med row * col
3. Print grid

**Forventet Output:**
```
0 0 0 0 
0 1 2 3 
0 2 4 6 
0 3 6 9 
```

---

## Del F: Complex Scenarios

### Opgave 6.26: Pattern collection
**Opgave:** 
1. Opret en PatternPrinter: size 4, symbol '*'
2. Print alle patterns:
   - Square
   - Right triangle
   - Inverted triangle
   - Hollow square

**Forventet Output:** (alle patterns efter hinanden)

---

### Opgave 6.27: Multiple multiplication tables
**Opgave:** 
1. Opret tre MultiplicationTable objekter: max 3, 5, 7
2. For each table:
   - Print table
   - Count even products
   - Find largest product

**Forventet Output:** (dit eget design)

---

### Opgave 6.28: Grid artwork
**Opgave:** 
1. Opret en Grid: 10 rows, 10 cols
2. Create a pattern:
   - Fill border med '#'
   - Fill diagonal med '\\'
   - Fill row 5 med '-'
   - Fill col 5 med '|'
3. Print result

**Forventet Output:** (dit eget design)

---

### Opgave 6.29: ASCII art
**Opgave:** 
Use nested loops til at create:
1. A pyramid (centered triangle)
2. A diamond shape
3. An hourglass shape

**Forventet Output:** (dit eget design)

---

### Opgave 6.30: Complex grid operations
**Opgave:** 
1. Opret en Grid: 8 rows, 8 cols
2. Perform operations:
   - Fill with '.'
   - Fill border with '#'
   - Fill main diagonal with '\\'
   - Fill anti-diagonal with '/'
   - Count each symbol type
   - Print statistics

**Forventet Output:** (dit eget design med complete statistics)

---

## Refleksionsspørgsmål

Efter du har løst opgaverne, tænk over:
1. Hvad er forskellen mellem outer og inner loop?
2. Hvordan bruges nested loops til 2D patterns?
3. Hvorfor printer vi newline EFTER inner loop?
4. Hvordan laver man triangular patterns (hint: inner loop afhænger af outer)?
5. Hvad er total antal iterationer for nested loops?
6. Hvordan kan du fill kun border af en grid?
7. Hvornår ville du bruge triple-nested loops?
