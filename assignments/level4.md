# Level4 Opgaver: while Loops

- [Del A: Grundlæggende while-loops](#del-a-basic-while-loops)
- [Del B: Tæller-mønstret](#del-b-counter-pattern)
- [Del C: Akkumulator-mønstret](#del-c-accumulator-pattern)
- [Del D: Sentinel-værdier (stop-signaler)](#del-d-sentinel-values)
- [Del E: Nedtælling og betingelser](#del-e-countdown-and-conditions)

---
## Del A: Basic While Loops

### Opgave 4.1: Dit første while loop
📖 [Se forklaring: While Loop Basics](#while-loop-basics)

**Opgave:**
Brug while loop til at printe tallene 0 til 4.

| <!-- --> | <!-- --> |
|----------|----------|
| Din kode | <input type="text" size="50"> |

<details>
<summary>Se svar</summary>

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
// Output: 0 1 2 3 4
```
</details>

---

### Opgave 4.2: Count to 10
**Opgave:**
Print tallene 1 til 10 med while loop.

<details>
<summary>Se svar</summary>

```java
int i = 1;
while (i <= 10) {
    System.out.println(i);
    i++;
}
// Output: 1 2 3 4 5 6 7 8 9 10
```
</details>

---

### Opgave 4.3: Count by 2
**Opgave:**
Print lige tal fra 0 til 20 (0, 2, 4, 6, ..., 20).

<details>
<summary>Se svar</summary>

```java
int i = 0;
while (i <= 20) {
    System.out.println(i);
    i += 2;  // Increment by 2
}
// Output: 0 2 4 6 8 10 12 14 16 18 20
```
</details>

---

## Del B: Counter Pattern

### Opgave 4.4: Count iterations
📖 [Se forklaring: Counter Pattern](#counter-pattern)

**Opgave:**
Tæl hvor mange gange loopen kører. Loop fra 0 til 9.

<details>
<summary>Se svar</summary>

```java
int count = 0;
int i = 0;

while (i < 10) {
    count++;
    i++;
}

System.out.println("Loop ran " + count + " times");
// Output: Loop ran 10 times
```
</details>

---

### Opgave 4.5: Count even numbers
**Opgave:**
Tæl hvor mange lige tal der er mellem 1 og 20.

<details>
<summary>Se svar</summary>

```java
int count = 0;
int i = 1;

while (i <= 20) {
    if (i % 2 == 0) {
        count++;
    }
    i++;
}

System.out.println("Even numbers: " + count);
// Output: Even numbers: 10
```
</details>

---

### Opgave 4.6: Count multiples of 3
**Opgave:**
Tæl hvor mange tal mellem 1 og 30 der er delelige med 3.

<details>
<summary>Se svar</summary>

```java
int count = 0;
int i = 1;

while (i <= 30) {
    if (i % 3 == 0) {
        count++;
    }
    i++;
}

System.out.println("Multiples of 3: " + count);
// Output: Multiples of 3: 10
```
</details>

---

### Opgave 4.7: Count digits
**Opgave:**
Tæl hvor mange cifre tallet 12345 har. Hint: divide by 10 gentagne gange.

<details>
<summary>Se svar</summary>

```java
int number = 12345;
int count = 0;

while (number > 0) {
    count++;
    number = number / 10;
}

System.out.println("Digits: " + count);
// Output: Digits: 5
```
</details>

---

### Opgave 4.8: Count down
**Opgave:**
Tæl ned fra 10 til 1 og tæl hvor mange tal du printer.

<details>
<summary>Se svar</summary>

```java
int i = 10;
int count = 0;

while (i > 0) {
    System.out.println(i);
    count++;
    i--;
}

System.out.println("Printed " + count + " numbers");
// Output: 10 9 8 7 6 5 4 3 2 1
// Printed 10 numbers
```
</details>

---

## Del C: Accumulator Pattern

### Opgave 4.9: Sum 1 to 10
📖 [Se forklaring: Accumulator Pattern](#accumulator-pattern)

**Opgave:**
Beregn summen af tallene 1 til 10.

<details>
<summary>Se svar</summary>

```java
int sum = 0;
int i = 1;

while (i <= 10) {
    sum += i;
    i++;
}

System.out.println("Sum: " + sum);
// Output: Sum: 55
```
</details>

---

### Opgave 4.10: Sum even numbers
**Opgave:**
Beregn summen af alle lige tal fra 1 til 20.

<details>
<summary>Se svar</summary>

```java
int sum = 0;
int i = 1;

while (i <= 20) {
    if (i % 2 == 0) {
        sum += i;
    }
    i++;
}

System.out.println("Sum of even numbers: " + sum);
// Output: Sum of even numbers: 110
```
</details>

---

### Opgave 4.11: Product/factorial
**Opgave:**
Beregn factorial af 5 (5! = 5 × 4 × 3 × 2 × 1 = 120).

<details>
<summary>Se svar</summary>

```java
int product = 1;
int i = 5;

while (i > 0) {
    product *= i;
    i--;
}

System.out.println("5! = " + product);
// Output: 5! = 120
```
</details>

---

### Opgave 4.12: Sum and count
**Opgave:**
Beregn sum OG count af tal mellem 1 og 100 der er delelige med 7.

<details>
<summary>Se svar</summary>

```java
int sum = 0;
int count = 0;
int i = 1;

while (i <= 100) {
    if (i % 7 == 0) {
        sum += i;
        count++;
    }
    i++;
}

System.out.println("Count: " + count);
System.out.println("Sum: " + sum);
// Output: Count: 14, Sum: 735
```
</details>

---

### Opgave 4.13: Average
**Opgave:**
Beregn gennemsnittet af tallene 10, 20, 30, 40, 50 med while loop.

<details>
<summary>Se svar</summary>

```java
int sum = 0;
int count = 0;
int i = 10;

while (i <= 50) {
    sum += i;
    count++;
    i += 10;
}

double average = (double) sum / count;

System.out.println("Sum: " + sum);
System.out.println("Count: " + count);
System.out.println("Average: " + average);
// Output: Sum: 150, Count: 5, Average: 30.0
```
</details>

---

## Del D: Sentinel Values

### Opgave 4.14: Stop at -1
📖 [Se forklaring: Sentinel Value](#sentinel-value)

**Opgave:**
Print tal fra 10 og ned, men stop når du når -1 (brug -1 som sentinel).

<details>
<summary>Se svar</summary>

```java
int number = 10;

while (number != -1) {
    System.out.println(number);
    number--;
    if (number == 5) {
        number = -1;  // Set sentinel
    }
}
// Output: 10 9 8 7 6
```
</details>

---

### Opgave 4.15: Sum until zero
**Opgave:**
Start med 100. Træk 7 fra hver gang. Stop når number <= 0. Print antal steps.

<details>
<summary>Se svar</summary>

```java
int number = 100;
int steps = 0;

while (number > 0) {
    System.out.println(number);
    number -= 7;
    steps++;
}

System.out.println("Steps: " + steps);
// Output: 100 93 86 79 72 65 58 51 44 37 30 23 16 9 2
// Steps: 15
```
</details>

---

### Opgave 4.16: Find square root
**Opgave:**
Find square root of 64 ved at teste tal fra 1 og op. Stop når found.

<details>
<summary>Se svar</summary>

```java
int target = 64;
int number = 1;
boolean found = false;

while (!found) {
    if (number * number == target) {
        found = true;
    } else {
        number++;
    }
}

System.out.println("Square root of " + target + " is " + number);
// Output: Square root of 64 is 8
```
</details>

---

### Opgave 4.17: Halve until small
**Opgave:**
Start med 1000. Halver (divide by 2) indtil number < 10. Tæl steps.

<details>
<summary>Se svar</summary>

```java
int number = 1000;
int steps = 0;

while (number >= 10) {
    System.out.println(number);
    number = number / 2;
    steps++;
}

System.out.println("Final: " + number);
System.out.println("Steps: " + steps);
// Output: 1000 500 250 125 62 31 15
// Final: 7, Steps: 7
```
</details>

---

### Opgave 4.18: Power of 2
**Opgave:**
Find den mindste power of 2 der er større end 1000. (2, 4, 8, 16, ...).

<details>
<summary>Se svar</summary>

```java
int power = 1;
int exponent = 0;

while (power <= 1000) {
    power *= 2;
    exponent++;
}

System.out.println("2^" + exponent + " = " + power);
// Output: 2^10 = 1024
```
</details>

---

## Del E: Countdown and Conditions

### Opgave 4.19: Countdown from 20
**Opgave:**
Tæl ned fra 20 til 1, men skip alle tal delelige med 3.

<details>
<summary>Se svar</summary>

```java
int i = 20;

while (i > 0) {
    if (i % 3 != 0) {
        System.out.println(i);
    }
    i--;
}
// Output: 20 19 17 16 14 13 11 10 8 7 5 4 2 1
```
</details>

---

### Opgave 4.20: Stop on condition
**Opgave:**
Sum tal fra 1 og op. Stop når sum overstiger 100. Print hvor mange tal du summerede.

<details>
<summary>Se svar</summary>

```java
int sum = 0;
int i = 1;
int count = 0;

while (sum <= 100) {
    sum += i;
    count++;
    i++;
}

System.out.println("Sum: " + sum);
System.out.println("Added " + count + " numbers");
// Output: Sum: 105 (1+2+3+...+14=105)
// Added 14 numbers
```
</details>

---

### Opgave 4.21: Double until large
**Opgave:**
Start med 1. Dobl indtil number > 1000. Print number og antal doublings.

<details>
<summary>Se svar</summary>

```java
int number = 1;
int doublings = 0;

while (number <= 1000) {
    number *= 2;
    doublings++;
}

System.out.println("Number: " + number);
System.out.println("Doublings: " + doublings);
// Output: Number: 1024, Doublings: 10
```
</details>

---

### Opgave 4.22: Multiple conditions
**Opgave:**
Increment i fra 0. Stop når ENTEN i > 50 OR i*i > 100.

<details>
<summary>Se svar</summary>

```java
int i = 0;

while (i <= 50 && i * i <= 100) {
    i++;
}

System.out.println("Stopped at i = " + i);
System.out.println("i squared = " + (i * i));
// Output: Stopped at i = 11
// i squared = 121
```
</details>

---

### Opgave 4.23: Fibonacci until limit
**Opgave:**
Generate Fibonacci tal indtil værdi > 100. Print antal tal generated.

<details>
<summary>Se svar</summary>

```java
int a = 0;
int b = 1;
int count = 0;

while (b <= 100) {
    System.out.println(b);
    int next = a + b;
    a = b;
    b = next;
    count++;
}

System.out.println("Generated " + count + " numbers");
// Output: 1 1 2 3 5 8 13 21 34 55 89
// Generated 11 numbers
```
</details>

---


## Refleksionsspørgsmål

Efter du har løst opgaverne, tænk over:
1. Hvad er de tre vigtige komponenter i en while loop?
2. Hvordan undgår du infinite loops?
3. Hvad er forskellen mellem counter og accumulator pattern?
4. Hvad er en sentinel value?
5. Hvornår ville du vælge while over for loop?
6. Hvordan kan du debug en while loop der ikke virker?
7. Hvad sker der hvis du glemmer at opdatere loop variablen?
