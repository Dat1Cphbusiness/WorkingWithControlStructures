## Level 1 Opgaver: Simple if Statements

- [Del A: Simple if-statements – én beslutning](#del-a-simple-if-statements)
- [Del B: if-else – to mulige veje](#del-b-if-else-statements)
- [Del C: if-else-if-else – flere muligheder i kæde](#del-c-if-else-if-else-chains)
- [Del D: String comparison – sammenligning af tekst](#del-d-string-comparison)
- [Del E: Boolean variables – gem beslutninger i variabler](#del-e-boolean-variables)




### Opgave 1.1: Din første if statement


**Opgave:**
Opret en variabel `age` med værdi 20. Hvis age er >= 18, print "Du er myndig".

| <!-- --> | <!-- --> |
|----------|----------|
| Din kode | <input type="text" size="50"> |

<details>
<summary>Se svar</summary>

```java
int age = 20;
if (age >= 18) {
    System.out.println("Du er myndig");
}
```
</details>

---

### Opgave 1.2: Temperature check
**Opgave:**
Opret en variabel `temperature` med værdi 30. Hvis temperature > 25, print "Det er varmt".

| <!-- --> | <!-- --> |
|----------|----------|
| Din kode | <input type="text" size="50"> |

<details>
<summary>Se svar</summary>

```java
int temperature = 30;
if (temperature > 25) {
    System.out.println("Det er varmt");
}
```
</details>

---

### Opgave 1.3: Score check
**Opgave:**
Opret en variabel `score` med værdi 85. Hvis score >= 60, print "Bestået".

| <!-- --> | <!-- --> |
|----------|----------|
| Din kode | <input type="text" size="50"> |

<details>
<summary>Se svar</summary>

```java
int score = 85;
if (score >= 60) {
    System.out.println("Bestået");
}
```
</details>

---

## Del B: if-else Statements

### Opgave 1.4: Pass or fail

**Opgave:**
Opret variabel `score` = 55. Print "PASS" hvis >= 60, ellers "FAIL".

| Score | Output |
|-------|--------|
| 55 | <input type="text" size="20"> |

<details>
<summary>Se svar</summary>

```java
int score = 55;
if (score >= 60) {
    System.out.println("PASS");
} else {
    System.out.println("FAIL");
}
// Output: FAIL
```
</details>

---

### Opgave 1.5: Adult or minor
**Opgave:**
Opret variabel `age` = 16. Print "Adult" hvis >= 18, ellers "Minor".

<details>
<summary>Se svar</summary>

```java
int age = 16;
if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
// Output: Minor
```
</details>

---

### Opgave 1.6: Positive or negative
**Opgave:**
Opret variabel `number` = -5. Print "Positive" hvis > 0, ellers "Not positive".

<details>
<summary>Se svar</summary>

```java
int number = -5;
if (number > 0) {
    System.out.println("Positive");
} else {
    System.out.println("Not positive");
}
// Output: Not positive
```
</details>

---

### Opgave 1.7: Even or odd
**Opgave:**
Opret variabel `number` = 7. Print "Even" hvis (number % 2 == 0), ellers "Odd".

<details>
<summary>Se svar</summary>

```java
int number = 7;
if (number % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
// Output: Odd
```
</details>

---

### Opgave 1.8: Price discount
**Opgave:**
Opret `price` = 600.0. Hvis price > 500, print "Discount available", ellers "No discount".

<details>
<summary>Se svar</summary>

```java
double price = 600.0;
if (price > 500) {
    System.out.println("Discount available");
} else {
    System.out.println("No discount");
}
// Output: Discount available
```
</details>

---

### Opgave 1.9: Stock availability
**Opgave:**
Opret `stock` = 0. Hvis stock > 0, print "Available", ellers "Out of stock".

<details>
<summary>Se svar</summary>

```java
int stock = 0;
if (stock > 0) {
    System.out.println("Available");
} else {
    System.out.println("Out of stock");
}
// Output: Out of stock
```
</details>

---

### Opgave 1.10: Speed limit
**Opgave:**
Opret `speed` = 135. Hvis speed > 130, print "Speeding!", ellers "Within limit".

<details>
<summary>Se svar</summary>

```java
int speed = 135;
if (speed > 130) {
    System.out.println("Speeding!");
} else {
    System.out.println("Within limit");
}
// Output: Speeding!
```
</details>

---

## Del C: if-else if-else Chains

### Opgave 1.11: Letter grades

**Opgave:**
Opret `score` = 85. Print letter grade: A(>=90), B(>=80), C(>=70), D(>=60), F(<60).

| Score | Grade |
|-------|-------|
| 85 | <input type="text" size="10"> |

<details>
<summary>Se svar</summary>

```java
int score = 85;
if (score >= 90) {
    System.out.println("A");
} else if (score >= 80) {
    System.out.println("B");
} else if (score >= 70) {
    System.out.println("C");
} else if (score >= 60) {
    System.out.println("D");
} else {
    System.out.println("F");
}
// Output: B
```
</details>

---

### Opgave 1.12: Flere karakterer
**Opgave:**
Test letter grade systemet med scores: 95, 72, 58. Print grade for hver.

<details>
<summary>Se svar</summary>

```java
// Score 95
int score1 = 95;
if (score1 >= 90) {
    System.out.println("A");
} else if (score1 >= 80) {
    System.out.println("B");
} else if (score1 >= 70) {
    System.out.println("C");
} else if (score1 >= 60) {
    System.out.println("D");
} else {
    System.out.println("F");
}

// Score 72
int score2 = 72;
if (score2 >= 90) {
    System.out.println("A");
} else if (score2 >= 80) {
    System.out.println("B");
} else if (score2 >= 70) {
    System.out.println("C");
} else if (score2 >= 60) {
    System.out.println("D");
} else {
    System.out.println("F");
}

// Score 58
int score3 = 58;
if (score3 >= 90) {
    System.out.println("A");
} else if (score3 >= 80) {
    System.out.println("B");
} else if (score3 >= 70) {
    System.out.println("C");
} else if (score3 >= 60) {
    System.out.println("D");
} else {
    System.out.println("F");
}

// Output: A, C, F
```
</details>

---

### Opgave 1.13: Age categories

**Opgave:**
Skriv kode der checker en persons alder og printer en kategori.

Brug følgende kategorier:
- Under 13: "Child"
- 13-17: "Teen"
- 18-64: "Adult"
- 65 og over: "Senior"

Test din kode med age = 10, 15, 30, og 70.

<details>
<summary>Se svar</summary>

```java
int age = 10;

if (age < 13) {
System.out.println("Child");
} else if (age < 18) {
System.out.println("Teen");
} else if (age < 65) {
System.out.println("Adult");
} else {
System.out.println("Senior");
}

// Test med forskellige værdier:
// age = 10 → Child
// age = 15 → Teen
// age = 30 → Adult
// age = 70 → Senior
```
</details>

______

### Opgave 1.14: Temperature ranges
**Opgave:**
Opret `temp` = 22. Print: "Freezing"(<0), "Cold"(<15), "Comfortable"(<25), "Hot"(>=25).

<details>
<summary>Se svar</summary>

```java
int temp = 22;
if (temp < 0) {
    System.out.println("Freezing");
} else if (temp < 15) {
    System.out.println("Cold");
} else if (temp < 25) {
    System.out.println("Comfortable");
} else {
    System.out.println("Hot");
}
// Output: Comfortable
```
</details>

---

### Opgave 1.15: Ticket pricing
**Opgave:**
Baseret på alder, find billetpris. Opret forskellige aldersvariabler og test.

Regler:
- Child (< 12): 50 kr
- Teen (< 18): 75 kr
- Adult (< 65): 100 kr
- Senior (>= 65): 60 kr

<details>
<summary>Se svar</summary>

```java
int age = 25;
int price;

if (age < 12) {
    price = 50;
} else if (age < 18) {
    price = 75;
} else if (age < 65) {
    price = 100;
} else {
    price = 60;
}

System.out.println("Price: " + price + " kr");
// For age=25: Output: Price: 100 kr
```
</details>

---

### Opgave 1.16: Grade ranges
**Opgave:**
Score systemet fra før, men nu gem resultatet i en String variabel først.

<details>
<summary>Se svar</summary>

```java
int score = 88;
String grade;

if (score >= 90) {
    grade = "A";
} else if (score >= 80) {
    grade = "B";
} else if (score >= 70) {
    grade = "C";
} else if (score >= 60) {
    grade = "D";
} else {
    grade = "F";
}

System.out.println("Grade: " + grade);
// Output: Grade: B
```
</details>

---

## Del D: String Comparison

### Opgave 1.17: Password check

**Opgave:**
Opret `password` = "secret123". Check om det er "secret123".


<details>
<summary>Se svar</summary>

```java
String password = "secret123";

if (password.equals("secret123")) {
    System.out.println("Access granted");
} else {
    System.out.println("Access denied");
}
// Output: Access granted
```
</details>

---

### Opgave 1.18: Case sensitivity
**Opgave:**
Test om "Hello" equals "hello" (case sensitive).

| Comparison | Result |
|------------|--------|
| "Hello" equals "hello" | <input type="text" size="10"> |

<details>
<summary>Se svar</summary>

```java
String word1 = "Hello";
String word2 = "hello";

if (word1.equals(word2)) {
    System.out.println("Match");
} else {
    System.out.println("No match");
}
// Output: No match (case matters!)
```
</details>

---

### Opgave 1.19: Multiple password attempts
**Opgave:**
Test tre forskellige passwords: "wrong", "Secret123", "secret123" mod correct = "secret123".

<details>
<summary>Se svar</summary>

```java
String correctPassword = "secret123";

String attempt1 = "wrong";
if (attempt1.equals(correctPassword)) {
    System.out.println("Correct");
} else {
    System.out.println("Wrong");
}

String attempt2 = "Secret123";
if (attempt2.equals(correctPassword)) {
    System.out.println("Correct");
} else {
    System.out.println("Wrong");
}

String attempt3 = "secret123";
if (attempt3.equals(correctPassword)) {
    System.out.println("Correct");
} else {
    System.out.println("Wrong");
}

// Output: Wrong, Wrong, Correct
```
</details>

---

### Opgave 1.20: Day of week
**Opgave:**
Opret `day` = "Monday". Hvis det er "Saturday" eller "Sunday", print "Weekend", ellers "Weekday".

<details>
<summary>Se svar</summary>

```java
String day = "Monday";

if (day.equals("Saturday") || day.equals("Sunday")) {
    System.out.println("Weekend");
} else {
    System.out.println("Weekday");
}
// Output: Weekday
```

Note: Vi bruger || (OR) som vi lærer i næste level!
</details>

---

### Opgave 1.21: Command processor
**Opgave:**
Opret `command` = "start". Print forskellig besked for: "start", "stop", "pause", andet.

<details>
<summary>Se svar</summary>

```java
String command = "start";

if (command.equals("start")) {
    System.out.println("Starting...");
} else if (command.equals("stop")) {
    System.out.println("Stopping...");
} else if (command.equals("pause")) {
    System.out.println("Pausing...");
} else {
    System.out.println("Unknown command");
}
// Output: Starting...
```
</details>

---

## Del E: Boolean Variables

### Opgave 1.22: Boolean flag
**Opgave:**
Opret `isActive` = true. Hvis isActive, print "System ON", ellers "System OFF".

<details>
<summary>Se svar</summary>

```java
boolean isActive = true;

if (isActive) {
    System.out.println("System ON");
} else {
    System.out.println("System OFF");
}
// Output: System ON
```
</details>

---

### Opgave 1.23: Combining conditions
**Opgave:**
Opret `hasLicense` = true og `age` = 20. Print "Can drive" hvis begge er true (age >= 18 AND hasLicense).

<details>
<summary>Se svar</summary>

```java
boolean hasLicense = true;
int age = 20;

if (age >= 18 && hasLicense) {
    System.out.println("Can drive");
} else {
    System.out.println("Cannot drive");
}
// Output: Can drive
```

Note: Vi bruger && (AND) som vi lærer mere om i næste level!
</details>

---

### Opgave 1.24: Setting boolean based on condition
**Opgave:**
Opret `score` = 75. Sæt en boolean `passed` baseret på om score >= 60.

<details>
<summary>Se svar</summary>

```java
int score = 75;
boolean passed;

if (score >= 60) {
    passed = true;
} else {
    passed = false;
}

System.out.println("Passed: " + passed);
// Output: Passed: true
```
</details>

---
## Refleksionsspørgsmål

Efter du har løst opgaverne, tænk over:
1. Hvad er forskellen mellem if, if-else, og if-else if-else?
2. Hvorfor bruger vi `>=` i stedet for `>` i nogle conditions?
3. Hvornår ville du vælge if-else if-else over flere separate if statements?
4. Hvorfor bruger vi `.equals()` for Strings men `==` for ints?
5. Hvad sker der hvis du glemmer `else` i en if-else if chain?
6. Hvordan kan du teste om din condition virker korrekt?

