# Level 4: While Loops

## Level 4 fokuserer på:
- While loop syntax og struktur
- Loop conditions
- Loop control variables
- Infinite loops (og hvordan man undgår dem)
- Sentinel values
- Accumulator pattern
- Search/find patterns
- Using while with arrays

---

## Begrebsgennemgang

### While Loop Basics
En **while loop** kører så længe en condition er sand:

```java
int count = 0;
while (count < 5) {
    System.out.println(count);
    count++;  // VIGTIGT: opdater condition variable!
}
// Output: 0 1 2 3 4
```

### Loop Components
En while loop har tre vigtige dele:
1. **Initialization** (før loop): Sæt start værdi
2. **Condition** (i while): Hvornår skal loop fortsætte?
3. **Update** (inde i loop): Opdater variable så condition ændres

```java
int i = 0;           // 1. Initialization
while (i < 10) {     // 2. Condition
    System.out.println(i);
    i++;             // 3. Update
}
```

### Infinite Loops - FARLIGT!
Hvis condition ALDRIG bliver false, kører loop for evigt:

```java
// FARLIGT - infinite loop!
int count = 0;
while (count < 5) {
    System.out.println(count);
    // Mangler count++! Loop stopper aldrig!
}
```

**Hvordan undgår man infinite loops:**
- Sørg altid for at condition kan blive false
- Opdater loop variable inde i loop
- Test din loop condition omhyggeligt

### Accumulator Pattern
Accumulator bruges til at samle/akkumulere værdier:

```java
int sum = 0;  // Accumulator
int i = 1;
while (i <= 5) {
    sum += i;  // Tilføj til accumulator
    i++;
}
// sum = 1+2+3+4+5 = 15
```

### Counter Pattern
Counter bruges til at tælle hvor mange gange noget sker:

```java
int count = 0;  // Counter
int i = 0;
int[] numbers = {2, 5, 8, 3, 10};

while (i < numbers.length) {
    if (numbers[i] > 5) {
        count++;  // Tæl hver gang condition er opfyldt
    }
    i++;
}
// count = 2 (to tal er større end 5)
```

### Search Pattern
Brug while til at søge efter en værdi:

```java
int[] numbers = {3, 7, 2, 9, 5};
int target = 9;
int index = 0;
boolean found = false;

while (index < numbers.length && !found) {
    if (numbers[index] == target) {
        found = true;
    } else {
        index++;
    }
}

if (found) {
    System.out.println("Found at index " + index);
}
```

### While med Arrays
Brug index variable til at iterere gennem array:

```java
int[] numbers = {10, 20, 30, 40, 50};
int index = 0;

while (index < numbers.length) {
    System.out.println(numbers[index]);
    index++;
}
```

### Sentinel Value
En sentinel value signalerer loop stop (ofte -1 eller special værdi):

```java
int value = 5;
while (value != -1) {  // -1 er sentinel value
    System.out.println(value);
    value--;
    if (value == 0) {
        value = -1;  // Sæt sentinel for at stoppe
    }
}
```

### While vs For Loop
**Brug while når:**
- Du ikke ved hvor mange iterationer
- Loop stopper baseret på condition (ikke counter)
- Input validation, search, sentinel values

**Brug for når:**
- Du ved antal iterationer
- Simple counting (0 til n)
- Array iteration (normalt)

**Tag udgangspunkt i klasserne Counter, InputValidator, og Accumulator.**  
**Skriv din kode i Main.java i testLevel4() metoden.**

**VIGTIGT:** Implementer TODO metoderne ved hjælp af while loops.

---

## Tips
- Start altid med at initialisere loop variable
- Check at din condition kan blive false
- Opdater loop variable inde i loop (ellers infinite loop!)
- Brug meaningful variable names (index, count, sum)
- Test med små værdier først
- Vær forsigtig med array bounds (index < array.length)
- Al din kode skal placeres inde i `testLevel4()` metoden mellem tuborgklammerne `{}`

---

## Del A: Basic While Loops

### Opgave 4.1: Dit første while loop
**Opgave:** 
1. Opret en Counter: "Basic", maxValue 5
2. Implementer `countToMax()` metoden:
   - Print numbers fra current value op til (men ikke inklusiv) maxValue
   - Use while loop
3. Call countToMax()

**Forventet Output:**
```
0 1 2 3 4
```

---

### Opgave 4.2: Counting down
**Opgave:** 
1. Opret en Counter: "Countdown", maxValue 10
2. Set value til 5
3. Implementer `countDown()` metoden:
   - Print numbers fra current value ned til 0
4. Call countDown()

**Forventet Output:**
```
5 4 3 2 1 0
```

---

### Opgave 4.3: While with different ranges
**Opgave:** 
1. Opret tre Counter objekter:
   - "Small" maxValue 3
   - "Medium" maxValue 7
   - "Large" maxValue 10
2. Call countToMax() på alle tre

**Forventet Output:**
```
0 1 2
0 1 2 3 4 5 6
0 1 2 3 4 5 6 7 8 9
```

