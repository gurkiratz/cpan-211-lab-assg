package titles;

public class TA extends Person {

    public TA(String title, String firstName, String lastName, String subject, int courseHours) {
        super(title, firstName, lastName, subject, courseHours);
    }

    @Override
    public int getParticipatingHours(int courseHours) {
        return getLabHours(courseHours);
    }
}
