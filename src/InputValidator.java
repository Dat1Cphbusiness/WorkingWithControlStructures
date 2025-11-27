public class InputValidator {
    
    private int attempts;
    private int maxAttempts;
    
    public InputValidator(int maxAttempts) {
        this.maxAttempts = maxAttempts;
        this.attempts = 0;
    }
    
    // Getters
    public int getAttempts() {
        return this.attempts;
    }
    
    public int getMaxAttempts() {
        return this.maxAttempts;
    }
    
    // Setters
    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }
    
    // Methods that need implementation using while loops
    public boolean validatePassword(String correctPassword, String[] inputPasswords) {
        // TODO: Implement using while loop
        // Loop through inputPasswords array
        // For each password, check if it matches correctPassword
        // If match found, return true
        // Increment attempts for each try
        // If attempts >= maxAttempts, return false
        // If no match found and haven't exceeded maxAttempts, return false
        return false;
    }
    
    public int countValidInputs(int[] inputs, int minValue, int maxValue) {
        // TODO: Implement using while loop
        // Count how many inputs are between minValue and maxValue (inclusive)
        // Use index variable to loop through inputs array
        return 0;
    }
    
    public void printAttemptsRemaining() {
        // TODO: Implement using while loop
        // Print "Attempts remaining: X" where X goes from maxAttempts down to 1
        // Use a counter variable
    }
    
    public boolean hasAttemptsLeft() {
        return attempts < maxAttempts;
    }
    
    public void incrementAttempt() {
        attempts++;
        System.out.println("Attempt " + attempts + " of " + maxAttempts);
    }
    
    public void reset() {
        attempts = 0;
    }
    
    public void displayInfo() {
        System.out.println("Attempts: " + attempts + "/" + maxAttempts);
        System.out.println("Remaining: " + (maxAttempts - attempts));
    }
}