---

### Opgave 4.4: Simple loop control
**Opgave:** 
1. I testLevel4(), skriv et while loop der:
   - Starter med i = 0
   - Printer i
   - Incrementer i
   - Stopper når i >= 10

**Forventet Output:**
```
0 1 2 3 4 5 6 7 8 9
```

---

### Opgave 4.5: Loop with condition check
**Opgave:** 
1. I testLevel4(), skriv et while loop der:
   - Starter med number = 1
   - Printer number
   - Doubler number (number *= 2)
   - Stopper når number > 100

**Forventet Output:**
```
1 2 4 8 16 32 64
```

---

## Del B: Accumulator Pattern

### Opgave 4.6: Simple sum
**Opgave:** 
1. Opret en Accumulator
2. Implementer `findSum(int start, int end)` metoden:
   - Return sum af alle tal fra start til end (inclusive)
   - Use while loop
3. Call findSum(1, 5)

**Forventet Output:**
```
15
```
(1+2+3+4+5 = 15)

---

### Opgave 4.7: Different sums
**Opgave:** 
1. Opret en Accumulator
2. Test findSum() med forskellige ranges:
   - findSum(1, 10)
   - findSum(5, 8)
   - findSum(0, 3)

**Forventet Output:**
```
55
26
6
```

---

### Opgave 4.8: Sum to value
**Opgave:** 
1. Opret en Counter: "Summer", maxValue 100
2. Set value til 10
3. Implementer `sumToValue()` metoden:
   - Return sum af 0 til current value (inclusive)
4. Print result

**Forventet Output:**
```
55
```
(0+1+2+3+4+5+6+7+8+9+10 = 55)

---

### Opgave 4.9: Array sum
**Opgave:** 
1. Opret en Accumulator
2. Opret et int array: {5, 10, 15, 20, 25}
3. Implementer `addNumbers(int[] numbers)` metoden:
   - Add alle numbers til total
   - Increment count for hver
   - Use while loop med index
4. Display info

**Forventet Output:**
```
Total: 75
Count: 5
Average: 15.0
```

---

### Opgave 4.10: Multiple arrays
**Opgave:** 
1. Opret en Accumulator
2. Opret tre arrays med forskellige tal
3. For hver array:
   - Call addNumbers()
   - Display info
   - Reset accumulator

**Forventet Output:** (eksempel for hver array)

---

## Del C: Counter Pattern

### Opgave 4.11: Count even numbers
**Opgave:** 
1. Opret en Accumulator
2. Opret et array: {2, 5, 8, 11, 14, 17, 20}
3. Implementer `countEven(int[] numbers)` metoden:
   - Count hvor mange numbers er even
   - Use while loop
4. Print count

**Forventet Output:**
```
4
```

---

### Opgave 4.12: Count with condition
**Opgave:** 
1. I testLevel4(), opret array: {10, 25, 5, 30, 15, 40, 8}
2. Brug while loop til at count hvor mange tal er større end 15
3. Print count

**Forventet Output:**
```
3
```

---

### Opgave 4.13: Valid inputs
**Opgave:** 
1. Opret en InputValidator: maxAttempts 5
2. Opret et array: {5, 12, -3, 8, 25, 10, 7}
3. Implementer `countValidInputs(int[] inputs, int minValue, int maxValue)`:
   - Count hvor mange er mellem min og max (inclusive)
   - Use while loop
4. Test med min=5, max=15

**Forventet Output:**
```
5
```

---

### Opgave 4.14: Multiple conditions
**Opgave:** 
1. I testLevel4(), opret array: {15, 22, 8, 33, 18, 5, 29}
2. Count hvor mange tal er:
   - Even AND greater than 10
3. Use while loop

**Forventet Output:**
```
3
```
(22, 18, både even og > 10)

---

### Opgave 4.15: Attempts remaining
**Opgave:** 
1. Opret en InputValidator: maxAttempts 5
2. Implementer `printAttemptsRemaining()` metoden:
   - Print "Attempts remaining: X" for X fra maxAttempts ned til 1
   - Use while loop

**Forventet Output:**
```
Attempts remaining: 5
Attempts remaining: 4
Attempts remaining: 3
Attempts remaining: 2
Attempts remaining: 1
```

---

## Del D: Search Pattern

### Opgave 4.16: Find maximum
**Opgave:** 
1. Opret en Accumulator
2. Opret et array: {15, 42, 8, 23, 56, 12}
3. Implementer `findMax(int[] numbers)` metoden:
   - Find largest number
   - Use while loop
4. Print max

**Forventet Output:**
```
56
```

---

### Opgave 4.17: Find minimum
**Opgave:** 
1. I testLevel4(), opret array: {25, 12, 45, 8, 33, 19}
2. Brug while loop til at finde smallest number
3. Print min

**Forventet Output:**
```
8
```

---

