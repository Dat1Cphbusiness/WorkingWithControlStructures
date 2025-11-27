public class AccessControl {
    
    private String username;
    private String password;
    private boolean isAdmin;
    private boolean isActive;
    private int loginAttempts;
    
    public AccessControl(String username, String password, boolean isAdmin, boolean isActive, int loginAttempts) {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.isActive = isActive;
        this.loginAttempts = loginAttempts;
    }
    
    // Getters
    public String getUsername() {
        return this.username;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public boolean isAdmin() {
        return this.isAdmin;
    }
    
    public boolean isActive() {
        return this.isActive;
    }
    
    public int getLoginAttempts() {
        return this.loginAttempts;
    }
    
    // Setters
    public void setLoginAttempts(int loginAttempts) {
        this.loginAttempts = loginAttempts;
    }
    
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    // Methods that need implementation using complex conditionals
    public boolean canLogin(String inputPassword) {
        // TODO: Implement using logical operators
        // Can login if:
        // - isActive is true
        // - loginAttempts < 3
        // - inputPassword matches password
        // All three conditions must be true
        return false;
    }
    
    public boolean hasFullAccess() {
        // TODO: Implement using logical operators
        // Has full access if isAdmin AND isActive
        return false;
    }
    
    public boolean needsPasswordReset() {
        // TODO: Implement using logical operators
        // Needs password reset if:
        // - loginAttempts >= 3 OR password.equals("password123")
        return false;
    }
    
    public String getAccessLevel() {
        // TODO: Implement using nested if and logical operators
        // "Full Access" if isAdmin AND isActive
        // "Limited Access" if NOT isAdmin AND isActive
        // "No Access" if NOT isActive OR loginAttempts >= 3
        return "";
    }
    
    public boolean canPerformAction(boolean requiresAdmin) {
        // TODO: Implement using logical operators
        // Can perform action if:
        // - isActive is true
        // - loginAttempts < 3
        // - If requiresAdmin is true, then isAdmin must also be true
        // - If requiresAdmin is false, any active user can perform action
        return false;
    }
    
    public void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Admin: " + isAdmin);
        System.out.println("Active: " + isActive);
        System.out.println("Login Attempts: " + loginAttempts);
        System.out.println("Access Level: " + getAccessLevel());
    }
}
