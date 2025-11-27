public class User {
    
    private String username;
    private String password;
    private int age;
    private boolean isActive;
    
    public User(String username, String password, int age, boolean isActive) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.isActive = isActive;
    }
    
    // Getters
    public String getUsername() {
        return this.username;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public boolean isActive() {
        return this.isActive;
    }
    
    // Setters
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    // Methods that need implementation using conditionals
    public boolean canLogin(String inputPassword) {
        // TODO: Implement using if
        // User can login if:
        // - isActive is true
        // - inputPassword matches password
        return false;
    }
    
    public String getAgeCategory() {
        // TODO: Implement using if-else if-else
        // "Child" if age < 13
        // "Teen" if age < 18
        // "Adult" if age < 65
        // "Senior" if age >= 65
        return "";
    }
    
    public boolean isAdult() {
        // TODO: Implement using if
        // Adult if age >= 18
        return false;
    }
    
    public String getAccountStatus() {
        // TODO: Implement using if-else
        // Return "Active" if isActive is true
        // Return "Inactive" if isActive is false
        return "";
    }
    
    public void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Age: " + age);
        System.out.println("Category: " + getAgeCategory());
        System.out.println("Status: " + getAccountStatus());
    }
}
