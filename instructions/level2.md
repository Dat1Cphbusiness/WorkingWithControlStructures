# Level 2: Complex Conditionals & Logical Operators

## Level 2 fokuserer på:
- Logical operators (&&, ||, !)
- Kombinere flere conditions i én statement
- Nested if statements
- Boolean methods med komplekse checks
- Short-circuit evaluation
- AND, OR, NOT logic i praksis

---

## Begrebsgennemgang

### Logical Operators

**AND operator (&&)** - begge conditions skal være sande:
```java
if (age >= 18 && hasLicense) {
    System.out.println("Kan køre bil");
}
```

**OR operator (||)** - mindst én condition skal være sand:
```java
if (isWeekend || isHoliday) {
    System.out.println("Fri!");
}
```

**NOT operator (!)** - inverterer en boolean:
```java
if (!isActive) {
    System.out.println("Account er ikke aktiv");
}
```

### Combining Multiple Conditions
Du kan kombinere flere conditions:

```java
if (age >= 18 && hasTicket && !isBanned) {
    System.out.println("Velkommen til koncerten");
}
```

### Parentheses for Clarity
Brug paranteser til at gruppere conditions:

```java
if ((age < 12 || age >= 65) && hasDiscount) {
    // Børn eller seniorer med discount
}

if (isWeekend && (isRaining || isCold)) {
    // Weekend OG (regnvejr ELLER koldt)
}
```

### Short-Circuit Evaluation
Java evaluerer logical operators fra venstre til højre og stopper når resultatet er kendt:

```java
// Hvis isActive er false, tjekkes password aldrig
if (isActive && password.equals("secret")) {
    System.out.println("Login success");
}

// Hvis age >= 18 er true, tjekkes isStudent aldrig
if (age >= 18 || isStudent) {
    System.out.println("Adgang tilladt");
}
```

### Nested if Statements
Du kan have if statements inde i andre if statements:

```java
if (isActive) {
    if (isAdmin) {
        System.out.println("Admin access");
    } else {
        System.out.println("User access");
    }
} else {
    System.out.println("No access");
}
```

### Boolean Methods in Conditions
Du kan bruge methods der returnerer boolean direkte i conditions:

```java
if (isAlive() && canCastSpell(50)) {
    System.out.println("Casting spell!");
}
```

**Tag udgangspunkt i klasserne Ticket, AccessControl, og GameCharacter.**  
**Skriv din kode i Main.java i testLevel2() metoden.**

**VIGTIGT:** Implementer TODO metoderne i klasserne ved hjælp af logical operators og nested conditionals.

---

## Tips
- && kræver at ALLE conditions er sande
- || kræver at MINDST ÉN condition er sand
- ! inverterer en boolean (true bliver false, false bliver true)
- Brug paranteser for at gøre komplekse conditions mere læsbare
- Short-circuit: Første false i && stopper evaluering, første true i || stopper evaluering
- Test dine methods med forskellige kombinationer af værdier
- Al din kode skal placeres inde i `testLevel2()` metoden mellem tuborgklammerne `{}`

---

## Del A: AND Operator (&&)

### Opgave 2.1: Simple AND
**Opgave:** 
1. Opret en AccessControl: "anna", "pass123", admin true, active true, attempts 0
2. Implementer `hasFullAccess()` metoden
   - Return true hvis isAdmin AND isActive (begge skal være true)
3. Test og print resultatet

**Forventet Output:**
```
true
```

---

### Opgave 2.2: AND with false condition
**Opgave:** 
1. Opret en AccessControl: "peter", "secret", admin true, active false, attempts 0
2. Test hasFullAccess() - skal være false fordi active er false

**Forventet Output:**
```
false
```

---

### Opgave 2.3: Multiple AND conditions
**Opgave:** 
1. Opret en AccessControl: "emma", "pass", admin false, active true, attempts 2
2. Implementer `canLogin(String inputPassword)` metoden
   - Return true hvis isActive AND loginAttempts < 3 AND inputPassword matches password
3. Test med korrekt password

