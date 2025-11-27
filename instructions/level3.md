# Level 3: Switch Statements

## Level 3 fokuserer på:
- Switch statement syntax
- Case labels og break statements
- Default case
- Gruppering af cases (fall-through)
- Hvornår switch er bedre end if-else if-else
- Switch med Strings og integers
- Common switch patterns

---

## Begrebsgennemgang

### Switch Statement Basics
En **switch statement** vælger mellem flere muligheder baseret på værdien af et udtryk:

```java
switch (dayOfWeek) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Invalid day");
}
```

### Break Statement
`break` stopper switch statement og forhindrer "fall-through":

```java
int choice = 2;

// MED break (korrekt)
switch (choice) {
    case 1:
        System.out.println("One");
        break;
    case 2:
        System.out.println("Two");  // Printer dette
        break;                      // Stopper her
    case 3:
        System.out.println("Three");
        break;
}

// UDEN break (fall-through - normalt en fejl!)
switch (choice) {
    case 1:
        System.out.println("One");
    case 2:
        System.out.println("Two");    // Printer dette
    case 3:
        System.out.println("Three");  // Printer OGSÅ dette! (fall-through)
}
```

### Default Case
`default` kører hvis ingen cases matcher (som `else` i if-else):

```java
switch (grade) {
    case "A":
        System.out.println("Excellent!");
        break;
    case "B":
        System.out.println("Good!");
        break;
    default:
        System.out.println("Keep trying!");
}
```

### Gruppering af Cases (Intentional Fall-Through)
Nogle gange ØNSKER vi fall-through for at gruppere cases:

```java
switch (dayOfWeek) {
    case 6:
    case 7:
        System.out.println("Weekend!");
        break;
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
        System.out.println("Weekday");
        break;
}
```

### Switch med Strings
Du kan bruge Strings i switch (Java 7+):

```java
String command = "attack";

switch (command) {
    case "attack":
        System.out.println("Attacking!");
        break;
    case "defend":
        System.out.println("Defending!");
        break;
    default:
        System.out.println("Unknown command");
}
```

### Switch vs. if-else if-else

**Brug switch når:**
- Du checker én variabel mod flere specifikke værdier
- Værdierne er constants (int, String, char, enum)
- Du har mange cases (5+)

**Brug if-else når:**
- Du har komplekse conditions (&&, ||)
- Du checker ranges (age > 18)
- Du checker forskellige variabler

```java
// GODT til switch
switch (menuChoice) {
    case "burger": ...
    case "pizza": ...
    case "salad": ...
}

// DÅRLIGT til switch, brug if-else
if (age > 18 && hasLicense) {
    ...
}
```

### Return i Switch
Du kan returnere direkte fra switch cases:

```java
public String getDayName(int day) {
    switch (day) {
        case 1:
            return "Monday";
        case 2:
            return "Tuesday";
        default:
            return "Invalid";
    }
    // Ingen break nødvendigt når du bruger return
}
```

**Tag udgangspunkt i klasserne Menu, DaySchedule, og GameCommand.**  
**Skriv din kode i Main.java i testLevel3() metoden.**

**VIGTIGT:** Implementer TODO metoderne ved hjælp af switch statements.

---

## Tips
- Husk altid `break` efter hver case (medmindre du ønsker fall-through)
- Brug `default` til at håndtere uventede værdier
- Switch er mere læsbar end lange if-else if-else chains for simple checks
- Du kan bruge `return` i stedet for `break` hvis du returnerer fra en metode
- Cases skal være konstante værdier (literals eller final variables)
- Al din kode skal placeres inde i `testLevel3()` metoden mellem tuborgklammerne `{}`

---

## Del A: Basic Switch Statements

### Opgave 3.1: Dit første switch statement
**Opgave:** 
1. Opret en Menu: "burger", quantity 2
2. Implementer `getPrice()` metoden med switch:
   - "burger" -> 50.0
   - "pizza" -> 65.0
   - "salad" -> 45.0
   - "fries" -> 25.0
   - "drink" -> 15.0
   - default -> 0.0
3. Print price

