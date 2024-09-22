package titles;

public class TA extends Person {

    public TA(String title, String firstName, String lastName, String subject) {
        super(title, firstName, lastName, subject);
    }
    
    // Override abstract method from superclass
    @Override
    public String getTitle() {
        return "TA";
    }

    // Override implemented method from ParticipateHours->Person
    // TA hours are just lab hours based on courseHours
    @Override
    public int getParticipatingHours(int courseHours) {
        return getLabHours(courseHours);
    }
}
