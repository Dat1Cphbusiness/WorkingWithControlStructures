# Level 1: Basic Conditionals (if/else)

## Level 1 fokuserer på:
- if statements - simple decisions
- if-else statements - two-way branching
- if-else if-else chains - multiple conditions
- Sammenligne værdier (numbers, strings, booleans)
- Returnere forskellige værdier baseret på conditions
- Bruge conditionals med object state

---

## Begrebsgennemgang

### if Statement
En **if statement** udfører kode kun hvis en condition er sand (true):

```java
if (age >= 18) {
    System.out.println("Du er myndig");
}
```

### if-else Statement
En **if-else statement** vælger mellem to muligheder:

```java
if (score >= 60) {
    System.out.println("Bestået");
} else {
    System.out.println("Ikke bestået");
}
```

### if-else if-else Chain
En **if-else if-else chain** vælger mellem flere muligheder:

```java
if (score >= 90) {
    return "A";
} else if (score >= 80) {
    return "B";
} else if (score >= 70) {
    return "C";
} else {
    return "F";
}
```

### Comparison Operators
- `==` - lig med
- `!=` - ikke lig med
- `<` - mindre end
- `<=` - mindre end eller lig med
- `>` - større end
- `>=` - større end eller lig med

### Boolean Conditions
Conditions evaluerer til `true` eller `false`:

```java
int age = 25;
boolean isAdult = age >= 18;  // true

if (isAdult) {
    System.out.println("Myndig");
}
```

### String Comparison
Brug `.equals()` til at sammenligne Strings (IKKE ==):

```java
String password = "secret123";

if (password.equals("secret123")) {  // KORREKT
    System.out.println("Korrekt password");
}

if (password == "secret123") {  // FORKERT - sammenligner references
    System.out.println("Dette virker måske ikke!");
}
```

**Tag udgangspunkt i klasserne Grade, User, og Product.**  
**Skriv din kode i Main.java i testLevel1() metoden.**

**VIGTIGT:** I dette level skal du **implementere metoderne** i klasserne Grade, User, og Product. Se efter "// TODO" kommentarer i klasserne.

---

## Tips
- if statements evaluerer conditions top-to-bottom
- Når en condition er sand, udføres den blok og resten springes over
- Husk tuborgklammer `{}` omkring kodeblokke
- Brug `>=` og `<=` når grænseværdier skal inkluderes
- Returnér fra en metode så snart du har svaret (tidlig return)
- Test dine conditionals med forskellige værdier
- Al din kode skal placeres inde i `testLevel1()` metoden mellem tuborgklammerne `{}`

---

## Del A: Simple if Statements

### Opgave 1.1: Din første if statement
**Opgave:** 
1. Opret en Grade: "Anna", score 75
2. Implementer `isPassing()` metoden i Grade klassen
   - Return true hvis score >= 60
   - Return false ellers
3. Kald isPassing() og print resultatet

**Forventet Output:**
```
true
```

---

### Opgave 1.2: if med object state
**Opgave:** 
1. Opret en User: "peter", "pass123", age 17, active true
2. Implementer `isAdult()` metoden i User klassen
   - Return true hvis age >= 18
3. Kald isAdult() og print resultatet

**Forventet Output:**
```
false
```

---

### Opgave 1.3: if med boolean field
**Opgave:** 
1. Opret en Product: "Laptop", price 5000, stock 0, category "Electronics"
2. Implementer `isAvailable()` metoden i Product klassen
   - Return true hvis stock > 0
3. Kald isAvailable() og print resultatet

**Forventet Output:**
```
false
```

---

### Opgave 1.4: Multiple if checks
**Opgave:** 
1. Opret tre Grade objekter med scores: 45, 60, 95
2. For hver grade, kald isPassing() og print resultatet

**Forventet Output:**
```
false
true
true
```

---