**Forventet Output:**
```
50.0
```

---

### Opgave 3.2: Multiple cases
**Opgave:** 
1. Opret fem Menu objekter: "burger", "pizza", "salad", "fries", "drink"
2. Print price for hver

**Forventet Output:**
```
50.0
65.0
45.0
25.0
15.0
```

---

### Opgave 3.3: Default case
**Opgave:** 
1. Opret en Menu: "pasta", quantity 1
2. Print price - skulle returnere 0.0 (default case)

**Forventet Output:**
```
0.0
```

---

### Opgave 3.4: Switch med integers
**Opgave:** 
1. Opret en DaySchedule: dayOfWeek 1 (Monday)
2. Implementer `getDayName()` metoden med switch:
   - 1 -> "Monday"
   - 2 -> "Tuesday"
   - 3 -> "Wednesday"
   - 4 -> "Thursday"
   - 5 -> "Friday"
   - 6 -> "Saturday"
   - 7 -> "Sunday"
   - default -> "Invalid Day"
3. Print day name

**Forventet Output:**
```
Monday
```

---

### Opgave 3.5: All days of week
**Opgave:** 
1. Opret syv DaySchedule objekter (day 1-7)
2. Print day name for hver

**Forventet Output:**
```
Monday
Tuesday
Wednesday
Thursday
Friday
Saturday
Sunday
```

---

## Del B: Switch with Return

### Opgave 3.6: Direct return from switch
**Opgave:** 
1. Opret en GameCommand: "attack", target "Dragon"
2. Implementer `execute()` metoden med switch (brug return, ikke break):
   - "attack" -> "Attacking " + target
   - "defend" -> "Defending against " + target
   - "heal" -> "Healing " + target
   - "run" -> "Running from " + target
   - "talk" -> "Talking to " + target
   - default -> "Unknown command"
3. Print execute()

**Forventet Output:**
```
Attacking Dragon
```

---

### Opgave 3.7: Multiple commands
**Opgave:** 
1. Opret fem GameCommand objekter med forskellige commands
2. Print execute() for hver

**Forventet Output:** (eksempel)
```
Attacking Goblin
Defending against Troll
Healing Ally
Running from Monster
Talking to Merchant
```

---

### Opgave 3.8: Integer return from switch
**Opgave:** 
1. Opret en GameCommand: "heal", target "Player"
2. Implementer `getManaCost()` metoden:
   - "attack" -> 10
   - "defend" -> 5
   - "heal" -> 20
   - "run" -> 0
   - "talk" -> 0
   - default -> 0
3. Print mana cost

**Forventet Output:**
```
20
```

---

### Opgave 3.9: All mana costs
**Opgave:** 
1. Opret fem GameCommand objekter med alle command types
2. Print command og mana cost for hver

**Forventet Output:** (eksempel)
```
attack: 10 mana
defend: 5 mana
heal: 20 mana
run: 0 mana
talk: 0 mana
```

---

### Opgave 3.10: Boolean return from switch
**Opgave:** 
1. Opret to GameCommand objekter: "attack" og "heal"
2. Implementer `isHostile()` metoden:
   - "attack" -> true
   - all others -> false
3. Print isHostile() for begge

**Forventet Output:**
```
true
false
```

---

## Del C: Grouping Cases (Fall-Through)

### Opgave 3.11: Weekend check
**Opgave:** 
1. Opret en DaySchedule: day 6 (Saturday)
2. Implementer `isWeekend()` metoden med grouped cases:
   ```java
   case 6:
   case 7:
       return true;
   default:
       return false;
   ```
3. Print isWeekend()

**Forventet Output:**
```
true
```

---

### Opgave 3.12: All weekend checks
**Opgave:** 
1. Opret syv DaySchedule objekter (day 1-7)
2. For hver, print day name og isWeekend()

**Forventet Output:**
```
Monday: false
Tuesday: false
Wednesday: false
Thursday: false
Friday: false
Saturday: true
Sunday: true
```

---