### Opgave 4.18: Search for value
**Opgave:** 
1. I testLevel4(), opret array: {10, 20, 30, 40, 50}
2. Brug while loop til at search for 30
3. Print index hvis found, ellers "Not found"

**Forventet Output:**
```
Found at index 2
```

---

### Opgave 4.19: First occurrence
**Opgave:** 
1. I testLevel4(), opret array: {5, 12, 8, 12, 20, 12}
2. Find first index where value equals 12
3. Use while loop og stop når found

**Forventet Output:**
```
Found at index 1
```

---

### Opgave 4.20: Password validation
**Opgave:** 
1. Opret en InputValidator: maxAttempts 3
2. Opret String array: {"wrong1", "wrong2", "correct", "wrong3"}
3. Implementer `validatePassword(String correctPassword, String[] inputPasswords)`:
   - Loop gennem inputs
   - Check hver mod correct password
   - Increment attempts
   - Return true hvis found, false hvis exceeded attempts eller not found
4. Test med correctPassword = "correct"

**Forventet Output:**
```
true
```

---

## Del E: Loop Control

### Opgave 4.21: Increment until target
**Opgave:** 
1. Opret en Counter: "Target", maxValue 20
2. Set value til 5
3. Implementer `incrementUntil(int target)` metoden:
   - Increment value until it reaches target
   - Don't exceed maxValue
   - Print value efter each increment
4. Call incrementUntil(10)

**Forventet Output:**
```
6 7 8 9 10
```

---

### Opgave 4.22: Reset to zero
**Opgave:** 
1. Opret en Counter: "Resetter", maxValue 100
2. Set value til 8
3. Implementer `resetToZero()` metoden:
   - Decrement value til 0
   - Print each step
4. Call resetToZero()

**Forventet Output:**
```
7 6 5 4 3 2 1 0
```

---

### Opgave 4.23: Controlled loop
**Opgave:** 
1. Opret en InputValidator: maxAttempts 5
2. Brug while loop til at:
   - Call incrementAttempt() while hasAttemptsLeft()
   - Stop når no attempts left
3. Display info når færdig

**Forventet Output:**
```
Attempt 1 of 5
Attempt 2 of 5
Attempt 3 of 5
Attempt 4 of 5
Attempt 5 of 5
Attempts: 5/5
Remaining: 0
```

---

### Opgave 4.24: Loop with break
**Opgave:** 
1. I testLevel4(), opret array: {5, 10, 15, 20, 25, 30}
2. Use while loop til at sum numbers
3. Hvis sum overstiger 40, break out of loop
4. Print final sum

**Forventet Output:**
```
45
```
(5+10+15+20 = 50, men 45 før sidste addition)

---

### Opgave 4.25: Sentinel value
**Opgave:** 
1. I testLevel4(), opret array: {10, 20, 30, -1, 40, 50}
2. Use while loop til at print numbers
3. Stop når du møder -1 (sentinel value)

**Forventet Output:**
```
10 20 30
```

---

## Del F: Complex Scenarios

### Opgave 4.26: Statistics calculator
**Opgave:** 
1. Opret en Accumulator
2. Opret et array med 10 tal
3. Calculate og print:
   - Sum (brug addNumbers)
   - Count
   - Average
   - Max (brug findMax)
   - Count of even numbers (brug countEven)

**Forventet Output:** (dit eget design)

---

### Opgave 4.27: Validation system
**Opgave:** 
1. Opret en InputValidator: maxAttempts 5
2. Opret array med passwords: mindst 7 strings
3. Test validatePassword() med forskellige correct passwords
4. Display attempts efter each validation
5. Reset mellem each test

**Forventet Output:** (dit eget design)

---

### Opgave 4.28: Counter simulation
**Opgave:** 
1. Opret tre Counter objekter med forskellige maxValues
2. For hver counter:
   - Count to max
   - Set value til maxValue/2
   - Count down
   - Calculate sumToValue
   - Display info

**Forventet Output:** (dit eget design)

---

### Opgave 4.29: Range finder
**Opgave:** 
1. Opret et array med 15 tal (mixed values)
2. Use while loops til at find:
   - Minimum value
   - Maximum value
   - Range (max - min)
   - Count of numbers in range [min+5, max-5]

**Forventet Output:** (dit eget design)

---

### Opgave 4.30: Multi-array processing
**Opgave:** 
1. Opret tre arrays med forskellige tal
2. For hver array:
   - Find sum
   - Find average
   - Find max
   - Count even numbers
3. Print statistics for hver array
4. Print grand total across all arrays

**Forventet Output:** (dit eget design)

---

## Refleksionsspørgsmål

Efter du har løst opgaverne, tænk over:
1. Hvad er de tre vigtige komponenter i en while loop?
2. Hvordan undgår du infinite loops?
3. Hvad er accumulator pattern og hvornår bruges det?
4. Hvad er sentinel value?
5. Hvornår ville du vælge while over for loop?
6. Hvordan kan du search gennem et array med while loop?
7. Hvad sker der hvis du glemmer at opdatere loop variable?
