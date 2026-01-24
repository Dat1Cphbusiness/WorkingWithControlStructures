# Level 5: For Loops (Basic)

## Level 5 fokuserer på:
- Traditional for loop syntax
- Loop initialization, condition, update
- Counting up and down
- Custom step sizes
- Loop patterns (sum, product, count)
- Nested number patterns
- For loop vs while loop
- When to use for loops

---


## Begrebsgennemgang

### For Loop Basics

En **for loop** bruges når du ved hvor mange gange du vil iterere:

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
// Output: 0 1 2 3 4
```

**Syntax:**
```java
for (initialization; condition; update) {
    // Code to repeat
}
```

### The Three Parts

```java
for (int i = 0; i < 10; i++) {
//   ^^^^^^^^  ^^^^^^^  ^^^
//      1         2      3

// 1. Initialization: Runs ONCE at start
// 2. Condition: Checked BEFORE each iteration
// 3. Update: Runs AFTER each iteration
```

**Execution flow:**
1. Initialize variable (once)
2. Check condition
3. If true: execute body → update → goto step 2
4. If false: exit loop

**Example breakdown:**
```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

// Step by step:
// i = 0; check 0 < 5 (true); print 0; i++
// i = 1; check 1 < 5 (true); print 1; i++
// i = 2; check 2 < 5 (true); print 2; i++
// i = 3; check 3 < 5 (true); print 3; i++
// i = 4; check 4 < 5 (true); print 4; i++
// i = 5; check 5 < 5 (false); EXIT
```

### Counting Up

**Standard counting:**
```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
// Output: 0 1 2 3 4 5 6 7 8 9
```

**Start from 1:**
```java
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
// Output: 1 2 3 4 5 6 7 8 9 10
```

**Custom range:**
```java
for (int i = 5; i <= 15; i++) {
    System.out.println(i);
}
// Output: 5 6 7 8 9 10 11 12 13 14 15
```

### Counting Down

```java
for (int i = 10; i > 0; i--) {
    System.out.println(i);
}
// Output: 10 9 8 7 6 5 4 3 2 1
```

**Key difference:**
- Counting up: `i++` and `i <`
- Counting down: `i--` and `i >`

### Custom Step Sizes

**Count by 2:**
```java
for (int i = 0; i <= 20; i += 2) {
    System.out.println(i);
}
// Output: 0 2 4 6 8 10 12 14 16 18 20
```

**Count by 5:**
```java
for (int i = 0; i <= 50; i += 5) {
    System.out.println(i);
}
// Output: 0 5 10 15 20 25 30 35 40 45 50
```

**Count by 10:**
```java
for (int i = 100; i >= 0; i -= 10) {
    System.out.println(i);
}
// Output: 100 90 80 70 60 50 40 30 20 10 0
```

### Accumulation with For

**Sum:**
```java
int sum = 0;
for (int i = 1; i <= 10; i++) {
    sum += i;
}
// sum = 55
```

**Product:**
```java
int product = 1;
for (int i = 1; i <= 5; i++) {
    product *= i;
}
// product = 120 (5!)
```

**Count:**
```java
int count = 0;
for (int i = 1; i <= 100; i++) {
    if (i % 7 == 0) {
        count++;
    }
}
// count = 14
```

### Nested For Loops

**Basic pattern:**
```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.print("(" + i + "," + j + ") ");
    }
    System.out.println();
}
// Output:
// (1,1) (1,2) (1,3)
// (2,1) (2,2) (2,3)
// (3,1) (3,2) (3,3)
```

**Think of it as:**
- Outer loop = rows
- Inner loop = columns
- Total iterations = outer × inner

### For vs While

**Use for when:**
- ✅ You know the number of iterations
- ✅ Simple counting (0 to n)
- ✅ Iterating through ranges
- ✅ Fixed number of repetitions

**Use while when:**
- ✅ You don't know the number of iterations
- ✅ Loop depends on conditions, not counting
- ✅ Sentinel values
- ✅ Complex termination conditions

```java
// GOOD for "for loop"
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}

// GOOD for "while loop"
boolean found = false;
while (!found) {
    // Search logic
}
```

### Common Patterns

**Print sequence:**
```java
for (int i = 1; i <= 10; i++) {
    System.out.print(i + " ");
}
```

**Sum range:**
```java
int sum = 0;
for (int i = 1; i <= 100; i++) {
    sum += i;
}
```

**Multiplication table:**
```java
int n = 7;
for (int i = 1; i <= 10; i++) {
    System.out.println(n + " × " + i + " = " + (n * i));
}
```

**Powers of 2:**
```java
int power = 1;
for (int i = 0; i <= 10; i++) {
    System.out.println("2^" + i + " = " + power);
    power *= 2;
}
```

---

## Tips
- Use `i++` for counting up, `i--` for counting down
- `i < n` means n iterations starting from 0
- `i <= n` means n+1 iterations starting from 0
- Use descriptive names when nested: `row`, `col` instead of `i`, `j`
- For loops are perfect when you know iteration count
- Test with small numbers first

---