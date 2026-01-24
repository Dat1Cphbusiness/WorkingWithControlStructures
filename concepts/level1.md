# Level 1: Basic Conditionals (if/else)

## Level 1 fokuserer på:
- if statements - simple decisions
- if-else statements - two-way branching
- if-else if-else chains - multiple conditions
- Comparison operators (==, !=, <, >, <=, >=)
- Boolean conditions
- String comparison (.equals())
- Making decisions with primitive types


## Begrebsgennemgang

### if Statement
En **if statement** udfører kode kun hvis en condition er sand (true):

```java
int age = 20;
if (age >= 18) {
    System.out.println("Du er myndig");
}
```

**Hvad sker der:**
1. Java evaluerer condition: `age >= 18`
2. Hvis true: koden i `{}` bliver udført
3. Hvis false: koden i `{}` bliver sprunget over

### if-else Statement
En **if-else statement** vælger mellem to muligheder:

```java
int score = 75;
if (score >= 60) {
    System.out.println("Bestået");
} else {
    System.out.println("Ikke bestået");
}
```

**Flowchart:**
```
Condition?
   ├─ true  → Do this
   └─ false → Do that
```

### if-else if-else Chain
En **if-else if-else chain** vælger mellem flere muligheder:

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

**Vigtigt:**
- Conditions checkes fra top til bund
- Første true condition bliver udført
- Resten bliver sprunget over
- `else` fanger alt der ikke matchede

### Comparison Operators

| Operator | Betydning | Eksempel | Resultat |
|----------|-----------|----------|----------|
| `==` | Lig med | `5 == 5` | `true` |
| `!=` | Ikke lig med | `5 != 3` | `true` |
| `<` | Mindre end | `3 < 5` | `true` |
| `<=` | Mindre eller lig | `5 <= 5` | `true` |
| `>` | Større end | `7 > 5` | `true` |
| `>=` | Større eller lig | `5 >= 5` | `true` |

### Boolean Expressions
Conditions evaluerer til `true` eller `false`:

```java
int temperature = 25;
boolean isWarm = temperature > 20;  // true

if (isWarm) {
    System.out.println("Det er varmt");
}
```

### String Comparison
**VIGTIGT:** Brug `.equals()` for Strings, IKKE `==`

```java
String password = "secret123";

// KORREKT
if (password.equals("secret123")) {
    System.out.println("Korrekt password");
}

// FORKERT - sammenligner references, ikke indhold
if (password == "secret123") {
    System.out.println("Dette virker måske ikke!");
}
```

**Hvorfor?**
- `==` checker om det er det samme objekt i hukommelsen
- `.equals()` checker om indholdet er det samme
- For Strings vil du næsten altid bruge `.equals()`

### Range Checking
Brug `>=` og `<=` når grænseværdier skal inkluderes:

```java
int age = 18;

// Inkluderer 18
if (age >= 18) {  
    System.out.println("Myndig");
}

// Ekskluderer 18
if (age > 18) {  
    System.out.println("Over 18");
}
```

### Common Patterns

**Pass/Fail:**
```java
int score = 65;
if (score >= 60) {
    System.out.println("PASS");
} else {
    System.out.println("FAIL");
}
```

**Grade assignment:**
```java
int score = 85;
if (score >= 90) {
    System.out.println("A");
} else if (score >= 80) {
    System.out.println("B");
} else if (score >= 70) {
    System.out.println("C");
} else {
    System.out.println("F");
}
```

**Range checking:**
```java
int temperature = 22;
if (temperature < 0) {
    System.out.println("Freezing");
} else if (temperature < 15) {
    System.out.println("Cold");
} else if (temperature < 25) {
    System.out.println("Comfortable");
} else {
    System.out.println("Hot");
}
```

---

## Tips
- Test din condition før du skriver if-statement
- Brug beskrivende variable navne
- Husk `{}` omkring kodeblokke (selv for én linje - god vane!)
- Conditions evalueres top-to-bottom - rækkefølge betyder noget
- `else` er optional - brug kun hvis nødvendigt
- For Strings: brug `.equals()`, IKKE `==`

---