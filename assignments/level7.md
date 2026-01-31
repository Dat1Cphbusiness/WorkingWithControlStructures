# Level 7 Opgaver: For-each loop

- [Del A: Grundlæggende for-each syntax](#del-a-basic-for-each)
- [Del B: For-each med String-arrays](#del-b-for-each-with-strings)
- [Del C: Beregninger med for-each](#del-c-calculations-with-for-each)
- [Del D: For-each vs traditionel for](#del-d-for-each-vs-traditional-for)
- [Del E: Hvornår for-each ikke virker](#del-e-when-not-to-use-for-each)

---

## Del A: Basic For-Each

### Opgave 7.1: Dit første for-each loop
📖 [Se forklaring: For-Each Loop Basics](../concepts/level7.md/#for-each-loop-basics)

**Opgave:**
Skriv kode der opretter array `numbers = {10, 20, 30, 40, 50}`. Brug et for-each loop til at printe alle tal.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {10, 20, 30, 40, 50};

for (int number : numbers) {
    System.out.println(number);
}
// Output: 10 20 30 40 50
```
</details>

---

### Opgave 7.2: Print on one line
**Opgave:**
Skriv kode der opretter array `numbers = {1, 2, 3, 4, 5}`. Brug et for-each loop til at printe alle tal på én linje separeret med mellemrum.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {1, 2, 3, 4, 5};

for (int number : numbers) {
    System.out.print(number + " ");
}
System.out.println();
// Output: 1 2 3 4 5
```
</details>

---

### Opgave 7.3: Double each value (display only)
**Opgave:**
Skriv kode der opretter array `numbers = {5, 10, 15, 20}`. Brug et for-each loop til at printe hver værdi ganget med 2. (Modificer ikke array, bare print).

<details>
<summary>Se svar</summary>

```java
int[] numbers = {5, 10, 15, 20};

for (int number : numbers) {
    System.out.println(number * 2);
}
// Output: 10 20 30 40
// Note: Original array unchanged
```
</details>

---

### Opgave 7.4: Print with labels
**Opgave:**
Skriv kode der opretter array `numbers = {100, 200, 300}`. Brug et for-each loop til at printe hver værdi med label "Value: ".

<details>
<summary>Se svar</summary>

```java
int[] numbers = {100, 200, 300};

for (int number : numbers) {
    System.out.println("Value: " + number);
}
// Output:
// Value: 100
// Value: 200
// Value: 300
```
</details>

---

### Opgave 7.5: Print squares
**Opgave:**
Skriv kode der opretter array `numbers = {2, 3, 4, 5}`. Brug et for-each loop til at printe kvadratet af hver værdi.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {2, 3, 4, 5};

for (int number : numbers) {
    int square = number * number;
    System.out.println(number + " squared = " + square);
}
// Output:
// 2 squared = 4
// 3 squared = 9
// 4 squared = 16
// 5 squared = 25
```
</details>

---

## Del B: For-Each with Strings

### Opgave 7.6: Print all names
📖 [Se forklaring: For-Each with Strings](../concepts/level7.md/#for-each-with-strings)

**Opgave:**
Skriv kode der opretter String array `names = {"Anna", "Bob", "Carl", "Diana"}`. Brug et for-each loop til at printe alle navne.

<details>
<summary>Se svar</summary>

```java
String[] names = {"Anna", "Bob", "Carl", "Diana"};

for (String name : names) {
    System.out.println(name);
}
// Output: Anna Bob Carl Diana
```
</details>

---

### Opgave 7.7: Greet everyone
**Opgave:**
Skriv kode der opretter String array `names = {"Alice", "Bob", "Charlie"}`. Brug et for-each loop til at printe "Hello, [name]!" for hver person.

<details>
<summary>Se svar</summary>

```java
String[] names = {"Alice", "Bob", "Charlie"};

for (String name : names) {
    System.out.println("Hello, " + name + "!");
}
// Output:
// Hello, Alice!
// Hello, Bob!
// Hello, Charlie!
```
</details>

---

### Opgave 7.8: Print lengths
**Opgave:**
Skriv kode der opretter String array `words = {"cat", "elephant", "dog", "butterfly"}`. Brug et for-each loop til at printe længden af hver String.

<details>
<summary>Se svar</summary>

```java
String[] words = {"cat", "elephant", "dog", "butterfly"};

for (String word : words) {
    System.out.println(word + " has " + word.length() + " letters");
}
// Output:
// cat has 3 letters
// elephant has 8 letters
// dog has 3 letters
// butterfly has 9 letters
```
</details>

---

### Opgave 7.9: Uppercase conversion
**Opgave:**
Skriv kode der opretter String array `words = {"hello", "world", "java"}`. Brug et for-each loop til at printe alle Strings i uppercase.

<details>
<summary>Se svar</summary>

```java
String[] words = {"hello", "world", "java"};

for (String word : words) {
    System.out.println(word.toUpperCase());
}
// Output: HELLO WORLD JAVA
```
</details>

---

### Opgave 7.10: First character
**Opgave:**
Skriv kode der opretter String array `names = {"Anna", "Bob", "Carl"}`. Brug et for-each loop til at printe første bogstav af hver String.

<details>
<summary>Se svar</summary>

```java
String[] names = {"Anna", "Bob", "Carl"};

for (String name : names) {
    System.out.println(name.charAt(0));
}
// Output: A B C
```
</details>

---

## Del C: Calculations with For-Each

### Opgave 7.11: Sum array
📖 [Se forklaring: Common Patterns with For-Each](../concepts/level7.md/#common-patterns-with-for-each)

**Opgave:**
Skriv kode der opretter array `numbers = {5, 10, 15, 20, 25}`. Brug et for-each loop til at beregne sum. Opret `sum = 0`.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {5, 10, 15, 20, 25};
int sum = 0;

for (int number : numbers) {
    sum += number;
}

System.out.println("Sum: " + sum);
// Output: Sum: 75
```
</details>

---

### Opgave 7.12: Average
**Opgave:**
Skriv kode der opretter array `numbers = {10, 20, 30, 40, 50}`. Brug et for-each loop til at beregne gennemsnit. Opret `sum = 0` og `count = 0`.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {10, 20, 30, 40, 50};
int sum = 0;
int count = 0;

for (int number : numbers) {
    sum += number;
    count++;
}

double average = (double) sum / count;
System.out.println("Average: " + average);
// Output: Average: 30.0
```
</details>

---

### Opgave 7.13: Count positive numbers
**Opgave:**
Skriv kode der opretter array `numbers = {-5, 10, -3, 8, 0, 15, -2}`. Brug et for-each loop til at tælle hvor mange positive tal der er. Opret `count = 0`.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {-5, 10, -3, 8, 0, 15, -2};
int count = 0;

for (int number : numbers) {
    if (number > 0) {
        count++;
    }
}

System.out.println("Positive numbers: " + count);
// Output: Positive numbers: 3
```
</details>

---

### Opgave 7.14: Find maximum
**Opgave:**
Skriv kode der opretter array `numbers = {23, 45, 12, 67, 34, 89, 21}`. Brug et for-each loop til at finde største tal. Opret `max = numbers[0]`.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {23, 45, 12, 67, 34, 89, 21};
int max = numbers[0];  // Initialize with first element

for (int number : numbers) {
    if (number > max) {
        max = number;
    }
}

System.out.println("Maximum: " + max);
// Output: Maximum: 89
```
</details>

---

### Opgave 7.15: Product of all elements
**Opgave:**
Skriv kode der opretter array `numbers = {2, 3, 4, 5}`. Brug et for-each loop til at beregne produktet (2 × 3 × 4 × 5). Opret `product = 1`.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {2, 3, 4, 5};
int product = 1;

for (int number : numbers) {
    product *= number;
}

System.out.println("Product: " + product);
// Output: Product: 120
```
</details>

---

## Del D: For-Each vs Traditional For

### Opgave 7.16: Same task, both ways
**Opgave:**
Skriv kode der opretter array `numbers = {1, 2, 3, 4, 5}`. Print alle tal med BÅDE traditional for loop og for-each loop. Sammenlign.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {1, 2, 3, 4, 5};

// Traditional for
System.out.println("Traditional for:");
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}

// For-each
System.out.println("\nFor-each:");
for (int number : numbers) {
    System.out.println(number);
}

// Both produce same output!
// For-each is simpler for this task.
```
</details>

---

### Opgave 7.17: When for-each is better
**Opgave:**
Skriv kode der opretter array `numbers = {10, 20, 30, 40}`. Summer array med both traditional for og for-each. Hvilken er simplest?

<details>
<summary>Se svar</summary>

```java
int[] numbers = {10, 20, 30, 40};

// Traditional for
int sum1 = 0;
for (int i = 0; i < numbers.length; i++) {
    sum1 += numbers[i];
}

// For-each (simpler!)
int sum2 = 0;
for (int number : numbers) {
    sum2 += number;
}

System.out.println("Sum (traditional): " + sum1);
System.out.println("Sum (for-each): " + sum2);

// For-each er simplere - no index needed!
```
</details>

---

### Opgave 7.18: When traditional for is needed
**Opgave:**
Skriv kode der opretter array `numbers = {100, 200, 300}`. Print hver element MED index. Kan du bruge for-each? Forklar hvorfor/hvorfor ikke.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {100, 200, 300};

// Must use traditional for - need index!
for (int i = 0; i < numbers.length; i++) {
    System.out.println("Index " + i + ": " + numbers[i]);
}

// Cannot do this with for-each - no access to index
```
</details>

---

### Opgave 7.19: Read-only limitation
**Opgave:**
Skriv kode der opretter array `numbers = {5, 10, 15}`. Forsøg at doble alle værdier med for-each. Print array før og efter. Hvad sker der?

<details>
<summary>Se svar</summary>

```java
int[] numbers = {5, 10, 15};

System.out.println("Before:");
for (int number : numbers) {
    System.out.print(number + " ");
}

// Try to modify (DOESN'T WORK!)
for (int number : numbers) {
    number = number * 2;  // Only modifies copy!
}

System.out.println("\nAfter:");
for (int number : numbers) {
    System.out.print(number + " ");
}

// Output shows array unchanged!
// For-each is READ-ONLY

// To modify, must use traditional for:
for (int i = 0; i < numbers.length; i++) {
    numbers[i] = numbers[i] * 2;
}
```
</details>

---

### Opgave 7.20: Choose the right tool
**Opgave:**
For hver task, beslut om for-each eller traditional for er bedst:

1. Print all elements
2. Double all values (modify array)
3. Sum all elements
4. Print with index numbers
5. Find maximum

<details>
<summary>Se svar</summary>

```java
int[] numbers = {10, 20, 30, 40, 50};

// 1. Print all - for-each is better
for (int number : numbers) {
    System.out.println(number);
}

// 2. Modify array - MUST use traditional
for (int i = 0; i < numbers.length; i++) {
    numbers[i] *= 2;
}

// 3. Sum - for-each is better
int sum = 0;
for (int number : numbers) {
    sum += number;
}

// 4. Print with index - MUST use traditional
for (int i = 0; i < numbers.length; i++) {
    System.out.println("Index " + i + ": " + numbers[i]);
}

// 5. Find max - for-each is fine
int max = numbers[0];
for (int number : numbers) {
    if (number > max) max = number;
}
```
</details>

---

## Del E: When NOT to Use For-Each

### Opgave 7.21: Partial iteration
**Opgave:**
Skriv kode der opretter array `numbers = {10, 20, 30, 40, 50, 60}`. Print kun first 3 elements. Kan du bruge for-each? Forklar.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {10, 20, 30, 40, 50, 60};

// Cannot do with for-each - must use traditional
for (int i = 0; i < 3; i++) {
    System.out.println(numbers[i]);
}
// Output: 10 20 30

// For-each always goes through ENTIRE array
```
</details>

---

### Opgave 7.22: Backwards iteration
**Opgave:**
Skriv kode der opretter array `numbers = {1, 2, 3, 4, 5}`. Print backwards. Kan du bruge for-each?

<details>
<summary>Se svar</summary>

```java
int[] numbers = {1, 2, 3, 4, 5};

// Cannot do backwards with for-each - must use traditional
for (int i = numbers.length - 1; i >= 0; i--) {
    System.out.println(numbers[i]);
}
// Output: 5 4 3 2 1

// For-each always goes forward
```
</details>

---

### Opgave 7.23: Every other element
**Opgave:**
Skriv kode der opretter array `numbers = {10, 20, 30, 40, 50, 60}`. Print every other element (10, 30, 50). Kan du bruge for-each?

<details>
<summary>Se svar</summary>

```java
int[] numbers = {10, 20, 30, 40, 50, 60};

// Must use traditional - need control over step
for (int i = 0; i < numbers.length; i += 2) {
    System.out.println(numbers[i]);
}
// Output: 10 30 50

// Cannot skip elements with for-each
```
</details>

---

### Opgave 7.24: Comparing adjacent elements
**Opgave:**
Skriv kode der opretter array `numbers = {5, 3, 8, 2, 9}`. Print hvor mange gange et tal er større end det næste. Kan du bruge for-each?

<details>
<summary>Se svar</summary>

```java
int[] numbers = {5, 3, 8, 2, 9};
int count = 0;

// Must use traditional - need to compare i and i+1
for (int i = 0; i < numbers.length - 1; i++) {
    if (numbers[i] > numbers[i + 1]) {
        count++;
    }
}

System.out.println("Count: " + count);
// Output: Count: 2 (5>3 and 8>2)

// Cannot access next element with for-each
```
</details>

---

### Opgave 7.25: Find index of element
**Opgave:**
Skriv kode der opretter array `numbers = {10, 20, 30, 40, 50}`. Find index of 30. Opret `target = 30`. Kan du bruge for-each?

<details>
<summary>Se svar</summary>

```java
int[] numbers = {10, 20, 30, 40, 50};
int target = 30;
int foundIndex = -1;

// Must use traditional - need index
for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] == target) {
        foundIndex = i;
        break;
    }
}

System.out.println("Found at index: " + foundIndex);
// Output: Found at index: 2

// For-each doesn't give you index
```
</details>

---

## Refleksionsspørgsmål

Efter du har løst opgaverne, tænk over:
1. Hvad er forskellen mellem for-each og traditional for loop?
2. Hvornår er for-each bedre end traditional for?
3. Hvornår SKAL du bruge traditional for i stedet for for-each?
4. Hvorfor kan du ikke modificere array elementer med for-each?
5. Hvordan får du fat i index med for-each? (Trick question!)
6. Er for-each read-only eller read-write?
7. Hvilken loop type ville du vælge for at printe alle elementer? Hvorfor?
8. Hvilken loop type ville du vælge for at finde et element ved index 5?
