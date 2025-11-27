# Java Control Structures - Part 1: Fundamentals

En guide til at lære kontrol strukturer i Java gennem 6 levels med stigende sværhedsgrad.

## 📋 Oversigt

Denne øvelsesserie (Part 1) er designet til at lære studerende om grundlæggende kontrol strukturer i Java gennem hands-on practice. 
Hvert level fokuserer på et specifikt koncept og bygger videre på det forrige level.

**Prerequisites:** Students should have completed the [method calling](https://github.com/Dat1Cphbusiness/MethodCalling) and [working with objects](https://github.com/Dat1Cphbusiness/WorkingWithObjects) exercise series.

## 🎯 Læringsmål

Efter at have gennemført alle 6 levels vil du kunne:
- Træffe beslutninger med betingelser (på en. 'conditionals') (if/else, switch)
- Kombinere betingelser med logical operators
- Iterere med while og for loops (traditional og enhanced)
- Forstå nested loops og 2D patterns
- Arbejde med arrays og strings i loops
- Skrive effektiv og læsbar kontrol flow kode

## 📚 Level Progression

### Level 1: Basic Conditionals (if/else)
**Fokus:** Simple _decision making_ med if, if-else, og if-else if-else

**Koncepter:**
- if statements
- if-else statements
- if-else if-else chains
- Comparison operators
- String comparison med .equals()
- Boolean conditions

**Klasser:** Grade, User, Product

**[Se Level 1 opgaver →](level1.md)**

---

### Level 2: Complex Conditionals & Logical Operators
**Fokus:** Kombinere betingelser og boolean logic

**Koncepter:**
- Logical operators (&&, ||, !)
- Multiple conditions i én statement
- Nested if statements
- Short-circuit evaluation
- Complex boolean expressions

**Klasser:** Ticket, AccessControl, GameCharacter

**[Se Level 2 opgaver →](level2.md)**

---

### Level 3: Switch Statements
**Fokus:** Multiple choice branching

**Koncepter:**
- Switch syntax
- Case statements og break
- Default case
- Grouping cases (fall-through)
- Switch med Strings og integers
- Hvornår switch vs if-else

**Klasser:** Menu, DaySchedule, GameCommand

**[Se Level 3 opgaver →](level3.md)**

---

### Level 4: While Loops
**Fokus:** Loops med ukendt antal iterationer

**Koncepter:**
- While loop syntax
- Loop conditions og control variables
- Infinite loops (og hvordan man undgår dem)
- Accumulator pattern
- Counter pattern
- Search pattern
- Sentinel values
- While med arrays

**Klasser:** Counter, InputValidator, Accumulator

**[Se Level 4 opgaver →](level4.md)**

---

### Level 5: For Loops
**Fokus:** Loops med ukendt antal iterationer

**Koncepter:**
- Traditional for loop (initialization; condition; update)
- Enhanced for loop (for-each)
- Hvornår traditional vs enhanced
- Array iteration (begge styles)
- String iteration
- Counting up/down
- Custom steps
- Modification vs read-only

**Klasser:** Sequence, ArrayProcessor, StringAnalyzer

**[Se Level 5 opgaver →](level5.md)**

---

### Level 6: Nested Loops
**Fokus:** Loops inde i loops

**Koncepter:**
- Nested loop struktur
- Outer loop vs inner loop
- 2D patterns og ASCII art
- Row og column relationships
- Multiplication tables
- 2D arrays/grids
- Border patterns, diagonals
- Performance considerations

**Klasser:** PatternPrinter, MultiplicationTable, Grid

**[Se Level 6 opgaver →](level6.md)**

---

## 📊 Progression Matrix

| Level | if/else | Logical | Switch | While | For | Enhanced | Nested | Arrays |
|-------|---------|---------|--------|-------|-----|----------|--------|--------|
| 1     | ✓✓      |         |        |       |     |          |        |        |
| 2     | ✓       | ✓✓      |        |       |     |          |        |        |
| 3     | ✓       | ✓       | ✓✓     |       |     |          |        |        |
| 4     | ✓       | ✓       | ✓      | ✓✓    |     |          |        | ✓      |
| 5     | ✓       | ✓       | ✓      | ✓     | ✓✓  | ✓✓       |        | ✓✓     |
| 6     | ✓       | ✓       | ✓      | ✓     | ✓✓  | ✓        | ✓✓     | ✓✓     |

## 🚀 Kom i Gang

### 1. Download alle filer
Klon projektet og følg instruktionerne i 'instructions' mappen

### 2. Åbn Main.java
`Main.java` indeholder 6 test metoder - én for hvert level.

### 3. Start med Level 1
```java
public static void main(String[] args) {
    testLevel1();  // Aktiv
    //testLevel2();  // Kommenteret ud
    //testLevel3();
    // osv...
}
```

### 4. Skriv din kode
Åbn `level1.md` i _instructions_ mappen, og læs opgaverne. Skriv din kode i `testLevel1()` metoden.

### 5. Gå videre til næste level
Når du er færdig med Level 1, kommentér `testLevel1()` ud og fjern kommentaren fra `testLevel2()`.



## 💡 Tips

### Generelle Tips
- Læs instrukserne grundigt før du begynder
- Start med at implementere metoderne i klasserne (se efter TODO kommentarer)
- Kør din kode ofte for at teste
- Brug System.out.println() til debugging
- Sammenlign dit output med forventet output
- Hvis du sidder fast, genlæs "Tips" sektionen i level-filen

### Conditionals (Level 1-3)
- Test alle branches(mulige udfald) i dine conditionals
- Brug paranteser for at gøre komplekse conditions mere læsbare
- Husk .equals() for String comparison
- Switch er ofte mere læsbar end lange if-else kæder

### Loops (Level 4-6)
- Sørg for at loop condition KAN blive false (undgå infinite loops)
- Opdater loop variable inde i loop
- Test med små værdier først
- Outer loop = rows, inner loop = columns (for nested loops)
- Husk println() efter inner loop for ny linje

### Debugging Tips
- Print loop variables for at se værdier
- Tæl iterationer for at verificere loop logik
- Start med simple cases (3x3 grid, ikke 100x100)
- Tegn patterns på papir før du koder

## 🎓 Pædagogisk Tilgang

Denne serie bruger en scaffolded approach:

1. **Gradvis Kompleksitet:** Hver level introducerer ét nyt koncept
2. **Hands-On Practice:** Du implementerer metoderne selv
3. **Real-World Scenarios:** Klasser baseret på realistiske situationer
4. **Pattern Recognition:** Lær common programming patterns
5. **Progressive Challenges:** Fra simple til komplekse opgaver

## 📖 Common Patterns

### Accumulator Pattern
```java
int sum = 0;
for (int number : numbers) {
    sum += number;
}
```

### Counter Pattern
```java
int count = 0;
for (int number : numbers) {
    if (number > 10) {
        count++;
    }
}
```

### Search Pattern
```java
boolean found = false;
for (int number : numbers) {
    if (number == target) {
        found = true;
        break;
    }
}
```

### Find Max Pattern
```java
int max = numbers[0];
for (int number : numbers) {
    if (number > max) {
        max = number;
    }
}
```

## 🔍 Decision Guide

### If/Else vs Switch
**Use if/else when:**
- Complex conditions (&&, ||)
- Ranges (age > 18)
- Different variables

**Use switch when:**
- One variable, multiple specific values
- Many cases (5+)
- Values are constants

### While vs For
**Use while when:**
- Unknown iteration count
- Loop stops on condition
- Input validation, search

**Use for when:**
- Known iteration count
- Counting from A to B
- Array/collection iteration

### Traditional vs Enhanced For
**Use traditional for when:**
- Need index
- Modify array elements
- Iterate backwards
- Skip elements

**Use enhanced for when:**
- Read all elements
- No index needed
- More readable code

## ✅ Checkliste

Brug denne checkliste til at tracke din progression:

- [ ] Level 1: Basic Conditionals (35 opgaver)
- [ ] Level 2: Complex Conditionals & Logical Operators (35 opgaver)
- [ ] Level 3: Switch Statements (31 opgaver)
- [ ] Level 4: While Loops (30 opgaver)
- [ ] Level 5: For Loops (35 opgaver)
- [ ] Level 6: Nested Loops (30 opgaver)

**Total: 196 opgaver**

## 🎯 Hvad Nu?

Når du har gennemført alle 6 levels:

1. **Review:** Genlæs refleksionsspørgsmålene i hver level
2. **Practice:** Lav dine egne opgaver med disse koncepter
3. **Move to Part 2:** Continue med Collections & Advanced Control Flow
4. **Build:** Opret et lille projekt der bruger alt hvad du har lært

## 📚 Part 2 Preview

Part 2 (Collections & Advanced Control Flow) vil dække:
- Arrays - Basics og Advanced Operations
- ArrayList - Basics og Advanced Operations
- Nested Loops - Advanced & 2D Arrays
- Collections med Complex Logic
- Comprehensive Integration

## 🔗 Relaterede Serier
- [**Method Calling Series:**]((https://github.com/Dat1Cphbusiness/WorkingWithObjects)) Prerequisites for denne serie
- [**Objects & Classes Series:**](https://github.com/Dat1Cphbusiness/WorkingWithObjects)Prerequisites for denne serie
- **Control Structures and Collections:** Next step efter denne serie

## 📝 Feedback

Har du feedback til disse øvelser? Del dine tanker med din instruktør!

---

**God fornøjelse med at lære Java Control Structures! 🚀**

## 📊 Series Statistics

- **Total Levels:** 6
- **Total Classes:** 18
- **Total Exercises:** 196
- **Total Concepts:** 30+
- **Estimated Time:** 15-20 timer

---

*Part of the comprehensive Java learning path: Method Calling → Objects & Classes → Control Structures (Part 1) → Collections & Control Flow (Part 2)*