### Opgave 1.5: if med price comparison
**Opgave:** 
1. Opret to Product objekter: "Mouse" (250 kr) og "Keyboard" (800 kr)
2. Implementer `isExpensive()` metoden i Product klassen
   - Return true hvis price > 500
3. Print isExpensive() for begge produkter

**Forventet Output:**
```
false
true
```

---

## Del B: if-else Statements

### Opgave 1.6: Simple if-else
**Opgave:** 
1. Opret en User: "emma", "secret", age 25, active false
2. Implementer `getAccountStatus()` metoden i User klassen
   - Return "Active" hvis isActive er true
   - Return "Inactive" hvis isActive er false
3. Print account status

**Forventet Output:**
```
Inactive
```

---

### Opgave 1.7: if-else med forskellige objekter
**Opgave:** 
1. Opret to User objekter: én active, én inactive
2. Print account status for begge

**Forventet Output:**
```
Active
Inactive
```

---

### Opgave 1.8: if-else returning values
**Opgave:** 
1. Opret to Grade objekter: score 55 og score 70
2. For hver grade:
   - Hvis isPassing(), print "PASS"
   - Ellers, print "FAIL"

**Forventet Output:**
```
FAIL
PASS
```

---

### Opgave 1.9: Using if-else in logic
**Opgave:** 
1. Opret tre Product objekter med forskellige stock levels: 0, 5, 15
2. For hvert produkt:
   - Hvis isAvailable(), print "Can order"
   - Ellers, print "Out of stock"

**Forventet Output:**
```
Out of stock
Can order
Can order
```

---

### Opgave 1.10: Combining methods
**Opgave:** 
1. Opret en User: "lars", "pass", age 16, active true
2. Print: "User lars is " + (isAdult() ? "adult" : "minor")
   - Brug ternary operator eller if-else

**Forventet Output:**
```
User lars is minor
```

---

## Del C: if-else if-else Chains

### Opgave 1.11: Din første chain
**Opgave:** 
1. Opret en Grade: "Maria", score 85
2. Implementer `getLetterGrade()` metoden i Grade klassen:
   - Return "A" hvis score >= 90
   - Return "B" hvis score >= 80
   - Return "C" hvis score >= 70
   - Return "D" hvis score >= 60
   - Return "F" ellers
3. Print letter grade

**Forventet Output:**
```
B
```

---

### Opgave 1.12: Multiple grades
**Opgave:** 
1. Opret fem Grade objekter med scores: 95, 85, 75, 65, 55
2. Print letter grade for hver

**Forventet Output:**
```
A
B
C
D
F
```

---

### Opgave 1.13: Age categories
**Opgave:** 
1. Opret en User: "sofie", "pass", age 15, active true
2. Implementer `getAgeCategory()` metoden i User klassen:
   - Return "Child" hvis age < 13
   - Return "Teen" hvis age < 18
   - Return "Adult" hvis age < 65
   - Return "Senior" hvis age >= 65
3. Print age category

**Forventet Output:**
```
Teen
```

---

### Opgave 1.14: All age categories
**Opgave:** 
1. Opret fire User objekter med ages: 10, 16, 30, 70
2. Print age category for hver

**Forventet Output:**
```
Child
Teen
Adult
Senior
```

---

### Opgave 1.15: Stock status levels
**Opgave:** 
1. Opret en Product: "Monitor", 450 kr, stock 3, "Electronics"
2. Implementer `getStockStatus()` metoden i Product klassen:
   - Return "Out of Stock" hvis stock == 0
   - Return "Low Stock" hvis stock < 5
   - Return "In Stock" hvis stock < 20
   - Return "Well Stocked" hvis stock >= 20
3. Print stock status

**Forventet Output:**
```
Low Stock
```

---

### Opgave 1.16: All stock levels
**Opgave:** 
1. Opret fire Product objekter med stock: 0, 3, 15, 25
2. Print stock status for hver

**Forventet Output:**
```
Out of Stock
Low Stock
In Stock
Well Stocked
```