**Forventet Output:**
```
true
```

---

### Opgave 2.4: AND failure
**Opgave:** 
1. Opret en AccessControl: "lars", "secret", admin false, active true, attempts 3
2. Test canLogin("secret") - skal være false fordi attempts >= 3

**Forventet Output:**
```
false
```

---

### Opgave 2.5: Game character spell casting
**Opgave:** 
1. Opret en GameCharacter: "Wizard", health 80, maxHealth 100, mana 40, level 5, shield false
2. Implementer `canCastSpell(int manaCost)` metoden
   - Return true hvis isAlive() AND mana >= manaCost
3. Test med manaCost 30

**Forventet Output:**
```
true
```

---

## Del B: OR Operator (||)

### Opgave 2.6: Simple OR
**Opgave:** 
1. Opret en Ticket: "Concert", age 16, student true, weekend false, basePrice 100
2. Implementer `isEligibleForDiscount()` metoden
   - Return true hvis (age < 18 OR age >= 65) OR isStudent
3. Test og print resultatet

**Forventet Output:**
```
true
```

---

### Opgave 2.7: OR with multiple conditions
**Opgave:** 
1. Opret tre Ticket objekter: age 15, age 30 (student), age 70
2. Test isEligibleForDiscount() for alle tre

**Forventet Output:**
```
true
true
true
```

---

### Opgave 2.8: OR with all false
**Opgave:** 
1. Opret en Ticket: "Movie", age 30, student false, weekend false, basePrice 80
2. Test isEligibleForDiscount() - skal være false

**Forventet Output:**
```
false
```

---

### Opgave 2.9: Password reset check
**Opgave:** 
1. Opret en AccessControl: "user1", "password123", admin false, active true, attempts 0
2. Implementer `needsPasswordReset()` metoden
   - Return true hvis loginAttempts >= 3 OR password equals "password123"
3. Test - skal være true pga. weak password

**Forventet Output:**
```
true
```

---

### Opgave 2.10: OR with login attempts
**Opgave:** 
1. Opret en AccessControl: "user2", "strongPass", admin false, active true, attempts 5
2. Test needsPasswordReset() - skal være true pga. too many attempts

**Forventet Output:**
```
true
```

---

## Del C: NOT Operator (!)

### Opgave 2.11: Simple NOT
**Opgave:** 
1. Opret en GameCharacter: "Knight", health 30, maxHealth 100, mana 50, level 3, shield false
2. Implementer `isInDanger()` metoden
   - Return true hvis health < (maxHealth / 4) AND NOT hasShield
3. Test og print

**Forventet Output:**
```
true
```

---

### Opgave 2.12: NOT with shield
**Opgave:** 
1. Opret en GameCharacter: "Paladin", health 20, maxHealth 100, mana 40, level 4, shield true
2. Test isInDanger() - skal være false fordi shield er active

**Forventet Output:**
```
false
```

---

### Opgave 2.13: NOT in access check
**Opgave:** 
1. Opret to AccessControl objekter: én active, én inactive
2. For hver, check if NOT isActive(), print "Account suspended"

**Forventet Output:**
```
Account suspended
```
(Kun for den inactive)

---

### Opgave 2.14: Combining NOT with AND
**Opgave:** 
1. Opret en GameCharacter: "Rogue", health 25, maxHealth 100, mana 15, level 2, shield false
2. Implementer `shouldRetreat()` metoden
   - Return true hvis (health < 30 OR mana < 20) AND NOT hasShield
3. Test og print

**Forventet Output:**
```
true
```

---

### Opgave 2.15: NOT with healthy character
**Opgave:** 
1. Opret en GameCharacter: "Warrior", health 90, maxHealth 100, mana 60, level 5, shield false
2. Test shouldRetreat() - skal være false

**Forventet Output:**
```
false
```

---

## Del D: Combining Operators

### Opgave 2.16: AND, OR together
**Opgave:** 
1. Opret en Ticket: "Festival", age 20, student false, weekend true, basePrice 200
2. Implementer `canBuyAlcohol()` metoden
   - Return true hvis age >= 18 AND age < 100