### Opgave 3.13: Category grouping
**Opgave:** 
1. Opret en Menu: "burger", quantity 1
2. Implementer `getCategory()` metoden med grouped cases:
   - "burger", "pizza" -> "Main Course"
   - "salad" -> "Healthy"
   - "fries" -> "Side Dish"
   - "drink" -> "Beverage"
   - default -> "Unknown"
3. Print category

**Forventet Output:**
```
Main Course
```

---

### Opgave 3.14: All categories
**Opgave:** 
1. Opret fem Menu objekter: burger, pizza, salad, fries, drink
2. Print item og category for hver

**Forventet Output:**
```
burger: Main Course
pizza: Main Course
salad: Healthy
fries: Side Dish
drink: Beverage
```

---

### Opgave 3.15: Command type grouping
**Opgave:** 
1. Opret en GameCommand: "run", target "Bear"
2. Implementer `getCommandType()` metoden:
   - "attack" -> "Offensive"
   - "defend" -> "Defensive"
   - "heal" -> "Support"
   - "run", "talk" -> "Non-combat"
   - default -> "Unknown"
3. Print command type

**Forventet Output:**
```
Non-combat
```

---

## Del D: Complex Switch Logic

### Opgave 3.16: Work schedule
**Opgave:** 
1. Opret en DaySchedule: day 3 (Wednesday)
2. Implementer `getSchedule()` metoden:
   - 1,2,3,4 -> "Work: 9-17"
   - 5 -> "Work: 9-15"
   - 6,7 -> "Free Day"
   - default -> "No schedule"
3. Print schedule

**Forventet Output:**
```
Work: 9-17
```

---

### Opgave 3.17: All schedules
**Opgave:** 
1. Opret syv DaySchedule objekter (day 1-7)
2. Print day name og schedule for hver

**Forventet Output:**
```
Monday: Work: 9-17
Tuesday: Work: 9-17
Wednesday: Work: 9-17
Thursday: Work: 9-17
Friday: Work: 9-15
Saturday: Free Day
Sunday: Free Day
```

---

### Opgave 3.18: Work hours calculation
**Opgave:** 
1. Opret en DaySchedule: day 1 (Monday)
2. Implementer `getWorkHours()` metoden:
   - Monday-Thursday: 8 hours
   - Friday: 6 hours
   - Weekend: 0 hours
   - default: 0
3. Print work hours

**Forventet Output:**
```
8
```

---

### Opgave 3.19: Weekly work hours
**Opgave:** 
1. Opret syv DaySchedule objekter (entire week)
2. Print work hours for each day
3. Calculate og print total hours per week

**Forventet Output:**
```
Monday: 8 hours
Tuesday: 8 hours
Wednesday: 8 hours
Thursday: 8 hours
Friday: 6 hours
Saturday: 0 hours
Sunday: 0 hours
Total: 38 hours
```

---

### Opgave 3.20: Calories tracking
**Opgave:** 
1. Opret en Menu: "pizza", quantity 2
2. Implementer `getCalories()` metoden:
   - "burger" -> 500
   - "pizza" -> 650
   - "salad" -> 150
   - "fries" -> 350
   - "drink" -> 100
   - default -> 0
3. Print calories og total calories (calories * quantity)

**Forventet Output:**
```
Calories per item: 650
Total calories: 1300
```

---

## Del E: Switch in Calculations

### Opgave 3.21: Total price calculation
**Opgave:** 
1. Opret to Menu objekter: "burger" quantity 3, "drink" quantity 2
2. Calculate total price for each (use getTotalPrice())
3. Calculate grand total

**Forventet Output:**
```
Burgers: 150.0 kr
Drinks: 30.0 kr
Grand Total: 180.0 kr
```

---

### Opgave 3.22: Menu order
**Opgave:** 
1. Opret fire Menu objekter med forskellige items og quantities
2. For hver:
   - Print item name
   - Print category
   - Print total price
3. Calculate grand total

**Forventet Output:** (eksempel)
```
burger (Main Course): 100.0 kr
fries (Side Dish): 50.0 kr
salad (Healthy): 45.0 kr
drink (Beverage): 30.0 kr
Grand Total: 225.0 kr
```

