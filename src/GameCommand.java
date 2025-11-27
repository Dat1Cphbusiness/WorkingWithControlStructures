public class GameCommand {
    
    private String command;
    private String target;
    
    public GameCommand(String command, String target) {
        this.command = command;
        this.target = target;
    }
    
    // Getters
    public String getCommand() {
        return this.command;
    }
    
    public String getTarget() {
        return this.target;
    }
    
    // Setters
    public void setCommand(String command) {
        this.command = command;
    }
    
    public void setTarget(String target) {
        this.target = target;
    }
    
    // Methods that need implementation using switch
    public String execute() {
        // TODO: Implement using switch
        // "attack" -> "Attacking " + target
        // "defend" -> "Defending against " + target
        // "heal" -> "Healing " + target
        // "run" -> "Running from " + target
        // "talk" -> "Talking to " + target
        // default -> "Unknown command"
        return "";
    }
    
    public int getManaCost() {
        // TODO: Implement using switch
        // "attack" -> 10
        // "defend" -> 5
        // "heal" -> 20
        // "run" -> 0
        // "talk" -> 0
        // default -> 0
        return 0;
    }
    
    public String getCommandType() {
        // TODO: Implement using switch
        // "attack" -> "Offensive"
        // "defend" -> "Defensive"
        // "heal" -> "Support"
        // "run", "talk" -> "Non-combat"
        // default -> "Unknown"
        return "";
    }
    
    public boolean isHostile() {
        // TODO: Implement using switch
        // Return true for "attack"
        // Return false for all others
        return false;
    }
    
    public int getCooldown() {
        // TODO: Implement using switch (in seconds)
        // "attack" -> 2
        // "defend" -> 3
        // "heal" -> 5
        // "run" -> 1
        // "talk" -> 0
        // default -> 0
        return 0;
    }
    
    public void displayInfo() {
        System.out.println("Command: " + command);
        System.out.println("Target: " + target);
        System.out.println("Type: " + getCommandType());
        System.out.println("Mana Cost: " + getManaCost());
        System.out.println("Cooldown: " + getCooldown() + "s");
    }
}
