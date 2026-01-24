## Level 3 Opgaver: Switch-case


- [Del A: basic-switch-statements](#del-a-basic-switch-statements)
- [Del B: switch-with-strings](#del-b-switch-with-strings)
- [Del C: grouping-cases-fall-through](#del-c-grouping-cases-fall-through)
- [Del D: switch-vs-if-else](#del-d-switch-vs-if-else)
- [Del E: complex-switch-logic](#del-e-complex-switch-logic)

---

## Del A: Basic Switch Statements

### Opgave 3.1: Din første switch statement
📖 [Se forklaring: Switch Statement Basics](#switch-statement-basics)

**Opgave:**
Opret `day` = 3. Brug switch til at print day name (1=Monday, 2=Tuesday, 3=Wednesday).

| day | Output |
|-----|--------|
| 3 | <input type="text" size="20"> |

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
Udvid switch til at håndtere alle 7 dage. Test med day = 5.

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
Tilføj `default` case til at håndtere invalid day numbers. Test med day = 10.

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
📖 [Se forklaring: Switch med Strings](#switch-med-strings)

**Opgave:**
Opret `command` = "start". Print besked for: "start", "stop", "pause".

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
Test om "START" matcher "start" i switch. Hvad sker der?

| command | Matches "start"? |
|---------|------------------|
| "START" | <input type="text" size="10"> |

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
Opret `color` = "red". Print action: "red"→Stop, "yellow"→Slow, "green"→Go.

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
Opret `month` = "March". Print season: Dec-Feb→Winter, Mar-May→Spring, Jun-Aug→Summer, Sep-Nov→Fall.

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
Opret `operation` = "add", `a` = 10, `b` = 5. Beregn baseret på operation.

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
📖 [Se forklaring: Grouping Cases](#grouping-cases-intentional-fall-through)

**Opgave:**
Brug grouped cases til at check weekend. Day 6 og 7 = "Weekend", 1-5 = "Weekday".

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
Check om char er vowel. Group a,e,i,o,u sammen. Test med ch = 'e'.

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
Group grades: A,B = "Good", C,D = "Average", F = "Poor". Test med grade = 'B'.

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
Group numbers: 1-3 = "Low", 4-7 = "Medium", 8-10 = "High". Test med num = 5.

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
Group months by days: months 1,3,5,7,8,10,12 have 31 days. Test med month = 7.

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
Hvilken ville du bruge switch til, hvilken if-else? Marker hver.

| Scenario | switch | if-else |
|----------|--------|---------|
| Check if age > 18 | <input type="checkbox"> | <input type="checkbox"> |
| Menu choice 1-5 | <input type="checkbox"> | <input type="checkbox"> |
| Day of week 1-7 | <input type="checkbox"> | <input type="checkbox"> |
| Check if (age > 18 && hasLicense) | <input type="checkbox"> | <input type="checkbox"> |

<details>
<summary>Se svar</summary>

| Scenario | switch | if-else |
|----------|--------|---------|
| Check if age > 18 | ❌ | ✅ |
| Menu choice 1-5 | ✅ | ❌ |
| Day of week 1-7 | ✅ | ❌ |
| Check if (age > 18 && hasLicense) | ❌ | ✅ |

**Regel:** 
- Switch: simple equality checks på én variabel
- if-else: ranges, complex conditions, forskellige variabler
</details>

---

### Opgave 3.15: Rewrite if-else as switch
**Opgave:**
Omskriv denne if-else til switch:

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
Implementer "ticket pricing" med switch: age 1-12 = 50kr, 13-17 = 75kr, 18-64 = 100kr, 65+ = 60kr.

Kan du? Hvorfor/hvorfor ikke?

<details>
<summary>Se svar</summary>

```java
// PROBLEM: Dette er RANGES, ikke specific values
// Switch kan ikke håndtere dette elegantly

// FORKERT måde (ville kræve alle cases 1-100):
int age = 25;
int price;

// Dette er upraktisk:
switch (age) {
    case 1: case 2: case 3: ... case 12:
        price = 50;
        break;
    // Osv...
}

// KORREKT måde - brug if-else:
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
Baseret på month number, beregn quarter (Q1, Q2, Q3, Q4). Test med month = 5.

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
Convert letter grade til points: A=12, B=10, C=7, D=4, F=0. Test med grade = 'B'.

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
Brug switch til at find category, derefter if-else til at check subcategory.
category = "fruit", item = "apple".

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
Calculator med to numbers (a=15, b=3) og operation. Beregn result og print.

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
Baseret på day (1-7), print work hours: Mon-Thu = 8h, Fri = 6h, Weekend = 0h.

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
