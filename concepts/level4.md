# Level 4: While Loops

## Level 4 fokuserer på:
- While loop syntax og struktur
- Loop conditions
- Loop control variables
- Infinite loops (og hvordan man undgår dem)
- Counter pattern
- Accumulator pattern
- Sentinel values
- Input validation patterns
- Loop termination conditions

---

## Begrebsgennemgang

### While Loop Basics

En **while loop** kører så længe en condition er sand:

```java
int count = 0;
while (count < 5) {
    System.out.println(count);
    count++;  // VIGTIGT: opdater variablen!
}
// Output: 0 1 2 3 4
```

**Syntax:**
```java
while (condition) {
    // Code to repeat
    // MUST update condition variable!
}
```

### Loop Components

En while loop har tre vigtige dele:

```java
int i = 0;           // 1. Initialization (før loop)
while (i < 10) {     // 2. Condition (test før hver iteration)
    System.out.println(i);
    i++;             // 3. Update (ændr variabel så loop stopper)
}
```

**Execution flow:**
1. Initialize variable
2. Check condition
3. If true: execute body, goto step 2
4. If false: exit loop

### Infinite Loops - FARLIGT!

Hvis condition ALDRIG bliver false, kører loop for evigt:

```java
// FARLIGT - infinite loop!
int count = 0;
while (count < 5) {
    System.out.println(count);
    // Mangler count++! Loop stopper ALDRIG!
}
```

**Hvordan undgår man infinite loops:**
- ✅ Sørg for at condition kan blive false
- ✅ Opdater loop variable inde i loop
- ✅ Test din condition omhyggeligt
- ✅ Brug debugging (print statements)

### Counter Pattern

En **counter** tæller hvor mange gange noget sker:

```java
int count = 0;
int i = 1;

while (i <= 10) {
    if (i % 2 == 0) {
        count++;  // Tæl hver gang condition er true
    }
    i++;
}
// count = 5 (five even numbers: 2, 4, 6, 8, 10)
```

**Pattern:**
1. Initialize counter til 0
2. I loop: increment når noget sker
3. Efter loop: counter har totalen

### Accumulator Pattern

En **accumulator** samler/akkumulerer værdier:

```java
int sum = 0;  // Accumulator
int i = 1;

while (i <= 5) {
    sum += i;  // Tilføj til accumulator
    i++;
}
// sum = 1+2+3+4+5 = 15
```

**Pattern:**
1. Initialize accumulator til 0 (eller start værdi)
2. I loop: add til accumulator
3. Efter loop: accumulator har totalen

### Sentinel Value

En **sentinel value** signalerer at loop skal stoppe:

```java
int number = 10;

while (number != -1) {  // -1 er sentinel value
    System.out.println(number);
    number--;
    if (number == 5) {
        number = -1;  // Sæt sentinel for at stoppe
    }
}
// Output: 10 9 8 7 6 (stopper når number bliver -1)
```

**Common sentinel values:**
- -1 for numbers
- 0 for positive numbers
- Empty string for text
- false for booleans

### Loop Termination Conditions

**Count-based:**
```java
int i = 0;
while (i < 10) {  // Stopper når i reaches 10
    i++;
}
```

**Value-based:**
```java
int number = 100;
while (number > 0) {  // Stopper når number reaches 0
    number = number / 2;
}
```

**Condition-based:**
```java
boolean found = false;
int i = 0;
while (!found && i < 100) {  // Stopper når found ELLER i >= 100
    // Search logic
    i++;
}
```

### While vs For Loop

**Brug while når:**
- ✅ Du ikke ved hvor mange iterationer
- ✅ Loop stopper baseret på condition (ikke counter)
- ✅ Sentinel values
- ✅ Input validation

**Brug for når:**
- ✅ Du ved antal iterationer
- ✅ Simple counting (0 til n)
- ✅ Array iteration (kommer i næste level!)

### Common Patterns

**Count up:**
```java
int i = 0;
while (i < 10) {
    System.out.println(i);
    i++;
}
```

**Count down:**
```java
int i = 10;
while (i > 0) {
    System.out.println(i);
    i--;
}
```

**Sum sequence:**
```java
int sum = 0;
int i = 1;
while (i <= 100) {
    sum += i;
    i++;
}
```

**Find value:**
```java
int number = 1;
boolean found = false;
while (!found) {
    if (number * number == 64) {
        found = true;
    } else {
        number++;
    }
}
// number = 8
```

---

## Tips
- Start altid med at initialisere loop variable
- Check at din condition kan blive false
- Opdater loop variable inde i loop (ellers infinite loop!)
- Brug meaningful names (count, sum, ikke bare x, y)
- Test med små værdier først
- Print loop variable for debugging

---