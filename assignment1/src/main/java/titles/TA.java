package titles;

public class TA extends Person {

    public TA(String firstName, String lastName, String subject, int courseHours) {
        super(firstName, lastName, subject);
        super.addTotalHours(courseHours);
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
