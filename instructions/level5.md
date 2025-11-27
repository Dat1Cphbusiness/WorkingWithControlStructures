# Level 5: For Loops

## Level 5 fokuserer på:
- Traditional for loop syntax (med index)
- Enhanced for loop syntax (for-each)
- Hvornår man bruger traditional vs enhanced
- Loop counters og counting patterns
- Array iteration (begge styles)
- String iteration med for loops
- Accumulation patterns
- Reverse iteration

---

## Begrebsgennemgang

### Traditional For Loop
En **traditional for loop** har tre dele i parentesen:

```java
for (initialization; condition; update) {
    // Loop body
}
```

**Eksempel:**
```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
// Output: 0 1 2 3 4
```

**De tre dele:**
1. **Initialization**: `int i = 0` - sæt start værdi (kører én gang)
2. **Condition**: `i < 5` - hvornår fortsætter loop? (tjekkes før hver iteration)
3. **Update**: `i++` - hvad sker efter hver iteration?

### Enhanced For Loop (For-Each)
En **enhanced for loop** bruges til at iterere gennem alle elementer i en collection:

```java
int[] numbers = {10, 20, 30, 40, 50};

for (int number : numbers) {
    System.out.println(number);
}
// Output: 10 20 30 40 50
```

**Syntax:**
```java
for (type variable : collection) {
    // Use variable
}
```

### Traditional vs Enhanced - Hvornår bruger man hvad?

**Brug TRADITIONAL for loop når:**
- Du behøver index/position
- Du modificerer array elementer
- Du itererer backwards
- Du skal skippe elementer (i += 2)
- Du behøver flere variabler

```java
// Behøver index
for (int i = 0; i < array.length; i++) {
    System.out.println("Index " + i + ": " + array[i]);
}

// Modificer elementer
for (int i = 0; i < array.length; i++) {
    array[i] = array[i] * 2;  // Doubler hver værdi
}

// Backwards
for (int i = array.length - 1; i >= 0; i--) {
    System.out.println(array[i]);
}
```

**Brug ENHANCED for loop når:**
- Du bare skal læse alle elementer
- Du behøver ikke index
- Du itererer gennem hele collection
- Koden skal være mere læsbar

```java
// Simple sum
int sum = 0;
for (int number : numbers) {
    sum += number;
}

// Find max
int max = numbers[0];
for (int number : numbers) {
    if (number > max) {
        max = number;
    }
}
```

### Counting Up and Down

**Counting up:**
```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);  // 0 1 2 3 4 5 6 7 8 9
}
```

**Counting down:**
```java
for (int i = 10; i > 0; i--) {
    System.out.println(i);  // 10 9 8 7 6 5 4 3 2 1
}
```

**Custom step:**
```java
for (int i = 0; i <= 20; i += 5) {
    System.out.println(i);  // 0 5 10 15 20
}
```

### Array Iteration

**Traditional (med index):**
```java
int[] numbers = {10, 20, 30, 40, 50};

for (int i = 0; i < numbers.length; i++) {
    System.out.println("numbers[" + i + "] = " + numbers[i]);
}
```

**Enhanced (uden index):**
```java
int[] numbers = {10, 20, 30, 40, 50};

for (int number : numbers) {
    System.out.println(number);
}
```

### String Iteration

**Traditional (med charAt):**
```java
String text = "Hello";

for (int i = 0; i < text.length(); i++) {
    char c = text.charAt(i);
    System.out.println(c);
}
```

**Enhanced (med toCharArray):**
```java
String text = "Hello";

for (char c : text.toCharArray()) {
    System.out.println(c);
}
```

### Common Patterns

**Accumulator (sum):**
```java
int sum = 0;
for (int number : numbers) {
    sum += number;
}
```

**Counter:**
```java
int count = 0;
for (int number : numbers) {
    if (number > 10) {
        count++;
    }
}
```

**Find max:**
```java
int max = numbers[0];
for (int number : numbers) {
    if (number > max) {
        max = number;
    }
}
```

**Search:**
```java
boolean found = false;
for (int number : numbers) {
    if (number == target) {
        found = true;
        break;
    }
}
```

### For vs While

**Brug for loop når:**
- Du ved antal iterationer
- Du tæller fra A til B
- Du itererer gennem array/collection

