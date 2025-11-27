public class GameCharacter {
    
    private String name;
    private int health;
    private int maxHealth;
    private int mana;
    private int level;
    private boolean hasShield;
    
    public GameCharacter(String name, int health, int maxHealth, int mana, int level, boolean hasShield) {
        this.name = name;
        this.health = health;
        this.maxHealth = maxHealth;
        this.mana = mana;
        this.level = level;
        this.hasShield = hasShield;
    }
    
    // Getters
    public String getName() {
        return this.name;
    }
    
    public int getHealth() {
        return this.health;
    }
    
    public int getMaxHealth() {
        return this.maxHealth;
    }
    
    public int getMana() {
        return this.mana;
    }
    
    public int getLevel() {
        return this.level;
    }
    
    public boolean hasShield() {
        return this.hasShield;
    }
    
    // Setters
    public void setHealth(int health) {
        this.health = health;
    }
    
    public void setMana(int mana) {
        this.mana = mana;
    }
    
    public void setShield(boolean hasShield) {
        this.hasShield = hasShield;
    }
    
    // Methods that need implementation using complex conditionals
    public boolean isAlive() {
        // TODO: Implement using logical operators
        // Alive if health > 0
        return false;
    }
    
    public boolean canCastSpell(int manaCost) {
        // TODO: Implement using logical operators
        // Can cast spell if isAlive() AND mana >= manaCost
        return false;
    }
    
    public boolean isInDanger() {
        // TODO: Implement using logical operators
        // In danger if health < (maxHealth / 4) AND NOT hasShield
        return false;
    }
    
    public boolean canLevelUp() {
        // TODO: Implement using logical operators
        // Can level up if isAlive() AND level < 100 AND (health == maxHealth OR mana >= 50)
        return false;
    }
    
    public String getStatus() {
        // TODO: Implement using nested if and logical operators
        // "Critical" if health <= 20 AND NOT hasShield
        // "Low Health" if health < (maxHealth / 2) AND NOT hasShield
        // "Protected" if hasShield AND health > 0
        // "Healthy" if health > (maxHealth / 2)
        // "Dead" if health <= 0
        return "";
    }
    
    public boolean shouldRetreat() {
        // TODO: Implement using logical operators
        // Should retreat if:
        // - (health < 30 OR mana < 20) AND NOT hasShield
        return false;
    }
    
    public String getCombatReadiness() {
        // TODO: Implement using nested if and logical operators
        // "Ready" if health > 50 AND mana > 30
        // "Need Rest" if health < 30 OR mana < 10
        // "Partially Ready" otherwise
        return "";
    }
    
    public void displayInfo() {
        System.out.println("Character: " + name);
        System.out.println("Level: " + level);
        System.out.println("Health: " + health + "/" + maxHealth);
        System.out.println("Mana: " + mana);
        System.out.println("Shield: " + hasShield);
        System.out.println("Status: " + getStatus());
    }
}
