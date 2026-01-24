## Level 2 Opgaver: Boolske Operatorer (&&)

- [Del A: AND-operator – begge betingelser skal være sande](#del-a-and-operator-)
- [Del B: OR-operator – mindst én betingelse skal være sand](#del-b-or-operator-)
- [Del C: NOT-operator – invertering af boolean](#del-c-not-operator-)
- [Del D: Kombinering af operatorer](#del-d-combining-operators)
- [Del E: Komplekse betingelser med parenteser](#del-e-complex-conditions)
---
## Del A: AND Operator (&&)
### Opgave 2.1: Simple AND
📖 [Se forklaring: AND Operator](#and-operator-)

**Opgave:**
Opret `age` = 25 og `hasLicense` = true. Kun hvis BEGGE er true (age >= 18 AND hasLicense), print "Can drive".

| <!-- --> | <!-- --> |
|----------|----------|
| Din kode | <input type="text" size="60"> |

<details>
<summary>Se svar</summary>

```java
int age = 25;
boolean hasLicense = true;

if (age >= 18 && hasLicense) {
    System.out.println("Can drive");
}
// Output: Can drive
```
</details>

---

### Opgave 2.2: AND with false condition
**Opgave:**
Test med `age` = 25 og `hasLicense` = false. Hvad bliver output?

| age >= 18 | hasLicense | Result |
|-----------|------------|--------|
| true | false | <input type="text" size="20"> |

<details>
<summary>Se svar</summary>

```java
int age = 25;
boolean hasLicense = false;

if (age >= 18 && hasLicense) {
    System.out.println("Can drive");
} else {
    System.out.println("Cannot drive");
}
// Output: Cannot drive (fordi hasLicense er false)
```
</details>

---

### Opgave 2.3: Multiple AND conditions
**Opgave:**
Check om et tal er mellem 10 og 20 (inclusive). Opret `number` = 15.

<details>
<summary>Se svar</summary>

```java
int number = 15;

if (number >= 10 && number <= 20) {
    System.out.println("Number is between 10 and 20");
}
// Output: Number is between 10 and 20
```
</details>

---

### Opgave 2.4: Three conditions with AND
**Opgave:**
Opret `age` = 22, `hasTicket` = true, `isBanned` = false.
Print "Welcome" kun hvis age >= 18 AND hasTicket AND NOT isBanned.

<details>
<summary>Se svar</summary>

```java
int age = 22;
boolean hasTicket = true;
boolean isBanned = false;

if (age >= 18 && hasTicket && !isBanned) {
    System.out.println("Welcome");
}
// Output: Welcome
```
</details>

---

### Opgave 2.5: Working hours check
**Opgave:**
Opret `hour` = 14. Check om det er working hours (9-17). Brug AND.

<details>
<summary>Se svar</summary>

```java
int hour = 14;

if (hour >= 9 && hour <= 17) {
    System.out.println("Working hours");
} else {
    System.out.println("Outside working hours");
}
// Output: Working hours
```
</details>

---

## Del B: OR Operator (||)

### Opgave 2.6: Simple OR
📖 [Se forklaring: OR Operator](#or-operator-)

**Opgave:**
Opret `age` = 10. Print "Discount" hvis age < 12 OR age >= 65.

| age | age < 12 | age >= 65 | Result |
|-----|----------|-----------|--------|
| 10 | <input type="text" size="10"> | <input type="text" size="10"> | <input type="text" size="20"> |

<details>
<summary>Se svar</summary>

```java
int age = 10;

if (age < 12 || age >= 65) {
    System.out.println("Discount");
}
// Output: Discount (fordi age < 12 er true)
```
</details>

---

### Opgave 2.7: Weekend check
**Opgave:**
Opret `day` = "Saturday". Print "Weekend" hvis day er "Saturday" OR "Sunday".

<details>
<summary>Se svar</summary>

```java
String day = "Saturday";

if (day.equals("Saturday") || day.equals("Sunday")) {
    System.out.println("Weekend");
} else {
    System.out.println("Weekday");
}
// Output: Weekend
```
</details>

---

### Opgave 2.8: Emergency contact
**Opgave:**
Print "Call emergency" hvis `temperature` > 39 OR `temperature` < 35. Test med temp = 40.

<details>
<summary>Se svar</summary>

```java
int temperature = 40;

if (temperature > 39 || temperature < 35) {
    System.out.println("Call emergency");
} else {
    System.out.println("Normal temperature");
}
// Output: Call emergency
```
</details>

---

### Opgave 2.9: Multiple valid inputs
**Opgave:**
Opret `command` = "start". Print "Valid" hvis command er "start" OR "run" OR "begin".

<details>
<summary>Se svar</summary>

```java
String command = "start";

if (command.equals("start") || command.equals("run") || command.equals("begin")) {
    System.out.println("Valid");
} else {
    System.out.println("Invalid");
}
// Output: Valid
```
</details>

---

### Opgave 2.10: Pass with retake
**Opgave:**
Student passar hvis `score` >= 60 OR (`score` >= 50 AND `hasRetake` = true).
Test med score = 55, hasRetake = true.

<details>
<summary>Se svar</summary>

```java
int score = 55;
boolean hasRetake = true;

if (score >= 60 || (score >= 50 && hasRetake)) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
// Output: Pass
```
</details>

---

## Del C: NOT Operator (!)

### Opgave 2.11: Simple NOT
📖 [Se forklaring: NOT Operator](#not-operator-)

**Opgave:**
Opret `isActive` = false. Print "Inactive" hvis NOT isActive.

| isActive | !isActive | Output |
|----------|-----------|--------|
| false | <input type="text" size="10"> | <input type="text" size="20"> |

<details>
<summary>Se svar</summary>

```java
boolean isActive = false;

if (!isActive) {
    System.out.println("Inactive");
}
// Output: Inactive
```
</details>

---

### Opgave 2.12: Double negative
**Opgave:**
Opret `isNotReady` = false. Hvad er `!isNotReady`?

| isNotReady | !isNotReady | Betydning |
|------------|-------------|-----------|
| false | <input type="text" size="10"> | <input type="text" size="20"> |

<details>
<summary>Se svar</summary>

```java
boolean isNotReady = false;

if (!isNotReady) {
    System.out.println("Is ready");
}
// Output: Is ready
// !false = true, så "is ready" er korrekt
```
</details>

---

### Opgave 2.13: Access denied
**Opgave:**
Print "Access denied" hvis NOT `hasPermission`. Test med hasPermission = false.

<details>
<summary>Se svar</summary>

```java
boolean hasPermission = false;

if (!hasPermission) {
    System.out.println("Access denied");
} else {
    System.out.println("Access granted");
}
// Output: Access denied
```
</details>

---

### Opgave 2.14: NOT with AND
**Opgave:**
Opret `age` = 20, `hasID` = false. Print "Entry denied" hvis age >= 18 AND NOT hasID.

<details>
<summary>Se svar</summary>

```java
int age = 20;
boolean hasID = false;

if (age >= 18 && !hasID) {
    System.out.println("Entry denied - need ID");
}
// Output: Entry denied - need ID
```
</details>

---

### Opgave 2.15: System status
**Opgave:**
Opret `isRunning` = true, `hasErrors` = false.
Print "System OK" hvis isRunning AND NOT hasErrors.

<details>
<summary>Se svar</summary>

```java
boolean isRunning = true;
boolean hasErrors = false;

if (isRunning && !hasErrors) {
    System.out.println("System OK");
} else {
    System.out.println("System issue");
}
// Output: System OK
```
</details>

---

## Del D: Combining Operators

### Opgave 2.16: AND + OR together
**Opgave:**
Student får bonus hvis (`score` >= 90) OR (`score` >= 80 AND `hasAttendance`).
Test med score = 85, hasAttendance = true.

<details>
<summary>Se svar</summary>

```java
int score = 85;
boolean hasAttendance = true;

if (score >= 90 || (score >= 80 && hasAttendance)) {
    System.out.println("Bonus awarded");
} else {
    System.out.println("No bonus");
}
// Output: Bonus awarded
```
</details>

---

### Opgave 2.17: Complex eligibility
**Opgave:**
Eligible hvis: (age >= 18 AND age < 65) AND (hasLicense OR hasPermit).
Test med age = 30, hasLicense = false, hasPermit = true.

<details>
<summary>Se svar</summary>

```java
int age = 30;
boolean hasLicense = false;
boolean hasPermit = true;

if ((age >= 18 && age < 65) && (hasLicense || hasPermit)) {
    System.out.println("Eligible");
} else {
    System.out.println("Not eligible");
}
// Output: Eligible
```
</details>

---

### Opgave 2.18: Discount logic
**Opgave:**
Discount hvis: (isMember OR purchaseAmount > 500) AND NOT blacklisted.
Test med isMember = false, purchaseAmount = 600, blacklisted = false.

<details>
<summary>Se svar</summary>

```java
boolean isMember = false;
double purchaseAmount = 600.0;
boolean blacklisted = false;

if ((isMember || purchaseAmount > 500) && !blacklisted) {
    System.out.println("Discount available");
} else {
    System.out.println("No discount");
}
// Output: Discount available
```
</details>

---

### Opgave 2.19: Login validation
**Opgave:**
Kan logge ind hvis: (correctPassword AND accountActive) OR isAdmin.
Test med correctPassword = true, accountActive = false, isAdmin = false.

<details>
<summary>Se svar</summary>

```java
boolean correctPassword = true;
boolean accountActive = false;
boolean isAdmin = false;

if ((correctPassword && accountActive) || isAdmin) {
    System.out.println("Login successful");
} else {
    System.out.println("Login failed");
}
// Output: Login failed
```
</details>

---

### Opgave 2.20: Priority access
**Opgave:**
Priority hvis: (isVIP OR (isMember AND points > 1000)) AND NOT suspended.
Test forskellige kombinationer.

<details>
<summary>Se svar</summary>

```java
boolean isVIP = false;
boolean isMember = true;
int points = 1200;
boolean suspended = false;

if ((isVIP || (isMember && points > 1000)) && !suspended) {
    System.out.println("Priority access");
} else {
    System.out.println("Standard access");
}
// Output: Priority access
```
</details>

---

## Del E: Complex Conditions

### Opgave 2.21: Temperature comfort zone
**Opgave:**
Comfortable hvis temp mellem 18-25 AND humidity mellem 30-60.
Test med temp = 22, humidity = 45.

<details>
<summary>Se svar</summary>

```java
int temp = 22;
int humidity = 45;

if ((temp >= 18 && temp <= 25) && (humidity >= 30 && humidity <= 60)) {
    System.out.println("Comfortable");
} else {
    System.out.println("Uncomfortable");
}
// Output: Comfortable
```
</details>

---

### Opgave 2.22: Valid date ranges
**Opgave:**
Valid hvis (month mellem 1-12) AND (day mellem 1-31) AND (year > 1900).
Test med month = 6, day = 15, year = 2024.

<details>
<summary>Se svar</summary>

```java
int month = 6;
int day = 15;
int year = 2024;

if ((month >= 1 && month <= 12) && (day >= 1 && day <= 31) && (year > 1900)) {
    System.out.println("Valid date");
} else {
    System.out.println("Invalid date");
}
// Output: Valid date
```
</details>

---

### Opgave 2.23: Multiple criteria search
**Opgave:**
Match hvis: (price mellem 100-500) AND (category er "Electronics" OR "Books") AND inStock.
Test med price = 299, category = "Electronics", inStock = true.

<details>
<summary>Se svar</summary>

```java
double price = 299.0;
String category = "Electronics";
boolean inStock = true;

if ((price >= 100 && price <= 500) && 
    (category.equals("Electronics") || category.equals("Books")) && 
    inStock) {
    System.out.println("Match found");
} else {
    System.out.println("No match");
}
// Output: Match found
```
</details>

---

### Opgave 2.24: Grade boundaries
**Opgave:**
Find hvilke conditions der giver hver grade. Brug score = 75.

Regler:
- A: score >= 90
- B: score >= 80 AND score < 90
- C: score >= 70 AND score < 80
- D: score >= 60 AND score < 70
- F: score < 60

<details>
<summary>Se svar</summary>

```java
int score = 75;
String grade;

if (score >= 90) {
    grade = "A";
} else if (score >= 80 && score < 90) {
    grade = "B";
} else if (score >= 70 && score < 80) {
    grade = "C";
} else if (score >= 60 && score < 70) {
    grade = "D";
} else {
    grade = "F";
}

System.out.println("Grade: " + grade);
// Output: Grade: C
```
</details>

---

### Opgave 2.25: Complex validation
**Opgave:**
Password valid hvis: (length >= 8) AND (har både uppercase OG lowercase) AND NOT containsSpaces.
Simulate med hasUpper = true, hasLower = true, length = 10, hasSpaces = false.

<details>
<summary>Se svar</summary>

```java
int length = 10;
boolean hasUpper = true;
boolean hasLower = true;
boolean hasSpaces = false;

if ((length >= 8) && (hasUpper && hasLower) && !hasSpaces) {
    System.out.println("Valid password");
} else {
    System.out.println("Invalid password");
}
// Output: Valid password
```
</details>

---


## Refleksionsspørgsmål

Efter du har løst opgaverne, tænk over:
1. Hvad er forskellen mellem && og ||?
2. Hvad betyder short-circuit evaluation?
3. Hvornår skal du bruge parenteser i complex conditions?
4. Hvad gør ! operatoren?
5. Hvordan kan du simplify complex conditions?
6. Hvad er forskellen mellem `(A && B) || C` og `A && (B || C)`?
7. Hvordan tester du om dine boolean expressions virker korrekt?