**Brug while loop når:**
- Du ikke ved antal iterationer
- Loop stopper på condition (ikke counter)
- Input validation, search med early exit

**Tag udgangspunkt i klasserne Sequence, ArrayProcessor, og StringAnalyzer.**  
**Skriv din kode i Main.java i testLevel5() metoden.**

**VIGTIGT:** Vær opmærksom på om opgaven beder om traditional eller enhanced for loop.

---

## Tips
- Traditional for loop: brug når du behøver index
- Enhanced for loop: brug til at læse alle elementer
- Enhanced for loop kan IKKE modificere array elementer
- Husk: i < array.length (ikke <=)
- For backwards: start = length-1, condition = i >= 0, update = i--
- Al din kode skal placeres inde i `testLevel5()` metoden mellem tuborgklammerne `{}`

---

## Del A: Traditional For Loop Basics

### Opgave 5.1: Dit første for loop
**Opgave:** 
1. I testLevel5(), skriv et for loop der:
   - Printer tal fra 0 til 9
   - Brug traditional for loop

**Forventet Output:**
```
0 1 2 3 4 5 6 7 8 9
```

---

### Opgave 5.2: Counting to specific number
**Opgave:** 
1. Opret en Sequence: start 0, end 15, step 1
2. Implementer `printSequence()` metoden:
   - Use traditional for loop
   - Print fra start til end (inclusive) med given step

**Forventet Output:**
```
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
```

---

### Opgave 5.3: Counting with step
**Opgave:** 
1. Opret en Sequence: start 0, end 20, step 3
2. Call printSequence()

**Forventet Output:**
```
0 3 6 9 12 15 18
```

---

### Opgave 5.4: Counting down
**Opgave:** 
1. I testLevel5(), skriv et for loop der:
   - Printer fra 10 ned til 1
   - Use traditional for loop

**Forventet Output:**
```
10 9 8 7 6 5 4 3 2 1
```

---

### Opgave 5.5: Sequence sum
**Opgave:** 
1. Opret en Sequence: start 1, end 10, step 1
2. Implementer `sumSequence()` metoden:
   - Use traditional for loop
   - Return sum af alle tal i sequence
3. Print result

**Forventet Output:**
```
55
```
(1+2+3+4+5+6+7+8+9+10 = 55)

---

## Del B: Traditional For Loop with Arrays

### Opgave 5.6: Array with index
**Opgave:** 
1. Opret en ArrayProcessor med array: {10, 20, 30, 40, 50}
2. Implementer `printWithIndex()` metoden:
   - Use traditional for loop
   - Print hver number med dens index

**Forventet Output:**
```
Index 0: 10
Index 1: 20
Index 2: 30
Index 3: 40
Index 4: 50
```

---

### Opgave 5.7: Modify array elements
**Opgave:** 
1. Opret en ArrayProcessor med array: {5, 10, 15, 20, 25}
2. Implementer `doubleAllValues()` metoden:
   - Use traditional for loop
   - Double each value in array
3. Print array before and after

**Forventet Output:**
```
Before: 5 10 15 20 25
After: 10 20 30 40 50
```

---

### Opgave 5.8: Reverse iteration
**Opgave:** 
1. I testLevel5(), opret array: {1, 2, 3, 4, 5}
2. Use traditional for loop til at print backwards

**Forventet Output:**
```
5 4 3 2 1
```

---

### Opgave 5.9: Sequence reverse
**Opgave:** 
1. Opret en Sequence: start 5, end 20, step 3
2. Implementer `printReverse()` metoden:
   - Use traditional for loop
   - Print sequence backwards (from end to start)

**Forventet Output:**
```
20 17 14 11 8 5
```

---

### Opgave 5.10: Reverse array in place
**Opgave:** 
1. Opret en ArrayProcessor med array: {10, 20, 30, 40, 50}
2. Implementer `reverseArray()` metoden:
   - Use traditional for loop
   - Swap elements (first med last, second med second-last, etc.)
3. Print array before and after

**Forventet Output:**
```
Before: 10 20 30 40 50
After: 50 40 30 20 10
```

---

## Del C: Enhanced For Loop Basics

### Opgave 5.11: First enhanced for loop
**Opgave:** 
1. I testLevel5(), opret array: {5, 10, 15, 20, 25}
2. Use enhanced for loop til at print alle tal

