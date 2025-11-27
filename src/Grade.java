public class Grade {
    
    private String studentName;
    private int score;
    
    public Grade(String studentName, int score) {
        this.studentName = studentName;
        this.score = score;
    }
    
    // Getters
    public String getStudentName() {
        return this.studentName;
    }
    
    public int getScore() {
        return this.score;
    }
    
    // Setters
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    // Methods that need implementation using conditionals
    public String getLetterGrade() {
        // TODO: Implement using if-else
        // 90-100: A
        // 80-89: B
        // 70-79: C
        // 60-69: D
        // 0-59: F
        return "";
    }
    
    public boolean isPassing() {
        // TODO: Implement using if
        // Passing score is 60 or above
        return false;
    }
    
    public String getStatus() {
        // TODO: Implement using if-else
        // "Excellent" if score >= 90
        // "Good" if score >= 70
        // "Needs Improvement" if score >= 60
        // "Failing" if score < 60
        return "";
    }
    
    public void displayInfo() {
        System.out.println("Student: " + studentName);
        System.out.println("Score: " + score);
        System.out.println("Letter Grade: " + getLetterGrade());
        System.out.println("Status: " + getStatus());
    }
}
