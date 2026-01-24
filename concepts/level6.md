# Level 6: For Loops with Arrays

## Level 6 fokuserer på:
- Array iteration med traditional for loop
- Accessing array elements med index
- Array length property i loops
- Sum, count, find patterns med arrays
- Min/max search i arrays
- Modifying array elements
- Reverse iteration through arrays
- Common array algorithms

---


## Begrebsgennemgang

### Arrays - Quick Recap

Et **array** holder flere værdier af samme type:

```java
int[] numbers = {10, 20, 30, 40, 50};
```

**Key properties:**
- `numbers[0]` = first element (10)
- `numbers[4]` = last element (50)
- `numbers.length` = antal elementer (5)
- Index går fra 0 til length-1

### Array Iteration with For Loop

**Basic pattern:**
```java
int[] numbers = {10, 20, 30, 40, 50};

for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
// Output: 10 20 30 40 50
```

**Template:**
```java
for (int i = 0; i < array.length; i++) {
    // Use array[i]
}
```

### Why Use array.length?

**Good - dynamic:**
```java
int[] numbers = {1, 2, 3, 4, 5};
for (int i = 0; i < numbers.length; i++) {  // Works for any length!
    System.out.println(numbers[i]);
}
```

**Bad - hardcoded:**
```java
int[] numbers = {1, 2, 3, 4, 5};
for (int i = 0; i < 5; i++) {  // Breaks if array size changes
    System.out.println(numbers[i]);
}
```

### Index Variable i

**i represents position in array:**
```java
int[] scores = {85, 92, 78, 88, 95};

for (int i = 0; i < scores.length; i++) {
    System.out.println("Score at index " + i + ": " + scores[i]);
}
// Output:
// Score at index 0: 85
// Score at index 1: 92
// ...
```

### Sum Pattern

```java
int[] numbers = {10, 20, 30, 40, 50};
int sum = 0;

for (int i = 0; i < numbers.length; i++) {
    sum += numbers[i];
}
// sum = 150
```

### Count Pattern

```java
int[] numbers = {10, 25, 5, 30, 15, 40};
int count = 0;

for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] > 20) {
        count++;
    }
}
// count = 3 (25, 30, 40)
```

### Find/Search Pattern

```java
int[] numbers = {10, 20, 30, 40, 50};
int target = 30;
int foundIndex = -1;  // -1 means not found

for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] == target) {
        foundIndex = i;
        break;  // Stop when found
    }
}
// foundIndex = 2
```

### Min/Max Pattern

**Find minimum:**
```java
int[] numbers = {45, 12, 67, 23, 89};
int min = numbers[0];  // Start with first element

for (int i = 1; i < numbers.length; i++) {
    if (numbers[i] < min) {
        min = numbers[i];
    }
}
// min = 12
```

**Find maximum:**
```java
int[] numbers = {45, 12, 67, 23, 89};
int max = numbers[0];

for (int i = 1; i < numbers.length; i++) {
    if (numbers[i] > max) {
        max = numbers[i];
    }
}
// max = 89
```

### Modifying Array Elements

```java
int[] numbers = {10, 20, 30, 40, 50};

// Double all values
for (int i = 0; i < numbers.length; i++) {
    numbers[i] = numbers[i] * 2;
}
// numbers is now {20, 40, 60, 80, 100}
```

### Reverse Iteration

**Backwards through array:**
```java
int[] numbers = {10, 20, 30, 40, 50};

for (int i = numbers.length - 1; i >= 0; i--) {
    System.out.println(numbers[i]);
}
// Output: 50 40 30 20 10
```

### Common Array Tasks

**Print all elements:**
```java
for (int i = 0; i < array.length; i++) {
    System.out.println(array[i]);
}
```

**Sum all elements:**
```java
int sum = 0;
for (int i = 0; i < array.length; i++) {
    sum += array[i];
}
```

**Count matching elements:**
```java
int count = 0;
for (int i = 0; i < array.length; i++) {
    if (array[i] meets condition) {
        count++;
    }
}
```

**Find element:**
```java
for (int i = 0; i < array.length; i++) {
    if (array[i] == target) {
        // Found at index i
        break;
    }
}
```

### Array Bounds

**VIGTIGT:** Index skal være inden for bounds!

```java
int[] numbers = {10, 20, 30};  // length = 3

// KORREKT
for (int i = 0; i < numbers.length; i++) {  // i = 0, 1, 2
    System.out.println(numbers[i]);
}

// FORKERT - ArrayIndexOutOfBoundsException!
for (int i = 0; i <= numbers.length; i++) {  // i = 0, 1, 2, 3
    System.out.println(numbers[i]);  // Crash when i = 3!
}
```

**Always use `i < array.length`, NOT `i <= array.length`**

---

## Tips
- Always use `i < array.length` (not `<=`)
- Index starts at 0, not 1
- Last element is at `array.length - 1`
- Use descriptive names: `numbers[i]`, not `a[x]`
- Initialize sum to 0, min/max to first element
- Use break to exit loop early when found

---