**Forventet Output:**
```
5 10 15 20 25
```

---

### Opgave 5.12: Sum with enhanced for
**Opgave:** 
1. Opret en ArrayProcessor med array: {3, 7, 12, 8, 15}
2. Implementer `sum()` metoden:
   - Use enhanced for loop
   - Return sum

**Forventet Output:**
```
45
```

---

### Opgave 5.13: Find max
**Opgave:** 
1. Opret en ArrayProcessor med array: {23, 45, 12, 67, 34, 89, 21}
2. Implementer `findMax()` metoden:
   - Use enhanced for loop
   - Return largest number

**Forventet Output:**
```
89
```

---

### Opgave 5.14: Count positive
**Opgave:** 
1. Opret en ArrayProcessor med array: {-5, 10, -3, 15, 0, -8, 22}
2. Implementer `countPositive()` metoden:
   - Use enhanced for loop
   - Count numbers > 0

**Forventet Output:**
```
3
```

---

### Opgave 5.15: Contains check
**Opgave:** 
1. Opret en ArrayProcessor med array: {10, 20, 30, 40, 50}
2. Implementer `contains(int target)` metoden:
   - Use enhanced for loop
   - Return true hvis array contains target
3. Test med target = 30

**Forventet Output:**
```
true
```

---

## Del D: String Iteration

### Opgave 5.16: Print each character
**Opgave:** 
1. Opret en StringAnalyzer: "Hello"
2. Implementer `printCharacters()` metoden:
   - Use traditional for loop med charAt(i)
   - Print each character med position

**Forventet Output:**
```
Position 0: H
Position 1: e
Position 2: l
Position 3: l
Position 4: o
```

---

### Opgave 5.17: Count vowels
**Opgave:** 
1. Opret en StringAnalyzer: "Programming"
2. Implementer `countVowels()` metoden:
   - Use traditional for loop
   - Count a, e, i, o, u (both cases)

**Forventet Output:**
```
3
```
(o, a, i)

---

### Opgave 5.18: Reverse string
**Opgave:** 
1. Opret en StringAnalyzer: "Java"
2. Implementer `reverseString()` metoden:
   - Use traditional for loop (backwards)
   - Return reversed string

**Forventet Output:**
```
avaJ
```

---

### Opgave 5.19: Count specific character
**Opgave:** 
1. Opret en StringAnalyzer: "Hello World"
2. Implementer `countCharacter(char target)` metoden:
   - Use traditional for loop
   - Count occurrences
3. Test med target = 'l'

**Forventet Output:**
```
3
```

---

### Opgave 5.20: Enhanced for with strings
**Opgave:** 
1. Opret en StringAnalyzer: "Hello World 123"
2. Implementer `countSpaces()` metoden:
   - Use enhanced for loop med text.toCharArray()
   - Count spaces

**Forventet Output:**
```
2
```

---

## Del E: Traditional vs Enhanced

### Opgave 5.21: When to use traditional
**Opgave:** 
1. I testLevel5(), opret array: {10, 20, 30, 40, 50}
2. Use traditional for loop til at:
   - Print even indices only (0, 2, 4)
   - Print the values at those indices

**Forventet Output:**
```
Index 0: 10
Index 2: 30
Index 4: 50
```

---

### Opgave 5.22: When to use enhanced
**Opgave:** 
1. I testLevel5(), opret array: {5, 12, 8, 20, 15, 3}
2. Use enhanced for loop til at:
   - Count how many are greater than 10

**Forventet Output:**
```
3
```

---

### Opgave 5.23: Both styles comparison
**Opgave:** 
1. Opret array: {2, 4, 6, 8, 10}
2. Calculate sum using BOTH traditional and enhanced for loops
3. Verify both give same result

**Forventet Output:**
```
Sum (traditional): 30
Sum (enhanced): 30
```

---

### Opgave 5.24: Uppercase count
**Opgave:** 
1. Opret en StringAnalyzer: "Hello World"
2. Implementer `countUpperCase()` metoden:
   - Use enhanced for loop
   - Use Character.isUpperCase(c)

**Forventet Output:**
```
2
```

---

