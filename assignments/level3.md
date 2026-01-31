## Level 3 Opgaver: Switch-case

- [Del A: basic-switch-statements](#del-a-basic-switch-statements)
- [Del B: switch-with-strings](#del-b-switch-with-strings)
- [Del C: grouping-cases-fall-through](#del-c-grouping-cases-fall-through)
- [Del D: switch-vs-if-else](#del-d-switch-vs-if-else)
- [Del E: complex-switch-logic](#del-e-complex-switch-logic)

---

## Del A: Basic Switch Statements

### Opgave 3.1: Din første switch statement
📖 [Se forklaring: Switch Statement Basics](../concepts/level3.md/#switch-statement-basics)

**Opgave:**
Skriv kode der opretter `day = 3`. Brug et switch statement til at printe day name (1=Monday, 2=Tuesday, 3=Wednesday).

<details>
<summary>Se svar</summary>

```java
int day = 3;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
}
// Output: Wednesday
```
</details>

---

### Opgave 3.2: Complete week
**Opgave:**
Skriv kode der opretter `day = 5`. Udvid switch statement fra opgave 3.1 til at håndtere alle 7 dage (1-7).

<details>
<summary>Se svar</summary>

```java
int day = 5;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
    case 7:
        System.out.println("Sunday");
        break;
}
// Output: Friday
```
</details>

---

### Opgave 3.3: Default case
**Opgave:**
Skriv kode der opretter `day = 10`. Tilføj en default case til switch statement fra opgave 3.2 til at håndtere invalid day numbers.

<details>
<summary>Se svar</summary>

```java
int day = 10;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
    case 7:
        System.out.println("Sunday");
        break;
    default:
        System.out.println("Invalid day");
}
// Output: Invalid day
```
</details>

---

## Del B: Switch with Strings

### Opgave 3.4: String switch
📖 [Se forklaring: Switch med Strings](../concepts/level3.md/#switch-med-strings)

**Opgave:**
Skriv kode der opretter `command = "start"`. Brug et switch statement til at printe beskeder for commands: "start", "stop", "pause". Tilføj en default case for unknown commands.

<details>
<summary>Se svar</summary>

```java
String command = "start";

switch (command) {
    case "start":
        System.out.println("Starting system...");
        break;
    case "stop":
        System.out.println("Stopping system...");
        break;
    case "pause":
        System.out.println("Pausing system...");
        break;
    default:
        System.out.println("Unknown command");
}
// Output: Starting system...
```
</details>

---

### Opgave 3.5: Case sensitivity
**Opgave:**
Skriv kode der opretter `command = "START"` (uppercase). Brug et switch statement med cases for "start", "stop", "pause" og default. Hvad bliver output?

<details>
<summary>Se svar</summary>

```java
String command = "START";

switch (command) {
    case "start":
        System.out.println("Starting...");
        break;
    default:
        System.out.println("Unknown");
}
// Output: Unknown
// Reason: String switch er case-sensitive!
```
</details>

---

### Opgave 3.6: Traffic light
**Opgave:**
Skriv kode der opretter `color = "red"`. Brug et switch statement til at printe action for traffic light colors: "red"→"Stop", "yellow"→"Slow down", "green"→"Go". Tilføj default case.

<details>
<summary>Se svar</summary>

```java
String color = "red";

switch (color) {
    case "red":
        System.out.println("Stop");
        break;
    case "yellow":
        System.out.println("Slow down");
        break;
    case "green":
        System.out.println("Go");
        break;
    default:
        System.out.println("Invalid color");
}
// Output: Stop
```
</details>

---

### Opgave 3.7: Month names
**Opgave:**
Skriv kode der opretter `month = "March"`. Brug et switch statement med grouped cases til at printe season: Dec-Feb→"Winter", Mar-May→"Spring", Jun-Aug→"Summer", Sep-Nov→"Fall".

<details>
<summary>Se svar</summary>

```java
String month = "March";

switch (month) {
    case "December":
    case "January":
    case "February":
        System.out.println("Winter");
        break;
    case "March":
    case "April":
    case "May":
        System.out.println("Spring");
        break;
    case "June":
    case "July":
    case "August":
        System.out.println("Summer");
        break;
    case "September":
    case "October":
    case "November":
        System.out.println("Fall");
        break;
    default:
        System.out.println("Invalid month");
}
// Output: Spring
```
</details>

---

### Opgave 3.8: Calculator operation
**Opgave:**
Skriv kode der opretter `operation = "add"`, `a = 10`, `b = 5`, og int variabel `result` (uden værdi). Brug et switch statement til at beregne result baseret på operation ("add", "subtract", "multiply", "divide"). Print result til sidst.

<details>
<summary>Se svar</summary>

```java
String operation = "add";
int a = 10;
int b = 5;
int result;

switch (operation) {
    case "add":
        result = a + b;
        break;
    case "subtract":
        result = a - b;
        break;
    case "multiply":
        result = a * b;
        break;
    case "divide":
        result = a / b;
        break;
    default:
        result = 0;
        System.out.println("Unknown operation");
}

System.out.println("Result: " + result);
// Output: Result: 15
```
</details>

---

## Del C: Grouping Cases (Fall-Through)

### Opgave 3.9: Weekend check
📖 [Se forklaring: Grouping Cases](../concepts/level3.md/#grouping-cases-intentional-fall-through)

**Opgave:**
Skriv kode der opretter `day = 6`. Brug et switch statement med grouped cases til at printe "Weekend" for day 6 og 7, "Weekday" for day 1-5, og "Invalid day" for andre værdier.

<details>
<summary>Se svar</summary>

```java
int day = 6;

switch (day) {
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
        System.out.println("Weekday");
        break;
    case 6:
    case 7:
        System.out.println("Weekend");
        break;
    default:
        System.out.println("Invalid day");
}
// Output: Weekend
```
</details>

---

### Opgave 3.10: Vowel check
**Opgave:**
Skriv kode der opretter `ch = 'e'`. Brug et switch statement med grouped cases til at printe "Vowel" hvis ch er a, e, i, o, eller u, ellers "Consonant".

<details>
<summary>Se svar</summary>

```java
char ch = 'e';

switch (ch) {
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
        System.out.println("Vowel");
        break;
    default:
        System.out.println("Consonant");
}
// Output: Vowel
```
</details>

---

### Opgave 3.11: Grade categories
**Opgave:**
Skriv kode der opretter `grade = 'B'`. Brug et switch statement med grouped cases til at printe "Good" for A eller B, "Average" for C eller D, "Poor" for F, og "Invalid grade" for andre.

<details>
<summary>Se svar</summary>

```java
char grade = 'B';

switch (grade) {
    case 'A':
    case 'B':
        System.out.println("Good");
        break;
    case 'C':
    case 'D':
        System.out.println("Average");
        break;
    case 'F':
        System.out.println("Poor");
        break;
    default:
        System.out.println("Invalid grade");
}
// Output: Good
```
</details>

---

### Opgave 3.12: Number categories
**Opgave:**
Skriv kode der opretter `num = 5`. Brug et switch statement med grouped cases til at printe "Low" for 1-3, "Medium" for 4-7, "High" for 8-10, og "Out of range" for andre.

<details>
<summary>Se svar</summary>

```java
int num = 5;

switch (num) {
    case 1:
    case 2:
    case 3:
        System.out.println("Low");
        break;
    case 4:
    case 5:
    case 6:
    case 7:
        System.out.println("Medium");
        break;
    case 8:
    case 9:
    case 10:
        System.out.println("High");
        break;
    default:
        System.out.println("Out of range");
}
// Output: Medium
```
</details>

---

### Opgave 3.13: Days in month
**Opgave:**
Skriv kode der opretter `month = 7` og int variabel `days` (uden værdi). Brug et switch statement til at tildele days baseret på month: months 1,3,5,7,8,10,12 har 31 days, months 4,6,9,11 har 30 days, month 2 har 28 days. Print "Days: [days]" til sidst.

<details>
<summary>Se svar</summary>

```java
int month = 7;
int days;

switch (month) {
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
        days = 31;
        break;
    case 4:
    case 6:
    case 9:
    case 11:
        days = 30;
        break;
    case 2:
        days = 28;
        break;
    default:
        days = 0;
        System.out.println("Invalid month");
}

System.out.println("Days: " + days);
// Output: Days: 31
```
</details>

---

## Del D: Switch vs if-else

### Opgave 3.14: When to use switch
**Opgave:**
For hver af disse scenarios, beslut om switch eller if-else er bedst:

1. Check if age > 18
2. Menu choice 1-5
3. Day of week 1-7
4. Check if (age > 18 && hasLicense)

<details>
<summary>Se svar</summary>

**Svar:**

1. Check if age > 18: **if-else** (range check, ikke equality)
2. Menu choice 1-5: **switch** (simple equality checks)
3. Day of week 1-7: **switch** (simple equality checks)
4. Check if (age > 18 && hasLicense): **if-else** (complex condition, multiple variables)

**Regel:** 
- Switch: simple equality checks på én variabel
- if-else: ranges, complex conditions, forskellige variabler
</details>

---

### Opgave 3.15: Rewrite if-else as switch
**Opgave:**
Skriv kode der omskriver denne if-else til et switch statement:

```java
int choice = 2;
if (choice == 1) {
    System.out.println("Option 1");
} else if (choice == 2) {
    System.out.println("Option 2");
} else if (choice == 3) {
    System.out.println("Option 3");
}
```

<details>
<summary>Se svar</summary>

```java
int choice = 2;

switch (choice) {
    case 1:
        System.out.println("Option 1");
        break;
    case 2:
        System.out.println("Option 2");
        break;
    case 3:
        System.out.println("Option 3");
        break;
}
// Output: Option 2
```
</details>

---

### Opgave 3.16: Why NOT switch?
**Opgave:**
Forklar hvorfor du ikke kan bruge switch her:

```java
int age = 25;
if (age >= 18 && age < 65) {
    System.out.println("Working age");
}
```

<details>
<summary>Se svar</summary>

```java
// Kan IKKE laves til switch fordi:
// 1. Vi checker et RANGE (18-64), ikke specifikke værdier
// 2. Vi bruger && (complex condition)
// 3. Switch kan kun check equality (==), ikke >= eller <

// if-else er det rigtige valg her
int age = 25;
if (age >= 18 && age < 65) {
    System.out.println("Working age");
}
```
</details>

---

### Opgave 3.17: Best choice
**Opgave:**
Skriv kode til ticket pricing baseret på age: age 1-12 = 50kr, 13-17 = 75kr, 18-64 = 100kr, 65+ = 60kr. Kan du bruge switch? Hvorfor/hvorfor ikke? Implementer med den bedste løsning.

<details>
<summary>Se svar</summary>

```java
// PROBLEM: Dette er RANGES, ikke specific values
// Switch kan ikke håndtere dette elegantly

// FORKERT måde (ville kræve alle cases 1-100):
// Dette er upraktisk:
// switch (age) {
//     case 1: case 2: case 3: ... case 12:
//         price = 50;
//         break;
//     // Osv...
// }

// KORREKT måde - brug if-else:
int age = 25;
int price;

if (age >= 1 && age <= 12) {
    price = 50;
} else if (age >= 13 && age <= 17) {
    price = 75;
} else if (age >= 18 && age <= 64) {
    price = 100;
} else {
    price = 60;
}

System.out.println("Price: " + price + " kr");
```
</details>

---

## Del E: Complex Switch Logic

### Opgave 3.18: Multi-value calculation
**Opgave:**
Skriv kode der opretter `month = 5` og String variabel `quarter` (uden værdi). Brug et switch statement til at tildele quarter baseret på month number: 1-3 = "Q1", 4-6 = "Q2", 7-9 = "Q3", 10-12 = "Q4". Print "Quarter: [quarter]" til sidst.

<details>
<summary>Se svar</summary>

```java
int month = 5;
String quarter;

switch (month) {
    case 1:
    case 2:
    case 3:
        quarter = "Q1";
        break;
    case 4:
    case 5:
    case 6:
        quarter = "Q2";
        break;
    case 7:
    case 8:
    case 9:
        quarter = "Q3";
        break;
    case 10:
    case 11:
    case 12:
        quarter = "Q4";
        break;
    default:
        quarter = "Invalid";
}

System.out.println("Quarter: " + quarter);
// Output: Quarter: Q2
```
</details>

---

### Opgave 3.19: Grade points
**Opgave:**
Skriv kode der opretter `grade = 'B'` og int variabel `points` (uden værdi). Brug et switch statement til at konvertere letter grade til points: A=12, B=10, C=7, D=4, F=0. Print "Points: [points]" hvis grade er valid.

<details>
<summary>Se svar</summary>

```java
char grade = 'B';
int points;

switch (grade) {
    case 'A':
        points = 12;
        break;
    case 'B':
        points = 10;
        break;
    case 'C':
        points = 7;
        break;
    case 'D':
        points = 4;
        break;
    case 'F':
        points = 0;
        break;
    default:
        points = -1;
        System.out.println("Invalid grade");
}

if (points >= 0) {
    System.out.println("Points: " + points);
}
// Output: Points: 10
```
</details>

---

### Opgave 3.20: Nested logic with switch
**Opgave:**
Skriv kode der opretter `category = "fruit"`, `item = "apple"`, og String variabel `description` (uden værdi). Brug et switch statement på category, og INDEN I hver case brug if-else til at check item. For "fruit": apple→"Red apple", banana→"Yellow banana", andet→"Unknown fruit". For "vegetable": carrot→"Orange carrot", andet→"Unknown vegetable". Print description til sidst.

<details>
<summary>Se svar</summary>

```java
String category = "fruit";
String item = "apple";
String description;

switch (category) {
    case "fruit":
        if (item.equals("apple")) {
            description = "Red apple";
        } else if (item.equals("banana")) {
            description = "Yellow banana";
        } else {
            description = "Unknown fruit";
        }
        break;
    case "vegetable":
        if (item.equals("carrot")) {
            description = "Orange carrot";
        } else {
            description = "Unknown vegetable";
        }
        break;
    default:
        description = "Unknown category";
}

System.out.println(description);
// Output: Red apple
```
</details>

---

### Opgave 3.21: Switch with calculation
**Opgave:**
Skriv kode der opretter `a = 15`, `b = 3`, `operation = "divide"`, double variabel `result` (uden værdi), og boolean variabel `validOperation = true`. Brug et switch statement til at beregne result baseret på operation. For "divide", check først om b != 0. Hvis operation er invalid eller division by zero, sæt validOperation til false. Print result kun hvis validOperation er true.

<details>
<summary>Se svar</summary>

```java
int a = 15;
int b = 3;
String operation = "divide";
double result;
boolean validOperation = true;

switch (operation) {
    case "add":
        result = a + b;
        break;
    case "subtract":
        result = a - b;
        break;
    case "multiply":
        result = a * b;
        break;
    case "divide":
        if (b != 0) {
            result = (double) a / b;
        } else {
            result = 0;
            System.out.println("Error: Division by zero");
            validOperation = false;
        }
        break;
    default:
        result = 0;
        System.out.println("Unknown operation");
        validOperation = false;
}

if (validOperation) {
    System.out.println(a + " " + operation + " " + b + " = " + result);
}
// Output: 15 divide 3 = 5.0
```
</details>

---

### Opgave 3.22: Work schedule
**Opgave:**
Skriv kode der opretter `day = 3` og int variabel `workHours` (uden værdi). Brug et switch statement med grouped cases til at tildele workHours baseret på day: Mon-Thu (1-4) = 8 hours, Fri (5) = 6 hours, Weekend (6-7) = 0 hours. Print "Work hours: [workHours]" til sidst.

<details>
<summary>Se svar</summary>

```java
int day = 3;
int workHours;

switch (day) {
    case 1:
    case 2:
    case 3:
    case 4:
        workHours = 8;
        break;
    case 5:
        workHours = 6;
        break;
    case 6:
    case 7:
        workHours = 0;
        break;
    default:
        workHours = 0;
        System.out.println("Invalid day");
}

System.out.println("Work hours: " + workHours);
// Output: Work hours: 8
```
</details>

---

## Refleksionsspørgsmål

Efter du har løst opgaverne, tænk over:
1. Hvad sker der hvis du glemmer `break` i en case?
2. Hvornår er switch bedre end if-else?
3. Hvornår kan du IKKE bruge switch?
4. Hvorfor er String switch case-sensitive?
5. Hvad er formålet med `default` case?
6. Hvordan grupperer du cases med fall-through?
7. Kan du bruge ranges (som age > 18) i switch? Hvorfor ikke?
