package titles;

public class TA extends Person {
    int totalHours;

    public TA(String title, String firstName, String lastName, String subject, int courseHours) {
        super(title, firstName, lastName, subject, courseHours);
        super.setTotalHours(courseHours);
    }

    public int getParticipatingHours(int courseHours) {
        return getLabHours(courseHours);
    }
}
