package titles;

public class Student extends Person {

    public Student(String title, String firstName, String lastName, String subject) {
        super(title, firstName, lastName, subject);
    }
    
    // Override abstract method from superclass
    @Override
    public String getTitle() {
        return "Student";
    }
    
    // Override implemented method from ParticipateHours->Person
    // Student hours are just course hours
    @Override
    public int getParticipatingHours(int courseHours) {
        return courseHours; 
    }
}
