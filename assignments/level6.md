# Level6 Opgaver: For Loops med array[]

### Gå direkte til opgaver

- [Del A: Grundlæggende array-gennemløb](#del-a-basic-array-iteration)
- [Del B: Beregninger på arrays](#del-b-array-calculations)
- [Del C: Søgning i arrays](#del-c-search-and-find)
- [Del D: Modificering af arrays](#del-d-modifying-arrays)
- [Del E: Baglæns gennemløb](#del-e-reverse-iteration)

---

## Del A: Basic Array Iteration

### Opgave 6.1: Print array elements
📖 [Se forklaring: Array Iteration with For Loop](/assignments/#array-iteration-with-for-loop)

**Opgave:**
Opret array `{10, 20, 30, 40, 50}`. Print alle elementer.

| <!-- --> | <!-- --> |
|----------|----------|
| Din kode | <input type="text" size="60"> |

<details>
<summary>Se svar</summary>

```java
int[] numbers = {10, 20, 30, 40, 50};

for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
// Output: 10 20 30 40 50
```
</details>

---

### Opgave 6.2: Print with index
**Opgave:**
Opret array `{5, 10, 15, 20}`. Print "Index 0: 5", "Index 1: 10", osv.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {5, 10, 15, 20};

for (int i = 0; i < numbers.length; i++) {
    System.out.println("Index " + i + ": " + numbers[i]);
}
// Output:
// Index 0: 5
// Index 1: 10
// Index 2: 15
// Index 3: 20
```
</details>

---

### Opgave 6.3: String array iteration
**Opgave:**
Opret String array `{"Anna", "Bob", "Carl", "Diana"}`. Print alle navne.

<details>
<summary>Se svar</summary>

```java
String[] names = {"Anna", "Bob", "Carl", "Diana"};

for (int i = 0; i < names.length; i++) {
    System.out.println(names[i]);
}
// Output: Anna Bob Carl Diana
```
</details>

---

### Opgave 6.4: Double array iteration
**Opgave:**
Opret double array `{12.5, 8.75, 15.0, 22.25}`. Print alle værdier.

<details>
<summary>Se svar</summary>

```java
double[] prices = {12.5, 8.75, 15.0, 22.25};

for (int i = 0; i < prices.length; i++) {
    System.out.println(prices[i] + " kr");
}
// Output: 12.5 kr, 8.75 kr, 15.0 kr, 22.25 kr
```
</details>

---

### Opgave 6.5: Array length
**Opgave:**
Opret array `{2, 4, 6, 8, 10, 12}`. Print antal elementer og alle elementer.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {2, 4, 6, 8, 10, 12};

System.out.println("Array length: " + numbers.length);
System.out.println("Elements:");

for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```
</details>

---

## Del B: Array Calculations

### Opgave 6.6: Sum array elements
📖 [Se forklaring: Sum Pattern](#sum-pattern)

**Opgave:**
Opret array `{10, 20, 30, 40, 50}`. Beregn sum.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {10, 20, 30, 40, 50};
int sum = 0;

for (int i = 0; i < numbers.length; i++) {
    sum += numbers[i];
}

System.out.println("Sum: " + sum);
// Output: Sum: 150
```
</details>

---

### Opgave 6.7: Average
**Opgave:**
Opret array `{85, 92, 78, 88, 95}`. Beregn gennemsnit.

<details>
<summary>Se svar</summary>

```java
int[] scores = {85, 92, 78, 88, 95};
int sum = 0;

for (int i = 0; i < scores.length; i++) {
    sum += scores[i];
}

double average = (double) sum / scores.length;
System.out.println("Average: " + average);
// Output: Average: 87.6
```
</details>

---

### Opgave 6.8: Count even numbers
**Opgave:**
Opret array `{3, 8, 12, 5, 20, 7, 14}`. Lav et loop til for at tælle hvor mange er lige.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {3, 8, 12, 5, 20, 7, 14};
int count = 0;

for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] % 2 == 0) {
        count++;
    }
}

System.out.println("Even numbers: " + count);
// Output: Even numbers: 4
```
</details>

---

### Opgave 6.9: Count above threshold
**Opgave:**
Opret array `{45, 67, 23, 89, 12, 56, 78}`. Tæl hvor mange er > 50.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {45, 67, 23, 89, 12, 56, 78};
int count = 0;

for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] > 50) {
        count++;
    }
}

System.out.println("Numbers above 50: " + count);
// Output: Numbers above 50: 4
```
</details>

---

### Opgave 6.10: Sum and count
**Opgave:**
Opret array `{10, 25, 5, 30, 15, 20}`. Find sum OG count af tal >= 20.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {10, 25, 5, 30, 15, 20};
int sum = 0;
int count = 0;

for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] >= 20) {
        sum += numbers[i];
        count++;
    }
}

System.out.println("Count: " + count);
System.out.println("Sum: " + sum);
// Output: Count: 3, Sum: 75
```
</details>

---

## Del C: Search and Find

### Opgave 6.11: Find element
📖 [Se forklaring: Find/Search Pattern](#findsearch-pattern)

**Opgave:**
Opret array `{10, 20, 30, 40, 50}`. Find index af 30.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {10, 20, 30, 40, 50};
int target = 30;
int foundIndex = -1;

for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] == target) {
        foundIndex = i;
        break;
    }
}

if (foundIndex != -1) {
    System.out.println("Found at index " + foundIndex);
} else {
    System.out.println("Not found");
}
// Output: Found at index 2
```
</details>

---

### Opgave 6.12: Contains check
**Opgave:**
Opret array `{5, 10, 15, 20, 25}`. Check om det indeholder 15.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {5, 10, 15, 20, 25};
int target = 15;
boolean found = false;

for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] == target) {
        found = true;
        break;
    }
}

if (found) {
    System.out.println("Array contains " + target);
} else {
    System.out.println("Array does not contain " + target);
}
// Output: Array contains 15
```
</details>

---

### Opgave 6.13: Find minimum
**Opgave:**
Opret array `{45, 12, 67, 23, 89, 8, 34}`. Find mindste værdi.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {45, 12, 67, 23, 89, 8, 34};
int min = numbers[0];  // Start with first element

for (int i = 1; i < numbers.length; i++) {
    if (numbers[i] < min) {
        min = numbers[i];
    }
}

System.out.println("Minimum: " + min);
// Output: Minimum: 8
```
</details>

---

### Opgave 6.14: Find maximum
**Opgave:**
Opret array `{45, 12, 67, 23, 89, 8, 34}`. Find største værdi.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {45, 12, 67, 23, 89, 8, 34};
int max = numbers[0];

for (int i = 1; i < numbers.length; i++) {
    if (numbers[i] > max) {
        max = numbers[i];
    }
}

System.out.println("Maximum: " + max);
// Output: Maximum: 89
```
</details>

---

### Opgave 6.15: Find min and max
**Opgave:**
Opret array `{34, 78, 12, 56, 90, 23, 67}`. Find BÅDE min og max i ét loop.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {34, 78, 12, 56, 90, 23, 67};
int min = numbers[0];
int max = numbers[0];

for (int i = 1; i < numbers.length; i++) {
    if (numbers[i] < min) {
        min = numbers[i];
    }
    if (numbers[i] > max) {
        max = numbers[i];
    }
}

System.out.println("Min: " + min);
System.out.println("Max: " + max);
System.out.println("Range: " + (max - min));
// Output: Min: 12, Max: 90, Range: 78
```
</details>

---

## Del D: Modifying Arrays

### Opgave 6.16: Double all values
📖 [Se forklaring: Modifying Array Elements](#modifying-array-elements)

**Opgave:**
Opret array `{5, 10, 15, 20}`. Dobl alle værdier og print before/after.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {5, 10, 15, 20};

System.out.println("Before:");
for (int i = 0; i < numbers.length; i++) {
    System.out.print(numbers[i] + " ");
}
System.out.println();

// Double all values
for (int i = 0; i < numbers.length; i++) {
    numbers[i] = numbers[i] * 2;
}

System.out.println("After:");
for (int i = 0; i < numbers.length; i++) {
    System.out.print(numbers[i] + " ");
}
// Output: Before: 5 10 15 20
//         After: 10 20 30 40
```
</details>

---

### Opgave 6.17: Add constant
**Opgave:**
Opret array `{10, 20, 30, 40}`. Tilføj 5 til alle elementer.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {10, 20, 30, 40};

System.out.println("Before: ");
for (int i = 0; i < numbers.length; i++) {
    System.out.print(numbers[i] + " ");
}

for (int i = 0; i < numbers.length; i++) {
    numbers[i] += 5;
}

System.out.println("\nAfter: ");
for (int i = 0; i < numbers.length; i++) {
    System.out.print(numbers[i] + " ");
}
// Output: Before: 10 20 30 40
//         After: 15 25 35 45
```
</details>

---

### Opgave 6.18: Set negatives to zero
**Opgave:**
Opret array `{10, -5, 20, -15, 30}`. Sæt alle negative tal til 0.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {10, -5, 20, -15, 30};

System.out.println("Before:");
for (int i = 0; i < numbers.length; i++) {
    System.out.print(numbers[i] + " ");
}

for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] < 0) {
        numbers[i] = 0;
    }
}

System.out.println("\nAfter:");
for (int i = 0; i < numbers.length; i++) {
    System.out.print(numbers[i] + " ");
}
// Output: Before: 10 -5 20 -15 30
//         After: 10 0 20 0 30
```
</details>

---

### Opgave 6.19: Normalize to percentage
**Opgave:**
Opret array `{25, 50, 75, 100}`. Divide alle med 100 for at få percentages.

<details>
<summary>Se svar</summary>

```java
int[] scores = {25, 50, 75, 100};
double[] percentages = new double[scores.length];

for (int i = 0; i < scores.length; i++) {
    percentages[i] = scores[i] / 100.0;
}

System.out.println("Percentages:");
for (int i = 0; i < percentages.length; i++) {
    System.out.println(percentages[i]);
}
// Output: 0.25, 0.5, 0.75, 1.0
```
</details>

---

### Opgave 6.20: Square all values
**Opgave:**
Opret array `{2, 3, 4, 5}`. Square alle værdier (multiply by themselves).

<details>
<summary>Se svar</summary>

```java
int[] numbers = {2, 3, 4, 5};

System.out.println("Before:");
for (int i = 0; i < numbers.length; i++) {
    System.out.print(numbers[i] + " ");
}

for (int i = 0; i < numbers.length; i++) {
    numbers[i] = numbers[i] * numbers[i];
}

System.out.println("\nAfter:");
for (int i = 0; i < numbers.length; i++) {
    System.out.print(numbers[i] + " ");
}
// Output: Before: 2 3 4 5
//         After: 4 9 16 25
```
</details>

---

## Del E: Reverse Iteration

### Opgave 6.21: Print backwards
📖 [Se forklaring: Reverse Iteration](#reverse-iteration)

**Opgave:**
Opret array `{10, 20, 30, 40, 50}`. Print i omvendt rækkefølge.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {10, 20, 30, 40, 50};

for (int i = numbers.length - 1; i >= 0; i--) {
    System.out.println(numbers[i]);
}
// Output: 50 40 30 20 10
```
</details>

---

### Opgave 6.22: Reverse sum
**Opgave:**
Opret array `{5, 10, 15, 20}`. Sum elementer bagfra.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {5, 10, 15, 20};
int sum = 0;

for (int i = numbers.length - 1; i >= 0; i--) {
    sum += numbers[i];
    System.out.println("Adding " + numbers[i] + ", sum = " + sum);
}

System.out.println("Total: " + sum);
// Output: Adding 20, sum=20
//         Adding 15, sum=35
//         Adding 10, sum=45
//         Adding 5, sum=50
```
</details>

---

### Opgave 6.23: Find last occurrence
**Opgave:**
Opret array `{10, 20, 30, 20, 40}`. Find sidste index af 20 (iterate backwards).

<details>
<summary>Se svar</summary>

```java
int[] numbers = {10, 20, 30, 20, 40};
int target = 20;
int foundIndex = -1;

for (int i = numbers.length - 1; i >= 0; i--) {
    if (numbers[i] == target) {
        foundIndex = i;
        break;  // Found last occurrence
    }
}

System.out.println("Last occurrence at index: " + foundIndex);
// Output: Last occurrence at index: 3
```
</details>

---

### Opgave 6.24: Print alternating
**Opgave:**
Opret array `{1, 2, 3, 4, 5, 6}`. Print first, last, second, second-last, osv.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {1, 2, 3, 4, 5, 6};
int left = 0;
int right = numbers.length - 1;

while (left <= right) {
    System.out.println(numbers[left]);
    if (left != right) {  // Don't print same element twice
        System.out.println(numbers[right]);
    }
    left++;
    right--;
}
// Output: 1 6 2 5 3 4
```
</details>

---

### Opgave 6.25: Count from both ends
**Opgave:**
Opret array `{5, 15, 25, 35, 45, 55}`. Tæl hvor mange elementer fra hver ende er > 20.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {5, 15, 25, 35, 45, 55};
int countFromStart = 0;
int countFromEnd = 0;

// From start
for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] > 20) {
        countFromStart++;
    }
}

// From end
for (int i = numbers.length - 1; i >= 0; i--) {
    if (numbers[i] > 20) {
        countFromEnd++;
    }
}

System.out.println("From start: " + countFromStart);
System.out.println("From end: " + countFromEnd);
// Both should be 4
```
</details>

---

## Refleksionsspørgsmål

Efter du har løst opgaverne, tænk over:
1. Hvorfor bruger vi `i < array.length` og ikke `i <= array.length`?
2. Hvordan finder du det sidste element i et array?
3. Hvad er fordelen ved at bruge `array.length` i stedet for et hardcoded tal?
4. Hvordan initialiserer du min/max før du søger?
5. Hvad er forskellen mellem at læse og modificere array elementer?
6. Hvordan itererer du baglæns gennem et array?
7. Hvorfor starter array indices ved 0?
