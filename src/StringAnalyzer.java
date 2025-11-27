public class StringAnalyzer {
    
    private String text;
    
    public StringAnalyzer(String text) {
        this.text = text;
    }
    
    // Getters
    public String getText() {
        return this.text;
    }
    
    // Setters
    public void setText(String text) {
        this.text = text;
    }
    
    // Methods using traditional for loops
    public int countVowels() {
        // TODO: Implement using traditional for loop
        // Count vowels (a, e, i, o, u) - both upper and lowercase
        // Use charAt(i) to get character at position i
        return 0;
    }
    
    public void printCharacters() {
        // TODO: Implement using traditional for loop
        // Print each character on separate line with position
        // Example: "Position 0: H"
    }
    
    public String reverseString() {
        // TODO: Implement using traditional for loop
        // Return reversed string
        // Loop backwards through string
        return "";
    }
    
    public int countCharacter(char target) {
        // TODO: Implement using traditional for loop
        // Count occurrences of target character
        return 0;
    }
    
    // Methods using enhanced for loops (with char array)
    public int countSpaces() {
        // TODO: Implement using enhanced for loop
        // Use: for (char c : text.toCharArray())
        // Count spaces
        return 0;
    }
    
    public int countUpperCase() {
        // TODO: Implement using enhanced for loop
        // Count uppercase letters
        // Use Character.isUpperCase(c)
        return 0;
    }
    
    public int countDigits() {
        // TODO: Implement using enhanced for loop
        // Count digit characters (0-9)
        // Use Character.isDigit(c)
        return 0;
    }
    
    public void displayInfo() {
        System.out.println("Text: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("Vowels: " + countVowels());
        System.out.println("Spaces: " + countSpaces());
        System.out.println("Uppercase: " + countUpperCase());
    }
}
