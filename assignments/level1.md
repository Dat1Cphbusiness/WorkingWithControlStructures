## Level 1 Opgaver: Simple if Statements

- [Del A: Simple if-statements – én beslutning](#del-a-simple-if-statements)
- [Del B: if-else – to mulige veje](#del-b-if-else-statements)
- [Del C: if-else-if-else – flere muligheder i kæde](#del-c-if-else-if-else-chains)
- [Del D: String comparison – sammenligning af tekst](#del-d-string-comparison)
- [Del E: Boolean variables – gem beslutninger i variabler](#del-e-boolean-variables)

---

## Del A: Simple if-statements

### Opgave 1.1: Din første if statement

**Opgave:**
Skriv kode der opretter variabel `age = 20`. Brug et if-statement til at printe "Du er myndig" hvis age >= 18.

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
Skriv kode der opretter variabel `temperature = 30`. Brug et if-statement til at printe "Det er varmt" hvis temperature > 25.

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
Skriv kode der opretter variabel `score = 85`. Brug et if-statement til at printe "Bestået" hvis score >= 60.

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
Skriv kode der opretter variabel `score = 55`. Brug et if-else statement til at printe "PASS" hvis score >= 60, ellers "FAIL".

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
Skriv kode der opretter variabel `age = 16`. Brug et if-else statement til at printe "Adult" hvis age >= 18, ellers "Minor".

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
Skriv kode der opretter variabel `number = -5`. Brug et if-else statement til at printe "Positive" hvis number > 0, ellers "Not positive".

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
Skriv kode der opretter variabel `number = 7`. Brug et if-else statement til at printe "Even" hvis number % 2 == 0, ellers "Odd".

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
Skriv kode der opretter variabel `price = 600.0`. Brug et if-else statement til at printe "Discount available" hvis price > 500, ellers "No discount".

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
Skriv kode der opretter variabel `stock = 0`. Brug et if-else statement til at printe "Available" hvis stock > 0, ellers "Out of stock".

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
Skriv kode der opretter variabel `speed = 135`. Brug et if-else statement til at printe "Speeding!" hvis speed > 130, ellers "Within limit".

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
Skriv kode der opretter variabel `score = 85`. Brug et if-else-if-else statement til at printe letter grade baseret på score:
- A hvis score >= 90
- B hvis score >= 80
- C hvis score >= 70
- D hvis score >= 60
- F hvis score < 60

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
Skriv kode der tester letter grade systemet fra opgave 1.11 med tre forskellige scores: 95, 72, og 58. Print grade for hver score.

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
Skriv kode der checker en persons alder og printer en kategori. Opret variabel `age = 10` og brug et if-else-if-else statement til at printe:
- "Child" hvis age < 13
- "Teen" hvis age < 18
- "Adult" hvis age < 65
- "Senior" hvis age >= 65

Test din kode derefter med age = 15, 30, og 70.

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

---

### Opgave 1.14: Temperature ranges
**Opgave:**
Skriv kode der opretter variabel `temp = 22`. Brug et if-else-if-else statement til at printe:
- "Freezing" hvis temp < 0
- "Cold" hvis temp < 15
- "Comfortable" hvis temp < 25
- "Hot" hvis temp >= 25

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
Skriv kode der bestemmer billetpris baseret på alder. Opret variabel `age = 25` og `price` (uden værdi). Brug et if-else-if-else statement til at tildele price baseret på:
- Child (age < 12): 50 kr
- Teen (age < 18): 75 kr
- Adult (age < 65): 100 kr
- Senior (age >= 65): 60 kr

Print "Price: [price] kr" til sidst.

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
Skriv kode der opretter variabel `score = 88` og String variabel `grade` (uden værdi). Brug et if-else-if-else statement til at tildele grade baseret på score (samme regler som opgave 1.11). Print "Grade: [grade]" til sidst.

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
Skriv kode der opretter variabel `password = "secret123"`. Brug et if-else statement med `.equals()` til at printe "Access granted" hvis password er "secret123", ellers "Access denied".

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
Skriv kode der opretter to String variabler: `word1 = "Hello"` og `word2 = "hello"`. Brug et if-else statement med `.equals()` til at printe "Match" hvis de er ens, ellers "No match".

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
Skriv kode der tester tre forskellige password attempts mod korrekt password "secret123". Opret variabel `correctPassword = "secret123"` og test disse tre attempts: "wrong", "Secret123", "secret123". Print "Correct" eller "Wrong" for hver.

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
Skriv kode der opretter variabel `day = "Monday"`. Brug et if-else statement til at printe "Weekend" hvis day er "Saturday" eller "Sunday", ellers "Weekday".

Hint: Brug `||` (OR operator) til at checke for begge weekend dage.

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
Skriv kode der opretter variabel `command = "start"`. Brug et if-else-if-else statement til at printe forskellig besked for hver command:
- "start" → "Starting..."
- "stop" → "Stopping..."
- "pause" → "Pausing..."
- andet → "Unknown command"

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
Skriv kode der opretter variabel `isActive = true`. Brug et if-else statement til at printe "System ON" hvis isActive er true, ellers "System OFF".

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
Skriv kode der opretter to variabler: `hasLicense = true` og `age = 20`. Brug et if-else statement til at printe "Can drive" hvis BEGGE betingelser er opfyldt (age >= 18 AND hasLicense), ellers "Cannot drive".

Hint: Brug `&&` (AND operator).

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
Skriv kode der opretter variabel `score = 75` og boolean variabel `passed` (uden værdi). Brug et if-else statement til at sætte passed til true hvis score >= 60, ellers false. Print "Passed: [passed]" til sidst.

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