---

### Opgave 1.17: Grade status
**Opgave:** 
1. Opret en Grade: "Thomas", score 92
2. Implementer `getStatus()` metoden i Grade klassen:
   - Return "Excellent" hvis score >= 90
   - Return "Good" hvis score >= 70
   - Return "Needs Improvement" hvis score >= 60
   - Return "Failing" hvis score < 60
3. Print status

**Forventet Output:**
```
Excellent
```

---

### Opgave 1.18: All grade statuses
**Opgave:** 
1. Opret fire Grade objekter med scores: 95, 75, 65, 50
2. Print status for hver

**Forventet Output:**
```
Excellent
Good
Needs Improvement
Failing
```

---

### Opgave 1.19: Discount calculation
**Opgave:** 
1. Opret en Product: "TV", 1200 kr, stock 10, "Electronics"
2. Implementer `getDiscountedPrice()` metoden i Product klassen:
   - 20% discount hvis price >= 1000
   - 10% discount hvis price >= 500
   - 5% discount hvis price >= 100
   - Ingen discount ellers
3. Print både original price og discounted price

**Forventet Output:**
```
Original: 1200.0 kr
Discounted: 960.0 kr
```

---

### Opgave 1.20: Various discounts
**Opgave:** 
1. Opret fire Product objekter med prices: 1500, 600, 150, 50
2. For hver, print original og discounted price

**Forventet Output:**
```
Original: 1500.0 kr, Discounted: 1200.0 kr
Original: 600.0 kr, Discounted: 540.0 kr
Original: 150.0 kr, Discounted: 142.5 kr
Original: 50.0 kr, Discounted: 50.0 kr
```

---

## Del D: String Comparison

### Opgave 1.21: String comparison with equals()
**Opgave:** 
1. Opret en User: "admin", "password123", age 30, active true
2. Test canLogin() med forskellige passwords:
   - canLogin("password123") - skal returnere true
   - canLogin("Password123") - skal returnere false (case sensitive)
   - canLogin("wrong") - skal returnere false

**Forventet Output:**
```
true
false
false
```

---

### Opgave 1.22: Why not == for Strings?
**Opgave:** 
1. Opret to String variabler:
   ```java
   String password1 = "secret";
   String password2 = new String("secret");
   ```
2. Print `password1 == password2` (sammenligner references)
3. Print `password1.equals(password2)` (sammenligner indhold)
4. Observe forskellen!

**Forventet Output:**
```
false
true
```

**Forklaring:** `==` sammenligner om det er det samme objekt i memory (reference equality). `.equals()` sammenligner om de har samme indhold (value equality).

---

### Opgave 1.23: String comparison in conditions
**Opgave:** 
1. Opret en Product: "Laptop", 5000 kr, stock 10, category "Electronics"
2. I testLevel1(), check:
   - Hvis category.equals("Electronics"), print "Tech product"
   - Hvis category.equals("Food"), print "Grocery item"

**Forventet Output:**
```
Tech product
```

---

### Opgave 1.24: Case sensitivity matters
**Opgave:** 
1. Opret en User: "anna", "Secret123", age 25, active true
2. Test canLogin() med:
   - "Secret123" (correct)
   - "secret123" (wrong case)
   - "SECRET123" (wrong case)

**Forventet Output:**
```
true
false
false
```

---

### Opgave 1.25: Multiple string comparisons
**Opgave:** 
1. Opret tre Product objekter med categories: "Electronics", "Food", "Clothing"
2. For hver product:
   - Hvis category.equals("Electronics"), print "Tech: " + name
   - Hvis category.equals("Food"), print "Grocery: " + name
   - Hvis category.equals("Clothing"), print "Fashion: " + name

**Forventet Output:** (eksempel)
```
Tech: Laptop
Grocery: Apple
Fashion: T-Shirt
```

---

## Del E: Combining Conditionals