3. Test og print

**Forventet Output:**
```
true
```

---

### Opgave 2.17: Complex ticket pricing
**Opgave:** 
1. Opret en Ticket: "Concert", age 22, student true, weekend true, basePrice 150
2. Implementer `isPremiumTime()` metoden
   - Return true hvis isWeekend AND (age >= 18 AND age < 65)
3. Test og print

**Forventet Output:**
```
true
```

---

### Opgave 2.18: Multiple logical operators
**Opgave:** 
1. Opret en GameCharacter: "Mage", health 100, maxHealth 100, mana 60, level 10, shield false
2. Implementer `canLevelUp()` metoden
   - Return true hvis isAlive() AND level < 100 AND (health == maxHealth OR mana >= 50)
3. Test og print

**Forventet Output:**
```
true
```

---

### Opgave 2.19: Access control with requirements
**Opgave:** 
1. Opret to AccessControl objekter: "admin" (admin true, active true) og "user" (admin false, active true)
2. Implementer `canPerformAction(boolean requiresAdmin)` metoden
   - Return true hvis isActive AND loginAttempts < 3 AND (if requiresAdmin, then must be admin)
3. Test begge med requiresAdmin = true

**Forventet Output:**
```
true
false
```

---

### Opgave 2.20: Action without admin requirement
**Opgave:** 
1. Brug samme objekter fra 2.19
2. Test canPerformAction(false) for begge - begge skulle kunne

**Forventet Output:**
```
true
true
```

---

## Del E: Nested Conditionals

### Opgave 2.21: Nested if for ticket type
**Opgave:** 
1. Opret en Ticket: "Movie", age 14, student false, weekend false, basePrice 80
2. Implementer `getTicketType()` metoden med nested if:
   - "Child" if age < 12
   - "Student" if age >= 12 AND age < 25 AND isStudent
   - "Adult" if age >= 18 AND age < 65 AND NOT student
   - "Senior" if age >= 65
   - "Teen" otherwise
3. Test og print

**Forventet Output:**
```
Teen
```

---

### Opgave 2.22: All ticket types
**Opgave:** 
1. Opret fem Ticket objekter:
   - age 10
   - age 20, student true
   - age 35, student false
   - age 70
   - age 16, student false
2. Print ticket type for hver

**Forventet Output:**
```
Child
Student
Adult
Senior
Teen
```

---

### Opgave 2.23: Access level determination
**Opgave:** 
1. Opret en AccessControl: "manager", "pass", admin false, active true, attempts 0
2. Implementer `getAccessLevel()` metoden med nested if:
   - "Full Access" if isAdmin AND isActive
   - "Limited Access" if NOT isAdmin AND isActive
   - "No Access" if NOT isActive OR loginAttempts >= 3
3. Print access level

**Forventet Output:**
```
Limited Access
```

---

### Opgave 2.24: All access levels
**Opgave:** 
1. Opret tre AccessControl objekter:
   - admin true, active true, attempts 0
   - admin false, active true, attempts 0
   - admin true, active false, attempts 0
2. Print access level for hver

**Forventet Output:**
```
Full Access
Limited Access
No Access
```

---

### Opgave 2.25: Game character status
**Opgave:** 
1. Opret en GameCharacter: "Hero", health 15, maxHealth 100, mana 30, level 1, shield false
2. Implementer `getStatus()` metoden med nested if:
   - "Critical" if health <= 20 AND NOT hasShield
   - "Low Health" if health < (maxHealth / 2) AND NOT hasShield
   - "Protected" if hasShield AND health > 0
   - "Healthy" if health > (maxHealth / 2)
   - "Dead" if health <= 0
3. Print status

**Forventet Output:**
```
Critical
```

---

### Opgave 2.26: Various character statuses
**Opgave:** 
1. Opret fire GameCharacter objekter:
   - health 18, shield false
   - health 40, shield false
   - health 30, shield true
   - health 70, shield false
2. Print status for hver

