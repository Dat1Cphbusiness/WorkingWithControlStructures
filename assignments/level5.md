# Level 5 Opgaver: for loops

- [Del A: Grundlæggende for-loops](#del-a-basic-for-loops)
- [Del B: Tælle-mønstre](#del-b-counting-patterns)
- [Del C: Akkumulering med for](#del-c-accumulation-with-for)
- [Del D: Nested for-loops](#del-d-nested-for-loops)
- [Del E: For vs while – hvornår bruger man hvad](#del-e-for-vs-while)

---

## Del A: Basic For Loops

### Opgave 5.1: Dit første for loop
📖 [Se forklaring: For Loop Basics](../concepts/level5.md/#for-loop-basics)

**Opgave:**
Skriv kode der bruger et for loop til at printe tallene 0 til 9.

<details>
<summary>Se svar</summary>

```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
// Output: 0 1 2 3 4 5 6 7 8 9
```
</details>

---

### Opgave 5.2: Count 1 to 10
**Opgave:**
Skriv kode der bruger et for loop til at printe tallene 1 til 10 (inklusiv).

<details>
<summary>Se svar</summary>

```java
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
// Output: 1 2 3 4 5 6 7 8 9 10
```
</details>

---

### Opgave 5.3: Custom range
**Opgave:**
Skriv kode der bruger et for loop til at printe tallene 5 til 15 (inklusiv).

<details>
<summary>Se svar</summary>

```java
for (int i = 5; i <= 15; i++) {
    System.out.println(i);
}
// Output: 5 6 7 8 9 10 11 12 13 14 15
```
</details>

---

## Del B: Counting Patterns

### Opgave 5.4: Count down
📖 [Se forklaring: Counting Down](../concepts/level5.md/#counting-down)

**Opgave:**
Skriv kode der bruger et for loop til at printe tallene 10 ned til 1.

<details>
<summary>Se svar</summary>

```java
for (int i = 10; i >= 1; i--) {
    System.out.println(i);
}
// Output: 10 9 8 7 6 5 4 3 2 1
```
</details>

---

### Opgave 5.5: Even numbers
**Opgave:**
Skriv kode der bruger et for loop til at printe alle lige tal fra 0 til 20.

<details>
<summary>Se svar</summary>

```java
for (int i = 0; i <= 20; i += 2) {
    System.out.println(i);
}
// Output: 0 2 4 6 8 10 12 14 16 18 20
```
</details>

---

### Opgave 5.6: Multiples of 5
**Opgave:**
Skriv kode der bruger et for loop til at printe alle tal fra 0 til 100 der er delelige med 5.

<details>
<summary>Se svar</summary>

```java
for (int i = 0; i <= 100; i += 5) {
    System.out.println(i);
}
// Output: 0 5 10 15 20 ... 95 100
```
</details>

---

### Opgave 5.7: Odd numbers backward
**Opgave:**
Skriv kode der bruger et for loop til at printe ulige tal fra 19 ned til 1.

<details>
<summary>Se svar</summary>

```java
for (int i = 19; i >= 1; i -= 2) {
    System.out.println(i);
}
// Output: 19 17 15 13 11 9 7 5 3 1
```
</details>

---

### Opgave 5.8: Powers of 2
**Opgave:**
Skriv kode der printer de første 10 powers of 2 (2^0 til 2^9). Opret variabel `power = 1` før loopet og brug et for loop med `i` fra 0 til 9.

<details>
<summary>Se svar</summary>

```java
int power = 1;
for (int i = 0; i < 10; i++) {
    System.out.println("2^" + i + " = " + power);
    power *= 2;
}
// Output: 2^0=1, 2^1=2, 2^2=4, ..., 2^9=512
```
</details>

---

## Del C: Accumulation with For

### Opgave 5.9: Sum 1 to 100
📖 [Se forklaring: Accumulation with For](../concepts/level5.md/#accumulation-with-for)

**Opgave:**
Skriv kode der beregner summen af alle tal fra 1 til 100. Opret `sum = 0` og brug et for loop.

<details>
<summary>Se svar</summary>

```java
int sum = 0;
for (int i = 1; i <= 100; i++) {
    sum += i;
}
System.out.println("Sum: " + sum);
// Output: Sum: 5050
```
</details>

---

### Opgave 5.10: Factorial
**Opgave:**
Skriv kode der beregner 10! (10 factorial = 10 × 9 × 8 × ... × 1). Opret `factorial = 1` og brug et for loop.

<details>
<summary>Se svar</summary>

```java
int factorial = 1;
for (int i = 1; i <= 10; i++) {
    factorial *= i;
}
System.out.println("10! = " + factorial);
// Output: 10! = 3628800
```
</details>

---

### Opgave 5.11: Sum even numbers
**Opgave:**
Skriv kode der summer alle lige tal fra 1 til 50. Opret `sum = 0` og brug et for loop.

<details>
<summary>Se svar</summary>

```java
int sum = 0;
for (int i = 2; i <= 50; i += 2) {
    sum += i;
}
System.out.println("Sum of even numbers: " + sum);
// Output: Sum of even numbers: 650
```
</details>

---

### Opgave 5.12: Count multiples
**Opgave:**
Skriv kode der tæller hvor mange tal mellem 1 og 100 der er delelige med 7. Opret `count = 0` og brug et for loop med if-statement.

<details>
<summary>Se svar</summary>

```java
int count = 0;
for (int i = 1; i <= 100; i++) {
    if (i % 7 == 0) {
        count++;
    }
}
System.out.println("Multiples of 7: " + count);
// Output: Multiples of 7: 14
```
</details>

---

### Opgave 5.13: Average
**Opgave:**
Skriv kode der beregner gennemsnittet af tallene 1 til 20. Opret `sum = 0` og `count = 0`, brug et for loop, og beregn average efter loopet.

<details>
<summary>Se svar</summary>

```java
int sum = 0;
int count = 0;

for (int i = 1; i <= 20; i++) {
    sum += i;
    count++;
}

double average = (double) sum / count;
System.out.println("Average: " + average);
// Output: Average: 10.5
```
</details>

---

## Del D: Nested For Loops

### Opgave 5.14: Multiplication table
📖 [Se forklaring: Nested For Loops](../concepts/level5.md/#nested-for-loops)

**Opgave:**
Skriv kode der printer gangetabellen for 5 (5×1 til 5×10). Opret variabel `n = 5` og brug et for loop.

<details>
<summary>Se svar</summary>

```java
int n = 5;
for (int i = 1; i <= 10; i++) {
    System.out.println(n + " × " + i + " = " + (n * i));
}
// Output: 5×1=5, 5×2=10, ..., 5×10=50
```
</details>

---

### Opgave 5.15: Simple nested loop
**Opgave:**
Skriv kode der printer (i,j) for i fra 1-3 og j fra 1-3. Brug nested for loops.

<details>
<summary>Se svar</summary>

```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.print("(" + i + "," + j + ") ");
    }
    System.out.println();
}
// Output:
// (1,1) (1,2) (1,3)
// (2,1) (2,2) (2,3)
// (3,1) (3,2) (3,3)
```
</details>

---

### Opgave 5.16: Number rectangle
**Opgave:**
Skriv kode der printer 4 rows med tallene 1-5 i hver row. Brug nested for loops.

<details>
<summary>Se svar</summary>

```java
for (int row = 1; row <= 4; row++) {
    for (int col = 1; col <= 5; col++) {
        System.out.print(col + " ");
    }
    System.out.println();
}
// Output:
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5
```
</details>

---

### Opgave 5.17: Star rectangle
**Opgave:**
Skriv kode der printer et 5×7 rektangel af stjerner (*). Brug nested for loops.

<details>
<summary>Se svar</summary>

```java
for (int row = 1; row <= 5; row++) {
    for (int col = 1; col <= 7; col++) {
        System.out.print("* ");
    }
    System.out.println();
}
// Output: 5 rows × 7 columns af stjerner
```
</details>

---

### Opgave 5.18: Right triangle
**Opgave:**
Skriv kode der printer en højre-vinklet trekant af stjerner (5 rows). Brug nested for loops.

Output:
```
*
**
***
****
*****
```

<details>
<summary>Se svar</summary>

```java
for (int row = 1; row <= 5; row++) {
    for (int col = 1; col <= row; col++) {
        System.out.print("*");
    }
    System.out.println();
}
```
</details>

---

### Opgave 5.19: Number triangle
**Opgave:**
Skriv kode der printer en trekant af tal. Brug nested for loops.

Output:
```
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

<details>
<summary>Se svar</summary>

```java
for (int row = 1; row <= 5; row++) {
    for (int col = 1; col <= row; col++) {
        System.out.print(col + " ");
    }
    System.out.println();
}
```
</details>

---

### Opgave 5.20: Inverted triangle
**Opgave:**
Skriv kode der printer en omvendt trekant. Brug nested for loops.

Output:
```
*****
****
***
**
*
```

<details>
<summary>Se svar</summary>

```java
for (int row = 5; row >= 1; row--) {
    for (int col = 1; col <= row; col++) {
        System.out.print("*");
    }
    System.out.println();
}
```
</details>

---

## Del E: For vs While

### Opgave 5.21: When to use for
**Opgave:**
Skriv kode der printer tal 1-10 med BÅDE for og while loop. Hvilket er mere passende?

<details>
<summary>Se svar</summary>

```java
// For loop (bedre her!)
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}

// While loop (fungerer, men for er mere naturligt)
int i = 1;
while (i <= 10) {
    System.out.println(i);
    i++;
}

// For er bedre fordi vi VED vi skal have 10 iterationer
```
</details>

---

### Opgave 5.22: Convert while to for
**Opgave:**
Omskriv denne while loop til et for loop:

```java
int i = 0;
while (i < 20) {
    System.out.println(i);
    i += 2;
}
```

<details>
<summary>Se svar</summary>

```java
for (int i = 0; i < 20; i += 2) {
    System.out.println(i);
}
// Meget mere compact og læsbar!
```
</details>

---

### Opgave 5.23: Sum comparison
**Opgave:**
Skriv kode der beregner sum 1-50 med BÅDE for og while loop. Sammenlign koden.

<details>
<summary>Se svar</summary>

```java
// For loop (compact)
int sum1 = 0;
for (int i = 1; i <= 50; i++) {
    sum1 += i;
}

// While loop (mere verbose)
int sum2 = 0;
int i = 1;
while (i <= 50) {
    sum2 += i;
    i++;
}

System.out.println("Sum (for): " + sum1);
System.out.println("Sum (while): " + sum2);

// For er bedre når vi kender antal iterationer
```
</details>

---

## Refleksionsspørgsmål

Efter du har løst opgaverne, tænk over:
1. Hvad er de tre dele af en for loop?
2. Hvad er forskellen mellem `i < n` og `i <= n`?
3. Hvordan tæller du ned i stedet for op?
4. Hvornår er for loop bedre end while loop?
5. Hvordan laver du custom step sizes (count by 5, by 10)?
6. Hvad betyder outer loop og inner loop i nested loops?
7. Hvordan ved du hvilket loop type du skal bruge?
