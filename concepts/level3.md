# Level 3: Switch Statements

## Level 3 fokuserer på:
- Switch statement syntax
- Case labels og break statements
- Default case
- Fall-through behavior
- Grouping cases
- Switch med int, char, og String
- Når switch er bedre end if-else
- Common switch patterns

---


## Begrebsgennemgang

### Switch Statement Basics
En **switch statement** vælger mellem flere muligheder baseret på værdien af et udtryk:

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
    default:
        System.out.println("Invalid day");
}
// Output: Wednesday
```

### Switch Syntax

```java
switch (expression) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code
}
```

**Components:**
- **expression**: Evalueres én gang (int, char, String, enum)
- **case**: Possible values to match
- **break**: Exit switch (prevent fall-through)
- **default**: Executes hvis ingen cases matcher (optional)

### Break Statement - VIGTIGT!

`break` stopper switch execution:

```java
int number = 2;

// MED break (korrekt)
switch (number) {
    case 1:
        System.out.println("One");
        break;
    case 2:
        System.out.println("Two");    // Printer dette
        break;                         // Stopper her!
    case 3:
        System.out.println("Three");
        break;
}
// Output: Two

// UDEN break (fall-through - normalt en fejl!)
switch (number) {
    case 1:
        System.out.println("One");
    case 2:
        System.out.println("Two");    // Printer dette
    case 3:
        System.out.println("Three");  // Printer OGSÅ dette!
}
// Output: Two Three
```

**Husk ALTID break!** (medmindre du vil have fall-through)

### Default Case

`default` fanger alle values der ikke matcher andre cases:

```java
int score = 42;

switch (score) {
    case 100:
        System.out.println("Perfect!");
        break;
    case 90:
        System.out.println("Excellent!");
        break;
    default:
        System.out.println("Score: " + score);
}
// Output: Score: 42
```

### Grouping Cases (Intentional Fall-Through)

Nogle gange ØNSKER vi fall-through for at gruppere cases:

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
}
// Output: Weekend
```

**Pattern:** Flere cases → samme code → kun break på sidste

### Switch med Strings

Du kan bruge Strings i switch (Java 7+):

```java
String command = "start";

switch (command) {
    case "start":
        System.out.println("Starting...");
        break;
    case "stop":
        System.out.println("Stopping...");
        break;
    case "pause":
        System.out.println("Pausing...");
        break;
    default:
        System.out.println("Unknown command");
}
// Output: Starting...
```

**VIGTIGT:** String comparison er case-sensitive!

### Switch med Char

```java
char grade = 'B';

switch (grade) {
    case 'A':
        System.out.println("Excellent");
        break;
    case 'B':
        System.out.println("Good");
        break;
    case 'C':
        System.out.println("Average");
        break;
    default:
        System.out.println("Unknown grade");
}
// Output: Good
```

### Switch vs. if-else if-else

**Brug switch når:**
- Du checker ÉN variabel mod flere specifikke værdier
- Værdierne er constants (int, String, char)
- Du har mange cases (5+)
- Mere læsbar end lange if-else chains

**Brug if-else når:**
- Du har complex conditions (&&, ||)
- Du checker ranges (age > 18)
- Du checker forskellige variabler
- Du har conditions der ikke er simple equality

```java
// GODT til switch
int choice = 3;
switch (choice) {
    case 1: ... break;
    case 2: ... break;
    case 3: ... break;
}

// DÅRLIGT til switch, brug if-else
int age = 25;
if (age > 18 && age < 65) {
    ...
}
```

### Return i Switch

Du kan returnere direkte fra switch cases (i en metode):

```java
// I en metode:
String getDayName(int day) {
    switch (day) {
        case 1:
            return "Monday";
        case 2:
            return "Tuesday";
        case 3:
            return "Wednesday";
        default:
            return "Invalid";
    }
    // Ingen break nødvendigt når du bruger return
}
```

### Common Patterns

**Menu selection:**
```java
int choice = 2;
switch (choice) {
    case 1:
        System.out.println("New game");
        break;
    case 2:
        System.out.println("Load game");
        break;
    case 3:
        System.out.println("Exit");
        break;
}
```

**Character classification:**
```java
char ch = 'a';
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
```

---

## Tips
- Husk ALTID `break` efter hver case (medmindre du vil fall-through)
- Brug `default` til at håndtere uventede værdier
- Switch er mere læsbar end lange if-else chains for simple checks
- Cases skal være konstante værdier (literals)
- String switch er case-sensitive
- Brug grouping (fall-through) til at kombinere cases med samme logic
- Test alle cases grundigt

---