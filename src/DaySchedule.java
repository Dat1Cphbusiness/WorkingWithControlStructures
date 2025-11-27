public class DaySchedule {
    
    private int dayOfWeek;  // 1 = Monday, 2 = Tuesday, ... 7 = Sunday
    private String activity;
    
    public DaySchedule(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        this.activity = "";
    }
    
    // Getters
    public int getDayOfWeek() {
        return this.dayOfWeek;
    }
    
    public String getActivity() {
        return this.activity;
    }
    
    // Setters
    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
    
    public void setActivity(String activity) {
        this.activity = activity;
    }
    
    // Methods that need implementation using switch
    public String getDayName() {
        // TODO: Implement using switch
        // 1 -> "Monday"
        // 2 -> "Tuesday"
        // 3 -> "Wednesday"
        // 4 -> "Thursday"
        // 5 -> "Friday"
        // 6 -> "Saturday"
        // 7 -> "Sunday"
        // default -> "Invalid Day"
        return "";
    }
    
    public boolean isWeekend() {
        // TODO: Implement using switch
        // Return true if day is 6 or 7 (Saturday or Sunday)
        // Return false for other days
        return false;
    }
    
    public String getSchedule() {
        // TODO: Implement using switch
        // 1 -> "Work: 9-17"
        // 2 -> "Work: 9-17"
        // 3 -> "Work: 9-17"
        // 4 -> "Work: 9-17"
        // 5 -> "Work: 9-15"
        // 6 -> "Free Day"
        // 7 -> "Free Day"
        // default -> "No schedule"
        return "";
    }
    
    public int getWorkHours() {
        // TODO: Implement using switch
        // Monday-Thursday: 8 hours
        // Friday: 6 hours
        // Weekend: 0 hours
        // default: 0
        return 0;
    }
    
    public void displayInfo() {
        System.out.println("Day: " + getDayName());
        System.out.println("Schedule: " + getSchedule());
        System.out.println("Work Hours: " + getWorkHours());
        System.out.println("Weekend: " + isWeekend());
    }
}