### Opgave 1.26: Login validation
**Opgave:** 
1. Opret en User: "admin", "admin123", age 30, active true
2. Implementer `canLogin(String inputPassword)` metoden i User klassen:
   - Return true hvis isActive er true OG inputPassword matcher password
   - Return false ellers
3. Test med korrekt password: print canLogin("admin123")
4. Test med forkert password: print canLogin("wrong")

**Forventet Output:**
```
true
false
```

---

### Opgave 1.27: Inactive user login
**Opgave:** 
1. Opret en User: "olduser", "pass123", age 40, active false
2. Test canLogin("pass123")
3. Selv med korrekt password, skal det returnere false fordi user er inactive

**Forventet Output:**
```
false
```

---

### Opgave 1.28: Display full info
**Opgave:** 
1. Opret en Grade: "Emma", score 88
2. Kald displayInfo() metoden (som bruger dine implementerede metoder)

**Forventet Output:**
```
Student: Emma
Score: 88
Letter Grade: B
Status: Good
```

---

### Opgave 1.29: Display user info
**Opgave:** 
1. Opret en User: "peter", "secret", age 25, active true
2. Kald displayInfo()

**Forventet Output:**
```
Username: peter
Age: 25
Category: Adult
Status: Active
```

---

### Opgave 1.30: Display product info
**Opgave:** 
1. Opret en Product: "Laptop", 8000 kr, stock 7, "Electronics"
2. Kald displayInfo()

**Forventet Output:**
```
Product: Laptop
Price: 8000.0 kr
Discounted Price: 6400.0 kr
Stock: 7
Status: In Stock
```

---

### Opgave 1.31: Multiple objects with display
**Opgave:** 
1. Opret tre Grade objekter med forskellige scores
2. Kald displayInfo() på alle tre

**Forventet Output:** (eksempel)
```
Student: Anna
Score: 95
Letter Grade: A
Status: Excellent

Student: Peter
Score: 72
Letter Grade: C
Status: Good

Student: Lars
Score: 58
Letter Grade: F
Status: Failing
```

---

### Opgave 1.32: Filtering with conditionals
**Opgave:** 
1. Opret fem Grade objekter
2. For hver grade:
   - Hvis isPassing(), print student name + "PASS"
   - Ellers, print student name + "FAIL"

**Forventet Output:** (eksempel)
```
Anna: PASS
Peter: PASS
Maria: FAIL
Lars: PASS
Sofie: FAIL
```

---

### Opgave 1.33: Product availability check
**Opgave:** 
1. Opret fem Product objekter med forskellige stock levels
2. Print navnet på alle produkter der er available (isAvailable())

**Forventet Output:** (eksempel)
```
Available products:
Laptop
Mouse
Keyboard
Monitor
```

---

### Opgave 1.34: Adult users only
**Opgave:** 
1. Opret seks User objekter med forskellige ages
2. Print username for alle users der er adults (isAdult())

**Forventet Output:** (eksempel)
```
Adult users:
peter
emma
lars
```

---

### Opgave 1.35: Complex scenario - Grade report
**Opgave:** 
Opret et grade report system:
1. Opret 7 Grade objekter med forskellige scores
2. For hver grade, print:
   - Student name
   - Letter grade
   - Status
   - "PASS" eller "FAIL"
3. Tæl hvor mange der passed (du skal selv holde styr på count)

**Forventet Output:** (dit eget design)

---

## Refleksionsspørgsmål

Efter du har løst opgaverne, tænk over:
1. Hvad er forskellen mellem if, if-else, og if-else if-else?
2. Hvorfor skal vi bruge `>=` i stedet for `>` i nogle conditionals?
3. Hvornår ville du vælge if-else if-else over flere separate if statements?
4. Hvorfor bruger vi `.equals()` for Strings men `==` for ints?
5. Hvad sker der hvis du glemmer `else` i en if-else if chain?
6. Hvordan kan conditionals hjælpe med at validere user input?