### Opgave 5.25: Digit count
**Opgave:** 
1. Opret en StringAnalyzer: "abc123def456"
2. Implementer `countDigits()` metoden:
   - Use enhanced for loop
   - Use Character.isDigit(c)

**Forventet Output:**
```
6
```

---

## Del F: Advanced Patterns

### Opgave 5.26: Sequence to array
**Opgave:** 
1. Opret en Sequence: start 5, end 20, step 3
2. Implementer `toArray()` metoden:
   - Use traditional for loop
   - Create array og fill med sequence values
   - Return array
3. Print returned array

**Forventet Output:**
```
5 8 11 14 17 20
```

---

### Opgave 5.27: Count sequence numbers
**Opgave:** 
1. Opret en Sequence: start 10, end 100, step 7
2. Implementer `countNumbers()` metoden:
   - Use traditional for loop
   - Count how many numbers are in sequence
3. Print count

**Forventet Output:**
```
14
```

---

### Opgave 5.28: Array statistics
**Opgave:** 
1. Opret en ArrayProcessor med array af 10 tal
2. Display info (uses sum, max, countPositive)
3. All should use enhanced for loops

**Forventet Output:** (dit eget design)

---

### Opgave 5.29: String analysis
**Opgave:** 
1. Opret en StringAnalyzer: "Hello World 2024!"
2. Display info (uses multiple methods)
3. Print:
   - Vowels (traditional for)
   - Spaces (enhanced for)
   - Uppercase (enhanced for)
   - Digits (enhanced for)

**Forventet Output:** (dit eget design)

---

### Opgave 5.30: Multiple sequences
**Opgave:** 
1. Opret tre Sequence objekter:
   - 0 to 10, step 1
   - 0 to 20, step 2
   - 5 to 50, step 5
2. For each:
   - Print sequence
   - Print sum
   - Print count

**Forventet Output:** (dit eget design)

---

### Opgave 5.31: Array transformations
**Opgave:** 
1. Opret array: {1, 2, 3, 4, 5}
2. Use traditional for loops til at:
   - Double all values
   - Print result
   - Triple all values
   - Print result
   - Add 10 to all values
   - Print result

**Forventet Output:**
```
Doubled: 2 4 6 8 10
Tripled: 6 12 18 24 30
Plus 10: 16 22 28 34 40
```

---

### Opgave 5.32: Comprehensive string processor
**Opgave:** 
Analyser tekst: "Programming in Java 2024 is FUN!"
1. Count vowels
2. Count consonants
3. Count spaces
4. Count digits
5. Count uppercase
6. Count lowercase
7. Print complete analysis

**Forventet Output:** (dit eget design)

---

### Opgave 5.33: Multi-array comparison
**Opgave:** 
1. Opret tre arrays med forskellige værdier
2. For each array, calculate:
   - Sum (enhanced for)
   - Max (enhanced for)
   - Average
3. Find which array has:
   - Highest sum
   - Highest max
   - Highest average

**Forventet Output:** (dit eget design)

---

### Opgave 5.34: Pattern generator
**Opgave:** 
Use traditional for loops til at generere:
1. Sequence: 1, 2, 4, 8, 16, 32, 64 (powers of 2)
2. Sequence: 1, 3, 9, 27, 81 (powers of 3)
3. Sequence: 2, 6, 12, 20, 30 (n*(n+1) for n=1 to 5)

**Forventet Output:** (dit eget design)

---

### Opgave 5.35: Complete processor system
**Opgave:** 
Opret et complete processing system:
1. Opret array med 15 tal (positive og negative)
2. Use traditional for loops til:
   - Modify: double all values
   - Modify: set negative values to 0
3. Use enhanced for loops til:
   - Calculate sum
   - Find max
   - Count zeros
4. Print complete before/after statistics

**Forventet Output:** (dit eget design med complete transformation)

---

## Refleksionsspørgsmål

Efter du har løst opgaverne, tænk over:
1. Hvad er de tre dele af en traditional for loop?
2. Hvornår skal du bruge traditional vs enhanced for loop?
3. Kan du modificere array elementer med enhanced for loop? Hvorfor ikke?
4. Hvordan itererer du backwards med for loop?
5. Hvornår er for loop bedre end while loop?
6. Hvordan får du adgang til index i enhanced for loop? (kan du?)
7. Hvilken for loop style er mere læsbar for simple operations?