---

### Opgave 3.23: Cooldown system
**Opgave:** 
1. Opret en GameCommand: "heal", target "Player"
2. Implementer `getCooldown()` metoden:
   - "attack" -> 2
   - "defend" -> 3
   - "heal" -> 5
   - "run" -> 1
   - "talk" -> 0
   - default -> 0
3. Print cooldown

**Forventet Output:**
```
5
```

---

### Opgave 3.24: Command statistics
**Opgave:** 
1. Opret fem GameCommand objekter (all command types)
2. For hver command, print:
   - Command name
   - Mana cost
   - Cooldown
   - Command type

**Forventet Output:** (eksempel)
```
attack: 10 mana, 2s cooldown, Offensive
defend: 5 mana, 3s cooldown, Defensive
heal: 20 mana, 5s cooldown, Support
run: 0 mana, 1s cooldown, Non-combat
talk: 0 mana, 0s cooldown, Non-combat
```

---

### Opgave 3.25: Meal planning
**Opgave:** 
1. Opret syv Menu objekter (one for each day of week)
2. Calculate total calories for entire week
3. Calculate average calories per day
4. Calculate total cost for week

**Forventet Output:** (dit eget design)

---

## Del F: Display Methods & Integration

### Opgave 3.26: Display menu info
**Opgave:** 
1. Opret to Menu objekter
2. Call displayInfo() for each

**Forventet Output:** (eksempel)
```
Item: burger
Category: Main Course
Price: 50.0 kr
Quantity: 2
Total: 100.0 kr

Item: salad
Category: Healthy
Price: 45.0 kr
Quantity: 1
Total: 45.0 kr
```

---

### Opgave 3.27: Display day schedule
**Opgave:** 
1. Opret three DaySchedule objekter (weekday, friday, weekend)
2. Call displayInfo() for each

**Forventet Output:** (eksempel)
```
Day: Monday
Schedule: Work: 9-17
Work Hours: 8
Weekend: false

Day: Friday
Schedule: Work: 9-15
Work Hours: 6
Weekend: false

Day: Saturday
Schedule: Free Day
Work Hours: 0
Weekend: true
```

---

### Opgave 3.28: Display game commands
**Opgave:** 
1. Opret three GameCommand objekter
2. Call displayInfo() for each

**Forventet Output:** (eksempel)
```
Command: attack
Target: Dragon
Type: Offensive
Mana Cost: 10
Cooldown: 2s

Command: heal
Target: Player
Type: Support
Mana Cost: 20
Cooldown: 5s
```

---

### Opgave 3.29: Restaurant ordering system
**Opgave:** 
Opret et restaurant ordering system:
1. Opret 6 Menu objekter (various items)
2. For each item, check if category is "Main Course"
3. Calculate total for main courses only
4. Calculate total for all items
5. Print complete order summary

**Forventet Output:** (dit eget design)

---

### Opgave 3.30: Work week analyzer
**Opgave:** 
Analyser en arbejdsuge:
1. Opret syv DaySchedule objekter (entire week)
2. Count weekend days
3. Count work days
4. Calculate total work hours
5. Find day with most work hours
6. Print complete statistics

**Forventet Output:** (dit eget design)

---

### Opgave 3.31: Game action planner
**Opgave:** 
Plan game actions:
1. Opret 8 GameCommand objekter (various commands and targets)
2. Calculate total mana cost for all actions
3. Count hostile actions
4. Find action with highest cooldown
5. Group actions by type (Offensive, Defensive, Support, Non-combat)
6. Print complete action plan

**Forventet Output:** (dit eget design)

---

## Refleksionsspørgsmål

Efter du har løst opgaverne, tænk over:
1. Hvornår er switch statements bedre end if-else?
2. Hvorfor er `break` statements vigtige?
3. Hvad sker der hvis du glemmer `break`?
4. Hvornår ville du bruge fall-through intentionally?
5. Kan du bruge ranges (som age > 18) i switch? Hvorfor ikke?
6. Hvad er forskellen mellem at bruge `return` vs `break` i switch?