**Forventet Output:**
```
Critical
Low Health
Protected
Healthy
```

---

### Opgave 2.27: Combat readiness
**Opgave:** 
1. Opret en GameCharacter: "Fighter", health 60, maxHealth 100, mana 40, level 3, shield false
2. Implementer `getCombatReadiness()` metoden:
   - "Ready" if health > 50 AND mana > 30
   - "Need Rest" if health < 30 OR mana < 10
   - "Partially Ready" otherwise
3. Print combat readiness

**Forventet Output:**
```
Ready
```

---

### Opgave 2.28: All readiness states
**Opgave:** 
1. Opret tre GameCharacter objekter:
   - health 70, mana 50
   - health 20, mana 40
   - health 45, mana 25
2. Print combat readiness for hver

**Forventet Output:**
```
Ready
Need Rest
Partially Ready
```

---

## Del F: Complex Scenarios

### Opgave 2.29: Ticket final price calculation
**Opgave:** 
1. Opret en Ticket: "Concert", age 20, student true, weekend true, basePrice 200
2. Implementer `getFinalPrice()` metoden:
   - Start med basePrice
   - If isWeekend AND age >= 18, add 50 kr
   - If isStudent AND age >= 18, subtract 20% from current price
   - If age < 12, subtract 50% from current price
   - If age >= 65, subtract 30% from current price
3. Print final price

**Forventet Output:**
```
200.0 kr
```
(200 + 50 = 250, then 250 * 0.8 = 200)

---

### Opgave 2.30: Various ticket prices
**Opgave:** 
1. Opret fire Ticket objekter:
   - age 10, student false, weekend false, basePrice 100
   - age 22, student true, weekend true, basePrice 150
   - age 35, student false, weekend true, basePrice 200
   - age 70, student false, weekend false, basePrice 150
2. Print final price for hver

**Forventet Output:** (beregn selv baseret på regler)

---

### Opgave 2.31: Display full info
**Opgave:** 
1. Opret to Ticket objekter med forskellige værdier
2. Kald displayInfo() på begge

**Forventet Output:** (eksempel)
```
Event: Concert
Ticket Type: Student
Base Price: 150.0 kr
Final Price: 200.0 kr
Premium Time: true

Event: Movie
Ticket Type: Child
Base Price: 80.0 kr
Final Price: 40.0 kr
Premium Time: false
```

---

### Opgave 2.32: Access control scenarios
**Opgave:** 
1. Opret tre AccessControl objekter med forskellige combinations
2. Test canLogin() og canPerformAction() for hver
3. Display full info

**Forventet Output:** (dit eget design)

---

### Opgave 2.33: Game party management
**Opgave:** 
1. Opret fire GameCharacter objekter (different states)
2. For hver character:
   - Print status
   - Check if canCastSpell(25)
   - Check if shouldRetreat()
   - Print combat readiness

**Forventet Output:** (dit eget design)

---

### Opgave 2.34: Filtering characters
**Opgave:** 
1. Opret seks GameCharacter objekter
2. Print navne på alle characters der shouldRetreat()
3. Print navne på alle characters der canLevelUp()

**Forventet Output:** (dit eget design)

---

### Opgave 2.35: Comprehensive ticket system
**Opgave:** 
Opret et ticket booking system:
1. Opret 8 Ticket objekter med various combinations af age, student status, weekend
2. For hver ticket:
   - Print ticket type
   - Print if eligible for discount
   - Print final price
3. Tæl hvor mange er eligible for discount
4. Beregn total revenue

**Forventet Output:** (dit eget design med complete statistics)

---

## Refleksionsspørgsmål

Efter du har løst opgaverne, tænk over:
1. Hvad er forskellen mellem && og ||?
2. Hvordan virker short-circuit evaluation?
3. Hvornår skal du bruge paranteser i complex conditions?
4. Hvad gør ! operatoren?
5. Hvornår er nested if statements bedre end logical operators?
6. Hvordan kan du simplify complex conditionals for at gøre dem mere læsbare?
