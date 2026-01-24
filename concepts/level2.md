# Level 2: Relational & Boolean Operators

## Level 2 fokuserer på:
- Logical operators (&&, ||, !)
- Combining multiple conditions
- AND logic (begge skal være sande)
- OR logic (mindst én skal være sand)
- NOT logic (inverterer boolean)
- Complex boolean expressions
- Short-circuit evaluation
- Truth tables

## Begrebsgennemgang

### Logical Operators Overview

| Operator | Navn | Betydning | Eksempel |
|----------|------|-----------|----------|
| `&&` | AND | Begge skal være sande | `age >= 18 && hasLicense` |
| `\|\|` | OR | Mindst én skal være sand | `age < 12 \|\| age >= 65` |
| `!` | NOT | Inverterer boolean | `!isActive` |

### AND Operator (&&)
**Begge conditions skal være sande** for at hele udtrykket er sandt:

```java
int age = 20;
boolean hasLicense = true;

if (age >= 18 && hasLicense) {
    System.out.println("Kan køre bil");
}
```

**Truth Table for AND:**
| A | B | A && B |
|---|---|--------|
| true | true | **true** |
| true | false | false |
| false | true | false |
| false | false | false |

**Kun true hvis BEGGE er true!**

### OR Operator (||)
**Mindst én condition skal være sand** for at hele udtrykket er sandt:

```java
int age = 70;

if (age < 12 || age >= 65) {
    System.out.println("Discount eligible");
}
```

**Truth Table for OR:**
| A | B | A \|\| B |
|---|---|--------|
| true | true | **true** |
| true | false | **true** |
| false | true | **true** |
| false | false | false |

**Kun false hvis BEGGE er false!**

### NOT Operator (!)
**Inverterer en boolean værdi:**

```java
boolean isActive = false;

if (!isActive) {
    System.out.println("System er IKKE aktiv");
}
```

**Truth Table for NOT:**
| A | !A |
|---|-----|
| true | **false** |
| false | **true** |

### Combining Multiple Conditions

Du kan kombinere flere conditions:

```java
int age = 25;
boolean hasTicket = true;
boolean isBanned = false;

if (age >= 18 && hasTicket && !isBanned) {
    System.out.println("Velkommen til koncerten");
}
```

**Alle tre conditions skal være sande:**
1. age >= 18 ✓
2. hasTicket ✓
3. !isBanned ✓ (fordi isBanned er false)

### Parentheses for Clarity

Brug `()` til at gruppere conditions og gøre dem mere læsbare:

```java
int age = 10;
boolean hasDiscount = true;

// Child OR senior, AND has discount
if ((age < 12 || age >= 65) && hasDiscount) {
    System.out.println("Special discount applies");
}
```

**Evaluering:**
1. `(age < 12 || age >= 65)` → `(true || false)` → `true`
2. `true && hasDiscount` → `true && true` → `true`

### Short-Circuit Evaluation

Java evaluerer logical operators **fra venstre til højre** og stopper når resultatet er kendt:

**AND short-circuit:**
```java
int age = 15;
boolean hasLicense = true;

// age >= 18 er false, så hasLicense checkes ALDRIG
if (age >= 18 && hasLicense) {
    System.out.println("Can drive");
}
```

**OR short-circuit:**
```java
int age = 8;

// age < 12 er true, så age >= 65 checkes ALDRIG
if (age < 12 || age >= 65) {
        System.out.println("Discount");
}
```

### Common Patterns

**Age range check:**
```java
int age = 25;

if (age >= 18 && age < 65) {
    System.out.println("Working age");
}
```

**Multiple valid options:**
```java
String day = "Saturday";

if (day.equals("Saturday") || day.equals("Sunday")) {
    System.out.println("Weekend!");
}
```

**Exclusion check:**
```java
boolean isBanned = false;
int age = 20;

if (age >= 18 && !isBanned) {
    System.out.println("Access granted");
}
```

### De Morgan's Laws

Useful transformations:
- `!(A && B)` = `!A || !B`
- `!(A || B)` = `!A && !B`

```java
// These are equivalent:
if (!(age < 18 || isBanned)) { ... }
if (age >= 18 && !isBanned) { ... }
```

---

## Tips
- && kræver at ALLE conditions er sande
- || kræver at MINDST ÉN condition er sand
- ! inverterer en boolean (true → false, false → true)
- Brug `()` for at gruppere conditions
- Test hver condition separat først
- Short-circuit: første false i && stopper, første true i || stopper
- Læsbarhed > korthed - brug paranteser hvis det hjælper

---