# Level 7: For-Each Loops

## Level 7 fokuserer på:
- Enhanced for loop (for-each) syntax
- When to use for-each vs traditional for
- Read-only iteration through arrays
- Simplicity of for-each loops
- Limitations of for-each
- Working with elements directly (no index)
- String arrays with for-each
- Common for-each patterns

---
## Begrebsgennemgang

### For-Each Loop Basics

En **for-each loop** (også kaldet "enhanced for loop") er en simplere måde at iterere gennem arrays:

**Traditional for loop:**
```java
int[] numbers = {10, 20, 30, 40, 50};

for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

**For-each loop:**
```java
int[] numbers = {10, 20, 30, 40, 50};

for (int number : numbers) {
    System.out.println(number);
}
```

**Meget simplere!** Ingen index variable, ingen `.length`, ingen `[i]`.

### For-Each Syntax

```java
for (Type element : array) {
    // Use element directly
}
```

**Components:**
- `Type`: Datatype of array elements
- `element`: Variable name for current element (you choose)
- `array`: The array to iterate through
- `:` means "in" (read as "for each element in array")

**Examples:**
```java
// int array
for (int num : numbers) { ... }

// String array
for (String name : names) { ... }

// double array
for (double price : prices) { ... }
```

### How For-Each Works

```java
int[] scores = {85, 92, 78, 88, 95};

for (int score : scores) {
    System.out.println(score);
}
```

**Step by step:**
1. First iteration: `score = 85` → print 85
2. Second iteration: `score = 92` → print 92
3. Third iteration: `score = 78` → print 78
4. Fourth iteration: `score = 88` → print 88
5. Fifth iteration: `score = 95` → print 95
6. No more elements → EXIT

**No index needed!** Loop automatically goes through each element.

### Read-Only Access

**VIGTIGT:** For-each loops give you a **copy** of each element:

```java
int[] numbers = {10, 20, 30};

// This DOES NOT modify the array!
for (int num : numbers) {
    num = num * 2;  // Only modifies the copy
}

// numbers is still {10, 20, 30}
```

**For-each is read-only!** You cannot modify array elements.

### Traditional For vs For-Each

**Use for-each when:**
- ✅ You need to read each element
- ✅ You don't need the index
- ✅ You go through entire array
- ✅ Simpler, more readable code

**Use traditional for when:**
- ✅ You need the index position
- ✅ You need to modify array elements
- ✅ You only want part of array
- ✅ You need to iterate backwards

### Element Naming Convention

Choose meaningful singular names for elements:

```java
// Good names
for (int score : scores) { ... }
for (String name : names) { ... }
for (double price : prices) { ... }
for (int age : ages) { ... }

// Bad names
for (int x : scores) { ... }
for (String s : names) { ... }
```

**Pattern:** Array is plural, element is singular.

### Common Patterns with For-Each

**Print all elements:**
```java
for (int number : numbers) {
    System.out.println(number);
}
```

**Sum all elements:**
```java
int sum = 0;
for (int number : numbers) {
    sum += number;
}
```

**Find maximum:**
```java
int max = numbers[0];  // Need first element outside loop
for (int number : numbers) {
    if (number > max) {
        max = number;
    }
}
```

**Count matching:**
```java
int count = 0;
for (int number : numbers) {
    if (number > 10) {
        count++;
    }
}
```

**Search for value:**
```java
boolean found = false;
for (int number : numbers) {
    if (number == target) {
        found = true;
        break;
    }
}
```

### For-Each with Strings

```java
String[] names = {"Anna", "Bob", "Carl", "Diana"};

for (String name : names) {
    System.out.println("Hello, " + name + "!");
}
// Output:
// Hello, Anna!
// Hello, Bob!
// Hello, Carl!
// Hello, Diana!
```

### When NOT to Use For-Each

**Cannot modify array:**
```java
int[] numbers = {10, 20, 30};

// DOESN'T WORK - cannot modify array with for-each
for (int num : numbers) {
    num = num * 2;  // Only changes copy, not array
}
```

**Need index:**
```java
// CANNOT do with for-each - need traditional for
for (int i = 0; i < names.length; i++) {
    System.out.println("Index " + i + ": " + names[i]);
}
```

**Only part of array:**
```java
// CANNOT do with for-each - need traditional for
for (int i = 5; i < 10; i++) {
    System.out.println(numbers[i]);
}
```

**Backwards iteration:**
```java
// CANNOT do with for-each - need traditional for
for (int i = numbers.length - 1; i >= 0; i--) {
    System.out.println(numbers[i]);
}
```

### Comparison Examples

**Print all elements:**
```java
// Traditional for
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}

// For-each (simpler!)
for (int number : numbers) {
    System.out.println(number);
}
```

**Sum elements:**
```java
// Traditional for
int sum = 0;
for (int i = 0; i < numbers.length; i++) {
    sum += numbers[i];
}

// For-each (simpler!)
int sum = 0;
for (int number : numbers) {
    sum += number;
}
```

**Find max (both similar):**
```java
// Traditional for
int max = numbers[0];
for (int i = 1; i < numbers.length; i++) {
    if (numbers[i] > max) {
        max = numbers[i];
    }
}

// For-each (also simple)
int max = numbers[0];
for (int number : numbers) {
    if (number > max) {
        max = number;
    }
}
```

---

## Tips
- For-each is simpler when you just need to read elements
- Use singular names for element variable
- Cannot modify array with for-each (read-only)
- Cannot access index with for-each
- For-each always goes through entire array
- Use traditional for when you need index or modifications
- For-each is perfect for calculations (sum, count, search)

---